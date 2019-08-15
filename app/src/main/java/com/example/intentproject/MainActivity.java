package com.example.intentproject;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.example.intentproject.R;

public class MainActivity extends AppCompatActivity{
    public ImageButton btn1;
    public ImageButton btn2;
    public ImageButton btn3;
    public Button btn4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }
    private void initComponent() {
        btn1 = (ImageButton) findViewById(R.id.anime);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntent(R.drawable.test1,"anime");
            }
        });

        btn2 = (ImageButton) findViewById(R.id.manga);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntent(R.drawable.test2,"manga");
            }
        });

        btn3 = (ImageButton)findViewById(R.id.music);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntent(R.drawable.test3,"music");
            }
        });

        btn4 = (Button)findViewById(R.id.other);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntent(R.drawable.title,"other");
            }
        });
    }

    private void startIntent(int image, String title) {
        Intent intent = new Intent(this,input1.class);
        intent.putExtra(input1.EXTRA_TITLE,title);
        intent.putExtra(input1.EXTRA_IMAGE,image);
        startActivity(intent);
    }


}