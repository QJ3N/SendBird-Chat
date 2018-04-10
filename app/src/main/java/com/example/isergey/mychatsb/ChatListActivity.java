package com.example.isergey.mychatsb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ListView;


import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class ChatListActivity extends AppCompatActivity {

    // Создаём пустой массив для хранения имен котов
    String[] catNames = {"sp115-1","sp115-2"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);

        // получаем экземпляр элемента ListView
        ListView listView = (ListView) findViewById(R.id.ListViewChatALL);

        // Создаём адаптер ArrayAdapter, чтобы привязать массив к ListView
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);
        // Привяжем массив через адаптер к ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {

                Intent intent = new Intent(itemClicked.getContext(), ChatActivity.class);
                startActivity(intent);
            }

        });

    }
}
