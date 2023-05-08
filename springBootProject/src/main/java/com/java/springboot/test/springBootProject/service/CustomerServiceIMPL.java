package main.java.com.java.springboot.test.springBootProject.service;

import main.java.com.java.springboot.test.springBootProject.CustomerController.Autowired;
import main.java.com.java.springboot.test.springBootProject.CustomerRepo.CustomerRepo;
import main.java.com.java.springboot.test.springBootProject.CustomerRepo.customerService;
import main.java.com.java.springboot.test.springBootProject.DIO.CustomerSaveDIO;
import main.java.com.java.springboot.test.springBootProject.entity.Customer;
import sun.security.krb5.KrbException;
import sun.security.krb5.internal.ccache.MemoryCredentialsCache;

import java.io.IOException;

import static main.java.com.java.springboot.test.springBootProject.entity.Customer.getCustomername;

@Service
public abstract class CustomerServiceIMPL implements customerService {
    @Autowired
    private CustomerRepo CustomerRepo;


    @Override
    public String addCustomer(CustomerSaveDIO customerSaveDIO) {
        Customer customer = new Customer(
                customerSaveDIO.getCustomername(),
                customerSaveDIO.getCustomeraddress(),
                customerSaveDIO.getMobile()
        );
        MemoryCredentialsCache customerRepo = null;
        try {
            customerRepo.save();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (KrbException e) {
            throw new RuntimeException(e);
        }
        return customer.getCustomername();


        /**
         *
         */

    }
}

