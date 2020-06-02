package com.example.bookingapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId())
        {
            case R.id.action_order:
                display_toast(getString(R.string.action_order_message));
                break;
            case R.id.action_favourite:
                display_toast(getString(R.string.action_favourite_message));
                break;
            case R.id.action_status:
                display_toast(getString(R.string.action_status_message));
                break;
            case R.id.action_contact:
                display_toast(getString(R.string.action_contact_message));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
    public void display_toast(String message)
    {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

    }
    public void showBiriyani(View v)
    {
        display_toast(getString(R.string.Biriyani_message));
        Intent intent = new Intent(MainActivity.this,Order_Activity.class);
        startActivity(intent);
    }
    public void showMomo(View v)
    {
        display_toast(getString(R.string.Momo_message));
        Intent intent = new Intent(MainActivity.this,Order_Activity.class);
        startActivity(intent);
    }
    public void showNoodles(View v)
    {
        display_toast(getString(R.string.Noodles_message));
        Intent intent = new Intent(MainActivity.this,Order_Activity.class);
        startActivity(intent);
    }
    public void showPizza(View v)
    {
        display_toast(getString(R.string.Pizza_message));
        Intent intent = new Intent(MainActivity.this,Order_Activity.class);
        startActivity(intent);

    }
}
