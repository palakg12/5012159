package DependencyInjectionExample;

// DependencyInjectionDemo.java
public class DependencyInjectionDemo {
    public static void main(String[] args) {
        // Create a repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Fetch a customer and display details
        Customer customer = customerService.getCustomer("12345");
        System.out.println(customer);
    }
}

