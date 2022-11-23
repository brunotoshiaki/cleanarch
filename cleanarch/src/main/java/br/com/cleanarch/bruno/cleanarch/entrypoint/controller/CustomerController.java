package br.com.cleanarch.bruno.cleanarch.entrypoint.controller;

import br.com.cleanarch.bruno.cleanarch.core.usecase.InsertCustomerUseCase;
import br.com.cleanarch.bruno.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import br.com.cleanarch.bruno.cleanarch.entrypoint.controller.request.CustomerRequest;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

  private final InsertCustomerUseCase insertCustomerUseCase;

  @PostMapping
  public ResponseEntity<Void> insert(@Valid @RequestBody final CustomerRequest customerRequest) {
    this.insertCustomerUseCase.insert(CustomerMapper.INSTANCE.toCustomer(customerRequest),
        customerRequest.getZipCode());
    return ResponseEntity.ok().build();
  }

}
