public class CustomerFactory {
    public Customer createCustomer(String type){
        if (type.equalsIgnoreCase("normal")){
            System.out.println("Guest Customer Created");
            return new GuestCustomer();
        }
        if (type.equalsIgnoreCase("vip")){
            System.out.println("VIP Customer Created");
            return new VIPCustomer();
        }

        else if (type.equalsIgnoreCase("singleton")){
            SingletonVIPCustomer singletonVipCustomer = null;
            System.out.println("Singleton VIP Customer Created");
            return singletonVipCustomer.getInstance();
        }
        else return null;
    }
}
