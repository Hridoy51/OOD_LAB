public class Main {
    public static void main(String[] args) {
        Traffic obj = new Traffic();
        obj.func();//here if we use same function but in two different interfaces..
        obj.moto_f();//function from motorcycle interface..
        obj.bus_f();//function from bus interface..
    }
}
