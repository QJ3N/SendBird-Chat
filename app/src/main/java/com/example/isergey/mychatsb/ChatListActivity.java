package com.example.isergey.mychatsb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import android.widget.ArrayAdapter;
public class ChatListActivity extends AppCompatActivity implements OnClickListener  {

    // Создаём пустой массив для хранения имен котов
    final ArrayList<String> catNames = new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);

        // получаем экземпляр элемента ListView
        ListView listView = (ListView) findViewById(R.id.ListViewChat);


        catNames.add("Новый елемент");

        // Создаём адаптер ArrayAdapter, чтобы привязать массив к ListView
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);
        // Привяжем массив через адаптер к ListView
        listView.setAdapter(adapter);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonListView:
                // получаем экземпляр элемента ListView
                catNames.add("Новый елемент");
                adapter.notifyDataSetChanged();
                break;
            default:
                break;
        }
    }
}
