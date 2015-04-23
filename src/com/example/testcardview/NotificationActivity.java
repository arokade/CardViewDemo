package com.example.testcardview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;


public class NotificationActivity extends ActionBarActivity {

	   private static final String TAG = "CardListActivity";
	    private CardArrayAdapter cardArrayAdapter;
	    private ListView listView;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.list_view);
	        listView = (ListView) findViewById(R.id.card_listView);

	        listView.addHeaderView(new View(this));
	        listView.addFooterView(new View(this));

	        cardArrayAdapter = new CardArrayAdapter(getApplicationContext(), R.layout.list_item_card);

	        for (int i = 0; i < 10; i++) {
	            Card card = new Card("Card " + (i+1) + " Line 1", "Card " + (i+1) + " Line 2");
	            cardArrayAdapter.add(card);
	        }
	        listView.setAdapter(cardArrayAdapter);
	    }


}
