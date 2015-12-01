package com.yk.mac.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class MainActivity extends ActionBarActivity {
    private LongImage longImage;
    ImageView imageView;
    private EditText input;

    private boolean isShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String setting ="{\"group_photo\":{\"host\":\"static.lianaibiji.com\",\"path\":\"photos_0ae095d19038559fb97915c95a717dcea857085a_d74ce98f253e458dcdf195e2df51f059.jpg\",\"height\":480,\"id\":0,\"width\":480}}";
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = jsonParser.parse(setting).getAsJsonObject();
        if (jsonObject.has("group_photo")){
            JsonObject groupObject = jsonObject.getAsJsonObject("group_photo");
            Log.v("haha",groupObject.get("width").getAsDouble()+"");
        }
//        String temp = "hahah";
//        input = (EditText) findViewById(R.id.edit_text);
//        input.setText(temp);
//        input.setSelection(temp.length());
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//
//            public void run() {
//                InputMethodManager inputManager = (InputMethodManager) input.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
//                inputManager.showSoftInput(input, 0);
//            }
//
//        }, 500);


//        Picasso.with(MainActivity.this)
//                .load("http://aiya.lianaibiji.com/image_00774d3daa4d3d25d6810f1df5534c015bd0b74a9c10c37b106dac42ff7b25e45591f9ee.jpg")
//                .resize(360,10000)
//                .into(target);
//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                longImage.setImageWidth(400);
//            }
//        });
    }

}
