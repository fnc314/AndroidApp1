package com.fnc314.mathify;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.main_view, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void mathify(View view) {
		EditText num1text=(EditText)findViewById(R.id.num1);
		EditText num2text=(EditText)findViewById(R.id.num2);
		Integer num1=Integer.parseInt(num1text.getText().toString()),num2=Integer.parseInt(num2text.getText().toString());
		Integer sum=num1+num2;
		Integer diff=Math.abs(num1-num2);
		Integer prod=num1 * num2;
		Double quot1= num1.doubleValue() / num2.doubleValue();
		Double quot2= num2.doubleValue() / num1.doubleValue();
		
		TextView addition=(TextView)findViewById(R.id.sum);
		addition.setText("Sum: " + sum.toString());
		TextView difference=(TextView)findViewById(R.id.diff);
		difference.setText("Difference: " + diff.toString());
		TextView product=(TextView)findViewById(R.id.prod);
		product.setText("Product: " + prod.toString());
		TextView quotient1=(TextView)findViewById(R.id.quot1);
		quotient1.setText("Quotient 1 (num1/num2): "+quot1);
		TextView quotient2=(TextView)findViewById(R.id.quot2);
		quotient2.setText("Quotient 2 (num2/num1): "+quot2);
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
