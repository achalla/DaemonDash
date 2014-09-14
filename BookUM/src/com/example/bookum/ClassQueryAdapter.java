package com.example.bookum;

import java.util.ArrayList;
import java.util.Arrays;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parse.ParseQueryAdapter;
import com.parse.ParseQuery;

public class ClassQueryAdapter extends ParseQueryAdapter<Book>{

	public ClassQueryAdapter(Context context) {
		super(context, new ParseQueryAdapter.QueryFactory<Book>(){
			
			String search = getInput(); 

			@Override
			public ParseQuery<Book> create() {
				ParseQuery bookQuery = new ParseQuery("Book");
				bookQuery.whereContainedIn("classId", Arrays.asList(search));
				return bookQuery.orderByAscending("classId");
			}
			
		});
		
	}
	
	public static String getInput(){
		return BuyBookListActivity.course;
		
	}
	
	public View getItemView(Book book, View v, ViewGroup parent){
		if (v == null){
			v = View.inflate(getContext(), R.layout.class_list_items, null);
		}
		
		super.getItemView(book, v, parent);
		
		//book.getEMail....etc look in book class
		
		String bookName = book.getBookId();
		String email = book.getEmail();
		String bookSwap = book.getBookSwap();
	
		
		
		TextView emailID = (TextView) v.findViewById(R.id.emailID);
		TextView classID = (TextView) v.findViewById(R.id.classID);
		TextView bookID = (TextView) v.findViewById(R.id.bookID);
		
		
		classID.setText(bookName);
		emailID.setText(email);
		bookID.setText(bookSwap);
		
		
		
		return v;
	}
}
