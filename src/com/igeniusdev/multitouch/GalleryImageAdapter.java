package com.igeniusdev.multitouch;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryImageAdapter extends BaseAdapter {
	private Context mContext;

	private int[] mImageIds = null;

	public GalleryImageAdapter(Context context, int[] ids) {
		mImageIds = ids;
		mContext = context;
	}

	public int getCount() {
		return mImageIds.length;
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int index, View view, ViewGroup viewGroup) {
		ImageView i = new ImageView(mContext);
		i.setImageResource(mImageIds[index]);
		i.setLayoutParams(new Gallery.LayoutParams(100, 100));
		i.setScaleType(ImageView.ScaleType.FIT_XY);
		return i;
	}
}