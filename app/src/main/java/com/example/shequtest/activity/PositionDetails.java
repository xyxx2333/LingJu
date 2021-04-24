package com.example.shequtest.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shequtest.R;

public class PositionDetails extends AppCompatActivity {
    private ImageView imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position_details);



                TextView itemname = (TextView)findViewById(R.id.name);
                TextView itemtext = (TextView)findViewById(R.id.textView8);


        Intent intent = this.getIntent();
        String name = intent.getStringExtra("name");
        itemname.setText(name);
        String text = intent.getStringExtra("text");
        itemtext.setText(text);
        int id = intent.getIntExtra("id", 0);
        Log.d("d", ""+id);
        ImageView imageView = (ImageView)findViewById(R.id.imageView5);
        imageView.setImageResource(id);

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        Integer id = intent.getIntExtra("id");
//        Log.d("x", id);

//        final ImageView btnChangeImage = (ImageView) findViewById(R.id.imagebutton);
//        btnChangeImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (btnChangeImage.drawable.current.constantState != resources.getDrawable(R.drawable.shoucang).constantState){
//                    btnChangeImage.setImageResource(R.drawable.shoucang);
//                }else{
//                    btnChangeImage.setImageResource(R.drawable.shoucang1);
//                }
//            }
//        });

//
//        }

//        Button button = (Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(PositionDetails.this,DaiKaiFaActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}