package com.spottechindustrial.carpool.adapters;

import com.spottechindustrial.carpool.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class CustomArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	public CustomArrayAdapter(Context context, int resource, String[] values) {
		super(context, resource, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_row_schedule, parent,
				false);

		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		String s = values[position];

		return rowView;
	}
}
