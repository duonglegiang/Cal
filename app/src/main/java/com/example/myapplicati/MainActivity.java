package com.example.myapplicati;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editInput, editEUR, editVND;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, ce, enter, add, sub, mul, div, clear, bs;

    double var1 = 0;
    double var2 = 0;
    double ans = 0;
    TextView txtIn, txtSol;
    Boolean check_add = false, check_sub = false, check_div = false, check_mul = false;


//    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btnOne);
        b2 = findViewById(R.id.btnTwo);
        b3 = findViewById(R.id.btnThree);
        b4 = findViewById(R.id.btnFour);
        b5 = findViewById(R.id.btnFive);
        b6 = findViewById(R.id.btnSix);
        b7 = findViewById(R.id.btnSeven);
        b8 = findViewById(R.id.btnEight);
        b9 = findViewById(R.id.btnNine);
        b0 = findViewById(R.id.btnZero);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMulti);
        div = findViewById(R.id.btnDevide);
        txtIn = findViewById(R.id.txtInput);
        txtSol = findViewById(R.id.txtSolution);
        clear = findViewById(R.id.btnC);
        bs = findViewById(R.id.btnBS);
        ce = findViewById(R.id.btnCE);
        enter = findViewById(R.id.btnEquals);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtIn.setText(txtIn.getText() + "0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(txtIn.getText().toString());
                var1 = Double.parseDouble(txtIn.getText().toString());

                txtIn.setText(txtIn.getText() + " + ");
//                txtIn.setText("");

//                buttonFalse();
                check_add = true;
            }
        });
//
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(txtIn.getText().toString());
                var1 = Double.parseDouble(txtIn.getText().toString());
                txtIn.setText(txtIn.getText() + " - ");

//                buttonFalse();
                check_sub = true;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(txtIn.getText().toString());
                var1 = Double.parseDouble(txtIn.getText().toString());

                txtIn.setText(txtIn.getText() + " x ");

//                buttonFalse();
                check_mul = true;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                check(txtIn.getText().toString());
                var1 = Double.parseDouble(txtIn.getText().toString());

                txtIn.setText(txtIn.getText() + " / ");

//                buttonFalse();
                check_div = true;
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string_var2 = "";
                String text_in = (String) txtIn.getText();
                for(int i = 0; i < text_in.length() - 1; i ++){
                    string_var2 += text_in.charAt(i);
                }
//                System.out.println(string_var2);
                txtIn.setText(string_var2);

                text_in = (String) txtIn.getText();
                try{
                    var1 = Double.parseDouble(txtIn.getText().toString());
                } catch (Exception e){
                    string_var2 = "";
                    for(int i = 0; i < text_in.length(); i ++){
                        if(text_in.charAt(i) == ' '){
                            break;
                        }
                        string_var2 += text_in.charAt(i);
                    }
                    var1 = Double.parseDouble(string_var2);
                    string_var2 = "";

                    for(int i = text_in.length() - 1; i >= 0; i--){
                        if(text_in.charAt(i) == ' '){
                            break;
                        }
                        string_var2 += text_in.charAt(i);
                    }

                    var2 = Double.parseDouble(string_var2);
                }

            }

        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    var1 = Double.parseDouble(txtIn.getText().toString());
                    var1 = 0;
                    txtIn.setText(String.valueOf(var1));
                } catch(Exception e){
                    String string_var2 = "";
                    String text_in = (String) txtIn.getText();
                    int check = 0;
                    for( int i = text_in.length() - 1; i >= 0; i--){
                        if(text_in.charAt(i) == ' ') {
                            check = i;
                            break;
                        }
                        string_var2 += text_in.charAt(i);
                    }
                    string_var2 = "";
                    for(int i = 0; i < check + 1; i ++){
                        string_var2 += text_in.charAt(i);
                    }

                    string_var2 += "0";
                    txtIn.setText(string_var2);
                    var2 = 0;
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allReset();
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                var2 = Double.parseDouble(txtIn.getText().toString());
                String string_var2 = "";
                String text_in = (String) txtIn.getText();
                for( int i = text_in.length() - 1; i >= 0; i--){
                    if(text_in.charAt(i) == ' ') {
                        break;
                    }
                    string_var2 += text_in.charAt(i);
                }

                var2 = Double.parseDouble(string_var2);
                System.out.println(check_add + " " + check_div + check_mul + check_sub);

                if(check_add){
                    ans = var1 + var2;
                }
                else if (check_sub){
                    ans = var1 - var2;
                    System.out.print("giang giang");
                }
                else if (check_mul){
                    ans = var1 * var2;
                }
                else if (check_div){
                    ans = var1 / var2;
                    System.out.println(var1);
                    System.out.println(var2);
                    System.out.println(ans);
                }
                else {
                    ans = ans + 0;
                }

                int aa = (int) ans;
//                System.out.println(ans);
                txtSol.setText(text_in + " = " + String.valueOf(aa));
                txtIn.setText("");
//                enter.setEnabled(false);
            }
        });
    }

//    public void buttonFalse(){
//        sub.setEnabled(false);
//        mul.setEnabled(false);
//        div.setEnabled(false);
//        add.setEnabled(false);
//    }

    public void allReset(){
        enter.setEnabled(true);
        sub.setEnabled(true);
        mul.setEnabled(true);
        div.setEnabled(true);
        add.setEnabled(true);
        txtIn.setText("");
        txtSol.setText("");
        check_cal();
    }

    public void check_cal(){
        check_add = false;
        check_div = false;
        check_mul = false;
        check_sub = false;
    }

    public int check(String text){
        char aa = text.charAt(text.length() - 1);
        try{
            double bb = Integer.parseInt(String.valueOf(aa));
            return 0;
        } catch(Exception e){
            String text_in = txtIn.getText().toString();
            String string2 = "";
            for(int i = 0; i < text_in.length(); i ++){
                if( text_in.charAt(i) == ' ' ){
                    break;
                }

                string2 += text_in.charAt(i);
            }

            txtIn.setText(string2);
            check_cal();
            return 1;
        }
    }
}