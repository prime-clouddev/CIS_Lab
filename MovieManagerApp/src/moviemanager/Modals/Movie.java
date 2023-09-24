package moviemanager.Modals;

public class Movie {
	private String title;
	private int year;
	private double rating;
	private int dailyrate;
	
	public Movie(String title, int year, double rating, int dailyrate) {
		super();
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.dailyrate = dailyrate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getDailyrate() {
		return dailyrate;
	}

	public void setDailyrate(int dailyrate) {
		this.dailyrate = dailyrate;
	}
}
