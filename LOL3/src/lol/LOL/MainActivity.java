package lol.LOL;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	    public static final String milk = "Cow";
		protected static int year;
		protected static int month;
		protected static int day;





		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        }
	     
	    
	   
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void DataClick(View view)
	{
		OnDateSetListener myCallBack = new OnDateSetListener() {

			public void onDateSet(DatePicker view, int yearOfYear, int monthOfYear,int dayOfMonth) {
				
				MainActivity.year = yearOfYear;
				MainActivity.month = monthOfYear;
				MainActivity.day = dayOfMonth;
				EditText Data = (EditText) findViewById(R.id.editDate);
				Data.setText("");
				Data.append(Integer.toString(MainActivity.day)+"/"+Integer.toString(MainActivity.month+1)+"/"+Integer.toString(MainActivity.year));

							}
			};
	
		DatePickerDialog FuckThemAll = new DatePickerDialog (this, myCallBack, 1993, 6, 25);	
		FuckThemAll.show();
//				
	}
	
	
	
	public void Click(View view)
{	String[] words=new String[7];
	
		EditText FIO = (EditText)findViewById(R.id.editText1);
		words[0] = FIO.getText().toString();
		
		EditText DATA = (EditText)findViewById(R.id.editDate);
		words[1] = DATA.getText().toString();
		
		Spinner SEX = (Spinner)findViewById(R.id.spinner1);
		words[2] =  (String) SEX.getSelectedItem();
		
		EditText RANG = (EditText)findViewById(R.id.editText2);
		words[3] = RANG.getText().toString();
		
		EditText SALARY = (EditText)findViewById(R.id.editText3);
		words[4] = SALARY.getText().toString();
		
		EditText PHONE = (EditText)findViewById(R.id.editText4);
		words[5] = PHONE.getText().toString();
		
		EditText MAIL = (EditText)findViewById(R.id.editText666);
		words[6] = MAIL.getText().toString();
			
//		
		Intent intent = new Intent(this, SecondActivity.class);
		intent.putExtra(milk, words);
		
		startActivity(intent);
		

	}
	
}
