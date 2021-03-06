package com.fudfill.runner.slidingmenu.adapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Sowmya on 1/4/2015.
 */

public class CustomerWaypointDetails implements Serializable {
    private String wayPointOrder;
    private String wayPointName;
    private String wayPointPrice;
    private List<CustomerOrderDetails> itemList = new ArrayList<CustomerOrderDetails>();

    public CustomerWaypointDetails(String wayPointOrder, String wayPointName, String wayPointPrice){
        this.wayPointOrder=wayPointOrder;
        this.wayPointName=wayPointName;
        this.wayPointPrice=wayPointPrice;
    }
    public String getWaypointOrder(){
        return this.wayPointOrder;
    }
    public void setWayPointOrder(String wayPointOrder){
        this.wayPointOrder=wayPointOrder;
    }
    public String getWayPointName(){
        return this.wayPointName;
    }
    public void setWayPointName(String wayPointName){
        this.wayPointName=wayPointName;
    }
    public String getWayPointPrice(){
        return this.wayPointPrice;
    }
    public void setWayPointPrice(String wayPointPrice){
        this.wayPointPrice=wayPointPrice;
    }
    public List<CustomerOrderDetails>getItemList(){
        return itemList;
    }
    public void setItemList(List<CustomerOrderDetails> itemList){
        this.itemList=itemList;
    }

}
