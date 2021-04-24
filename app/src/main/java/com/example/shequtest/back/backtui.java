package com.example.shequtest.back;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shequtest.activity.Login;

import java.util.Timer;
import java.util.TimerTask;

public class backtui extends AppCompatActivity {
    private boolean isExit = false;//确保第一次按back不退出，因为不走if

    @Override
    public void onBackPressed() {
        if (isExit) {
            finish();//关闭activity
            System.exit(0);//程序退出
        } else {
            Toast.makeText(getApplicationContext(), "再按一次将退出", Toast.LENGTH_LONG).show();
            isExit = true;//值改为true，确保第二次按走if退出
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false;//2s后将值重新改成false，确保2次按下的事件在2分钟内.也可以用handler将值改为false
                }
            }, 2000);
        }
    }
}
