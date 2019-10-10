package xyz.imtiyaz.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.ObjectAnimator;
import android.widget.ProgressBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ActivitySplash extends AppCompatActivity {
    ProgressBar splashProgress;
    int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashProgress = findViewById(R.id.splashProgress);
        playProgress();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mySuperIntent = new Intent(ActivitySplash.this, ActivityHome.class);
                startActivity(mySuperIntent);
                finish();
            }
        }, SPLASH_TIME);
    }

    private void playProgress() {
        ObjectAnimator.ofInt(splashProgress, "progress", 100)
            .setDuration(5000)
            .start();
    }
}