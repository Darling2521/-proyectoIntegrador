package edu.yavirac.backendpi.feature.campaign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampaignService {


    @Autowired
    CampaignRepository campaignRepository;

    //create
    public Campaign save(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public Campaign findById(long id) {
        return campaignRepository.findById(id).orElse(new Campaign());
    }

    public void deleteById(long id){ 
        campaignRepository.deleteById(id);
    }

    public List<Campaign> findAll() {
        return campaignRepository.findAll();
    }

}
