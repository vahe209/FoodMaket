package com.example.foodmaket.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodmaket.R;
import com.example.foodmaket.models.ItemWithoutPicture;

import java.util.List;

public class AdapterWithoutImgFirst extends RecyclerView.Adapter<AdapterWithoutImgFirst.RVWithoutImgFirst> {
    private List<ItemWithoutPicture> itemsList;
    private Context context;
    private int counter;

    public AdapterWithoutImgFirst(Context context, List<ItemWithoutPicture> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public AdapterWithoutImgFirst.RVWithoutImgFirst onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_without_img, parent, false);
        return new AdapterWithoutImgFirst.RVWithoutImgFirst(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWithoutImgFirst.RVWithoutImgFirst holder, int position) {
        holder.title.setText(itemsList.get(position).getName());
        holder.price.setText(String.valueOf("+$" + itemsList.get(position).getPrice()));
        holder.info.setText(itemsList.get(position).getInfo());
        holder.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                holder.count.setText(String.valueOf(counter));
            }
        });
        holder.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 0) {
                    counter--;
                    holder.count.setText(String.valueOf(counter));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class RVWithoutImgFirst extends RecyclerView.ViewHolder {

        private TextView title,
                price,
                info,
                count;
        private ImageButton plus,
                minus;


        public RVWithoutImgFirst(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
            info = itemView.findViewById(R.id.info);
            plus = itemView.findViewById(R.id.addButton);
            minus = itemView.findViewById(R.id.removeButton);
            count = itemView.findViewById(R.id.count_of_food);
        }
    }
}
