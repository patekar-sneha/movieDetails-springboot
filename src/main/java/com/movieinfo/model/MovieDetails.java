package com.movieinfo.model;

public class MovieDetails {

	private int id;
	private String movieName;
	private String movieSummary;
	private float rating;
	private String castAndCrew;
	
	
	public MovieDetails(int id, String movieName, String movieSummary, float rating, String castAndCrew) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieSummary = movieSummary;
		this.rating = rating;
		this.castAndCrew = castAndCrew;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieSummary() {
		return movieSummary;
	}
	public void setMovieSummary(String movieSummary) {
		this.movieSummary = movieSummary;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getCastAndCrew() {
		return castAndCrew;
	}
	public void setCastAndCrew(String castAndCrew) {
		this.castAndCrew = castAndCrew;
	}
	
	
}
