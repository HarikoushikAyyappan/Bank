package com.bank.controller;

import com.bank.model.Account;
import com.bank.model.Customer;
import com.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
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
    public ModelAndView customerPage(@RequestParam int customerId, @RequestParam int password ){
        List<Customer> customerResult = userService.find(customerId,password);
        if(customerResult.isEmpty()){
            return new ModelAndView("errorPage");
        }
        else{
            ModelAndView mav = new ModelAndView("customerPage");
            mav.addObject("customerResult", customerResult);
            return mav;}
    }
    @GetMapping(value = "/withdraw/{accountId}")
    public ModelAndView withdraw(@PathVariable int accountId)  {
        List<Account> accountDetails  = userService.getAccountDetails();
        ModelAndView mav = new ModelAndView("withdraw");
        mav.addObject("account",new Account());
        mav.addObject("accountDetails", accountDetails);
        return mav;
    }
    @RequestMapping("/getAmount")
    public ModelAndView buy(@RequestParam int amount, @RequestParam int accountId,@RequestParam("availableBalance") int availableBalance){
        //List<Account> accountDetails = userService.getAccountDetails();
        Customer customer = new Customer();
        customer.setAccntId(accountId);
        Account account = new Account();
        account.setAccountId(accountId);
        account.setWithdrawalAmount(amount);
        account.setAvailableBalance(availableBalance);
        account.setAvailableBalance(account.getAvailableBalance()-account.getWithdrawalAmount());
        //accountDetails.add(6,account.getAvailableBalance());
        //userService.updateAccount(accountId);
        ModelAndView mav = new ModelAndView("buy");
        mav.addObject("account",account);
        return mav;}
    @RequestMapping(value = "/store", method = RequestMethod.POST)
    public ModelAndView savePerson(@ModelAttribute("account") Account account) {
        userService.updateAccount(account);
        return new ModelAndView("success");
    }
    }

