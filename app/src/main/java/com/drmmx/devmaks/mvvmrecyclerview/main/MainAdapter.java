package com.drmmx.devmaks.mvvmrecyclerview.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.drmmx.devmaks.mvvmrecyclerview.databinding.NewsBinding;
import com.drmmx.devmaks.mvvmrecyclerview.listeners.ClickListener;
import com.drmmx.devmaks.mvvmrecyclerview.viewmodel.NewsModel;

import java.util.List;

/**
 * Created by dev3rema
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<NewsModel> mNewsList;
    private LayoutInflater mLayoutInflater;

    public MainAdapter(List<NewsModel> newsList) {
        this.mNewsList = newsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup viewGroup, int i) {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        final NewsBinding newsBinding = NewsBinding.inflate(mLayoutInflater, viewGroup, false);

        newsBinding.setPresenter(new ClickListener() {
            @Override
            public void onClickListener() {
                Toast.makeText(viewGroup.getContext(), "You are click on " + newsBinding.getNewsView().title,
                        Toast.LENGTH_SHORT).show();
            }
        });

        return new ViewHolder(newsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        NewsModel newsModel = mNewsList.get(i);
        viewHolder.bind(newsModel);
    }

    @Override
    public int getItemCount() {
        return mNewsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private NewsBinding mNewsBinding;

        public ViewHolder(@NonNull NewsBinding newsBinding) {
            super(newsBinding.getRoot());

            this.mNewsBinding = newsBinding;
        }

        public void bind(NewsModel newsModel) {
            this.mNewsBinding.setNewsView(newsModel);
        }

        public NewsBinding getNewsBinding() {
            return mNewsBinding;
        }

    }
}