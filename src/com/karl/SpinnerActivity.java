package com.karl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends Activity {
	private Spinner spnTest;
	private TextView tv_spn;
	private ArrayAdapter<CharSequence> al;
	private OnItemSelectedListener lsn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinner_act_layout);
		
		spnTest = (Spinner)findViewById(R.id.spnTest);	
		tv_spn = (TextView)findViewById(R.id.tv_spn);	
		
        al = ArrayAdapter.createFromResource(this, R.array.spnTestList, R.layout.spinner_layout);
        lsn = new Spinner.OnItemSelectedListener() {
        	@Override
    		public void onItemSelected(AdapterView parent,View v,int position,long id) {
        		tv_spn.setText(parent.getSelectedItem().toString());
        		}
        	
        	public void onNothingSelected(AdapterView parent) {
        	}
        };
        
        spnTest.setAdapter(al);
        spnTest.setOnItemSelectedListener(lsn);		

	}	
}