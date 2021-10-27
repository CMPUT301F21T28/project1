package com.example.addevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    //ListView cityList;
    //ArrayAdapter<String> cityAdapter;
    //ArrayList<String> dataList;

    private ArrayList<String> event_list = new ArrayList();
    //private String event = "diet";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        event_list.add("event");
        event_list.add("event2");
        event_list.add("event3");
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1 ,event_list);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        FloatingActionButton add_event = findViewById(R.id.floatingActionButtonAdd);
        add_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"click",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,MainActivityAddClicked.class);
                startActivity(intent);

            }
        });

        /*event_list = findViewById(R.id.event_list);
        //String []events = {"abc","ade"};
        data_list = new ArrayList<>();
        data_list.addAll(Arrays.asList(events));

        //event_adapter = new ArrayAdapter<>(this,R.layout.content,data_list);
        event_list.setAdapter(event_adapter);*/
    }
}