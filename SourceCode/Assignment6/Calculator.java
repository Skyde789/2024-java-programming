package designpatterns;

public class Calculator {
    Double result;

    public Calculator(Double x){
        this.result = x;
    }

    Double getResult(){return this.result; }

    public Calculator add(Double value){
        this.result += value;
        return this;
    }

    public Calculator subtract(Double value){
        this.result -= value;
        return this;
    }

    public Calculator multiply(Double value){
        this.result *= value;
        return this;
    }

    public Calculator divide(Double value){
        this.result /= value;
        return this;
    }
}