package be.thomasmore.party.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Collection;

@Entity
public class MusicGenre {
    @Id
    private Long id;

    private String name;
    private String description;
    private int popularity; // Waarde tussen 1 en 10

    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Party> parties;

    public Collection<Party> getParties() {
        return parties;
    }

    public void setParties(Collection<Party> parties) {
        this.parties = parties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

}
