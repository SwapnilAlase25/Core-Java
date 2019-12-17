/*
 * Creating a class 'Movie'
 * with attributes as 'movieID', 'movieName', 'movieRating'
 * printMovie() method will display all the details of the movie
 * 
 */

package PRN_0018;

public class Movie {

	private int movieID;
	private String movieName;
	private int movieRating;

	// Default (No-Args) Constructor
	public Movie() {
		movieID = 0;
		movieName = "NULL";
		movieRating = 0;
	}

	// Getters and Setters Methods
	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}

	// Method to print the Movie details
	public void printMovie() {
		System.out.println("Movie ID : " + movieID);
		System.out.println("Name : " + movieName);
		System.out.println("Rating (Out of 10) : " + movieRating);
	}

}
