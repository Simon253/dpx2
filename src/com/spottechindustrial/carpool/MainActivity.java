package com.spottechindustrial.carpool;

// import com.google.android.gms.maps.GoogleMap;
// import com.google.android.gms.maps.MapFragment;
import com.spottechindustrial.carpool.fragments.ScheduleListFragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

public class MainActivity extends Activity {
	public static final String TAG = MainActivity.class.getSimpleName();
	// private GoogleMap map;
	private ScheduleListFragment scheduleListFrag;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		if(scheduleListFrag == null){
			scheduleListFrag = new ScheduleListFragment();
		}
		if(savedInstanceState == null){
			getFragmentManager().beginTransaction().add(R.id.fragmentContainer, scheduleListFrag).commit();
		}
		
		/*
		Log.d("Simon", "map is " + (map == null));
		if (null == getFragmentManager()) {
			Log.v(TAG, "getFragmentManager is null");
		} else {
			if (null == getFragmentManager().findFragmentById(R.id.fragmentContainer)) {
				Log.v(TAG, "findFragmentById is null");
			}
		}

		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.fragmentContainer)).getMap();
		if(map == null) 
			Log.d("Simon", "map is null.");
			*/
	}


	

}
