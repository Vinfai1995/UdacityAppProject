package com.vinfai.myproject0;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    private String ToastText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToastMethod1(View view) {
        Toast.makeText(MainActivity.this, "启动应用：热门电影", Toast.LENGTH_SHORT).show();
    }
    public void ToastMethod2(View view) {
        Toast.makeText(MainActivity.this, "启动应用：股票雄鹰", Toast.LENGTH_SHORT).show();
    }
    public void ToastMethod3(View view) {
        Toast.makeText(MainActivity.this, "启动应用：XYZ阅读器", Toast.LENGTH_SHORT).show();
    }
    public void ToastMethod4(View view) {
        Toast.makeText(MainActivity.this, "启动应用：最新闻", Toast.LENGTH_SHORT).show();
    }
    public void ToastMethod5(View view) {
        Toast.makeText(MainActivity.this, "启动应用：毕业设计", Toast.LENGTH_SHORT).show();
    }
}
