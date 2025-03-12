package be.thomasmore.party.controllers;

import be.thomasmore.party.model.MusicGenre;
import be.thomasmore.party.repositories.MusicGenreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicGenreController {
    private final Logger logger = LoggerFactory.getLogger(MusicGenreController.class);

    @Autowired
    private MusicGenreRepository musicGenreRepository;

    @GetMapping("/musicgenrelist")
    public String musicGenreList(Model model) {
        logger.info(String.format("musicGenreList"));
        Iterable<MusicGenre> musicGenres = musicGenreRepository.findAll();
        model.addAttribute("musicGenres", musicGenres);
        return "musicgenrelist";
    }

}

