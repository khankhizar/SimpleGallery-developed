package com.example.android.simplegallery.models;
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
import android.net.Uri;
import com.example.android.simplegallery.GalleryPagerFragment;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;

public class GalleryPagerAdapter extends FragmentStatePagerAdapter {

	private List<Uri> resources;


	public GalleryPagerAdapter(FragmentActivity activity, List<Uri> resources) {
		super(activity.getSupportFragmentManager());
		this.resources = resources;
	}

	@Override
	public Fragment getItem(int position) {
		try {
			return GalleryPagerFragment.create(position, resources.get(position));
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public int getCount() {
		return resources.size();
	}
}