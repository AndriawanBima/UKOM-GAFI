package com.ukom.resto2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.models.FeaturedVerModel

class FeaturedVerAdapter(var list: List<FeaturedVerModel>) :
    RecyclerView.Adapter<FeaturedVerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.featured_ver_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name
        holder.description.text = list[position].description
        holder.timing.text = list[position].timing
        holder.rating.text = list[position].rating
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView =
            itemView.findViewById(R.id.detailed_img)
        var name: TextView =
            itemView.findViewById(R.id.detailed_name)
        var description: TextView =
            itemView.findViewById(R.id.detailed_des)
        var rating: TextView =
            itemView.findViewById(R.id.detailed_rating)
        var timing: TextView =
            itemView.findViewById(R.id.detailed_timing)
    }
}
