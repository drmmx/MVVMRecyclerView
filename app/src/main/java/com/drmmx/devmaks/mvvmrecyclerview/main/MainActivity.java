package com.drmmx.devmaks.mvvmrecyclerview.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.drmmx.devmaks.mvvmrecyclerview.R;
import com.drmmx.devmaks.mvvmrecyclerview.model.News;
import com.drmmx.devmaks.mvvmrecyclerview.viewmodel.NewsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MainAdapter mAdapter;
    private List<NewsModel> mNewsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNewsList = new ArrayList<>();
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MainAdapter(mNewsList);
        mRecyclerView.setAdapter(mAdapter);
        setData();
    }

    private void setData() {
        mNewsList.add(new NewsModel(new News("Title1", "All about title 1")));
        mNewsList.add(new NewsModel(new News("Title2", "All about title 2")));
        mNewsList.add(new NewsModel(new News("Title3", "All about title 3")));
        mNewsList.add(new NewsModel(new News("Title4", "All about title 4")));
        mNewsList.add(new NewsModel(new News("Title5", "All about title 5")));
        mNewsList.add(new NewsModel(new News("Title6", "All about title 6")));
        mNewsList.add(new NewsModel(new News("Title7", "All about title 7")));
        mNewsList.add(new NewsModel(new News("Title8", "All about title 8")));
        mNewsList.add(new NewsModel(new News("Title9", "All about title 9")));
    }
}