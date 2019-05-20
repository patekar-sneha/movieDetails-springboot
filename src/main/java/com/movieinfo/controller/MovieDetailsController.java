package com.movieinfo.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfo.model.MovieDetails;

@RestController
public class MovieDetailsController {

	@GetMapping(path = "/{movieName}", produces = "application/json")
	public MovieDetails demo(@PathVariable("movieName") String movieName) throws IOException {
		// MovieDetails movieDetails = new MovieDetails(1, movieName, "Badla
		// (transl.?Revenge) is a 2019 Indian Hindi language mystery", 3,
		// "Amitabh Bachchan as Badal Gupta");
		String inMovieName = movieName;
		MovieDetails movieDetails = null;
		if (inMovieName.equalsIgnoreCase("Badla")) {
			movieDetails = new MovieDetails(1, movieName,
					"Badla (transl.?Revenge) is a 2019 Indian Hindi language mystery", 3,
					"Amitabh Bachchan as Badal Gupta");
		}
		else if (inMovieName.equalsIgnoreCase("Gully Boy")) {
			movieDetails = new MovieDetails(1, movieName,
					"rappers movie", 4,
					"Ranveer Singh, Alia Bhatt");
		}
		else if (inMovieName.equalsIgnoreCase("Avengers")) {
			movieDetails = new MovieDetails(1, movieName,
					"Comic Novel", 4,
					"Robert");
		}

		return movieDetails;

	}

}
