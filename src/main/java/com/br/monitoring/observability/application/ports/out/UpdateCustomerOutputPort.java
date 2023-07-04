package com.br.monitoring.observability.application.ports.out;

import com.br.monitoring.observability.application.core.model.Customer;

import java.util.Optional;

public interface UpdateCustomerOutputPort {
    Optional<Customer> update(Customer customer);
}
