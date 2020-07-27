package com.rantas.chatjerico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String SEND = "posting";
    public static final int INDEX = 7;
    private TextView textContainer;
    private EditText message1st;
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textContainer = findViewById(R.id.textReceiver);
        message1st = findViewById(R.id.editTextTextMultiLine);
        sendBtn = findViewById(R.id.sendMessage);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent carrier_over = new Intent(MainActivity.this, MainActivity2nd.class);
                carrier_over.putExtra(SEND,message1st.getText().toString());
                startActivityForResult(carrier_over,INDEX);
            }
        });

        textContainer = findViewById(R.id.textReceiver);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity2nd.SEND_BACK);
        textContainer.setText(message);
    }
}