package com.example.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreditsActivity extends AppCompatActivity {
    TextView answerr;
    Button ret; String str, strRe;
    Intent back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        answerr=(TextView)findViewById(R.id.textView);
        ret=(Button)findViewById(R.id.result);
        back=getIntent();
        str=back.getStringExtra("str");
        answerr.setText("The last result is "+str);
    }

    public void onActivityResult (int rqCode, Intent data_back){
        if (data_back!=null){
            strRe =data_back.getStringExtra("re");
        }

    }
    public void returnb(View view) {
        back.putExtra("re", str);
        setResult(RESULT_OK, back);
        finish();
    }
}
