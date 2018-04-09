package com.example.isergey.mychatsb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button buttonLogIn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogIn = (Button)findViewById(R.id.buttonLogIn);
        buttonLogIn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLogIn:
                Intent intent = new Intent(this, ChatListActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Tag", "MainActivity: onStart()");
    }

}
