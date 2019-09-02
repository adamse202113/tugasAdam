package com.adamse.tugasadam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtSisi, edtPanjang, edtLebar;
    private Button btnKel;
    private Button btnLuas;
    private Button btnReset;
    private TextView hasilKel, hasilLuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        hasilKel = findViewById(R.id.hasilKel);
        hasilLuas = findViewById(R.id.hasilLuas);
        edtSisi = findViewById(R.id.edtSisi);
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        btnKel = findViewById(R.id.btnKel);
        btnLuas = findViewById(R.id.btnLuas);
        btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(this);
        btnLuas.setOnClickListener(this);
        btnKel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String sisi = edtSisi.getText().toString().trim();
        String panjang = edtPanjang.getText().toString().trim();
        String lebar = edtLebar.getText().toString().trim();
        switch(view.getId()){
            case R.id.btnKel:

                if (sisi.length() == 0){
                    edtSisi.setError("Masukan Sisi!!!");
                }
                else if (view.getId() == R.id.btnKel){
                    String inputSisi = edtSisi.getText().toString().trim();

                    Double sisi1 = toDouble(inputSisi);


                    double kel = 4 * sisi1;
                    hasilKel.setText(String.valueOf(kel));
                }
            break;

            case R.id.btnLuas:

                if (panjang.length() == 0){
                edtPanjang.setError("Masukan Panjang!!!");
            }
            else if (lebar.length() == 0){
                edtLebar.setError("Masukan Lebar!!!");
            }
                else if (view.getId() == R.id.btnLuas){
                    String inputPanjang = edtPanjang.getText().toString().trim();
                    String inputLebar = edtLebar.getText().toString().trim();

                    Double panjang1 = toDouble(inputPanjang);
                    Double lebar1 = toDouble(inputLebar);

                    double luas = panjang1 * lebar1;
                    hasilLuas.setText(String.valueOf(luas));
                }
                break;

            case R.id.btnReset:
                edtSisi.getText().clear();
                edtPanjang.getText().clear();
                edtLebar.getText().clear();
                hasilLuas.setText("0");
                hasilKel.setText("0");
            }

        }






    private Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
