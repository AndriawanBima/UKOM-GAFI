package com.ukom.resto2.ui.favourite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.ukom.resto2.Fragments.FragmentAdapter
import com.ukom.resto2.R

class FavouriteFragment : Fragment() {
    var tabLayout: TabLayout? = null
    var viewPager2: ViewPager2? = null
    var fragmentAdapter: FragmentAdapter? = null
    private val MyContext: FragmentActivity? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_favourite, container, false)


        tabLayout = root.findViewById(R.id.tabLayout)
        viewPager2 = root.findViewById(R.id.view_pager2)

        val fm = requireActivity().supportFragmentManager
        fragmentAdapter = FragmentAdapter(fm, getLifecycle())

        viewPager2?.setAdapter(fragmentAdapter)

        tabLayout?.newTab()?.let { tabLayout?.addTab(it.setText("Featured")) }
        tabLayout?.newTab()?.let { tabLayout?.addTab(it.setText("Popular")) }
        tabLayout?.newTab()?.let { tabLayout?.addTab(it.setText("New")) }

        tabLayout?.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager2?.setCurrentItem(tab.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
            }
        })

        viewPager2?.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                tabLayout?.selectTab(tabLayout?.getTabAt(position))
            }
        })


        return root
    }

    private fun getLifecycle() {

    }
}