package com.bank.controller;

import com.bank.model.AccountPractice;
import com.bank.model.CustomerPractice;
import com.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
@RestController
public class PracticeController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/get")
    public ModelAndView newCustomerForm(@RequestParam int accountId) {
        ModelAndView modelAndView = new ModelAndView("getById");
       AccountPractice accountPractice  = userService.getAll(accountId);
        modelAndView.addObject("accountPractice",accountPractice);
        modelAndView.addObject("account",new AccountPractice());
        return modelAndView;
    }
}
