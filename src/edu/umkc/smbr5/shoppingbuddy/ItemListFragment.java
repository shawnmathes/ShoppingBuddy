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

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

public class ItemListFragment extends ListFragment {
    private ArrayList<ShoppingItem> mShoppingItems;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.main_list_title);
        mShoppingItems = ShoppingListPad.get(getActivity()).getShoppingLists().get(1).getList();
        
        ArrayAdapter<ShoppingItem> adapter =
                new ArrayAdapter<ShoppingItem>(getActivity(),
                        android.R.layout.simple_list_item_1, mShoppingItems);
        setListAdapter(adapter);
    }
}
