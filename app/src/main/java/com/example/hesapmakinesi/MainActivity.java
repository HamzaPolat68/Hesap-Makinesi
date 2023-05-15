package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnsil,btnac,btnkapa,btntümsil,btntopla,btncıkar,btncarp,btnbol,btnesit,btnvir;

    boolean topla,cıkar,carp,bol;
    float deger1,deger2;

    TextView sonuc,cozum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonuc=findViewById(R.id.txtsonuc);
        cozum=findViewById(R.id.txtcozum);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnsil=findViewById(R.id.btnC);
        btnac=findViewById(R.id.btnac);
        btnkapa=findViewById(R.id.btnkapa);
        btntümsil=findViewById(R.id.btntümsil);
        btntopla=findViewById(R.id.btntopla);
        btncıkar=findViewById(R.id.btncıkar);
        btncarp=findViewById(R.id.btncarp);
        btnbol=findViewById(R.id.btnbol);
        btnesit=findViewById(R.id.btnesit);
        btnvir=findViewById(R.id.btnvir);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"1");
                cozum.setText(cozum.getText());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"2");
                cozum.setText(cozum.getText());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"3");
                cozum.setText(cozum.getText());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"4");
                cozum.setText(cozum.getText());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"5");
                cozum.setText(cozum.getText());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"6");
                cozum.setText(cozum.getText());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"7");
                cozum.setText(cozum.getText());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"8");
                cozum.setText(cozum.getText());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"9");
                cozum.setText(cozum.getText());
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"0");
                cozum.setText(cozum.getText());
            }
        });
        btnvir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+".");
                cozum.setText(cozum.getText());
            }
        });
        btntümsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText("");
            }
        });
        btntopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sonuc==null){
                    sonuc.setText("");
                }
                else {
                    deger1=Float.parseFloat(sonuc.getText()+"");
                    topla=true;
                    sonuc.setText(null);
                }
            }
        });
        btncıkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat(sonuc.getText()+"");
                cıkar=true;
                sonuc.setText(null);
            }
        });
        btncarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat(sonuc.getText()+"");
                carp=true;
                sonuc.setText(null);
            }
        });
        btnbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat(sonuc.getText()+"");
                bol=true;
                sonuc.setText(null);
            }
        });

        btnesit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger2=Float.parseFloat(sonuc.getText()+"");
                if(topla==true){
                    sonuc.setText(deger1+deger2+"");
                    cozum.setText(deger1+"+"+deger2);
                    topla=false;
                }
                if(cıkar==true){
                    sonuc.setText(deger1-deger2+"");
                    cozum.setText(deger1+"-"+deger2);
                    cıkar=false;
                }
                if(carp==true){
                    sonuc.setText(deger1*deger2+"");
                    cozum.setText(deger1+"*"+deger2);
                    carp=false;
                }
                if (bol==true){
                    sonuc.setText(deger1/deger2+"");
                    cozum.setText(deger1+"/"+deger2);
                    bol=false;
                }
            }
        });




    }
}
