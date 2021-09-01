public class SingletonVIPCustomer extends Customer{
    private static SingletonVIPCustomer onlyVIP;

    private SingletonVIPCustomer (){
        System.out.println("VIP customer was created with singleton method");
    }

    public static SingletonVIPCustomer getInstance(){
        if(onlyVIP == null){
            onlyVIP = new SingletonVIPCustomer();
        }
        return onlyVIP;
    }

}
