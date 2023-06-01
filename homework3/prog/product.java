package homework3.prog;

public class product {
	private String id;
	private boolean member;
	private int dry;
	private int can;
	private int sum;
	private boolean payment;
	
	
	
	public product(String id, boolean member, int dry, int can, boolean payment) {
		super();
			this.id = id;
			this.dry = dry;
			this.can = can;
			this.member=member;
			this.payment=payment;
						
		if(member==true && payment==true) {
			sum=(int)((dry*1000+can*50)*0.9);
		}else if (member==false && payment==true){
			sum=(int)(dry*1000+can*50);
		}else if(member==true && payment==false) {
			sum=(int)((dry*1000+can*50)*0.9*1.03);
		}else if(member==false && payment==false) {
			sum=(int)((dry*1000+can*50)*1.03);
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

	public String showMember() {
		if (member==true) {
			return "會員價9折";
		}else{
			return "原價";
		}
	}

	public int getDry() {
		return dry;
	}


	public void setDry(int dry) {
		this.dry = dry;
	}

	public int DS() {
		return this.dry*1000;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public int CS() {
		return this.can*50;
	}
	
	public boolean isPayment() {
		return payment;
	}


	public void setPayment(boolean payment) {
		this.payment = payment;
	}

	public String showPayment() {
		if (member==true) {
			return "現金價";
		}else{
			return "外加刷卡手續費3%";
		}
	}
	
	public int getSum() {
		return sum;
	}
	
	public String output(){
		return 
				"收到您的訂單!\t\t\t^ↀᴥↀ^"+
				"\n============================================"+
				"\n品項\t單價\t數量\t小計"+
				"\n--------------------------------------------------------------------------------"+
				"\n乾飼料\t$1380\t"+getDry()+"\t"+DS()+
				"\n點心罐\t$60\t"+getCan()+"\t"+CS()+
				"\n--------------------------------------------------------------------------------"+
				"\n\t\t應付金額\t"+getSum();		
	}
	
	
	

}
