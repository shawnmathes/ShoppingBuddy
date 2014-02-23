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
    
    /**
     * Create a new instance of DetailsFragment, initialized to
     * show the text at 'index'.
     */
    public static ItemListFragment newInstance(int index) {
        ItemListFragment i = new ItemListFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        i.setArguments(args);

        return i;
    }
    
    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        ShoppingList list = ShoppingListPad.get(getActivity()).getShoppingLists().get(getShownIndex());
        getActivity().setTitle(list.getTitle());
        mShoppingItems = list.getList();
        
        ArrayAdapter<ShoppingItem> adapter =
                new ArrayAdapter<ShoppingItem>(getActivity(),
                        android.R.layout.simple_list_item_1, mShoppingItems);
        setListAdapter(adapter);
    }
}
