package DependencyInjectionExample;

// CustomerService.java
public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomer(String id) {
        return customerRepository.findCustomerById(id);
    }
}
