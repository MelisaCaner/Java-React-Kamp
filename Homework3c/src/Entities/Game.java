package Entities;

public class Game {
	private int id;
	private String name;
	private double 	expense;
	private double afterDiscount;
	
	public Game() {
		
	}

	public Game(int id, String name, double expense, double afterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.expense = expense;
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

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}

	public double getAfterDiscount() {
		return afterDiscount;
	}

	public void setAfterDiscount(double afterDiscount) {
		this.afterDiscount = afterDiscount;
	}
	
	
}
