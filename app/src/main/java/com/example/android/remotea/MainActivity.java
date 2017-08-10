package com.example.android.remotea;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowLocation(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=52.1474437,21.04777(Remotea)"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void Call(View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + 519101141));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void SendEmail(View view){

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:remotea@gmail.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_CC, "a.szummer@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "[APP]Feel free to ask");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }

}
