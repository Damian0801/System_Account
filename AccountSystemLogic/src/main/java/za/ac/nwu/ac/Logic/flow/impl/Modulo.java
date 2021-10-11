package za.ac.nwu.ac.Logic.flow.impl;

public class Modulo {
    public Integer doMod(int dividend ,int divisor) throws Exception{
        if(divisor == 0){
            throw new RuntimeException("Some Reason");
        }
        return dividend % divisor ;
    }
}
