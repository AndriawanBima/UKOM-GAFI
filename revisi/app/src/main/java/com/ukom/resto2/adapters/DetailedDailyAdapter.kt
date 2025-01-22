package com.ukom.resto2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ukom.resto2.R
import com.ukom.resto2.models.DetailedDailyModel

class DetailedDailyAdapter(var list: List<DetailedDailyModel>) :
    RecyclerView.Adapter<DetailedDailyAdapter.ViewHolder>() {
    private var bottomSheetDialog: BottomSheetDialog? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.detailed_daily_meal_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.price.text = list[position].price
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
            itemView.findViewById(R.id.detailed_price)
        var price: TextView =
            itemView.findViewById(R.id.detailed_name)
        var description: TextView =
            itemView.findViewById(R.id.detailed_des)
        var rating: TextView =
            itemView.findViewById(R.id.detailed_rating)
        var timing: TextView =
            itemView.findViewById(R.id.detailed_timing)
        var button: Button =
            itemView.findViewById(R.id.button)

        init {
            bottomSheetDialog = BottomSheetDialog(button.context, R.style.BottomSheetTheme)

            button.setOnClickListener {
                Toast.makeText(button.context, "Added to a Cart", Toast.LENGTH_SHORT).show()
                bottomSheetDialog!!.dismiss()
            }
        }
    }
}
