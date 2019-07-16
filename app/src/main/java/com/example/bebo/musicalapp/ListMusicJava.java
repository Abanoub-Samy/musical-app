package com.example.bebo.musicalapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;

public class ListMusicJava extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listmusic);
        ListView listView = findViewById(R.id.listview);
        ArrayList<List> items = new ArrayList<List>();
        items.add(new List("عند شعورك بالذنب "));
        items.add(new List("عند شعورك بالضيق"));
        items.add(new List("عند شعورك بالايمان"));
        items.add(new List("عند شعورك بالخوف"));
        items.add(new List("عند شعورك بالضعف"));
        items.add(new List("عند شعورك بالذنب بالملل"));
        items.add(new List("عند شعورك بالالم"));
        items.add(new List("عند شعورك بالحزن"));
        items.add(new List("عند شعورك بالغضب"));
        items.add(new List("عند شعورك بالحقد"));
        SetAdapter set = new SetAdapter(this, items);
        listView.setAdapter(set);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //List mode = (List) parent.getItemAtPosition(position);
                Intent intent = new Intent(getBaseContext(), PlayMusicJava.class);
                intent.putExtra("name", String.valueOf(position));
                startActivity(intent);
            }
        });
    }
}


