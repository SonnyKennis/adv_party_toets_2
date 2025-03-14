package be.thomasmore.party.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

@Entity
public class Party {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private Integer pricePresaleInEur;
    private Integer priceInEur;
    private String extraInfo;
    private LocalDate date;
    private LocalTime doors;

    @ManyToOne(fetch = FetchType.LAZY)
    private Venue venue;
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Artist> artists;
    @ManyToMany(mappedBy = "parties", fetch = FetchType.LAZY)
    private Collection<Animal> animals;
    @ManyToMany(mappedBy = "parties", fetch = FetchType.LAZY)
    private Collection<MusicGenre> musicGenres;

    public Collection<MusicGenre> getMusicGenres() {
        return musicGenres;
    }

    public void setMusicGenres(Collection<MusicGenre> musicGenres) {
        this.musicGenres = musicGenres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPricePresaleInEur() {
        return pricePresaleInEur;
    }

    public void setPricePresaleInEur(Integer pricePresaleInEur) {
        this.pricePresaleInEur = pricePresaleInEur;
    }

    public Integer getPriceInEur() {
        return priceInEur;
    }

    public void setPriceInEur(Integer priceInEur) {
        this.priceInEur = priceInEur;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDoors() {
        return doors;
    }

    public void setDoors(LocalTime doors) {
        this.doors = doors;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Collection<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Collection<Artist> artists) {
        this.artists = artists;
    }

    public Collection<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Collection<Animal> animals) {
        this.animals = animals;
    }
}

