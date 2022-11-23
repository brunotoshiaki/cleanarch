package br.com.cleanarch.bruno.cleanarch.entrypoint.consumer;

import br.com.cleanarch.bruno.cleanarch.core.usecase.UpdateCustomerUseCase;
import br.com.cleanarch.bruno.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import br.com.cleanarch.bruno.cleanarch.entrypoint.consumer.message.CustomerMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReceiveValidatedCpfConsumer {

  private final UpdateCustomerUseCase updateCustomerUseCase;

  @KafkaListener(topics = "tp-cpf-validated", groupId = "avelar")

  public void receive(final CustomerMessage customerMessage) {
    final var customer = CustomerMessageMapper.INSTANCE.toCostumer(customerMessage);
    this.updateCustomerUseCase.update(customer,
        customerMessage.getZipCode());
  }
}
