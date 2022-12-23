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
            items_of_menus.add(new Items_Of_Menu(R.drawable.four_cheese_garlic_bread, "four_cheese_garlic_bread", "30$"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.mozzarella_sticks, "mozzarella_sticks", "30$"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.chicken_tenders, "chicken_tenders", "30$"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.stuffed_mushrooms, "stuffed_mushrooms", "30$"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.nachos, "nachos", "30$"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.french_fries, "french_fries", "30$"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.onion_rings, "onion_rings", "30$"));
            items_of_menus.add(new Items_Of_Menu(R.drawable.classic_wings, "classic_wings", "30$"));

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
                    items_of_menus.add(new Items_Of_Menu(R.drawable.four_cheese_garlic_bread, "four_cheese_garlic_bread", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.mozzarella_sticks, "mozzarella_sticks", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.chicken_tenders, "chicken_tenders", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.stuffed_mushrooms, "stuffed_mushrooms", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.nachos, "nachos", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.french_fries, "french_fries", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.onion_rings, "onion_rings", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.classic_wings, "classic_wings", "30$"));
                    updateItems.callBack(position, items_of_menus);

                } else if (position == 1) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();
                    items_of_menus.add(new Items_Of_Menu(R.drawable.chicken_caesar_salad, "chicken caesar salad", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.greek_salad, "Fruit Salad", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.halloumi_salad, "halloumi_salad", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.quinoa_salad, "quinoa_salad", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.rocca_salad, "rocca_salad", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.taboola_salad, "taboola_salad", "30$"));
                    updateItems.callBack(position, items_of_menus);
                }
                if (position == 2) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.beef_mushroom_sauce, "beef_mushroom_sauce", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.beef_stroganoff, "beef_stroganoff", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.chicken_fajita, "chicken_fajita", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.chicken_pesto, "chicken_pesto", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.entrecote_steak, "entrecote_steak", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.garlic_lemon_chicken, "garlic_lemon_chicken", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.grilled_salmon, "grilled_salmon", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.grilled_shrimps, "grilled_shrimps", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.mushroom_chicken, "mushroom_chicken", "30$"));
                    updateItems.callBack(position, items_of_menus);

                }
                if (position == 3) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.asado_burger, "asado_burger", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.classic_burger, "classic_burger", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.crispy_burger, "crispy_burger", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.grilled_burger, "grilled_burger", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.mexican_burger, "mexican_burger", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.steak_burger, "steak_burger", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.swiss_burger, "swiss_burger", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.vegerarian_burger, "vegerarian_burger", "30$"));

                    updateItems.callBack(position, items_of_menus);
                }
                if (position == 4) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.apple, "apple", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.carrot, "carrot", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.lemon, "lemon", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.pomegranate, "pomegranate", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.strawberry, "strawberry", "30$"));

                    updateItems.callBack(position, items_of_menus);
                }
                if (position == 5) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.cappuccino, "cappuccino", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.chai_late, "chai_late", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.epreso, "epreso", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.nescafe, "nescafe", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.traditional_turkish_coffee, "traditional_turkish_coffee", "30$"));
                    updateItems.callBack(position, items_of_menus);

                }
                if (position == 6) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.brownies, "brownies", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.cheese_cake, "cheese_cake", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.creme_brulee, "creme_brulee", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.souffle, "souffle", "30$"));
                    updateItems.callBack(position, items_of_menus);


                }
                if (position == 7) {

                    ArrayList<Items_Of_Menu> items_of_menus = new ArrayList<>();

                    items_of_menus.add(new Items_Of_Menu(R.drawable.hoka, "two apple", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.hoka, "blueberry", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.hoka, "lemon and melt", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.hoka, "watermelon", "30$"));
                    items_of_menus.add(new Items_Of_Menu(R.drawable.hoka, "candy", "30$"));


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
