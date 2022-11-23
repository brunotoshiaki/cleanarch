package br.com.cleanarch.bruno.cleanarch.entrypoint.controller;

import br.com.cleanarch.bruno.cleanarch.core.usecase.FindCustomerByIdUseCase;
import br.com.cleanarch.bruno.cleanarch.core.usecase.InsertCustomerUseCase;
import br.com.cleanarch.bruno.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import br.com.cleanarch.bruno.cleanarch.entrypoint.controller.request.CustomerRequest;
import br.com.cleanarch.bruno.cleanarch.entrypoint.controller.response.CustomerResponse;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

  private final InsertCustomerUseCase insertCustomerUseCase;

  private final FindCustomerByIdUseCase findCustomerByIdUseCase;

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

}
