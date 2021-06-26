package Entities;

public class Campaign {
	private int id;
	private String name;
	private double afterDiscount;
	
	public Campaign() {
	
	}

	public Campaign(int id, String name, double afterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.afterDiscount = afterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAfterDiscount() {
		return afterDiscount;
	}

	public void setAfterDiscount(double afterDiscount) {
		this.afterDiscount = afterDiscount;
	}
}
