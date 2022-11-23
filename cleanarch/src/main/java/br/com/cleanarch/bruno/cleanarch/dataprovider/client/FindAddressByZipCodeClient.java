package br.com.cleanarch.bruno.cleanarch.dataprovider.client;

import br.com.cleanarch.bruno.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FindAddressByZipCodeClient", url = "${viacep.client.address.url}")
public interface FindAddressByZipCodeClient {

  @GetMapping("/{zipcode}")
  AddressResponse find(@PathVariable("zipcode") final String zipCode);

}
