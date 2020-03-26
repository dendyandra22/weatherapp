package com.example.weatherapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.Settings;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        @Override
    public void onBackPressed() 
    { 
  
        // Create the object of 
        // AlertDialog Builder class 
        AlertDialog.Builder builder 
            = new AlertDialog 
                  .Builder(MainActivity.this); 
  
        // Set the message show for the Alert time 
        builder.setMessage("Do you want to exit ?"); 
  
        // Set Alert Title 
        builder.setTitle("Alert !"); 
  
        // Set Cancelable false 
        // for when the user clicks on the outside 
        // the Dialog Box then it will remain show 
        builder.setCancelable(false); 
  
        // Set the positive button with yes name 
        // OnClickListener method is use of 
        // DialogInterface interface. 
  
        builder 
            .setPositiveButton( 
                "Yes", 
                new DialogInterface 
                    .OnClickListener() { 
  
                        @Override
                        public void onClick(DialogInterface dialog, 
                                            int which) 
                        { 
  
                            // When the user click yes button 
                            // then app will close 
                            finish(); 
                        } 
                    }); 
  
        // Set the Negative button with No name 
        // OnClickListener method is use 
        // of DialogInterface interface. 
        builder 
            .setNegativeButton( 
                "No", 
                new DialogInterface 
                    .OnClickListener() { 
  
                        @Override
                        public void onClick(DialogInterface dialog, 
                                            int which) 
                        { 
  
                            // If user click no 
                            // then dialog box is canceled. 
                            dialog.cancel(); 
                        } 
                    }); 
  
        // Create the Alert dialog 
        AlertDialog alertDialog = builder.create(); 
  
        // Show the Alert Dialog box 
        alertDialog.show(); 
    } 
} 

//        gpsManager gpsManager = new gpsManager();
//        gpsManager.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
