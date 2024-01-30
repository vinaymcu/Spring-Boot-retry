package com.howtodoinjava.app.service;

import com.howtodoinjava.app.model.order.Order;
import com.howtodoinjava.app.model.user.User;
import com.howtodoinjava.app.repositories.order.OrderRepository;
import com.howtodoinjava.app.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserRepository userRepository;

    public void getUser(){
        User user = new User();
        user.setEmail("johndoe@gmail.com");
        user.setFirstName("John");
        user.setLastName("DOe");
        System.out.println(" save data in user database>>>>>>>");
        User savedUser = userRepository.save(user);
        Optional<User> userData = userRepository.findById(savedUser.getId());
        System.out.println("ID :"+ userData.get().getId());
        System.out.println("getFirstName:: "+userData.get().getFirstName());

    }

    public void saveOrderDataInDB() {

        Order order = new Order();
        order.setProductName("Mobile");
        order.setOrderAmount(200);
        order.setUserId(1);

        Order savedOrder = orderRepository.save(order);
        System.out.println(" save data in order database>>>>>>>"+savedOrder.getId());
        Optional<Order> orderData = orderRepository.findById(savedOrder.getId());
        System.out.println("ProductName: "+orderData.get().getProductName());


    }
}


