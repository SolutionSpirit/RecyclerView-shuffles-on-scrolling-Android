package com.example.shuja.recyclerviewshufflesissue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. get a reference to recyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // this is data fro recycler view
        ItemData itemsData[] = {
                new ItemData("Help",R.drawable.help),
                new ItemData("Delete",R.drawable.delete),
                new ItemData("Cloud",R.drawable.cloud),
                new ItemData("Favorite",R.drawable.favorite),
                new ItemData("Rating",R.drawable.rating),

                new ItemData("Like",R.drawable.like),
                new ItemData("Comment",R.drawable.comment),
                new ItemData("Chat",R.drawable.chat),
                new ItemData("Profile",R.drawable.profile),
                new ItemData("Settings",R.drawable.settingws),
        };

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. create an adapter
        Adapter mAdapter = new Adapter(itemsData);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
