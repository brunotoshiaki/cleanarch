package br.com.cleanarch.bruno.cleanarch.entrypoint.controller;

import br.com.cleanarch.bruno.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import br.com.cleanarch.bruno.cleanarch.core.usecase.FindCustomerByIdUseCase;
import br.com.cleanarch.bruno.cleanarch.core.usecase.InsertCustomerUseCase;
import br.com.cleanarch.bruno.cleanarch.core.usecase.UpdateCustomerUseCase;
import br.com.cleanarch.bruno.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import br.com.cleanarch.bruno.cleanarch.entrypoint.controller.request.CustomerRequest;
import br.com.cleanarch.bruno.cleanarch.entrypoint.controller.response.CustomerResponse;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

  private final InsertCustomerUseCase insertCustomerUseCase;

  private final FindCustomerByIdUseCase findCustomerByIdUseCase;

  private final UpdateCustomerUseCase updateCustomerUseCase;

  private final DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

  @PostMapping
  public ResponseEntity<Void> insert(@Valid @RequestBody final CustomerRequest customerRequest) {
    this.insertCustomerUseCase.insert(CustomerMapper.INSTANCE.toCustomer(customerRequest),
        customerRequest.getZipCode());
    return ResponseEntity.ok().build();
  }

  @GetMapping("/{id}")
  public ResponseEntity<CustomerResponse> findyId(@PathVariable final String id) {
    final var customer = this.findCustomerByIdUseCase.find(id);

    return ResponseEntity.ok().body(CustomerMapper.INSTANCE.toCustomerResponse(customer));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Void> update(@Valid @RequestBody final CustomerRequest customerRequest,
      @PathVariable final String id) {
    final var customer = CustomerMapper.INSTANCE.toCustomer(customerRequest);
    customer.setId(id);
    this.updateCustomerUseCase.update(customer, customerRequest.getZipCode());
    return ResponseEntity.noContent().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable final String id) {
    this.deleteCustomerByIdUseCase.delete(id);
    return ResponseEntity.noContent().build();
  }

}
