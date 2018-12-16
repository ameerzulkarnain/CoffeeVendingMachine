package coffeecompifce;



public interface CoffeeVendingMachineIfce {
	public void setCoffee(String coffee);
	public void setSize(String size);
	public void addTopping(String topping);
	public String getCoffee();
	public void placeOrder() throws InterruptedException;
}
