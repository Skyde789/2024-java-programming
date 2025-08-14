package designpatterns;

public class Circle implements Shape {
    Double radius;
    Double[] params;

    public Circle(Double[] _params){
        params = _params;
        if (params.length == 0 || params.length > 1)
            throw new IllegalArgumentException("Number of parameters wrong for circle, needs radius");
        radius = params[0];
    }

    public Double getArea(){
        return radius * radius * Math.PI;
    }

    public Double[] getParams(){
        return params;
    }

}