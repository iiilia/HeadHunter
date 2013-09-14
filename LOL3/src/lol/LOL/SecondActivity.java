package lol.LOL;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class SecondActivity extends Activity {
	
final int DIALOG_EXIT = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.boss_screen);
		
		Intent intent = getIntent();
	
		String[] words = new String[7];
		words = intent.getStringArrayExtra(MainActivity.milk);
		
		TextView fIO = (TextView) findViewById(R.id.textView11);
		fIO.append(words[0]);
		TextView Data = (TextView) findViewById(R.id.textView12);
		Data.append(words[1]);
		TextView SEX1 = (TextView) findViewById(R.id.textView13);
		SEX1.append(words[2]);
		TextView RANG1 = (TextView) findViewById(R.id.textView14);
		RANG1.append(words[3]);
		TextView Sala = (TextView) findViewById(R.id.textView15);
		Sala.append(words[4]);
		TextView Phon = (TextView) findViewById(R.id.textView16);
		Phon.append(words[5]);
		TextView MAIL1 = (TextView) findViewById(R.id.textView17);
		MAIL1.append(words[6]);
		
		Linkify.addLinks(MAIL1,Linkify.EMAIL_ADDRESSES);
		Linkify.addLinks(Phon,Linkify.PHONE_NUMBERS);

	}
	
    
    public void boss_click(View v) {
      // вызываем диалог
      
  	showDialog(DIALOG_EXIT);
    }
    
    protected Dialog onCreateDialog(int id) {
    	EditText Reply = (EditText)findViewById(R.id.editText7);
		String Letter = Reply.getText().toString();
				
		//setContentView(R.layout.activity_main);
      if (id == DIALOG_EXIT) {
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        // заголовок
        adb.setTitle("Вам ответ"); 
        // сообщение
        adb.setMessage(Letter);
        // иконка
        adb.setIcon(android.R.drawable.ic_dialog_info);
        // кнопка положительного ответа
        adb.setPositiveButton("Да, меня устраивает работа", myClickListener);
        // кнопка отрицательного ответа
        adb.setNegativeButton("Нет, спасибо", myClickListener);
        // создаем диалог
        return adb.create();
      }
      return super.onCreateDialog(id);
    }
    
    OnClickListener myClickListener = new OnClickListener() {
    public void onClick(DialogInterface dialog, int which) {
      switch (which) {
      // положительная кнопка
      case Dialog.BUTTON_POSITIVE:{
    	  
    	  
        break;}
      // негаитвная кнопка
      case Dialog.BUTTON_NEGATIVE:{
    	  
    	  Intent s_f = new Intent(SecondActivity.this, MainActivity.class);  		
  			startActivity(s_f);
  		
        break;}

       
      }
    }
  };
  
  void saveData() {
    Toast.makeText(this, "потрачено", Toast.LENGTH_SHORT).show();
  }
	
	

	



}
