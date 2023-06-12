package com.example.foodmaket.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodmaket.R;
import com.example.foodmaket.models.ItemWithPicture;

import java.util.List;

public class AdapterWithImgSecond extends RecyclerView.Adapter<AdapterWithImgSecond.RVWithImgSecond> {
    private List<ItemWithPicture> itemsList;
    private Context context;

    public AdapterWithImgSecond(Context context, List<ItemWithPicture> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public AdapterWithImgSecond.RVWithImgSecond onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_with_img_second, parent, false);
        return new AdapterWithImgSecond.RVWithImgSecond(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWithImgSecond.RVWithImgSecond holder, int position) {
        holder.title.setText(itemsList.get(position).getName());
        holder.price.setText(String.valueOf("+$" + itemsList.get(position).getPrice()));
        holder.info.setText(itemsList.get(position).getInfo());
        holder.image.setImageResource(itemsList.get(position).getImg());
        holder.btn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("This function will be add :)");
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class RVWithImgSecond extends RecyclerView.ViewHolder {

     private TextView title,
                      price,
                      info,
                      btn_text;
      private ImageView image;


        public RVWithImgSecond(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
            info = itemView.findViewById(R.id.info);
            image = itemView.findViewById(R.id.image);
            btn_text = itemView.findViewById(R.id.rv_btn_configure);
        }
    }
}

