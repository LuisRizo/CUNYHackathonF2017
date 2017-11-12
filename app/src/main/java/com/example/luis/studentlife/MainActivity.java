package com.example.luis.studentlife;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    Button b;
   // public Intent intent=new Intent(this,MapsActivity.class);

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;

    {
        mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        mTextMessage.setText(R.string.title_home);
                        return true;
                    case R.id.navigation_counselor:
                        mTextMessage.setText(R.string.title_counselor);
                        return true;
                    case R.id.navigation_tutoring:
                        Intent i=new  Intent(MainActivity.this,MapsActivity.class);
                        startActivity(i);
                      //  mTextMessage.setText(R.string.title_tutoring);
                        return true;
                    case R.id.navigation_discussion:
                        mTextMessage.setText(R.string.title_discussion);
                        return true;
                }
                return false;
            }
        };
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationTutoringListener;
    {
        mOnNavigationTutoringListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.navigation_tutoring:



                        return true;
                }
                return false;
            }
        };
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }




}
