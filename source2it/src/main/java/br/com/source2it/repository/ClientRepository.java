package br.com.source2it.repository;

import br.com.source2it.model.Client;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends DatastoreRepository<Client, Long> {
}
