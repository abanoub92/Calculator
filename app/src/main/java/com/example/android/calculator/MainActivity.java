package com.example.android.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    /** variables contains number 1 for first number in operation,
     * number 2 for second after choosing the assign operation, and
     * result for the result of the operation*/
    private double number1, number2, result;

    /** contain the assign operation (+ | - | * | /) */
    private char ope;

    /** display for shows up which button user pressed
      * record for recoding the whole process */
    TextView display, record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display_text_view);
        record = findViewById(R.id.display2_text_view);
    }

    /**
     * Method to determine which button was clicked
     * @param s enter the number well display on screen
     */
    private void whichButton(String s){
        String enter = display.getText().toString() + s;
        display.setText(enter);
    }

    /**
     * Method setRecord to display the whole operation
     * @param rec to get the numbers and operators
     */
    private void setRecord(String rec){
        String storage = record.getText().toString() + " " + rec;
        record.setText(storage);
    }

    /**
     * Method operators determine which operator was clicked
     * @param sign enter the assign here
     */
    private void operators(char sign){
        number1 = Double.parseDouble(display.getText().toString());
        ope = sign;
        display.setText("");

    }

    /**
     * Method btnOne to display no 1
     * @param view to connect with xml button
     */
    public void btnOne(View view){
        whichButton("1");
        setRecord("1");
    }

    //Method btnTwo to display no 2
    public void btnTwo(View view){
        whichButton("2");
        setRecord("2");
    }

    //Method btnThree to display no 3
    public void btnThree(View view){
        whichButton("3");
        setRecord("3");
    }

    //Method btnFour to display no 4
    public void btnFour(View view){
        whichButton("4");
        setRecord("4");
    }

    //Method btnFive to display no 5
    public void btnFive(View view){
        whichButton("5");
        setRecord("5");
    }

    //Method btnSix to display no 6
    public void btnSix(View view){
        whichButton("6");
        setRecord("6");
    }

    //Method btnSeven to display no 7
    public void btnSeven(View view){
        whichButton("7");
        setRecord("7");
    }

    //Method btnEight to display no 8
    public void btnEight(View view){
        whichButton("8");
        setRecord("8");
    }

    //Method btnNine to display no 9
    public void btnNine(View view){
        whichButton("9");
        setRecord("9");
    }

    //Method btnZero to display no 0
    public void btnZero(View view){
        whichButton("0");
        setRecord("0");
    }

    //Method btnDot to display Decimal point
    public void btnDot(View view){
        whichButton(".");
        setRecord(".");
    }

    //Method btnAdd to add sum operator
    public void btnAdd(View view){
        operators('+');
        setRecord("+");
    }

    //Method btnSubtract to add subtract operator
    public void btnSubtract(View view){
        operators('-');
        setRecord("-");
    }

    //Method btnMultiply to add multiply operator
    public void btnMultiply(View view){
        operators('*');
        setRecord("*");
    }

    //Method btnDivided to add divided operator
    public void btnDivided(View view){
        operators('/');
        setRecord("/");
    }

    //Method btnMod to add mod operator
    public void btnMod(View view){
        operators('%');
        setRecord("%");
    }

    /**
     * Method btnEqual display the result
     * @param view to connect xml button with this method
     */
    public void btnEqual(View view){
        number2 = Double.parseDouble(display.getText().toString());

        switch (ope){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
        }
        String res = String.valueOf(result);
        //String res = String.format("%.0f", result);     //to prevent display the result with points
        display.setText(res);
    }

    /**
     * Method btnClear to clear screen from any numbers or operations
     * @param view
     */
    public void btnClear(View view){
        display.setHint(R.string.oow);
        display.setText("");

        record.setHint(R.string.oow);
        record.setText("");
    }
}
