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
import java.util.UUID;

import android.content.Context;

public class ShoppingListPad {
    private ArrayList<ShoppingList> mShoppingLists;
    
    private static ShoppingListPad sShoppingListPad;
    @SuppressWarnings("unused")
    private Context mAppContext;
    
    private ShoppingListPad(Context appContext) {
        mAppContext = appContext;
        mShoppingLists = new ArrayList<ShoppingList>();
        
        // TODO: Dummy data, remove after testing
        for (int i = 0; i < 5; i++) {
            ShoppingList l = new ShoppingList();
            l.setTitle("List #" + i);
            for (int j = 0; j < 10; j++) {
                ShoppingItem li = new ShoppingItem();
                li.setTitle("Item #" + j);
                li.setCheckedOff(j % 2 == 0); // Every other one
                l.getList().add(li);
            }
            mShoppingLists.add(l);
        }
    }
    
    public static ShoppingListPad get(Context c) {
        if (sShoppingListPad == null) {
            sShoppingListPad = new ShoppingListPad(c.getApplicationContext());
        }    
        return sShoppingListPad;
    }
    
    public ArrayList<ShoppingList> getShoppingLists() {
        return mShoppingLists;
    }
    
    public ShoppingList getShoppingList(UUID id) {
        for (ShoppingList l : mShoppingLists) {
            if (l.getId().equals(id)) {
                return l;
            }
        }
        return null;
    }
}
