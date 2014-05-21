package com.spottechindustrial.carpool.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spottechindustrial.carpool.R;
import com.spottechindustrial.carpool.adapters.CustomArrayAdapter;

public class ScheduleListFragment extends ListFragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
				Bundle saveInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_schedule_list, container,false);

		return rootView;
	}


	  @Override
	  public void onActivityCreated(Bundle savedInstanceState) {
	    super.onActivityCreated(savedInstanceState);

	    //load data
	    String[] values = new String[] { "Peter", "James", "Bill",
	        "Jacobo", "Fourth", "Fifth", "Sixth", "Nineth", "Eleventh"};

	    CustomArrayAdapter myCustomArrayAdapter = new CustomArrayAdapter( getActivity(), R.layout.list_row_schedule, values) ;
	    
	    //final ImageView hasCar = (ImageView) getView().findViewById(R.id.hasCarIconScheduleItem);
	    //View hasCarParent = (View) getView().findViewById(R.id.hasDrvScheduleItem);
	    //Log.d("Simon", "hasCarParent = " + hasCarParent);
	    /*
	    hasCar.setOnClickListener(new OnClickListener(){
	    		public void onClick(View v){
	    			((ImageView) v).setImageResource(R.drawable.has_not_car);
	    		}
	    });
	    */
	    setListAdapter(myCustomArrayAdapter);
	  }
}
