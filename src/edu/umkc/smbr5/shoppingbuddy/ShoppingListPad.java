package edu.umkc.smbr5.shoppingbuddy;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;

public class ShoppingListPad {
    private ArrayList<ShoppingList> mShoppingLists;
    
    private static ShoppingListPad sShoppingListPad;
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
