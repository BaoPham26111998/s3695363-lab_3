import java.util.ArrayList;

public class CustomerList {
	private ArrayList<Customer> theList;
	
	public CustomerList() {
		this.theList = new ArrayList<Customer>();
	}
	
	public ArrayList<Customer> getList() {
		return this.theList;
	}

	int tmpCustomer = 0;

	public boolean hasNext(){
		if(tmpCustomer >= theList.size()){
			tmpCustomer=0;
			return false;
		}
		return true;
	}

	public Object next(){

		return theList.get(tmpCustomer++);
	}
	
	public Customer getCustomer(String id) {
		for (int i = 0; i < this.theList.size(); i++) {
			Customer temp = this.theList.get(i);
			if (temp.getID().equals(id))
				return temp;
		}
		System.out.println("Customer " + id + " not found");
		return null;
	}
	
	public boolean addCustomer(Customer cust) {
		for (int i = 0; i < this.theList.size(); i++) {
			Customer temp = this.theList.get(i);
			if (temp.getID().equals(cust.getID()))
				return false;
		}
		this.theList.add(cust);
		return true;
	}
}
