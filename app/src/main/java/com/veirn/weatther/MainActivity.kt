package com.veirn.weatther

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast
import com.veirn.weatther.model.Weathermodel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    lateinit var  adapter : WeatherAdapter
    lateinit var recyclerView: RecyclerView
    lateinit var  list : Weathermodel
    private var mCompositeDisposable: CompositeDisposable? = null
    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val restRetrofit = RestRetrofit()
        val requestInterface = restRetrofit.buildRetrofit()

        if (requestInterface != null) {

            mCompositeDisposable?.add(requestInterface.getData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse, this::handleError))


        }


    }

    private fun handleResponse(androidList: Weathermodel) {

        recyclerView = findViewById(R.id.WeatherREC)
        adapter = WeatherAdapter(androidList, this)
        val layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        recyclerView.isNestedScrollingEnabled = false
    }

    private fun handleError(error: Throwable) {

        Log.d(TAG, error.localizedMessage)

        Toast.makeText(this, "Error ${error.localizedMessage}", Toast.LENGTH_SHORT).show()
    }
}
