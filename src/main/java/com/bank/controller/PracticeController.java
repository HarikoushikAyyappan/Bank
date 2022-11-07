package com.bank.controller;

import com.bank.model.AccountPractice;
import com.bank.model.CustomerPractice;
import com.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class PracticeController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/get")
    public ModelAndView newCustomerForm() {
        ModelAndView modelAndView = new ModelAndView("get");
        List<AccountPractice> accountPractice  = userService.getAll();
        modelAndView.addObject("accountPractice",accountPractice);
        modelAndView.addObject("account",new AccountPractice());
        return modelAndView;
    }
}
