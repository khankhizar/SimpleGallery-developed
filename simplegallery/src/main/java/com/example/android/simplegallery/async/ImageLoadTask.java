package com.example.android.simplegallery.async;
/*
 * Copyright 2018 Khizar Heyat Khan (khizarkhan8@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
import com.example.android.simplegallery.util.BitmapUtils;

import java.io.File;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;


public class ImageLoadTask extends AsyncTask<String, Integer, Bitmap> {

	Context mContext;
	ImageView mImageView;
	int width, height;

	public ImageLoadTask(Context mContext, ImageView mImageView, int width, int height) {
		this.mContext = mContext;
		this.mImageView = mImageView;
		this.width = width;
		this.height = height;
	}

	@Override
	protected Bitmap doInBackground(String... strings) {
		String path = strings[0];
		Bitmap bm = BitmapUtils.getFullImage(mContext, Uri.fromFile(new File(path)),
				width, height);
		return bm;
	}

	@Override
	protected void onPostExecute(Bitmap bitmap) {
		if (bitmap == null) {
			mImageView.setScaleType(ScaleType.CENTER);
//			bitmap = BitmapFactory.decodeResource(getResources(),
//					R.drawable.no_photo);
//			mImageView.setImageBitmap(bitmap);
		} else {
			mImageView.setScaleType(ScaleType.MATRIX);
			mImageView.setImageBitmap(bitmap);
		}
//		mImageView.setVisibility(View.VISIBLE);
//		mProgressBar.setVisibility(GONE);
	}

//	@Override
//	protected void onProgressUpdate(Integer... values) {
//		mProgressBar.setProgress(values[0]);
//	}
}