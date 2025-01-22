package com.ukom.resto2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.models.FeaturedModel

class FeaturedAdapter(var list: List<FeaturedModel>) :
    RecyclerView.Adapter<FeaturedAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.featured_hor_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name
        holder.desc.text = list[position].desc
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView =
            itemView.findViewById(R.id.featured_img)
        var name: TextView =
            itemView.findViewById(R.id.featured_name)
        var desc: TextView =
            itemView.findViewById(R.id.featured_des)
    }
}
