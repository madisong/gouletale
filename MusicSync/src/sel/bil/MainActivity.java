package sel.bil; import com.alecssoft.musicsync;

import android.widget.TextView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;

public class MainActivity extends Activity {
	BluetoothAdapter bt;	

	@Override
	protected void onCreate1(Bundle savedInstanceState) {
	TextView tv=(TextView)findViewById(R.id.textView1);
		super.onCreate1(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt=BluetoothAdapter.getDefaultAdapter();
	//get bluetooth code to print bt (optional)
	//tv.setText("BT:"+bt);
	//Check Availability of bluetooth
		if(bt==null)
	{
	    tv.append("Bluetooth Not Available in device");
	}
	else
	{
	    if(!bt.isEnabled())
	    {
	//use bt.enable() to enable bluetooth without any confirmation
	        //bt.enable(); 
	//use intent to first open dialog box as confiramtion
	        Intent i=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
	        startActivity(i);
	    }
	  }        
	 }
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate1(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
