package com.example.instaui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instaui.R;
import com.example.instaui.model.Friend;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendViewHolder> {
    private final List<Friend> friends;
    public FriendAdapter(List<Friend> friends) {
        this.friends = friends;
    }

    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.friend_item, parent, false);

        return new FriendViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return friends.size();
    }

    public static class FriendViewHolder extends RecyclerView.ViewHolder {
        public FriendViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
