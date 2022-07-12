package edu.yavirac.backendpi.feature.prospect;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProspectRepository extends CrudRepository<Prospect, Long> {
    List<Prospect> findAll();

}
