package com.example.foodmaket.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodmaket.R;
import com.example.foodmaket.models.Items;

import java.util.List;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.SecondVH> {
    private List<Items> itemsList;
    private Context context;

    public SecondAdapter(Context context, List<Items> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public SecondAdapter.SecondVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec2_row, parent, false);
        return new SecondAdapter.SecondVH(view);
    }


    @Override
    public void onBindViewHolder(@NonNull SecondAdapter.SecondVH holder, int position) {
        holder.details.setText(itemsList.get(position).getDetails());
        holder.price.setText(String.valueOf("+$" + itemsList.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }


    public class SecondVH extends RecyclerView.ViewHolder {

        private TextView details;
        private TextView price;

        public SecondVH(@NonNull View itemView) {
            super(itemView);
            details = itemView.findViewById(R.id.details);
            price = itemView.findViewById(R.id.price);
        }
    }


}
