package com.example.bookum;

import android.app.Activity; 
import com.parse.Parse;
import com.parse.ParseObject;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;
 
public class MainActivity extends Activity {
	
	ImageView sellButton, buyButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ParseObject.registerSubclass(Book.class);
		Parse.initialize(this, "j09kUykKeeqkzecORp4TxEaayTydJkdFHEhJia9U", "4IfpjmQZuwz5cSOTTXvOp1vp1e88GRFuK2o6lgJQ");
		
		buyListener();
		sellListener();
	}


	
	public void buyListener() {
		buyButton = (ImageView) findViewById(R.id.BuyButton);
		buyButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(MainActivity.this, BuyBookListActivity.class);
				startActivity(intent1);
				
			}
			
			
		});
	
	}
	public void sellListener() {
		sellButton = (ImageView) findViewById(R.id.SellButton);
		sellButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent2 = new Intent(MainActivity.this, SellBookListActivity.class);
				startActivity(intent2);
				
			}
			
		});
	}
}
