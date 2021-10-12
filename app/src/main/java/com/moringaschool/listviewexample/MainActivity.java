package com.moringaschool.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] mobile = {"Galaxy", "Samsung", "Nokia", "Iphone", "Acer", "Hp"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        //Array Adapter

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,
                mobile
        );
        listView.setAdapter(adapter);

        //add onclick listener

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"iWILL BUY: "+ adapter.getItem(position),Toast.LENGTH_LONG).show();
            }
        });
    }
}