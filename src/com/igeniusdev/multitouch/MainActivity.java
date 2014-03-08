package com.igeniusdev.multitouch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;

public class MainActivity extends Activity {

	com.igeniusdev.multitouch.PhotoSortrView photoSorter;
	int[] images = { R.drawable.gentleman_00, R.drawable.gentleman_01,
			R.drawable.gentleman_02, R.drawable.gentleman_03,
			R.drawable.gentleman_04, R.drawable.gentleman_06,
			R.drawable.gentleman_07, R.drawable.gentleman_08,
			R.drawable.gentleman_09, R.drawable.gentleman_10,
			R.drawable.gentleman_11, R.drawable.gentleman_12,
			R.drawable.gentleman_13, R.drawable.gentleman_14,
			R.drawable.gentleman_15, R.drawable.gentleman_16,
			R.drawable.gentleman_17, R.drawable.gentleman_18,
			R.drawable.gentleman_19, R.drawable.gentleman_20,
			R.drawable.gentleman_21, R.drawable.gentleman_22 };
	int i = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle(R.string.instructions);
		setContentView(R.layout.main);
		photoSorter = (com.igeniusdev.multitouch.PhotoSortrView) findViewById(R.id.photosortr);

		Gallery gallery = (Gallery) findViewById(R.id.butOk);
		gallery.setAdapter(new GalleryImageAdapter(MainActivity.this, images));
		gallery.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				photoSorter.loadImages1(MainActivity.this, images[position]);
			}
		});
	}

}