package jp.ac.seiko.sougiken.teamprogrammingtest2020.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jp.ac.seiko.sougiken.teamprogrammingtest2020.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonHiroyuki;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // host joined.
        // Cyberhac joined.
        setContentView(R.layout.activity_main);
    }

    private void init() {
        mButtonHiroyuki = findViewById(R.id.button_hiroyuki);
        mButtonHiroyuki.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.button_hiroyuki:
                // TODO
                break;
            default:

        }
    }
}
