package jpabook.jpashop;

import jpabook.jpashop.domin.Book;
import jpabook.jpashop.domin.Order;
import jpabook.jpashop.domin.OrderItem;

import javax.persistence.*;


public class JpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            //Order order = new Order();
            //em.persist(order);

            //OrderItem orderItem = new OrderItem();
            //orderItem.setOrder(order);

            //em.persist(orderItem);
            //order.addOrderItem(new OrderItem());

            Book book = new Book();
            book.setName("JPA");
            book.setAuthor("윤석환");

            em.persist(book);

            tx.commit();
        }catch (Exception ex) {
            tx.rollback();
        }finally {
            em.close();
        }

        em.close();
        emf.close();
    }
}
