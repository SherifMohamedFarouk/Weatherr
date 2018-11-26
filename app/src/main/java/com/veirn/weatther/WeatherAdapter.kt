package com.veirn.weatther

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.veirn.weatther.model.Weathermodel
import kotlinx.android.synthetic.main.list_item.view.*
import java.text.SimpleDateFormat
import java.util.*

class WeatherAdapter (private val dataList : Weathermodel, private val context : Context) : RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {




        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            holder.weather.text = dataList.list[position].weather[0].main
            holder.wmax.text = dataList.list[position].temp.max.toString()
            holder.wmin.text = dataList.list[position].temp.min.toString()
            val calendar : Calendar = Calendar.getInstance()
            val  simpleDateFormat  = SimpleDateFormat("EEEE",Locale.US)

            if (position == 0 ) {
                holder.today.text="today"
            }
            else if (position==1){
                holder.today.text= "Tommorow"

            }
            else{

                calendar.add(Calendar.DATE,position);
                var x = simpleDateFormat.format(calendar.getTime());
                holder.today.setText(x);

            }



        }

        override fun getItemCount(): Int = dataList.list.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

            return ViewHolder(view)
        }

        class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
            val today =view.today
            val weather = view.Weather
            val wmax = view.wmax
            val wmin = view.wmin
            val imageview = view.Image



        }
    }
