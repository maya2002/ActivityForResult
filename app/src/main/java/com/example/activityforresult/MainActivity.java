package com.example.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btpl,btmn, btk, bth, btdelete, btans, credt;
    EditText dis;
    double mishtane, mishtane2=0, bein;
    int op=1;
    String str, bac;
    Toast to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btpl=(Button) findViewById(R.id.plus);
        btmn= (Button) findViewById(R.id.minus);
        btk=(Button) findViewById(R.id.kefel);
        bth=(Button) findViewById(R.id.hiluk);
        btdelete=(Button) findViewById(R.id.erase);
        btans=(Button) findViewById(R.id.result);
        dis=(EditText) findViewById(R.id.displayy);
    }


    public void hibur(View view) {
        if ((!dis.getText().toString().equals(""))&&((!dis.getText().toString().equals("."))&&(!dis.getText().toString().equals("-"))&&(!dis.getText().toString().equals("-.")))) {
            String dp = dis.getText().toString();
            mishtane2 = Double.parseDouble(dp);
            dis.setText("");
            switch (op) {
                case 1:
                    mishtane = mishtane + mishtane2;
                    break;
                case 2:
                    mishtane = mishtane - mishtane2;
                    break;
                case 3:
                    mishtane = mishtane * mishtane2;
                    break;
                case 4:
                    if (mishtane2 == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    mishtane = mishtane / mishtane2;
                    break;
            }
            str = Double.toString(mishtane);
            dis.setHint(str);
        }
        else {
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 1;
    }

    public void hisur(View view) {
        if ((!dis.getText().toString().equals(""))&&((!dis.getText().toString().equals("."))&&(!dis.getText().toString().equals("-"))&&(!dis.getText().toString().equals("-.")))) {
            String dp = dis.getText().toString();
            mishtane2 = Double.parseDouble(dp);
            dis.setText("");
            switch (op) {
                case 1:
                    mishtane = mishtane + mishtane2;
                    break;
                case 2:
                    mishtane = mishtane - mishtane2;
                    break;
                case 3:
                    mishtane = mishtane * mishtane2;
                    break;
                case 4:
                    if (mishtane2 == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    mishtane = mishtane / mishtane2;
                    break;
            }
            str = Double.toString(mishtane);
            dis.setHint(str);
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 2;
    }

    public void kefel(View view) {
        if ((!dis.getText().toString().equals(""))&&((!dis.getText().toString().equals("."))&&(!dis.getText().toString().equals("-"))&&(!dis.getText().toString().equals("-.")))) {
            String dp = dis.getText().toString();
            mishtane2 = Double.parseDouble(dp);
            dis.setText("");
            switch (op) {
                case 1:
                    mishtane = mishtane + mishtane2;
                    break;
                case 2:
                    mishtane = mishtane - mishtane2;
                    break;
                case 3:
                    mishtane = mishtane * mishtane2;
                    break;
                case 4:
                    if (mishtane2 == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    mishtane = mishtane / mishtane2;
                    break;
            }
            str = Double.toString(mishtane);
            dis.setHint(str);
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 3;
    }

    public void hiluk(View view) {
        if ((!dis.getText().toString().equals(""))&&((!dis.getText().toString().equals("."))&&(!dis.getText().toString().equals("-"))&&(!dis.getText().toString().equals("-.")))) {
            String dp = dis.getText().toString();
            mishtane2 = Double.parseDouble(dp);
            dis.setText("");
            switch (op) {
                case 1:
                    mishtane = mishtane + mishtane2;
                    break;
                case 2:
                    mishtane = mishtane - mishtane2;
                    break;
                case 3:
                    mishtane = mishtane * mishtane2;
                    break;
                case 4:
                    if (mishtane2 == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    mishtane = mishtane / mishtane2;
                    break;
            }
            str = Double.toString(mishtane);
            dis.setHint(str);
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 4;
    }

    public void clear(View view) {
        dis.setText("");
        dis.setHint("display");
        mishtane=0;
        mishtane2=0;
        op=0;
    }

    public void answer(View view) {
        if ((!dis.getText().toString().equals(""))&&((!dis.getText().toString().equals("."))&&(!dis.getText().toString().equals("-"))&&(!dis.getText().toString().equals("-.")))) {
            String dp = dis.getText().toString();
            mishtane2 = Double.parseDouble(dp);
            dis.setText("");
            switch (op) {
                case 1:
                    mishtane = mishtane + mishtane2;
                    break;
                case 2:
                    mishtane = mishtane - mishtane2;
                    break;
                case 3:
                    mishtane = mishtane * mishtane2;
                    break;
                case 4:
                    if (mishtane2 == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    mishtane = mishtane / mishtane2;
                    break;
            }
            str = Double.toString(mishtane);
            dis.setHint(str);
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        bein=mishtane;
        op=1; mishtane2=mishtane=0;
    }

    public void credits(View view) {
        Intent t=new Intent(this, CreditsActivity.class);
        if (mishtane==0){
            str=Double.toString(bein);
            t.putExtra("str", str);
        }
        else{
            str=Double.toString(mishtane);
            t.putExtra("str", str);
        }
        startActivityForResult(t,1);
    }
    public void onActivityResult (int a, int b ,Intent c){
        bac=c.getStringExtra("re");
        dis.setText("The last result is "+bac);
    }
}
