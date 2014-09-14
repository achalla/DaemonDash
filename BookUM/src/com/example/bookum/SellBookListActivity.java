package com.example.bookum;

import com.parse.ParseException;
import com.parse.SaveCallback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SellBookListActivity extends Activity {
	
	private EditText classId, bookId, bookSwap, price, email;
	public Book book;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sell_book_list);
		
		book = new Book();
		
		classId = (EditText) findViewById(R.id.EditText2);
		bookId = (EditText) findViewById(R.id.EditText3);
		bookSwap = (EditText) findViewById(R.id.EditText4);
		price = (EditText) findViewById(R.id.EditText5);
		email = (EditText) findViewById(R.id.EditText1);
		
		final Button submit = (Button) findViewById(R.id.Button2);
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				book.setClassId(classId.getText().toString());
				book.setBookId(bookId.getText().toString());
				book.setBookSwap(bookSwap.getText().toString());
				book.setPrice(Integer.parseInt(price.getText().toString()));
				book.setEmail(email.getText().toString());
				book.saveInBackground();
				
				//Intent i = new Intent(getParent(), MainActivity.class);
				//i.putExtra("AlreadyOpenedBitch", true);
				//startActivity(i);
			}
		});
	}
}
