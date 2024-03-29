package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { //turunan,pewarisan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveactivity = findViewById(R.id.btn_move_activity);
        btnMoveactivity.setOnClickListener(this);//menjalankan function btn_move_activity

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) { //fungsi
        switch  (v.getId()){ //percabangan,  parameter(v.getId)
                case R.id.btn_move_activity:
                    Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                    startActivity(moveIntent);
                    break;

                case R.id.btn_move_activity_data:
                    Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class); //memindahkan
                    moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Dhamario Gymnastiarno");
                    moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 17);
                    startActivity(moveWithDataIntent);
                    break;

                case R.id.btn_dial_number:
                    String phoneNumber = "081381765660";
                    Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +phoneNumber));
                    startActivity(dialPhoneIntent);
                    break;
        }
    }
}
