package com.ukom.resto2.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.adapters.FeaturedAdapter
import com.ukom.resto2.adapters.FeaturedVerAdapter
import com.ukom.resto2.models.FeaturedModel
import com.ukom.resto2.models.FeaturedVerModel

class ThirdFragment : Fragment() {
    /////////Featured Hor RecyclerView
    var featuredModelList: MutableList<FeaturedModel>? = null
    var recyclerView: RecyclerView? = null
    var featuredAdapter: FeaturedAdapter? = null


    ////////Featured Ver RecyclerView
    var featuredVerModelList: MutableList<FeaturedVerModel>? = null
    var recyclerView2: RecyclerView? = null
    var featuredVerAdapter: FeaturedVerAdapter? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)


        /////////Featured Hor RecyclerView
        recyclerView = view.findViewById(R.id.featured_hor_rec)
        recyclerView?.setLayoutManager(LinearLayoutManager(context, RecyclerView.HORIZONTAL, false))
        featuredModelList = ArrayList()

        (featuredModelList as ArrayList<FeaturedModel>).add(FeaturedModel(R.drawable.new1, "New 1", "Description 1"))
        (featuredModelList as ArrayList<FeaturedModel>).add(FeaturedModel(R.drawable.new2, "New 2", "Description 2"))
        (featuredModelList as ArrayList<FeaturedModel>).add(FeaturedModel(R.drawable.new3, "New 3", "Description 3"))

        featuredAdapter = FeaturedAdapter(featuredModelList as ArrayList<FeaturedModel>)
        recyclerView?.setAdapter(featuredAdapter)


        ////////Featured Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec)
        recyclerView2?.setLayoutManager(LinearLayoutManager(context, RecyclerView.VERTICAL, false))
        featuredVerModelList = ArrayList()

        (featuredVerModelList as ArrayList<FeaturedVerModel>).add(
            FeaturedVerModel(
                R.drawable.new11,
                "New 1",
                "Pink Lava",
                "4.8",
                "10:00-13:00"
            )
        )
        (featuredVerModelList as ArrayList<FeaturedVerModel>).add(
            FeaturedVerModel(
                R.drawable.new22,
                "New 2",
                "Corn Dog",
                "4.8",
                "12:00-20:00"
            )
        )
        (featuredVerModelList as ArrayList<FeaturedVerModel>).add(
            FeaturedVerModel(
                R.drawable.new33,
                "New 3",
                "Candy",
                "4.8",
                "09:00-20:00"
            )
        )

        featuredVerAdapter = FeaturedVerAdapter(featuredVerModelList as ArrayList<FeaturedVerModel>)
        recyclerView2?.setAdapter(featuredVerAdapter)
        return view
    }
}