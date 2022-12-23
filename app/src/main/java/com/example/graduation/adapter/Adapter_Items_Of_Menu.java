package com.example.graduation.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.graduation.R;
import com.example.graduation.models.Items_Of_Menu;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Items_Of_Menu extends RecyclerView.Adapter<Adapter_Items_Of_Menu.ViewHolder> {

    Context context;
    ArrayList<Items_Of_Menu> list;

    public Adapter_Items_Of_Menu(Context context, ArrayList<Items_Of_Menu> list ) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Items_Of_Menu model = list.get(position);
        holder.imageView.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(view.getRootView().getContext());
                View dialogView=LayoutInflater.from(view.getRootView().getContext()).inflate(R.layout.items_pop,null);
                de.hdodenhof.circleimageview.CircleImageView image3 ;
                TextView textView3 , textView7 ;
                Button button3;
                image3=dialogView.findViewById(R.id.image3);
                textView3=dialogView.findViewById(R.id.textView3);
                textView7=dialogView.findViewById(R.id.textView7);
                button3=dialogView.findViewById(R.id.button3);
                image3.setImageResource(model.getImage());
                textView3.setText(model.getName());
                textView7.setText(model.getPrise());
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast = Toast.makeText(context.getApplicationContext(), "Simple Toast In Android", Toast.LENGTH_LONG); // initiate the Toast with context, message and duration for the Toast
                        toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);     // set gravity for the Toast.
                        toast.setText("added to cart"); // set the text for the Toast
                        toast.show(); // display the Toast
                    }
                });
                builder.setView(dialogView);
                builder.setCancelable(true);
                builder.show();
            }
        }
        );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_1);
            name = itemView.findViewById(R.id.name);
    }
    }
}
