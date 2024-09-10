package com.example.thelakewoodsocialclub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainCard;

    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainCard = findViewById(R.id.card_view_main);
        dessertsCard = findViewById(R.id.card_view_desserts);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(mainCoursesActivityIntent);
            }
        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dessertsActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);

                startActivity(dessertsActivityIntent);
            }
        });


        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:thelakewoodsocialclub@gmail.com"));
                startActivity(launchEmailAppIntent);

            }
        });
    }
}