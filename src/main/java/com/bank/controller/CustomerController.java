package com.bank.controller;

import com.bank.model.Customer;
import com.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    UserService userService;
    @GetMapping(value = "/customers")
        public ModelAndView home() {
            List<Customer > customerList  = userService.getAllCustomer();
            Customer customer = new Customer();
            ModelAndView mav = new ModelAndView("customerList");
            mav.addObject("customer",customer);
            mav.addObject("customerList", customerList);
            return mav;
        }
    @RequestMapping("/customerLogin")
    public ModelAndView newCustomerForm() {
        ModelAndView modelAndView = new ModelAndView("customerLoginPage");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
    @RequestMapping("/customerPage")
    public ModelAndView customerPage(@RequestParam int customerId, @RequestParam String password ){
        List<Customer> customerResult = userService.find(customerId,password);
        if(customerResult.isEmpty()){
            return new ModelAndView("errorPage");
        }
        else{
            ModelAndView mav = new ModelAndView("customerPage");
            mav.addObject("customerResult", customerResult);
            return mav;}
    }

    }

