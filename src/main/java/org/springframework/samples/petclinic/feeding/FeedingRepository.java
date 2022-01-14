package org.springframework.samples.petclinic.feeding;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface FeedingRepository extends CrudRepository<Feeding, Integer>{
    List<Feeding> findAll();
    
    @Query("SELECT ftype FROM FeedingType ftype")
    List<FeedingType> findAllFeedingTypes();

    @Query("SELECT fplan FROM FeedingType fplan WHERE fplan.name LIKE :name%")
    FeedingType findFeedingPlanByName(@Param("name") String name) throws DataAccessException;

    Optional<Feeding> findById(int id);
    Feeding save(Feeding p);

    @Query("SELECT fplan FROM Feeding fplan")
    List<Feeding> findAllFeedingPlans();
}
