package main.java.com.java.springboot.test.springBootProject.CustomerRepo;

import main.java.com.java.springboot.test.springBootProject.DIO.CustomerSaveDIO;

public interface customerService {
    String addCustomer();

    String addCustomer(CustomerSaveDIO customerSaveDIO);
}
