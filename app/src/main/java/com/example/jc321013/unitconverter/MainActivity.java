package com.example.jc321013.unitconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText editCentimeters, editMeters, editInches, editFeet;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editCentimeters = (EditText) findViewById(R.id.editText);
        editMeters = (EditText) findViewById(R.id.editText2);
        editInches = (EditText) findViewById(R.id.editText3);
        editFeet = (EditText) findViewById(R.id.editText4);
        button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            //            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                double cm = Double.parseDouble(editCentimeters.getText().toString());
                double m = cm / 100;
                double inch = cm / 2.54;
                double foot = inch / 12;

                editMeters.setText("" + m);
                editInches.setText("" + inch);
                editFeet.setText("" + foot);


            }
        });

    }


    //        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}


