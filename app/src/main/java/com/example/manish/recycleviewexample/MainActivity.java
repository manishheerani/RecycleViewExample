package com.example.manish.recycleviewexample;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.manish.recycleviewexample.Utils.DataSource;
import com.example.manish.recycleviewexample.adapter.PresidentListAdapter;
import com.example.manish.recycleviewexample.model.President;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   static ArrayList<President> presidents_list;
    static RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    static RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Presidents");
        presidents_list= DataSource.getPresidentData();
        recyclerView = (RecyclerView)findViewById(R.id.president_list_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
       // recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new PresidentListAdapter(presidents_list,this);

        recyclerView.setAdapter(adapter);
    }

}
