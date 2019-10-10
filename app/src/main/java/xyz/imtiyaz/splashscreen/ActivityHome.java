package xyz.imtiyaz.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityHome extends AppCompatActivity {

    Button bt_click_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Add all your codes here
        bt_click_me = findViewById(R.id.bt_click_me);
        bt_click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityHome.this, "You clicked me. Thank you!", Toast.LENGTH_SHORT).show();
            }
        });

        //Happy coding :)

    }
}
