package com.java.springboot.test.springBootProject.CustomerController;
import main.java.com.java.springboot.test.springBootProject.CustomerController.*;
import main.java.com.java.springboot.test.springBootProject.DIO.CustomerSaveDIO;
import main.java.com.java.springboot.test.springBootProject.service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping(path="/customer")

public final class CustomerController {
@Autowired
private CustomerService customerService;
 @PostMapping(path = "/save")
    public  String saveCustomer(@RequestBody CustomerSaveDIO customerSaveDIO )
 {
   String id=customerService.addCustomer(customerSaveDIO);
     return id;

 }


}
