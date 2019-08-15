package com.example.intentproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import com.example.intentproject.R;

import org.w3c.dom.Text;

public class outputActivity extends AppCompatActivity {

    public static final String EXTRA_PESANAN = "extra_pesanan";
    private TextView txtNama;
    private TextView txtAlamat;
    private TextView txtPesan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output);
        initComponent();
    }

    private void initComponent() {

        output pesanan = getIntent().getParcelableExtra(EXTRA_PESANAN);

        txtNama = (TextView) findViewById(R.id.name);
        txtAlamat = (TextView) findViewById(R.id.total);
        txtPesan = (TextView) findViewById(R.id.desc);

        txtNama.setText(pesanan.getNama());
        txtAlamat.setText(pesanan.getAlamat());
        txtPesan.setText(pesanan.getPesanan());

    }
}
