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

import java.util.List;

public class AdapterInConfigure extends RecyclerView.Adapter<AdapterInConfigure.RVInConfigure> {
    private List<ItemWithPicture> itemsList;
    private Context context;

    public AdapterInConfigure(Context context, List<ItemWithPicture> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }


    @NonNull
    @Override
    public RVInConfigure onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_in_configure, parent, false);
        return new AdapterInConfigure.RVInConfigure(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVInConfigure holder, int position) {
        holder.title.setText(itemsList.get(position).getName());
        holder.price.setText(String.valueOf("+$" + itemsList.get(position).getPrice()));
        holder.info.setText(itemsList.get(position).getInfo());
        holder.image.setImageResource(itemsList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class RVInConfigure extends RecyclerView.ViewHolder {

        private TextView title,
                price,
                info,
                count;
        private ImageView image;

        public RVInConfigure(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
            info = itemView.findViewById(R.id.info);
            image = itemView.findViewById(R.id.image);
        }
    }


}
