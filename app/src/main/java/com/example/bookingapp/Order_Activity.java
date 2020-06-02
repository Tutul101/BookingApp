package com.example.bookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Order_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_);
    }


    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.sameday:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Your order in same day has been selected", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.nextday:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Your order in next day has been selected", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.pickup:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Your order pick up has been selected", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
