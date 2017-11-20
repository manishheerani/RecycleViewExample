package com.example.manish.recycleviewexample.adapter;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.manish.recycleviewexample.Details;
import com.example.manish.recycleviewexample.MainActivity;
import com.example.manish.recycleviewexample.R;
import com.example.manish.recycleviewexample.model.President;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Manish on 11/18/2017.
 */

public class PresidentListAdapter  extends RecyclerView.Adapter<PresidentListAdapter.MyViewHolder>
{
    ArrayList<President> presidents;
Activity mContext;
    public PresidentListAdapter(ArrayList<President> presidents, Activity mContext)
    {
        this.presidents=presidents;
        this.mContext =mContext;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView presidentName,duration,number_of_president;
        CardView card_view;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.duration = (TextView)itemView.findViewById(R.id.duration);
            this.imageView = (ImageView)itemView.findViewById(R.id.image);
            this.number_of_president = (TextView)itemView.findViewById(R.id.number_of_president);
            this.presidentName = (TextView)itemView.findViewById(R.id.name);
            this.card_view= (CardView)itemView.findViewById(R.id.card_view);
        }
    }

    @Override
    public PresidentListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.president_item_layout, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PresidentListAdapter.MyViewHolder holder, final int position) {
        ImageView imageView=holder.imageView;
        TextView presidentName=holder.presidentName,duration=holder.duration,number_of_president=holder.number_of_president;
        presidentName.setText(presidents.get(position).getName());
        number_of_president.setText(presidents.get(position).getNumber_of_president()+" President of India");
        duration.setText(presidents.get(position).getDuration());
        imageView.setImageResource(presidents.get(position).getImage());
        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(mContext, Details.class);
                intent.putExtra("president", presidents.get(position));
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return presidents.size();
    }
}
