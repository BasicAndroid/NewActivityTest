package newactivity.test.android.liam.newactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toSecondActivity(View view) {
        Intent act_2 = new Intent(MainActivity.this, Activity2.class);
            startActivity(act_2);
    }
}
