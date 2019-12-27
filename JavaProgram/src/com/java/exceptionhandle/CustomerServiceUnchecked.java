package com.java.exceptionhandle;

import com.java.exceptioncustomer.Customer;
import com.java.exceptions.NameNotFoundException;

public class CustomerServiceUnchecked {
	
	public Customer findByName(String name) throws NameNotFoundException {
    	if ("".equals(name)) {
            throw new NameNotFoundException("Name is empty!");
        }

        return new Customer(name);

    }

    public static void main(String[] args) {
    	CustomerServiceUnchecked obj = new CustomerServiceUnchecked();
        try {

            Customer cus = obj.findByName("");

        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }

    }//main void 
}//end of the CustomerServiceUncheked