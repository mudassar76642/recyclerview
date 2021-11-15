package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView TRV;
    private ArrayList<modelclassGuid> GModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TRV = findViewById(R.id.idGR);
// here we have created new array list and added data to it.
        GModelArrayList = new ArrayList<>();
        GModelArrayList.add(new modelclassGuid("Mir Manzar Elahi",  R.drawable.g7,10));
        GModelArrayList.add(new modelclassGuid("Mohammd Nouman Azam",   R.drawable.g7,220));
        GModelArrayList.add(new modelclassGuid("Sikandar Niazi",   R.drawable.g7,130));
        GModelArrayList.add(new modelclassGuid("Ghulam Murtaza",  R.drawable.g7,240));
        GModelArrayList.add(new modelclassGuid("Ashfaq Khan",  R.drawable.g7,150));
        GModelArrayList.add(new modelclassGuid("krishma Inyat",   R.drawable.g7,130));
        GModelArrayList.add(new modelclassGuid("Sherbaz Hiroshima",  R.drawable.tg6,110));
        GModelArrayList.add(new modelclassGuid("Qamar Altaf",R.drawable.g7,340));
        Adopterclassguid courseAdapter = new Adopterclassguid(this, GModelArrayList);
        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        TRV.setLayoutManager(linearLayoutManager);
        TRV.setAdapter(courseAdapter);
    }
}