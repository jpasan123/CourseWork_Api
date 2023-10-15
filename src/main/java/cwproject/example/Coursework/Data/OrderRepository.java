package cwproject.example.Coursework.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {


    @Query("select o from Order o where o.name=?1")
    List<Order>findorderByName(String name);

//
//    @Query("select Or from order O where Or.amount=?1")
//    List<Order>findorderByPrice(int amount);
//
//    @Query("select Or from order O where Or.name=?1 and Or.amount=?2")
//    List<Order>findorderByNameandprice(String name ,int amount );


}
