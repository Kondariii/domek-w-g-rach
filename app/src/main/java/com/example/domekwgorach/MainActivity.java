package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView likeCountText;
    private int likeCount = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleText = findViewById(R.id.titleText);
        ImageView imageView = findViewById(R.id.imageView);
        Button likeButton = findViewById(R.id.likeButton);
        Button deleteButton = findViewById(R.id.deleteButton);
        Button saveButton = findViewById(R.id.saveButton);
        likeCountText = findViewById(R.id.likeCountText);
        TextView descriptionText = findViewById(R.id.descriptionText);

        updateLikeCount();

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeCount++;
                updateLikeCount();
                Toast.makeText(MainActivity.this, "Polubiono!", Toast.LENGTH_SHORT).show();
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeCount--;
                updateLikeCount();
                Toast.makeText(MainActivity.this, "Usunięto!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Method to update the like count text
    private void updateLikeCount() {
        likeCountText.setText(likeCount + " polubień");
    }
}