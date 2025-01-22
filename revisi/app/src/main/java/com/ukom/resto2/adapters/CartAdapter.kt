package com.ukom.resto2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.models.CartModel

class CartAdapter(var list: List<CartModel>) : RecyclerView.Adapter<CartAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.mycart_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].getImage())
        holder.name.text = list[position].name
        holder.rating.text = list[position].rating
        holder.price.text = list[position].price
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView =
            itemView.findViewById(R.id.detailed_img)
        var name: TextView =
            itemView.findViewById(R.id.detailed_name)
        var rating: TextView =
            itemView.findViewById(R.id.detailed_rating)
        var price: TextView =
            itemView.findViewById(R.id.textView12)
    }
}

private fun CartModel.getImage(): Int {

    return TODO("Provide the return value")
}
