package com.example.graduation.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.graduation.R;
import com.example.graduation.adapter.CartAdapter;
import com.example.graduation.models.CardModel;

import java.util.ArrayList;
import java.util.List;


public class Cart extends Fragment {

    List<CardModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cart_fragment,container,false);

        recyclerView = view.findViewById(R.id.items_on_cart);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CardModel(R.drawable.iconcart,"item"));
        list.add(new CardModel(R.drawable.iconcart,"item"));
        list.add(new CardModel(R.drawable.iconcart,"item"));
        list.add(new CardModel(R.drawable.iconcart,"item"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);





        return view;
    }


}