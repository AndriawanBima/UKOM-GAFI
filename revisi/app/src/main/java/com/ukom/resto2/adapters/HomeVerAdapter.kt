package com.ukom.resto2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ukom.resto2.R
import com.ukom.resto2.models.HomeVerModel

class HomeVerAdapter(var context: Context, var list: ArrayList<HomeVerModel>) :
    RecyclerView.Adapter<HomeVerAdapter.ViewHolder>() {
    private var bottomSheetDialog: BottomSheetDialog? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.home_vertical_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mName = list[position].name
        val mTiming = list[position].timing
        val mRating = list[position].rating
        val mPrice = list[position].price
        val mImage = list[position].image

        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name
        holder.timing.text = list[position].timing
        holder.rating.text = list[position].rating
        holder.price.text = list[position].price

        holder.itemView.setOnClickListener {
            bottomSheetDialog = BottomSheetDialog(context, R.style.BottomSheetTheme)
            val sheetView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout, null)
            sheetView.findViewById<View>(R.id.add_to_cart).setOnClickListener {
                Toast.makeText(context, "Added to a Cart", Toast.LENGTH_SHORT).show()
                bottomSheetDialog!!.dismiss()
            }

            val bottomImg = sheetView.findViewById<ImageView>(R.id.bottom_img)
            val bottomName = sheetView.findViewById<TextView>(R.id.bottom_name)
            val bottomPrice = sheetView.findViewById<TextView>(R.id.bottom_price)
            val bottomRating = sheetView.findViewById<TextView>(R.id.bottom_rating)

            bottomName.text = mName
            bottomPrice.text = mPrice
            bottomRating.text = mRating
            bottomImg.setImageResource(mImage)

            bottomSheetDialog!!.setContentView(sheetView)
            bottomSheetDialog!!.show()
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView =
            itemView.findViewById(R.id.ver_img)
        var name: TextView =
            itemView.findViewById(R.id.name)
        var timing: TextView =
            itemView.findViewById(R.id.timing)
        var rating: TextView =
            itemView.findViewById(R.id.rating)
        var price: TextView =
            itemView.findViewById(R.id.price)
    }
}
