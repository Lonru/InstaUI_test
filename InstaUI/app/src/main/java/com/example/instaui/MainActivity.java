package com.example.instaui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.instaui.adapter.FriendAdapter;
import com.example.instaui.adapter.PostAdapter;
import com.example.instaui.model.Friend;
import com.example.instaui.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public List<Post> posts;
    public List<Friend> friends;
    private PostAdapter postAdapter;
    private FriendAdapter friendAdapter;
    private RecyclerView rvFriend, rvPost;
    private MainActivity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initAdapter();
    }
    private void init() {
        rvFriend = findViewById(R.id.rv_friend);
        rvPost = findViewById(R.id.rv_post);
        mActivity = MainActivity.this;

        friends = new ArrayList<>();
        friends.add(new Friend());
        friends.add(new Friend());
        friends.add(new Friend());

        posts = new ArrayList<>();
        posts.add(new Post());
        posts.add(new Post());
        posts.add(new Post());

    }

    private void initAdapter() {
        LinearLayoutManager friendManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager postManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        friendAdapter = new FriendAdapter(friends);
        postAdapter = new PostAdapter(posts);

        rvFriend.setLayoutManager(friendManager);
        rvFriend.setAdapter(friendAdapter);

        rvPost.setLayoutManager(postManager);
        rvPost.setAdapter(postAdapter);
    }

}