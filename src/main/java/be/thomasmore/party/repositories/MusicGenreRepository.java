package be.thomasmore.party.repositories;

import be.thomasmore.party.model.MusicGenre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MusicGenreRepository extends CrudRepository<MusicGenre, Integer> {

    @Query("SELECT DISTINCT m FROM MusicGenre m WHERE " +
            "(:searchName IS NULL OR LOWER(m.name) LIKE LOWER(CONCAT('%', :searchName, '%'))) AND " +
            "(:searchName IS NULL OR LOWER(m.description) LIKE LOWER(CONCAT('%', :searchName, '%')))")
    List<MusicGenre> findByFilter(@Param("searchName") String searchName);


}
