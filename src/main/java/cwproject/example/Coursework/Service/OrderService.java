package cwproject.example.Coursework.Service;

import cwproject.example.Coursework.Data.Order;
import cwproject.example.Coursework.Data.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllorders() {
        return orderRepository.findAll();
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);

    }

    public Order updateOrder(Order order){
        return orderRepository.save(order);


    }

    public void  deleteOrder(int id){
        orderRepository.deleteById(id);

    }

    public List<Order>findorderByName(String name){

        return orderRepository.findorderByName(name);
    }
//
//    public List<Order>findorderByPrice(int amount){
//
//        return orderRepository.findorderByPrice(amount);
//    }
//    public List<Order> findorderByNameandprice(String name,int amount){
//
//        return orderRepository. findorderByNameandprice(name,amount);
//    }


}
