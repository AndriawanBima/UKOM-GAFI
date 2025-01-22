package com.ukom.resto2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.adapters.HomeHorAdapter
import com.ukom.resto2.adapters.HomeVerAdapter
import com.ukom.resto2.adapters.UpdateVerticalRec
import com.ukom.resto2.models.HomeHorModel
import com.ukom.resto2.models.HomeVerModel

class HomeFragment : Fragment(), UpdateVerticalRec {
    var homeHorizontalRec: RecyclerView? = null
    var homeVerticalRec: RecyclerView? = null
    var homeHorModelsList: ArrayList<HomeHorModel>? = null
    var homeHorAdapter: HomeHorAdapter? = null

    //////////////////////Vertical
    var homeVerModelsList: ArrayList<HomeVerModel>? = null
    var homeVerAdapter: HomeVerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec)
        homeVerticalRec = root.findViewById(R.id.home_ver_rec)

        //////////////////////Horizontal RecyclerView
        homeHorModelsList = ArrayList()

        homeHorModelsList!!.add(HomeHorModel(R.drawable.pizza, "Pizza"))
        homeHorModelsList!!.add(HomeHorModel(R.drawable.hamburger, "Hamburger"))
        homeHorModelsList!!.add(HomeHorModel(R.drawable.fried_potatoes, "Fries"))
        homeHorModelsList!!.add(HomeHorModel(R.drawable.ice_cream, "Ice Cream"))

        homeHorAdapter = HomeHorAdapter(this, activity, homeHorModelsList)
        homeHorizontalRec.setAdapter(homeHorAdapter)
        homeHorizontalRec.setLayoutManager(
            LinearLayoutManager(
                activity,
                RecyclerView.HORIZONTAL,
                false
            )
        )
        homeHorizontalRec.setHasFixedSize(true)
        homeHorizontalRec.setNestedScrollingEnabled(false)


        //////////////////////Vertical RecyclerView
        homeVerModelsList = ArrayList()


        homeVerAdapter = HomeVerAdapter(activity, homeVerModelsList)
        homeVerticalRec.setAdapter(homeVerAdapter)
        homeVerticalRec.setLayoutManager(
            LinearLayoutManager(
                activity,
                RecyclerView.VERTICAL,
                false
            )
        )

        return root
    }

    override fun callBack(position: Int, list: ArrayList<HomeVerModel>) {
        homeVerAdapter = HomeVerAdapter(context, list)
        homeVerAdapter!!.notifyDataSetChanged()
        homeVerticalRec!!.adapter = homeVerAdapter
    }
}