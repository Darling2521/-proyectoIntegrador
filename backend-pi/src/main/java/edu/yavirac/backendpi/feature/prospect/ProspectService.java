package edu.yavirac.backendpi.feature.prospect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProspectService {

    @Autowired
    ProspectRepository prospectRepository;

    //create
    public Prospect save (Prospect prospect){
        return prospectRepository.save(prospect);
    }

    //read
    public Prospect findById (long id){
        return prospectRepository.findById(id).orElse(new Prospect());
    }
    
    //update=create

    public void deleteById (long id){
        prospectRepository.deleteById(id);
    }

    public List<Prospect> findAll(){
        return prospectRepository.findAll();
    }
}
