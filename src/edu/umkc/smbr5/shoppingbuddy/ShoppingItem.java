package edu.umkc.smbr5.shoppingbuddy;

import java.util.UUID;

public class ShoppingItem {
    private UUID mId;
    private String mTitle;
    private Boolean mCheckedOff;
    
    public ShoppingItem() {
        mId = UUID.randomUUID();
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
     * @return the mCheckedOff
     */
    public Boolean getCheckedOff() {
        return mCheckedOff;
    }
    
    /**
     * @param mCheckedOff the mCheckedOff to set
     */
    public void setCheckedOff(Boolean checkedOff) {
        mCheckedOff = checkedOff;
    }
}
