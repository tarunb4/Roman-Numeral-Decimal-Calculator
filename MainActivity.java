package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int num1, num2, total, num; //Intializing all the Integer variables
    TextView outputdeci, outputrom; //Intializing all the textview variables
    boolean add,sub; //Initializing all the boolean variables

    public String converttostring(int num) { //First method converting decimal to Roman Numeral
        this.num =  num; // keeps the same variable without actually having to create a new variable
        String roman = ""; // Storing the roman numeral inside this empty string

        while (num >= 1000) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "M"; // If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 1000; // subtracts 1000 from the user's input for the number so no more of the same letter show again
        }

        while ( num >= 900) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "CM"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 900; // subtracts 900 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 500) {//Checks to see if num the user entered is greater than or equal to this statement
            roman += "D";  //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 500; // subtracts 500 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 400) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "CD"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 400; // subtracts 400 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 100) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "C"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 100; // subtracts 100 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 90) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "XC"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 90; // subtracts 90 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 50) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "L"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 50; // subtracts 50 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 40) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "XL"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 40; // subtracts 40 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 10) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "X"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 10; // subtracts 10 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 9) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "IX"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 9; // subtracts 9 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 5) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "V"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 5; // subtracts 5 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 4) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "IV"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 4; // subtracts 4 from the user's input for the number so no more of the same letter show again
        }

        while (num >= 1) { //Checks to see if num the user entered is greater than or equal to this statement
            roman += "I"; //If the number the user entered is greater than/equal to this letter will be added to the empty string
            num -= 1; // subtracts 1 from the user's input for the number so no more of the same letter show again
        }
            return roman;// stores the value of the variable

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //MAPPING BUTTONS TO CORRECT OBJECT ID
        Button ButtonAC = (Button) findViewById(R.id.buttonAC);
        Button ButtonRD = (Button) findViewById(R.id.buttonRD);
        Button Button0 = (Button) findViewById(R.id.button0);
        Button Button1 = (Button) findViewById(R.id.button1);
        Button Button2 = (Button) findViewById(R.id.button2);
        Button Button3 = (Button) findViewById(R.id.button3);
        Button Button4 = (Button) findViewById(R.id.button4);
        Button Button5 = (Button) findViewById(R.id.button5);
        Button Button6 = (Button) findViewById(R.id.button6);
        Button Button7 = (Button) findViewById(R.id.button7);
        Button Button8 = (Button) findViewById(R.id.button8);
        Button Button9 = (Button) findViewById(R.id.button9);
        Button Buttonadd = (Button) findViewById(R.id.buttonadd);
        Button Buttonsub = (Button) findViewById(R.id.buttonsub);
        Button Buttontotal = (Button) findViewById(R.id.buttontotal);

        outputdeci = (TextView) findViewById(R.id.outputdeci);
        outputrom = (TextView) findViewById(R.id.outputrom);






        // THIS BUTTON IS STARTING A NEW WINDOW WITHIN THAT SAME SCREEN
        ButtonRD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), Calculator2.class);
                startActivity(startIntent);
            }
        });

        //ONCE THE CLEAR BUTTON IS CLICKED IT WILL RESET ALL VALUES
        ButtonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = 0;
                num2 = 0;
                total = 0;
                outputdeci.setText("");
                outputrom.setText("");


            }
        });

        //ONCE THE USER CLICKS ON THE 0 BUTTON
        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "0" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL

            }
        });

        // ONCE THE USER CLICKS ON THE 1 BUTTON
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "1" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL



            }
        });

        // ONCE THE USER CLICKS ON THE 2 BUTTON
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "2" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL

            }
        });

        // ONCE THE USER CLICKS ON THE 3 BUTTON
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "3" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL

            }
        });

        // ONCE THE USER CLICKS ON THE 4 BUTTON
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "4" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL

            }
        });

        // ONCE THE USER CLICKS ON THE 5 BUTTON
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "5" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL

            }
        });

        // ONCE THE USER CLICKS ON THE 6 BUTTON
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "6" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL

            }
        });

        // ONCE THE USER CLICKS ON THE 7 BUTTON
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "7" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL

            }
        });

        // ONCE THE USER CLICKS ON THE 8 BUTTON
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "8" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL

            }
        });

        // ONCE THE USER CLICKS ON THE 9 BUTTON
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outputdeci.setText(outputdeci.getText().toString() + "9" ); // CONVERTING THAT DECIMAL INTO A STRING
                outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //USING THE CONVERT TO ROMAN NUMERAL METHOD TO CONVERTING THE STRING INTO A DECIMAL BACK INTO A ROMAN NUMERAL

            }
        });

        //ONCE THE USER SELECTS THE ADDING BUTTON
        Buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(outputdeci == null){ //IF THE OUTPUT OF THE DECIMAL IS NOTHING
                    outputdeci.setText(""); // IT WILL SET THE OUTPUT OF THE DECIMAL TO A STRING WHICH IS BLANK
                }

                else{ //OTHERWISE
                    num1 = Integer.parseInt(outputdeci.getText() + ""); //THE INTEGER THAT THE USER INPUTS WILL BE STORED IN THIS VARIABLE AND CHANGED INTO A INTEGER
                    add = true; // THIS BUTTON TURNS TRUE
                    outputdeci.setText(null); //CLEARS THE NUMBER THAT YOU INPUTTED ONCE YOU CLICK THE ADD BUTTON
                }
            }
        });

        Buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(outputdeci == null){ //IF THE OUTPUT OF THE DECIMAL IS NOTHING
                    outputdeci.setText("");  // IT WILL SET THE OUTPUT OF THE DECIMAL TO A STRING WHICH IS BLANK
                }

                else{
                    num1 = Integer.parseInt(outputdeci.getText() + ""); //THE INTEGER THAT THE USER INPUTS WILL BE STORED IN THIS VARIABLE AND CHANGED INTO A INTEGER
                    sub = true; // THIS BUTTON TURNS TRUE
                    outputdeci.setText(null);  //CLEARS THE NUMBER THAT YOU INPUTTED ONCE YOU CLICK THE ADD BUTTON
                }
            }
        });

        Buttontotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Integer.parseInt(outputdeci.getText()+ ""); //THE SECOND NUMBER ALSO GETS CONVERTED TO AN INTEGER


                if(add == true){ //IF THE ADDING BUTTON WAS SET TO TRUE
                    outputdeci.setText(num1 + num2+""); //WILL PREFORM ADDITION CALCULATION

                    if (num1 + num2 < 5000) // IF THE TOTAL OF BOTH NUMBERS ADDED TOGETHER IS LESS THAN 5000
                    outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString()))+ ""); //THEN IT WILL OUTPUT THE ROMAN NUMERAL RESULT BY USING THE CONVERT TO ROMAN NUMERAL METHOD
                    add = false; //SET ADD TO FALSE

                    if (num1 + num2 > 5000) { //IF THE TOTAL IS GREATER THAN 5000
                        outputrom.setText("Error"); //CANNOT OUTPUT INTO ROMAN NUMERAL
                        add = false; //SET ADD TO FALSE
                    }

                }

                if (sub == true){ //IF THE SUBTRACTING BUTTON WAS SET TO TRUE
                    outputdeci.setText(num1 - num2+""); //WILL PREFORM SUBTRACTION CALCULATION


                    if (num1 - num2 < 5000) { // IF THE TOTAL OF BOTH NUMBERS ADDED TOGETHER IS LESS THAN 5000
                        outputrom.setText(converttostring(Integer.parseInt(outputdeci.getText().toString())) + ""); //THEN IT WILL OUTPUT THE ROMAN NUMERAL RESULT BY USING THE CONVERT TO ROMAN NUMERAL METHOD
                        sub = false; // SET SUB TO FALSE
                    }

                    if (num1 - num2 > 5000 || num1 - num2 < 0){ //IF THE TOTAL IS GREATER THAN 5000 OR LESS THAN 0
                        outputrom.setText("Error"); //CANNOT OUTPUT INTO ROMAN NUMERAL
                        add = false; //SET SUB TO FALSE
                    }

                }


            }
        });


    }
}
