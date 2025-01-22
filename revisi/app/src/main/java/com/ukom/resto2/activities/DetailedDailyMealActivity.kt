package com.ukom.resto2.activities

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.adapters.DetailedDailyAdapter
import com.ukom.resto2.models.DetailedDailyModel

class DetailedDailyMealActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var detailedDailyModelsList: MutableList<DetailedDailyModel>? = null
    var dailyAdapter: DetailedDailyAdapter? = null
    var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_daily_meal)

        val type = intent.getStringExtra("type")

        recyclerView = findViewById(R.id.detailed_rec)
        imageView = findViewById(R.id.detailed_img)

        recyclerView?.setLayoutManager(LinearLayoutManager(this))
        detailedDailyModelsList = ArrayList()
        dailyAdapter = DetailedDailyAdapter(detailedDailyModelsList as ArrayList<DetailedDailyModel>)
        recyclerView?.setAdapter(dailyAdapter)

        if (type != null && type.equals("breakfast", ignoreCase = true)) {
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.fav1,
                    "Salad",
                    "breakfast",
                    "4.8",
                    "22k",
                    "7am to 10pm"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.fav2,
                    "Bread",
                    "breakfast",
                    "4.5",
                    "30k",
                    "7am to 10pm"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.fav3,
                    "Aglio Olio",
                    "breakfast",
                    "4.5",
                    "40k",
                    "7am to 10pm"
                )
            )
            dailyAdapter!!.notifyDataSetChanged()
        }

        if (type != null && type.equals("sweets", ignoreCase = true)) {
            imageView?.setImageResource(R.drawable.sweets)
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.s1,
                    "Candy",
                    "sweets",
                    "4.5",
                    "1k",
                    "11am to 1am"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.s2,
                    "Donut's",
                    "sweets",
                    "4.5",
                    "20k",
                    "11am to 1am"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.s3,
                    "Ice Cream",
                    "sweets",
                    "4",
                    "15k",
                    "11am to 1am"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.s4,
                    "Stobery Cake",
                    "sweets",
                    "4.5",
                    "15k",
                    "11am to 1am"
                )
            )
            dailyAdapter!!.notifyDataSetChanged()
        }

        if (type != null && type.equals("lunch", ignoreCase = true)) {
            imageView?.setImageResource(R.drawable.lunch)
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.l1,
                    "Ayam Serundeng",
                    "lunch",
                    "4.8",
                    "12k",
                    "12am to 2am"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.l2,
                    "Steak Daging",
                    "lunch",
                    "4.2",
                    "20k",
                    "12am to 2am"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.l3,
                    "Sop Iga",
                    "lunch",
                    "4.5",
                    "15k",
                    "12am to 2am"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.l4,
                    "Ayam Richise",
                    "lunch",
                    "4.8",
                    "25k",
                    "12am to 2am"
                )
            )
        }

        if (type != null && type.equals("dinner", ignoreCase = true)) {
            imageView?.setImageResource(R.drawable.dinner)
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.d1,
                    "Chiken Pepper",
                    "dinner",
                    "4.8",
                    "20k",
                    "6pm to 11pm"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.d2,
                    "Beef Pasta",
                    "dinner",
                    "4.7",
                    "35k",
                    "6pm to 11pm"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.d3,
                    "Pepper Steak",
                    "dinner",
                    "4.5",
                    "25k",
                    "6pm to 11pm"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.d4,
                    "Chiken Curry",
                    "dinner",
                    "4.8",
                    "20kk",
                    "6pm to 11pm"
                )
            )
        }

        if (type != null && type.equals("coffee", ignoreCase = true)) {
            imageView?.setImageResource(R.drawable.coffe)
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.c1,
                    "Coffe Figs",
                    "coffe",
                    "4.9",
                    "25k",
                    "12am to 2am"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.c2,
                    "Caramel Hazelnut",
                    "coffe",
                    "4.9",
                    "30k",
                    "12am to 2am"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.c3,
                    "Dalgona Coffe",
                    "coffe",
                    "4.5",
                    "15k",
                    "12am to 2am"
                )
            )
            (detailedDailyModelsList as ArrayList<DetailedDailyModel>).add(
                DetailedDailyModel(
                    R.drawable.c4,
                    "Coffe Jelly",
                    "coffe",
                    "4.7",
                    "10k",
                    "12am to 2am"
                )
            )
        }
    }
}
