package ru.mirea.sablina.task_1_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class task_1_7 extends AppCompatActivity {

    private TextView textView;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_1_7);

        textView = (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button) findViewById(R.id.btnOk);
        buttonCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener ok_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Entered OK Button");
            }

        };
        View.OnClickListener cancel_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Entered Cancel Button");
            }

        };
        buttonOk.setOnClickListener(ok_listener);
        buttonCancel.setOnClickListener(cancel_listener);
    }
}