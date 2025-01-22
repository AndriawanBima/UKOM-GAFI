package com.ukom.resto2.ui.dailymeal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.adapters.DailyMealAdapter
import com.ukom.resto2.models.DailyMealModel

class DailyMealFragment : Fragment() {
    var recyclerView: RecyclerView? = null
    var dailyMealModels: MutableList<DailyMealModel>? = null
    var dailyMealAdapter: DailyMealAdapter? = null
    var imageView: ImageView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.daily_meal_fragment, container, false)

        recyclerView = root.findViewById(R.id.daily_meal_rec)
        recyclerView?.setLayoutManager(LinearLayoutManager(context))
        dailyMealModels = ArrayList()

        (dailyMealModels as ArrayList<DailyMealModel>).add(
            DailyMealModel(
                R.drawable.breakfast,
                "Breakfast",
                "30% OFF",
                "Description",
                "breakfast"
            )
        )
        (dailyMealModels as ArrayList<DailyMealModel>).add(
            DailyMealModel(
                R.drawable.lunch,
                "Lunch",
                "30% OFF",
                "Description",
                "lunch"
            )
        )
        (dailyMealModels as ArrayList<DailyMealModel>).add(
            DailyMealModel(
                R.drawable.dinner,
                "Dinner",
                "20% OFF",
                "Description",
                "dinner"
            )
        )
        (dailyMealModels as ArrayList<DailyMealModel>).add(
            DailyMealModel(
                R.drawable.sweets,
                "Sweets",
                "39% OFF",
                "Description",
                "sweets"
            )
        )
        (dailyMealModels as ArrayList<DailyMealModel>).add(
            DailyMealModel(
                R.drawable.coffe,
                "Coffee",
                "15% OFF",
                "Description",
                "coffee"
            )
        )

        dailyMealAdapter = context?.let { DailyMealAdapter(it, dailyMealModels as ArrayList<DailyMealModel>) }
        recyclerView?.setAdapter(dailyMealAdapter)
        dailyMealAdapter!!.notifyDataSetChanged()
        return root
    }
}