package com.example.aura.platform05fcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String judul;
    public static String isi;

    public TextView tvJudul, tvIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyFirebaseInstanceService ambilToken= new MyFirebaseInstanceService();

        ambilToken.onTokenRefresh();

        tvJudul = (TextView) findViewById(R.id.tvTitle);
        tvIsi = (TextView) findViewById(R.id.tvBody);
        if(judul !=null || isi !=null)
        {
            tvJudul.setText(judul);
            tvIsi.setText(isi);
        }
    }
}
