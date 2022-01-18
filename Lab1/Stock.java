public class Stock{
	
	String symbol;
	String name;
	double previousClosingPrice = 79.45;
	double currentPrice = 79.65;
	
	/* As the lab only stated to create a constructor for symbol and name, I wrote a complete contstuctor as well as
	giving the previousClosingPrice and currentPrice variables the default value of the numbers stated in the lab, as I wasn't sure as to what
	the assignment was looking for. */
	
	public Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
	
	public Stock(String symbol, String name, double pCR, double cP){
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = pCR;
		this.currentPrice = cP;
	}
	
	public double getChangePercent(){
			return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
	
	public String toString(){
		return "Stock: " + this.name + "\nPercentage change from Previous Closing Price: " + this.getChangePercent() + "%";
}
}