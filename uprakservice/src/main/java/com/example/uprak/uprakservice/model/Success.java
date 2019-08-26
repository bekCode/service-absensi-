
package com.example.uprak.uprakservice.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Success {

    @SerializedName("is_map_shown")
    @Expose
    private Boolean isMapShown;
    @SerializedName("my_group")
    @Expose
    private MyGroup myGroup;
    @SerializedName("shift")
    @Expose
    private Object shift;
    @SerializedName("my_group_members")
    @Expose
    private List<MyGroupMember> myGroupMembers = null;

    public Boolean getIsMapShown() {
        return isMapShown;
    }

    public void setIsMapShown(Boolean isMapShown) {
        this.isMapShown = isMapShown;
    }

    public MyGroup getMyGroup() {
        return myGroup;
    }

    public void setMyGroup(MyGroup myGroup) {
        this.myGroup = myGroup;
    }

    public Object getShift() {
        return shift;
    }

    public void setShift(Object shift) {
        this.shift = shift;
    }

    public List<MyGroupMember> getMyGroupMembers() {
        return myGroupMembers;
    }

    public void setMyGroupMembers(List<MyGroupMember> myGroupMembers) {
        this.myGroupMembers = myGroupMembers;
    }

}
