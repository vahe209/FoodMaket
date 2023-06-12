package com.example.foodmaket.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodmaket.R;
import com.example.foodmaket.models.ItemWithPicture;
import com.example.foodmaket.models.Items;

import java.util.List;

public class AdapterWithImgFirst extends RecyclerView.Adapter<AdapterWithImgFirst.RVWithImgFirst> {
    private List<ItemWithPicture> itemsList;
    private Context context;
    private int counter;

    public AdapterWithImgFirst(Context context, List<ItemWithPicture> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public AdapterWithImgFirst.RVWithImgFirst onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_with_img, parent, false);
        return new AdapterWithImgFirst.RVWithImgFirst(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWithImgFirst.RVWithImgFirst holder, int position) {
        holder.title.setText(itemsList.get(position).getName());
        holder.price.setText(String.valueOf("+$" + itemsList.get(position).getPrice()));
        holder.info.setText(itemsList.get(position).getInfo());
        holder.image.setImageResource(itemsList.get(position).getImg());
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

    public class RVWithImgFirst extends RecyclerView.ViewHolder {

        TextView title,
                 price,
                 info,
                 count;
        ImageView image;
        ImageButton plus,
                    minus;


        public RVWithImgFirst(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
            info = itemView.findViewById(R.id.info);
            image = itemView.findViewById(R.id.image);
            plus = itemView.findViewById(R.id.addButton);
            minus = itemView.findViewById(R.id.removeButton);
            count = itemView.findViewById(R.id.count_of_food);
        }
    }
}

