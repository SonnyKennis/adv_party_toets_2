package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Venue;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VenueRepository extends CrudRepository<Venue, Integer> {
    @Query("SELECT v FROM Venue v WHERE :minCapacity IS NULL OR :minCapacity <= v.capacity")
    List<Venue> findByFilter(@Param("minCapacity") Integer minCapacity);
}
