package com.ukom.resto2.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ukom.resto2.R
import com.ukom.resto2.adapters.CartAdapter
import com.ukom.resto2.models.CartModel

class MyCartFragment : Fragment() {
    var list: MutableList<CartModel>? = null
    var cartAdapter: CartAdapter? = null
    var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_my_cart, container, false)

        recyclerView = view.findViewById(R.id.cart_rec)
        recyclerView?.setLayoutManager(LinearLayoutManager(context))

        list = ArrayList()
        (list as ArrayList<CartModel>).add(CartModel(R.drawable.s1, "Order 1", "1k", "4.5"))
        (list as ArrayList<CartModel>).add(CartModel(R.drawable.s2, "Order 2", "20k", "4.5"))
        (list as ArrayList<CartModel>).add(CartModel(R.drawable.fav1, "Order 3", "22k", "4.5"))
        (list as ArrayList<CartModel>).add(CartModel(R.drawable.s1, "Order 1", "50k", "4.5"))
        (list as ArrayList<CartModel>).add(CartModel(R.drawable.s2, "Order 2", "40k", "4.5"))
        (list as ArrayList<CartModel>).add(CartModel(R.drawable.fav1, "Order 3", "35k", "4.5"))
        cartAdapter = CartAdapter(list as ArrayList<CartModel>)
        recyclerView?.setAdapter(cartAdapter)

        return view
    }
}