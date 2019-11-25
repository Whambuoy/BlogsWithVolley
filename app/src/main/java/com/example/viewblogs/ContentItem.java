package com.example.viewblogs;

public class ContentItem {

    //Non-public, non-static field names start with m
    private String mImageUrl;
    private String mCreator;
    private String mBlogPost;

    public ContentItem(String imageUrl, String creator, String blogPost){
        mImageUrl = imageUrl;
        mCreator = creator;
        mBlogPost = blogPost;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public String getmCreator() {
        return mCreator;
    }

    public String getmBlogPost() {
        return mBlogPost;
    }
}
