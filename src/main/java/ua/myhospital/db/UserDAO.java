package ua.myhospital.db;

import ua.myhospital.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Pavel Ravvich.
 * Created : 29/10/2017.
 * <p>
 * UserDAO
 */
public class UserDAO {

    private final List<Customer> store = new ArrayList<>();

    public Customer getById(int id) {

        Customer result = new Customer();
        result.setId(-1);

        for (Customer customer : store) {
            if (customer.getId() == id) {
                result = customer;
            }
        }

        return result;
    }

    public Customer getUserByLoginPassword(final String login, final String password) {

        Customer result = new Customer();
        result.setId(-1);

        for (Customer customer : store) {
            if (customer.getEmail().equals(login) && customer.getPassword().equals(password)) {
                result = customer;
            }
        }

        return result;
    }

    public boolean add(final Customer customer) {

        for (Customer u : store) {
            if (u.getEmail().equals(customer.getEmail()) && u.getPassword().equals(customer.getPassword())) {
                return false;
            }
        }

        return store.add(customer);
    }

    public Customer.Role getRoleByLoginPassword(final String login, final String password) {
        Customer.Role result = Customer.Role.UNKNOWN;

        for (Customer customer : store) {
            if (customer.getEmail().equals(login) && customer.getPassword().equals(password)) {
                result = customer.getRole();
            }
        }

        return result;
    }

    public boolean userIsExist(final String login, final String password) {

        boolean result = false;

        for (Customer customer : store) {
            if (customer.getEmail().equals(login) && customer.getPassword().equals(password)) {
                result = true;
                break;
            }
        }

        return result;
    }
}