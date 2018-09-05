package com.schaldrac.rxjava.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.schaldrac.rxjava.R;

public class PostViewHolder extends RecyclerView.ViewHolder {
    final TextView title;
    final TextView content;
    final TextView author;

    PostViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.txt_title);
        content = itemView.findViewById(R.id.txt_content);
        author = itemView.findViewById(R.id.txt_author);
    }
}
