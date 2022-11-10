package com.bank.controller;

import com.bank.model.Account;
import com.bank.model.Customer;
import com.bank.model.Loan;
import com.bank.model.Officer;
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
    @RequestMapping(value = "/customers")
        public ModelAndView home() {
            List<Customer > customerList  = userService.getAllCustomer();
            Customer customer = new Customer();
            ModelAndView mav = new ModelAndView("customerList");
            mav.addObject("customer",customer);
            mav.addObject("customerList", customerList);
            return mav;
        }
    @RequestMapping("/customerLogin")
    public ModelAndView newCustomerFor() {
        ModelAndView modelAndView = new ModelAndView("customerLoginPage");
        Customer customer = new Customer();
        customer.setAccount(new Account());
        modelAndView.addObject("customer",customer);
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
    @RequestMapping(value = "/withdraw/{accountId}")
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
      //  customer.setAccntId(accountId);
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
    @RequestMapping("/officerLogin")
    public ModelAndView newAdminForm() {
        ModelAndView modelAndView = new ModelAndView("officerLoginPage");
        modelAndView.addObject("officer",new Officer());
        return modelAndView;
    }
    @RequestMapping("/officerPage")
    public ModelAndView adminPage(@RequestParam int officerId,@RequestParam String password ){
        List<Officer> result = userService.search(officerId,password);
        if(result.isEmpty()){
            return new ModelAndView("errorPage");
        }
        else {
            ModelAndView mav = new ModelAndView("officerPage");
            mav.addObject("result", result);
            return mav;
        }
    }
    @RequestMapping("/approveLoan")
    public ModelAndView update() {
        List<Loan> loanList  = userService.getAllLoans();
        Loan loan  = new Loan();
        ModelAndView mav = new ModelAndView("applyLoan");
        mav.addObject("loan",loan);
        mav.addObject("loanList", loanList);
        return mav;
    }
    @RequestMapping(value = "/approve/{accountId}")
    public ModelAndView approve(@PathVariable int accountId)  {
        List<Account> accountDetails  = userService.getAccountDetails();
        ModelAndView mav = new ModelAndView("approval");
        mav.addObject("account",new Account());
        mav.addObject("accountDetails", accountDetails);
        return mav;
    }
    @RequestMapping("/credit")
    public ModelAndView credit(@RequestParam int amount, @RequestParam int accountId,@RequestParam("availableBalance") int availableBalance,@RequestParam("loanId") int loanId){
        //List<Account> accountDetails = userService.getAccountDetails();
        Customer customer = new Customer();
      //  customer.setAccntId(accountId);
        Account account = new Account();
        account.setAccountId(accountId);
        account.setMaturityAmount(amount);
        account.setAvailableBalance(availableBalance);
        account.setAvailableBalance(account.getAvailableBalance()+account.getMaturityAmount());
        //accountDetails.add(6,account.getAvailableBalance());
        //userService.updateAccount(accountId);
        ModelAndView mav = new ModelAndView("creditUpdate");
        mav.addObject("account",account);
         userService.delete(loanId);
            System.out.println("success");

        return mav;}
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("account") Account account) {
        userService.updateAccount(account);
        return new ModelAndView("success");
    }
    @RequestMapping(value ="applyloan/{customerId}")
    public ModelAndView newLoan(@PathVariable int customerId){
        ModelAndView modelAndView = new ModelAndView("newLoan");
        modelAndView.addObject("loan",new Loan());
        return modelAndView;
    }
    @RequestMapping(value = "/loanApplication", method = RequestMethod.POST)
    public ModelAndView saveLoan(@ModelAttribute("loan") Loan loan) {
        userService.updateLoan(loan);
        return new ModelAndView("success");
    }
    @RequestMapping(value = "/deposit/{customerId}")
    public ModelAndView deposit(@PathVariable int customerId){
        Customer customer = userService.getCustomerById(customerId);
        ModelAndView mav = new ModelAndView("deposit");
        mav.addObject("customer",customer);
        return mav;
    }
    @RequestMapping(value = "/retain")
    public ModelAndView saveCustomer(@RequestParam("accountId") int accountId,@RequestParam("deposit") int deposit) {
        Account account= userService.getAccountById(accountId);
        account.setAccountDeposit(deposit);
        account.setAvailableBalance(account.getAvailableBalance()+account.getAccountDeposit());
        userService.updateAccount(account);
       return new ModelAndView("done");
    }
    @RequestMapping(value = "/downloadExcel", method = RequestMethod.GET)
    public ModelAndView downloadExcel() {
        List<Customer > customerList  = userService.getAllCustomer();
        return new ModelAndView("excelView", "listCustomer", customerList);
    }
    }

