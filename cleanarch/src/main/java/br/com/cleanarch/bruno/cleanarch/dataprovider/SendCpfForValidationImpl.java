package br.com.cleanarch.bruno.cleanarch.dataprovider;

import br.com.cleanarch.bruno.cleanarch.core.dataprovider.SendCpfForValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendCpfForValidationImpl implements SendCpfForValidation {

  private final KafkaTemplate<String, String> kafkaTemplate;

  @Override
  public void send(final String cpf) {
    this.kafkaTemplate.send("tp-cpf-validation", cpf);
  }
}
