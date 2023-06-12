package com.example.foodmaket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.foodmaket.adapters.AdapterInConfigure;
import com.example.foodmaket.adapters.AdapterWithImgFirst;
import com.example.foodmaket.adapters.AdapterWithImgSecond;
import com.example.foodmaket.adapters.AdapterWithoutImgFirst;
import com.example.foodmaket.adapters.FirstAdapter;
import com.example.foodmaket.adapters.SecondAdapter;
import com.example.foodmaket.models.ItemWithPicture;
import com.example.foodmaket.models.ItemWithoutPicture;
import com.example.foodmaket.models.Items;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private List<Items> itemsList;
    private List<ItemWithPicture> itemListWithPictures;
    private AdapterWithImgSecond adapterWithImgSecond;
    private List<ItemWithoutPicture> itemWithoutPictureList;
    private FirstAdapter firstAdapter;
    private SecondAdapter secondAdapter;
    private AdapterWithoutImgFirst adapterWithoutImgFirst;
    private AdapterInConfigure adapterInConfigure;
    private AdapterWithImgFirst adapterWithImgFirst;
    private RecyclerView firstRV,
            secondRV,
            rVWithImageFirst,
            rVWithoutImageFirst,
            rVWithImageSecond,
            rVInConfigure,
            rVInConfigure2,
            rVInConfigure3,
            rVWithImageThird;
    private TextView count,
            count2;
    private ImageButton minus,
            plus,
            minus2,
            plus2;
    private int counter = 0;
    private int counter2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstRV = findViewById(R.id.firstRV);
        secondRV = findViewById(R.id.secondRV);
        rVWithImageFirst = findViewById(R.id.rv_with_image_first);
        rVWithoutImageFirst = findViewById(R.id.rv_without_image_first);
        rVWithImageSecond = findViewById(R.id.rv_without_image_second);
        rVInConfigure = findViewById(R.id.rv_in_configure);
        rVInConfigure2 = findViewById(R.id.rv_in_configure2);
        rVInConfigure3 = findViewById(R.id.rv_in_configure3);
        rVWithImageThird = findViewById(R.id.lastRV);
        toolbar = findViewById(R.id.toolbar);
        count = findViewById(R.id.count_of_food);
        count2 = findViewById(R.id.count_of_food2);
        minus = findViewById(R.id.removeButton);
        plus = findViewById(R.id.add_button);
        plus2 = findViewById(R.id.add_button2);
        minus2 = findViewById(R.id.removeButton2);
        plus.setOnClickListener(v -> plusCount());
        minus.setOnClickListener(v -> minusCount());
        plus2.setOnClickListener(v -> plusCount2());
        minus2.setOnClickListener(v -> minusCount2());

        itemsList = new ArrayList<>();
        itemsList.add(new Items("Add Bacon or Cheese", (float) 0.75));
        itemsList.add(new Items("Add Bacon or Cheese", (float) 0.75));
        setFirstItemsList(itemsList);

        itemsList = new ArrayList<>();
        itemsList.add(new Items("Add Bacon or Cheese", (float) 0.75));
        itemsList.add(new Items("Add Bacon or Cheese", (float) 0.75));
        setSecondItemsList(itemsList);

        itemListWithPictures = new ArrayList<>();
        itemListWithPictures.add(new ItemWithPicture("Name/Title", "Lorem Ipsum dolar sit amet", (float) 7.99, R.color.grey));
        setRVWithPictureFirst(itemListWithPictures);

        itemWithoutPictureList = new ArrayList<>();
        itemWithoutPictureList.add(new ItemWithoutPicture("Name/Title", "Lorem Ipsum dolar sit amet", (float) 7.99));
        setRVWithoutPictureFirst(itemWithoutPictureList);

        itemListWithPictures = new ArrayList<>();
        itemListWithPictures.add(new ItemWithPicture("Name/Title", "Lorem Ipsum dolar sit amet", (float) 7.99, R.color.grey));
        setRVWithPictureSecond(itemListWithPictures);

        itemListWithPictures = new ArrayList<>();
        itemListWithPictures.add(new ItemWithPicture("Name/Title", "Lorem Ipsum dolar sit amet", (float) 7.99, R.color.grey));
        setRVInConfigure(itemListWithPictures);

        itemsList = new ArrayList<>();
        itemsList.add(new Items("Add Bacon or ", (float) 0.75));
        itemsList.add(new Items("Add Bacon or ", (float) 0.75));
        itemsList.add(new Items("Add Bacon or ", (float) 0.75));
        setRVInConfigure2(itemsList);

        itemsList = new ArrayList<>();
        itemsList.add(new Items("Add Bacon or ", (float) 0.75));
        setRVInConfigure3(itemsList);

        itemListWithPictures = new ArrayList<>();
        itemListWithPictures.add(new ItemWithPicture("Name/Title", "Lorem Ipsum dolar sit amet", (float) 7.99, R.color.grey));
        setRVWithPictureThird(itemListWithPictures);
    }
    
    private void minusCount() {
        if (counter > 0) {
            counter--;
            count.setText(String.valueOf(counter));
        }
    }
    private void plusCount2() {
        counter2++;
        count2.setText(String.valueOf(counter2));
    }
    private void minusCount2() {
        if (counter2 > 0) {
            counter2--;
            count2.setText(String.valueOf(counter2));
        }
    }
    private void plusCount() {
        counter++;
        count.setText(String.valueOf(counter));
    }
    private void setFirstItemsList(List<Items> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        firstRV.setLayoutManager(layoutManager);
        firstAdapter = new FirstAdapter(this, dataList);
        firstRV.setAdapter(firstAdapter);
    }
    private void setSecondItemsList(List<Items> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        secondRV.setLayoutManager(layoutManager);
        secondAdapter = new SecondAdapter(this, dataList);
        secondRV.setAdapter(secondAdapter);
    }
    private void setRVWithPictureFirst(List<ItemWithPicture> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rVWithImageFirst.setLayoutManager(layoutManager);
        adapterWithImgFirst = new AdapterWithImgFirst(this, dataList);
        rVWithImageFirst.setAdapter(adapterWithImgFirst);
    }
    private void setRVWithoutPictureFirst(List<ItemWithoutPicture> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rVWithoutImageFirst.setLayoutManager(layoutManager);
        adapterWithoutImgFirst = new AdapterWithoutImgFirst(this, dataList);
        rVWithoutImageFirst.setAdapter(adapterWithoutImgFirst);
    }
    private void setRVWithPictureSecond(List<ItemWithPicture> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rVWithImageSecond.setLayoutManager(layoutManager);
        adapterWithImgSecond = new AdapterWithImgSecond(this, dataList);
        rVWithImageSecond.setAdapter(adapterWithImgSecond);
    }
    private void setRVInConfigure(List<ItemWithPicture> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rVInConfigure.setLayoutManager(layoutManager);
        adapterInConfigure = new AdapterInConfigure(this, dataList);
        rVInConfigure.setAdapter(adapterInConfigure);
    }
    private void setRVInConfigure2(List<Items> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rVInConfigure2.setLayoutManager(layoutManager);
        firstAdapter = new FirstAdapter(this, dataList);
        rVInConfigure2.setAdapter(firstAdapter);
    }
    private void setRVInConfigure3(List<Items> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rVInConfigure3.setLayoutManager(layoutManager);
        secondAdapter = new SecondAdapter(this, dataList);
        rVInConfigure3.setAdapter(secondAdapter);
    }
    private void setRVWithPictureThird(List<ItemWithPicture> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rVWithImageThird.setLayoutManager(layoutManager);
        adapterWithImgSecond = new AdapterWithImgSecond(this, dataList);
        rVWithImageThird.setAdapter(adapterWithImgSecond);
    }
}