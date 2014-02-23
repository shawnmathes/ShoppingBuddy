package edu.umkc.smbr5.shoppingbuddy;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

public class MainListFragment extends ListFragment {
    private ArrayList<ShoppingList> mShoppingLists;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.main_list_title);
        mShoppingLists = ShoppingListPad.get(getActivity()).getShoppingLists();
        
        ArrayAdapter<ShoppingList> adapter =
                new ArrayAdapter<ShoppingList>(getActivity(),
                        android.R.layout.simple_list_item_1, mShoppingLists);
        setListAdapter(adapter);
    }
}
