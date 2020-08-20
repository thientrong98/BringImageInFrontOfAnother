package tech.vlab.bringimageinfrontofanother;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageViewLeft = (ImageView) findViewById(R.id.img_left);
        final ImageView imageViewRight = (ImageView) findViewById(R.id.img_right);

        final LinearLayout llLeft = (LinearLayout) findViewById(R.id.ll_left);
        final LinearLayout llRight = (LinearLayout) findViewById(R.id.ll_right);

        imageViewLeft.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("WrongConstant")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_UP:
                        imageViewLeft.setAlpha(0.3f);
                        llLeft.bringToFront();
                        break;
                }
                return true;
            }
        });

        llLeft.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("WrongConstant")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        imageViewLeft.bringToFront();
                        imageViewLeft.setAlpha(1f);
                        break;
                }
                return true;
            }
        });

        imageViewRight.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("WrongConstant")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_UP:
                        imageViewRight.setAlpha(0.3f);
                        llLeft.bringToFront();
                        break;
                }
                return true;
            }
        });

        llRight.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("WrongConstant")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        imageViewRight.bringToFront();
                        imageViewRight.setAlpha(1f);
                        break;
                }
                return true;
            }
        });
    }
}
