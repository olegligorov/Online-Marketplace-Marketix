package com.marketix.init;

import com.marketix.dao.ProductRepository;
import com.marketix.dao.UserRepository;
import com.marketix.entity.Product;
import com.marketix.entity.User;
import com.marketix.util.Gender;
import com.marketix.util.Role;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
//
//@Component
//@Slf4j
//public class DataInitializer implements CommandLineRunner {
//    private final List<User> USERS = List.of(
//            new User("Ole", "olegligorov@gmail.com", "password1.", Gender.MALE, Role.ADMIN,
//                    null, "ADMIN"),
//            new User("User", "randomuser@gmail.com", "password1.", Gender.MALE, Role.USER,
//                    null, "random user testing account"),
//            new User("TestUser", "randomuser@gmail.com", "password1.", Gender.MALE, Role.USER,
//                    null, "random user testing account")
//    );
//    private final List<Product> PRODUCTS =  List.of(
//            new Product("iPhone11", "phone", USERS.get(0).getEmail(), 500, 5.00),
//            new Product("iPhone12", "phone", USERS.get(0).getEmail(), 600, 4.95),
//                        new Product("iPhone13", "phone", USERS.get(0).getEmail(), 600, 4.95),
//            new Product("iPhone14", "phone", USERS.get(1).getEmail(), 600, 4.95),
//            new Product("iPhone13+", "phone", USERS.get(1).getEmail(), 600, 4.95)
//
//            );
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        if (userRepository.count() == 0) {
//            userRepository.saveAll(USERS);
//        }
//        if (productRepository.count() == 0) {
//            productRepository.saveAll(PRODUCTS);
//        }
//    }
//
//}
