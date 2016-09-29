package cn.edu.gdmec.s07150708.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private TextView tv1,tv2;
    private int inum1,inum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Log.d(TAG, "onCreate() called with:"+"我创建");
        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView);
        tv1.setText("你好，修改成功");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tv1.setText("onResturt");
        tv2.setText("onResturt");
    }

  /*  @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        inum1++;
        inum2++;
        outState.putString("tv1","tv1保存值："+inum1);
        outState.putString("tv2",String.valueOf(inum2));
    }*/

 @Override
protected void onStart() {
        super.onStart();
        Log.d(TAG, "onCreate() called with:"+"我启动");
   }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onCreate() called with:"+"我要显示了");
    }

    @Override
    protected void onStop() {
       super.onStop();
                Log.d(TAG, "onCreate() called with:"+"有人挡在我前面了");
    }


    @Override
    protected void onPause() {
       super.onPause();
        Log.d(TAG, "onCreate() called with:"+"我失去焦点了");
    }
}
