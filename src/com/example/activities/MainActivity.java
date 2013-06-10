package com.example.activities;


import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button bn;
    TextView txt;
    EditText etxt;
    int i=0;
    
   	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bn = (Button)findViewById(R.id.button1);
		
		bn.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View view) {
				if(i==0)
				{
	            etxt   = (EditText)findViewById(R.id.editText1);
	            txt = (TextView)findViewById(R.id.textView1);
	            txt.setText("Welcome "+etxt.getText().toString()+"! Click OK to see the jumbled sequence.");
	            i=1;
				}
				
				else
				{
	            char wa[] = etxt.getText().toString().toCharArray();	
	            int l=etxt.getText().toString().length();
	            l=l-1;
	            Random r = new Random();
	            for(int i =l; i > 0; i--)
	            {
	              int rand = r.nextInt(i);
	              char a=wa[i];
	              wa[i]=wa[rand];
	              wa[rand]=a;
	           }
	           String newword = String.copyValueOf(wa);
	            txt.setText("The jumbled sequence is " + newword + ". Click again to see another jumbled sequence.");
				}
	          }
	        });	
		}	
	         
		
		  
	}

	
      
       