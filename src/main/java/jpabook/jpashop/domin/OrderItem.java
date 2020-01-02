package jpabook.jpashop.domin;

import jdk.nashorn.internal.runtime.logging.Logger;

import javax.persistence.*;

@Entity
public class OrderItem {
    @Id @Logger
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    //@Column(name="ITEM_ID")
    //private Long itemId;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    private int orderPrice;
    private int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //public Long getItemId() {
    //    return itemId;
    //}

    //public void setItemId(Long itemId) {
    //    this.itemId = itemId;
    //}

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
