package Ass3;
class Box<T> {
    T value;
    Box(T value){
        this.value = value;
    }
    void setvalue(T value){
        this.value = value;
    }
    T getvalue(){
        return value;
    }
    public String toString(){
        return "Box [" + value + "]";
    }
}
public class Q4 {
    public static void main(String [] args){
        Box <String> b1 = new Box<>("BOX");
        System.out.println("Box1: " + b1);
        Box <String> b2 = b1;
        b1.setvalue("Still A Box");
        System.out.println("Box2: " + b2);

        Box <Integer> b3 = new Box<>(67);
        System.out.println("Box3: " + b3);
        Box <Integer> b4 = b3;
        b3.setvalue(69);
        System.out.println("Box4:" + b4);

        Box<Object> b5 = new Box<>(67.67);
        System.out.println("Box5: " + b5);
        Box<Object> b6 = b5;
        b5.setvalue(69.69);
        System.out.println("Box6: " + b6);
    }
}
