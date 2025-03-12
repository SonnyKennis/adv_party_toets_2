package be.thomasmore.party.repositories;

import be.thomasmore.party.model.MusicGenre;
import org.springframework.data.repository.CrudRepository;

public interface MusicGenreRepository extends CrudRepository<MusicGenre, Integer> {
}
