package com.drmmx.devmaks.mvvmrecyclerview.viewmodel;

import com.drmmx.devmaks.mvvmrecyclerview.model.News;

/**
 * Created by dev3rema
 */
public class NewsModel {

    public String title;
    public String description;

    public NewsModel(News news) {
        this.title = news.getTitle();
        this.description = news.getDescription();
    }

}
