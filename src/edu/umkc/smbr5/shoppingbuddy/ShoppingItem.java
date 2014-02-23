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
