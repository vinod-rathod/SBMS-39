package in.fis.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.fis.binding.Customer;


//Returning one Customer Data
@RestController
public class CustomerRestController {
	@GetMapping(value ="/customer", produces="application/json")
	public ResponseEntity<Customer> getCustomer(){
		Customer c=new Customer(1,"Alex","alex123@gmail.com");
		return new ResponseEntity<>(c,HttpStatus.OK);

	}
	
	//Returning multiple Customer Data
	@GetMapping(value="/customers", produces="application/json")
	public ResponseEntity<List<Customer>> getCustomers(){
		Customer c=new Customer(1,"Alex","alex123@gmail.com");
		Customer c2=new Customer(2,"Sajm","sajm@gmail.com");
		Customer c3=new Customer(3,"Tom","tom@gmail.com");
		Customer c4=new Customer(4,"Mom","mom@gmail.com");
		Customer c5=new Customer(5,"Dad","dad@gmail.com");
		List <Customer> list =Arrays.asList(c,c2,c3,c4,c5);
		return new ResponseEntity<>(list,HttpStatus.OK);
		
	}

}
