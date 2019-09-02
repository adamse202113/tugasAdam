package com.adamse.tugasadam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPersegi, btnPersegiPanjang, btnLingkaran, btnSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPersegi = findViewById(R.id.btnPersegi);
        btnPersegiPanjang = findViewById(R.id.btnPersegiPanjang);
        btnLingkaran = findViewById(R.id.btnLingkaran);
        btnSegitiga = findViewById(R.id.btnSegitiga);

        btnPersegi.setOnClickListener(this);
        btnPersegiPanjang.setOnClickListener(this);
        btnSegitiga.setOnClickListener(this);
        btnLingkaran.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPersegi:
                Intent layoutPersegi = new Intent(MainActivity.this, PersegiActivity.class);
                startActivity(layoutPersegi);
                break;

            case R.id.btnPersegiPanjang:
                Intent layoutPersegiPanjang = new Intent(MainActivity.this, PersegiPanjangActivity.class);
                startActivity(layoutPersegiPanjang);
                break;

            case R.id.btnLingkaran:
                Intent layoutLingkaran = new Intent(MainActivity.this, LingkaranActivity.class);
                startActivity(layoutLingkaran);
                break;

            case R.id.btnSegitiga:
                Intent layoutSegitiga = new Intent(MainActivity.this, SegitigaActivity.class);
                startActivity(layoutSegitiga);
        }

    }


}
