package edu.umkc.smbr5.shoppingbuddy;

import java.util.ArrayList;
import java.util.UUID;

public class ShoppingList {
    private UUID mId;
    private String mTitle;
    private ArrayList<ShoppingItem> mList;
    
    public ShoppingList() {
        mId = UUID.randomUUID();
        mList = new ArrayList<ShoppingItem>();
    }
    
    /**
     * @return the ID
     */
    public UUID getId() {
        return mId;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return mTitle;
    }
    
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        mTitle = title;
    }
    
    /**
     * @return the mList
     */
    public ArrayList<ShoppingItem> getList() {
        return mList;
    }
    
    @Override
    public String toString() {
        return mTitle;
    }
}
