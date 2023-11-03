package Publication;

import java.time.LocalDate;

public class Tape extends Publication{
	private int time;
	public Tape(String title, double price, LocalDate publishDate, int ratings, int time) {
		super(title, price, publishDate, ratings);
		this.time=time;
		// TODO Auto-generated constructor stub
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Tape [time=" + time+",Id=" + getId() + ", Title=" + getTitle() + ", Price="
				+ getPrice() + ", PublishDate=" + getPublishDate() + ", Ratings=" + getRatings()
				+  "]";
	}

	

}
