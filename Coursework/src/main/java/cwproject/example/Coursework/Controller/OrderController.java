package cwproject.example.Coursework.Controller;

import cwproject.example.Coursework.Data.Order;
import cwproject.example.Coursework.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/orders")
    public List<Order> getAllorders() {
        return orderService.getAllorders();
    }


    @PostMapping(path ="/orders" )
    public  Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);

    }

    @PutMapping(path = "/orders")
    public  Order updateStudent(@RequestBody Order order){

        return orderService.updateOrder(order);
    }


    @DeleteMapping(path = "/orders{id}")
    public void deleteOrder(@PathVariable int id){

        orderService.deleteOrder(id);
    }


    @GetMapping(path="/orders" ,params = "name")

    public List<Order>findorderByName(@RequestParam String name){
        return orderService.findorderByName(name);
    }
//
//    @GetMapping(path="/orders" ,params = "amount")
//
//    public List<Order>findorderByName(@RequestParam int amount){
//        return orderService.findorderByPrice(amount);
//    }
//
//    @GetMapping(path="/orders" ,params = {"name","amount"})
//
//    public List<Order>findorderByNameOrders(@RequestParam String name,@RequestParam int amount){
//        return orderService.findorderByNameandprice(name,amount);
//    }



}
