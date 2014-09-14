package com.example.bookum;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class SellBookListActivity extends Activity {
	
	private EditText classId, bookId, bookSwap, price, email;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sell_book_list);
		
		classId = (EditText) findViewById(R.id.EditText2);
		bookId = (EditText) findViewById(R.id.EditText3);
		
		
	}
}
