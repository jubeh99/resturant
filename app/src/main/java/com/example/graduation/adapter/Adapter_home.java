package com.example.graduation.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.graduation.R;
import com.example.graduation.models.Home_Models;
import com.example.graduation.models.Items_Of_Menu;

import java.util.ArrayList;

public class Adapter_home extends RecyclerView.Adapter<Adapter_home.ViewHolder> {

    UpdateItems updateItems;
    Activity activity;
    ArrayList<Home_Models> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public Adapter_home(UpdateItems updateItems, Activity activity, ArrayList<Home_Models> list) {
        this.updateItems = updateItems;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.horizantal_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.text_name.setText(list.get(position).getName());

        if (check) {
            ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();
            items_of_menus.add(new Items_Of_Menu(R.drawable.four_cheese_garlic_bread, "four_cheese_garlic_bread"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.mozzarella_sticks, "mozzarella_sticks"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.chicken_tenders, "chicken_tenders"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.stuffed_mushrooms, "stuffed_mushrooms"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.nachos, "nachos"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.french_fries, "french_fries"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.onion_rings, "onion_rings"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.classic_wings, "classic_wings"));

            updateItems.callBack(position, items_of_menus);
            check = false;
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();
                if (position == 0) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();
                    items_of_menus.add(new Items_Of_Menu(R.drawable.four_cheese_garlic_bread, "four_cheese_garlic_bread"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.mozzarella_sticks, "mozzarella_sticks"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.chicken_tenders, "chicken_tenders"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.stuffed_mushrooms, "stuffed_mushrooms"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.nachos, "nachos"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.french_fries, "french_fries"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.onion_rings, "onion_rings"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.classic_wings, "classic_wings"));
                    updateItems.callBack(position, items_of_menus);

                } else if (position == 1) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();
                    items_of_menus.add(new Items_Of_Menu(R.drawable.fajita, "1"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.dd, "Fruit Salad" +
                            "50$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "3"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.apptizer, "4"));
                    updateItems.callBack(position, items_of_menus);
                }
                if (position == 2) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "1"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "2"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "3"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "4"));
                    updateItems.callBack(position, items_of_menus);

                }
                if (position == 3) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.hooka, "1"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.hooka, "2"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.hooka, "3"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.hooka, "4"));

                    updateItems.callBack(position, items_of_menus);
                }
                if (position == 4) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "1"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "2"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "3"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "4"));

                    updateItems.callBack(position, items_of_menus);
                }
                if (position == 5) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "1"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "2"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "3"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "4"));
                    updateItems.callBack(position, items_of_menus);

                }
                if (position == 6) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "1"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "2"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "3"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "4"));
                    updateItems.callBack(position, items_of_menus);


                }
                if (position == 7) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "1"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "2"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "3"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.burger, "4"));

                    updateItems.callBack(position, items_of_menus);


                }


            }
        });

        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.round);
                select = false;
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.round);

            } else {
                holder.cardView.setBackgroundResource(R.drawable.round2);

            }
        }
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView text_name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_1);
            text_name = itemView.findViewById(R.id.text_1);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}
