package com.example.trungphat.da_luong_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private android.os.Handler hand = new android.os.Handler();
    Button bt;
    TextView hienthi_giay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.button_count);
        hienthi_giay = findViewById(R.id.text_number);
        hand.postDelayed(run1, 1000);

    }

    public Runnable run1 = new Runnable() {
        @Override
        public void run() {

            int count = Integer.parseInt(hienthi_giay.getText().toString());
            if (count == 10) {
                bt.setVisibility(View.VISIBLE);
                ShowText();
            } else {
                count = count + 1;
                hienthi_giay.setText(String.valueOf(count));
                hand.postDelayed(run1, 1000);

            }
        }
    };


    public void ShowText() {
            Toast.makeText(getApplication(), "Bạn đã hoàn thành", Toast.LENGTH_SHORT).show();
            return;
        }

}
