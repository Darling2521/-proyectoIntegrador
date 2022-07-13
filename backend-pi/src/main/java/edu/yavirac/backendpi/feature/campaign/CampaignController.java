package edu.yavirac.backendpi.feature.campaign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin({})
@RequestMapping("/api/campaign")



public class CampaignController {
    
    @Autowired
    CampaignService campaignService;
    //create
    @PostMapping("/save")
    public Campaign save(@RequestBody Campaign campaign){
        return campaignService.save(campaign);
    }
    //read
    @GetMapping("/{id}")
    public Campaign findById(@PathVariable long id){
    return campaignService.findById(id);
}
    //update
    @PutMapping("/update")
    public Campaign update (@RequestBody Campaign campaign){
    return campaignService.save(campaign);
}
//Delete
@DeleteMapping("/delete/{id}")
public void  deleteById (@PathVariable long id){
    campaignService.deleteById(id);
}

//para mostrar todos los registros 
@GetMapping("/all")
  public List<Campaign> findAll(){
      return campaignService.findAll();
}
    
}

