package com.example.raheel.rotornot;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class CompareActivity extends AppCompatActivity {

    private ImageView rotmanImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        ImageView imgPicture2 = (ImageView)findViewById(R.id.imgPicture2);


            Intent intent = getIntent();
            Bitmap image = (Bitmap) intent.getParcelableExtra("BitmapImage");
            //Bitmap image = BitmapFactory.decodeStream(inputStream);

            //show image to user
            imgPicture2.setImageBitmap(image);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_compare, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, FinalActivity.class);
        startActivity(intent);
    }
}
