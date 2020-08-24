/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bruno Araujo
 */
public class OrderModel
{
    private Date moment;
    private OrderStatusEnum status;
    private ClientModel client;
    
    private ArrayList<OrderItemModel> orderItemList;

    public OrderModel()
    {
        this.moment = new Date();
    }
    
    public OrderModel(OrderStatusEnum status)
    {
        this.moment = new Date();
        this.status = status; 
    }
    
    public Double total()
    {
        return 0.00;
    }
    
    public void addOrderItem(OrderItemModel orderItem)
    {
        this.orderItemList.add(orderItem);
    }
    
    public void addOrderItem(ArrayList<OrderItemModel> orderItems)
    {
        this.orderItemList.addAll(orderItems);
    }
    
    public void removeOrderItem(OrderItemModel orderItem)
    {
        this.orderItemList.remove(orderItem);
    }
    
    public void clearOrderItem()
    {
        this.orderItemList.clear();
    }

    public Date getMoment()
    {
        return moment;
    }

    public void setMoment(Date moment)
    {
        this.moment = moment;
    }

    public OrderStatusEnum getStatus()
    {
        return status;
    }

    public void setStatus(OrderStatusEnum status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "OrderModel{" + "moment=" + moment + ", status=" + status + ", orderItemList=" + orderItemList + '}';
    }
}
