package com.rahul009.onlineimages;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView onlineimage,onlineimage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onlineimage=findViewById(R.id.imageView);
        onlineimage2=findViewById(R.id.imageView2);
        String url="https://www.netmeds.com/images/cms/wysiwyg/blog/2021/02/1613033598_Recipes_big_1.jpg";

        Picasso.get().load(url).placeholder(R.drawable.aaaa).into(onlineimage);

        Picasso.get().load("https://spicecravings.com/wp-content/uploads/2017/12/Rajma-3.webp").placeholder(R.drawable.aaaa).into(onlineimage2);
    }
}