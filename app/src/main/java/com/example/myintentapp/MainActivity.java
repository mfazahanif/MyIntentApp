package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
    Button btnMoveData;
    Button btnDial;
    Button btnLink;
    Button btnhalaman1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btn_move_data);
        btnMoveData.setOnClickListener(this);

        btnDial = findViewById(R.id.BtnDial);
        btnDial.setOnClickListener(this);

        btnLink = findViewById(R.id.btn_link);
        btnLink.setOnClickListener(this);

        btnhalaman1 = findViewById(R.id.btn_halaman1);
        btnhalaman1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveActivity = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_data:
                Intent MoveDataActivity = new Intent(MainActivity.this, MoveActivityWithData.class);
                MoveDataActivity.putExtra(MoveActivityWithData.EXTRA_NAME, "Hanif nat");
                MoveDataActivity.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(MoveDataActivity);
                break;
            case R.id.BtnDial:
                String PhoneNumber = "087882005063";
                //Intent dialphone = new Intent (intent.Action_Dial,Uri.parse("tel"+phone)
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel" + PhoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_link:
                String link = "http://www.polines.ac.id/id/";
                Intent linkIntent = new Intent(Intent.ACTION_VIEW);
                linkIntent.setData(Uri.parse("LINK : " + link));
                startActivity(linkIntent);
                break;
            case R.id.btn_halaman1:
                Intent oped = new Intent(MainActivity.this, move_polines1.class);
                startActivity(oped);
                break;
        }
    }
}
