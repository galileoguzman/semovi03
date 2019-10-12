package com.galileoguzman.semovi03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class UserDetailActivity extends AppCompatActivity {

    private TextView tvTWitterAccount;
    private String twitterAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        twitterAccount = getIntent().getStringExtra("twitterAccount");

        tvTWitterAccount = (TextView) findViewById(R.id.tvTwitter);
        tvTWitterAccount.setText(twitterAccount);
    }
}
