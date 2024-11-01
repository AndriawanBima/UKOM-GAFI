package com.ukom.resto2.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ukom.resto2.R;
import com.ukom.resto2.adapters.CartAdapter;
import com.ukom.resto2.models.CartModel;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.s1,"Order 1","1k","4.5"));
        list.add(new CartModel(R.drawable.s2,"Order 2","20k","4.5"));
        list.add(new CartModel(R.drawable.fav1,"Order 3","22k","4.5"));
        list.add(new CartModel(R.drawable.s1,"Order 1","50k","4.5"));
        list.add(new CartModel(R.drawable.s2,"Order 2","40k","4.5"));
        list.add(new CartModel(R.drawable.fav1,"Order 3","35k","4.5"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }
}