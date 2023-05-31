package homework3.prog;

public class product {
	private String orderNumber;
	private String id;
	private boolean member;
	private int dry;
	private int can;
	private int bag;
	private int sum;
	private boolean payment;
	static int index = 0;
	
	
	public product(String orderNumber, String id, boolean member, int dry, int can, int bag, boolean payment) {
		super();
			this.orderNumber = orderNumber;
			this.id = id;
			this.dry = dry;
			this.can = can;
			this.bag = bag;
			index++;
		if(member==true && payment==true) {
			sum=(int)((dry*1380+can*60+bag*45)*0.9);
		}else if (member==false && payment==true){
			sum=(int)(dry*1380+can*60+bag*45);
		}else if(member==true && payment==false) {
			sum=(int)((dry*1380+can*60+bag*45)*0.9*1.03);
		}else if(member==false && payment==false) {
			sum=(int)((dry*1380+can*60+bag*45)*1.03);
		}
		
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public boolean isMember() {
		return member;
	}


	public void setMember(boolean member) {
		this.member = member;
	}


	public int getDry() {
		return dry;
	}


	public void setDry(int dry) {
		this.dry = dry;
	}


	public int getCan() {
		return can;
	}


	public void setCan(int can) {
		this.can = can;
	}


	public int getBag() {
		return bag;
	}


	public void setBag(int bag) {
		this.bag = bag;
	}


	public boolean isPayment() {
		return payment;
	}


	public void setPayment(boolean payment) {
		this.payment = payment;
	}


	public String getOrderNumber() {
		return orderNumber;
	}


	public int getSum() {
		return sum;
	}
	
	
	
	
	

}
