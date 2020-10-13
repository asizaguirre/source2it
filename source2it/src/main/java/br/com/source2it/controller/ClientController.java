package br.com.source2it.controller;

import br.com.source2it.model.Client;
import br.com.source2it.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequiredArgsConstructor
public class ClientController {

    private final ClientRepository clientRepository;

    @GetMapping("/api/v1/clients")
    public Iterable<Client> getAllClients() {
        log.debug("->getAllClients");
        return clientRepository.findAll();
    }

    @PostMapping("/api/v1/clients")
    public Client saveClient(@RequestBody Client client) {
        log.debug("->saveClient {}", client);
        return clientRepository.save(client);
    }
}