package lab5.lab5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lab5.lab5.model.Customer;
import lab5.lab5.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getById(long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Customer update(long id, Customer customer) {
        if (customerRepository.existsById(id)) {
            customer.setId(id);
            return customerRepository.save(customer);
        }
        return null;
    }

    public void delete(long id) {
        customerRepository.deleteById(id);
    }
}
