package com.ukom.resto2.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.models.HomeHorModel
import com.ukom.resto2.models.HomeVerModel

class HomeHorAdapter(
    var updateVerticalRec: UpdateVerticalRec,
    var activity: Activity,
    var list: ArrayList<HomeHorModel>
) :
    RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {
    var check: Boolean = true
    var select: Boolean = true
    var row_index: Int = -1


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.home_horizontal_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name

        if (check) {
            val homeVerModels = ArrayList<HomeVerModel>()
            homeVerModels.add(
                HomeVerModel(
                    R.drawable.pizza1,
                    "Pizza 1",
                    "10:00 - 23:00",
                    "5.5",
                    "Rp - 110k"
                )
            )
            homeVerModels.add(
                HomeVerModel(
                    R.drawable.pizza2,
                    "Pizza 2",
                    "10:00 - 23:00",
                    "5.9",
                    "Rp - 105k"
                )
            )
            homeVerModels.add(
                HomeVerModel(
                    R.drawable.pizza3,
                    "Pizza 3",
                    "10:00 - 23:00",
                    "5.0",
                    "Rp - 115k"
                )
            )
            homeVerModels.add(
                HomeVerModel(
                    R.drawable.pizza4,
                    "Pizza 4",
                    "10:00 - 23:00",
                    "5.0",
                    "Rp - 112k"
                )
            )

            updateVerticalRec.callBack(position, homeVerModels)
            check = false
        }
        holder.cardView.setOnClickListener {
            row_index = position
            notifyDataSetChanged()
            if (position == 0) {
                val homeVerModels = ArrayList<HomeVerModel>()
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.pizza1,
                        "Pizza 1",
                        "10:00 - 23:00",
                        "5.5",
                        "Rp - 110k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.pizza2,
                        "Pizza 2",
                        "10:00 - 23:00",
                        "5.9",
                        "Rp - 105k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.pizza3,
                        "Pizza 3",
                        "10:00 - 23:00",
                        "5.0",
                        "Rp - 115k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.pizza4,
                        "Pizza 4",
                        "10:00 - 23:00",
                        "5.0",
                        "Rp - 112k"
                    )
                )

                updateVerticalRec.callBack(position, homeVerModels)
            } else if (position == 1) {
                val homeVerModels = ArrayList<HomeVerModel>()

                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.burger1,
                        "Burger 1",
                        "10:00 - 23:00",
                        "4.5",
                        "Rp - 70k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.burger2,
                        "Burger 2",
                        "10:00 - 23:00",
                        "5.5",
                        "Rp - 80k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.burger4,
                        "Burger 3",
                        "10:00 - 23:00",
                        "5.0",
                        "Rp - 75k"
                    )
                )

                updateVerticalRec.callBack(position, homeVerModels)
            } else if (position == 2) {
                val homeVerModels = ArrayList<HomeVerModel>()

                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.fries1,
                        "Fries 1",
                        "10:00 - 23:00",
                        "4.9",
                        "Rp - 15k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.fries2,
                        "Fries 2",
                        "10:00 - 23:00",
                        "4.9",
                        "Rp - 10k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.fries3,
                        "Fries 3",
                        "10:00 - 23:00",
                        "4.9",
                        "Rp - 15k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.fries4,
                        "Fries 4",
                        "10:00 - 23:00",
                        "4.9",
                        "Rp - 5k"
                    )
                )

                updateVerticalRec.callBack(position, homeVerModels)
            } else if (position == 3) {
                val homeVerModels = ArrayList<HomeVerModel>()

                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.icecream1,
                        "IceCream 1",
                        "10:00 - 23:00",
                        "4.0",
                        "Rp - 10k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.icecream2,
                        "IceCream 2",
                        "10:00 - 23:00",
                        "4.5",
                        "Rp - 20k"
                    )
                )
                homeVerModels.add(
                    HomeVerModel(
                        R.drawable.icecream3,
                        "IceCream 3",
                        "10:00 - 23:00",
                        "5.0",
                        "Rp - 25k"
                    )
                )

                updateVerticalRec.callBack(position, homeVerModels)
            }
        }

        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg)
                select = false
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg)
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView =
            itemView.findViewById(R.id.hor_img)
        var name: TextView =
            itemView.findViewById(R.id.hor_text)
        var cardView: CardView = itemView.findViewById(R.id.cardView)
    }
}
