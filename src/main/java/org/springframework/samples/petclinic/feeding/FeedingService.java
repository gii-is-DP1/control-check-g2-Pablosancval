package org.springframework.samples.petclinic.feeding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class FeedingService {

    @Autowired
    private FeedingRepository feedingRepository;
    public List<Feeding> getAll(){
        return null;
    }

    public List<Feeding> getAllFeedingPlans(){
        return feedingRepository.findAllFeedingPlans();
    }

    public List<FeedingType> getAllFeedingTypes(){
        return feedingRepository.findAllFeedingTypes();
    }

    public FeedingType getFeedingType(String typeName) {
        return feedingRepository.findFeedingPlanByName();
    }

    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
        return null;       
    }

    
}
