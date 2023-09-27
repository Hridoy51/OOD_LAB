
interface motorcycle{
    //all function here are dummy ...
    //common function of vehicle....
    public void func();
    //specialized function
    public void moto_f();
    //.....//
    
}
interface bus{
    //all function here are dummy ...
    //common function of vehicle....
    public void func();
    //specialized function
    public void bus_f();
    //.....//
    
}

public class Traffic implements motorcycle, bus{
    @Override
    //implements all the function in motorcycle and bus interface...
    public void func(){
        System.out.println("it is func() and it Perform a common task for all vehicle");
    }
    @Override
    public void moto_f(){
        System.out.println("it is moto_f() and do Special task of motorcycle");
    }
    @Override
    public void bus_f(){
        System.out.println("it is bus_f() and do Special task of a BUS");
    }
}
