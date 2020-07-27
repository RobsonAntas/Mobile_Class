package com.rantas.chatjerico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2nd extends AppCompatActivity {
    public static final String SEND_BACK = "backPosting";
    public static final int _2ND_INDEX = 8;

    private TextView textReceieved;
    private EditText message2nd;
    private Button sendBtn2nd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2nd);

        textReceieved = findViewById(R.id.textReceiver2nd);
        Intent intent =getIntent();
        String message = intent.getStringExtra(MainActivity.SEND);
        textReceieved.setText(message);

        sendBtn2nd = findViewById(R.id.sendMessage2nd);
        message2nd = findViewById(R.id.editTextTextMultiLine2nd);

        sendBtn2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent carrierBack_over = new Intent(MainActivity2nd.this,MainActivity.class);
                carrierBack_over.putExtra(SEND_BACK,message2nd.getText().toString());
                startActivityForResult(carrierBack_over,_2ND_INDEX);
            }
        });



    }
}