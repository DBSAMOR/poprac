package org.techtown.imagepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView1;
    ScrollView scrollView2;
    ImageView imageView1;
    ImageView imageView2;
    BitmapDrawable bitmap;
    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView1 = (ScrollView) findViewById(R.id.scrollView1);
        scrollView1.setHorizontalScrollBarEnabled(true);
        imageView1 = (ImageView) findViewById(R.id.imageView1);

        scrollView2 = (ScrollView) findViewById(R.id.scrollView2);
        scrollView2.setHorizontalScrollBarEnabled(true);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.altale);

        imageView1.setImageDrawable(bitmap);
        imageView1.getLayoutParams().width = bitmap.getIntrinsicWidth();
        imageView1.getLayoutParams().height = bitmap.getIntrinsicHeight();
        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width = bitmap.getIntrinsicWidth();
        imageView2.getLayoutParams().height = bitmap.getIntrinsicHeight();
    }

    public void onClickUpButton(View v){
        imagePushUP();
    }

    public void onClickDownButton(View v){
        imagePushDown();
    }
    private void imagePushUP(){
        if(imageIndex == 1) {
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageIndex = 0;
        }
    }

    private void imagePushDown(){
        if(imageIndex == 0) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageIndex = 1;
        }
    }
}
