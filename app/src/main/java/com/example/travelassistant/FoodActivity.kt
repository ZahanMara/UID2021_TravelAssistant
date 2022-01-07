package com.example.travelassistant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView


class FoodActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var restaurantRecyclerViewAdapter: RestaurantRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        // getting the recyclerview by its id
        recyclerView = findViewById(R.id.restaurantRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@FoodActivity, RecyclerView.VERTICAL, false)
        restaurantRecyclerViewAdapter = RestaurantRecyclerViewAdapter()
        restaurantRecyclerViewAdapter.loadRestaurants()
        recyclerView.adapter = restaurantRecyclerViewAdapter
        recyclerView.adapter

    }
}