package edu.yavirac.backendpi.feature.prospect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/prospect")
public class ProspectController {

@Autowired
ProspectService prospectService;
    //create
    @PostMapping("/save")
    public Prospect save(@RequestBody Prospect prospect){
        return prospectService.save(prospect);
    }

    //read
    @GetMapping("/{id}")
    public Prospect findById(@PathVariable long id) {
        return prospectService.findById(id);
    }

    //update
    @PutMapping("/update")
    public Prospect update (@RequestBody Prospect prospect){
        return prospectService.save(prospect);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public void deleteById (@PathVariable long id){
        prospectService.deleteById(id);
    }

    
    @GetMapping("/all")
     public List<Prospect> findAll(){
        return prospectService.findAll();
     }
    

}
