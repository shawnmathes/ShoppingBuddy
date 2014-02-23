/*
 * Copyright (C) 2014 Shawn Mathes
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package edu.umkc.smbr5.shoppingbuddy;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.Fragment;

public class ItemListActivity extends SingleFragmentActivity {
    public static final String ITEM_LIST_INDEX = "edu.umkc.smbr5.shoppingbuddy.index";

    @Override
    protected Fragment createFragment() {
        setupActionBar();
        
        Intent intent = getIntent();
        int index = intent.getIntExtra(ITEM_LIST_INDEX, 0);
        return ItemListFragment.newInstance(index);
    }
    
    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void setupActionBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

}
