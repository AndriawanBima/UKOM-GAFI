package com.ukom.resto2.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.activities.DetailedDailyMealActivity
import com.ukom.resto2.models.DailyMealModel

class DailyMealAdapter(var context: Context, var list: List<DailyMealModel>) :
    RecyclerView.Adapter<DailyMealAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.daily_meal_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name
        holder.discount.text = list[position].discount
        holder.description.text = list[position].description

        holder.itemView.setOnClickListener {
            val intent = Intent(
                context,
                DetailedDailyMealActivity::class.java
            )
            intent.putExtra("type", list[position].type)
            context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView =
            itemView.findViewById(R.id.imageview)
        var name: TextView =
            itemView.findViewById(R.id.textView5)
        var description: TextView =
            itemView.findViewById(R.id.textView8)
        var discount: TextView =
            itemView.findViewById(R.id.discount)
    }
}
