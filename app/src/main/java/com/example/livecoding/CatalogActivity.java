package com.example.livecoding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.livecoding.adapters.ProductsAdapter;
import com.example.livecoding.databinding.ActivityCatalogBinding;
import com.example.livecoding.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogActivity extends AppCompatActivity {
    ActivityCatalogBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        b = ActivityCatalogBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        setUpProductList();
    }

    private void setUpProductList() {
        //Create dataset
        List<Product> products = new ArrayList<>(
                Arrays.asList(
                        new Product("Tomato", 20),
                        new Product("Orange", 30),
                        new Product("Kiwi", 40),
                        new Product("Papaya", 50),
                        new Product("Grapes", 60),
                        new Product("Cucumber", 20),
                        new Product("Coriander", 30),
                        new Product("Spinach", 40),
                        new Product("Carrots", 50),
                        new Product("Mango", 60),
                        new Product("Gooseberries", 20),
                        new Product("Potato", 30),
                        new Product("Onion", 40),
                        new Product("Capsicum", 50),
                        new Product("Jack Fruit", 60)
                )
        );

        //Create adapter object
        ProductsAdapter adapter = new ProductsAdapter(this, products);

        //Set the adapter and layout manager
        b.recyclerView.setAdapter(adapter);
        b.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}