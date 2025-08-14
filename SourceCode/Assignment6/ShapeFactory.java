package designpatterns;

public class ShapeFactory {

    public static Shape create(String type, Double[] params){
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle(params);
            case "rectangle":
                return new Rectangle(params);
            default:
                return null;
        }
    }
}