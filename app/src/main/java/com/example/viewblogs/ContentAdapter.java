package com.example.viewblogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ContentAdapter extends RecyclerView.Adapter <ContentAdapter.ContentViewHolder> {

    private Context mContext;
    private ArrayList<ContentItem> mContextList;

    public ContentAdapter(Context context, ArrayList<ContentItem> contextList){
        //set member variables to those variables parsed here
        mContext = context;
        mContextList = contextList;
    }

    @NonNull
    @Override
    public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.content_item, parent, false);
        return new ContentViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentViewHolder holder, int position) {
        ContentItem currentItem = mContextList.get(position);

        String imageUrl = currentItem.getmImageUrl();
        String creatorName = currentItem.getmCreator();
        String blogPost = currentItem.getmBlogPost();

        holder.mTextViewCreator.setText(creatorName);
        holder.mTextViewBlogPost.setText(blogPost);
        Picasso.get().load(imageUrl).fit().centerInside().into(holder.mImageView);

    }

    @Override
    public int getItemCount() {
        return mContextList.size();
    }

    //Create the view holder class
    public class ContentViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTextViewCreator;
        public TextView mTextViewBlogPost;


        public ContentViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.image_view_blog_photo);
            mTextViewCreator = itemView.findViewById(R.id.text_view_creator_name);
            mTextViewBlogPost = itemView.findViewById(R.id.text_view_blog_post_title);

        }
    }
}
