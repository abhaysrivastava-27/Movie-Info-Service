package com.Demo.MovieInfoService.Resource;

import com.Demo.MovieInfoService.Model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfo {
    @RequestMapping("/{movieid}")
    public Movie getMovieInfo(@PathVariable("movieid") int MovieId){
        return new Movie(MovieId, "Transformer");
    }
}
