package com.example.recyclerview;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.modelclassGuid;
import com.example.recyclerview.R;
import com.example.recyclerview.MainActivity;

import java.util.ArrayList;

public class Adopterclassguid extends  RecyclerView.Adapter<Adopterclassguid.Viewholder> {
    private Context context;
    private ArrayList<modelclassGuid> courseModelArrayList;

    // Constructor
    public Adopterclassguid(Context context, ArrayList<modelclassGuid> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @NonNull
    @Override
    public Adopterclassguid.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tourguidcardlayout, parent, false);
        return new Adopterclassguid.Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        modelclassGuid model = courseModelArrayList.get(position);
        holder.Ttittle.setText(""+model.getName());
        holder.Tratting.setText("" + model.getUpvote());
        holder.Timageview.setImageResource(model.getPicture());
        holder.cardViewg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent =new Intent(context, TourGuidDetail.class);
//                intent.putExtra("key",model.getG_tittle());
//                context.startActivity(intent);
            }
        });




    }



    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return courseModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView Timageview;
        private TextView Ttittle, Tratting;
        CardView cardViewg;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            Timageview = itemView.findViewById(R.id.timage);
            Ttittle = itemView.findViewById(R.id.name);
            Tratting = itemView.findViewById(R.id.Tlove);
            cardViewg = itemView.findViewById(R.id.guideCard);


        }
    }
}

