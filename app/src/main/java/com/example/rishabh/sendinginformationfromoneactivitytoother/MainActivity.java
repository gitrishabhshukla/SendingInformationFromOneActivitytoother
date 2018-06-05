package com.example.rishabh.sendinginformationfromoneactivitytoother;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,RadioGroup.OnCheckedChangeListener{

    EditText edtName;
    EditText edtEmail;
    EditText edtUsername;
    EditText edtPassword;
    ImageView imageView;
    RadioGroup radioGroup;
    Button btnAdd;
    String genderType = "";
    final int IMAGE_REQUEST_CODE = 1000;
    String photoPath = "";
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        imageView = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.radioGroup);
        btnAdd = findViewById(R.id.btnAddThevalue);

        btnAdd.setOnClickListener(MainActivity.this);
        radioGroup.setOnCheckedChangeListener(MainActivity.this);
        imageView.setOnClickListener(MainActivity.this);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.tiger);
        imageView.setImageBitmap(bitmap);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnAddThevalue:
                
                break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }
}
