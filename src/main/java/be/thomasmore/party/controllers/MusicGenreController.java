package be.thomasmore.party.controllers;

import be.thomasmore.party.model.MusicGenre;
import be.thomasmore.party.repositories.MusicGenreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MusicGenreController {
    private final Logger logger = LoggerFactory.getLogger(MusicGenreController.class);

    @Autowired
    private MusicGenreRepository musicGenreRepository;

    @GetMapping("/musicgenrelist")
    public String musicGenreList(@RequestParam(required = false) String searchName,Model model)
    {
        logger.info(String.format("musicGenreList"));
        Iterable<MusicGenre> musicGenres = musicGenreRepository.findByFilter(searchName);
        model.addAttribute("musicGenres", musicGenres);
        return "musicgenrelist";
    }

}

