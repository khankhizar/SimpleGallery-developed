package com.example.android.simplegallery.models.ui;
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
import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class CoverFlowPageTransformer implements android.support.v4.view.ViewPager.PageTransformer {

	public void transformPage(View view, float position) {
		view.setRotationY(position * -30);
	}
}