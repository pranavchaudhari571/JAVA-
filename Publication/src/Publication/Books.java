package Publication;

import java.time.LocalDate;

public class Books extends Publication {

	
	private int pagecount;
	public Books(String title, double price, LocalDate publishDate, int ratings,int pagecount) {
		super(title, price, publishDate, ratings);
		this.pagecount=pagecount;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Books [pagecount=" + pagecount + ", Id=" + getId() + ", Title=" + getTitle() + ", Price="
				+ getPrice() + ", PublishDate=" + getPublishDate() + ", Ratings=" + getRatings()
				+  "]";
	}
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	

}
