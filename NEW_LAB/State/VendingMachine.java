

public class VendingMachine {
    private IdleState idleState;
    private HasOneDollarState hasOneDollarState;
    private OutOfStockState outOfStockState;
    
    public State currentState;
    int count;

    public VendingMachine(int count){
        this.count = count;
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();

        if(count>0){
            currentState = idleState;
        }
        else currentState = outOfStockState;
    }

    void insertDollar(){
        currentState.insertDollar(this);
    }
    void ejectMoney(){
        currentState.ejectMoney(this);
    }
    void dispense(){
        currentState.dispense(this);
    }
    void doReturnMoney(){
        System.out.println("Returning the money");
    }
    void doReleaseProduct(){
        count = count-1;
        System.out.println("The product is released");
    }
    State getState(){
        return this.currentState;
    }
    void setState(State state){
        currentState = state;
    }
    int getCount(){
        return count;
    }
    State getIdleState(){
        return idleState;
    }
    State getHasOneDollarState(){
        return hasOneDollarState;
    }
    State getOutOfStockState(){
        return outOfStockState;
    }
}
