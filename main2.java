abstract class Objects{
    abstract void showShape();
    public void shape(){
        System.out.println("I'm from abstract class");
    }
}
class Sphere extends Objects{
    void showShape(){
        System.out.println("object type is sphere.");
    }
}
class Cuboid extends Objcts{
    void showShape(){
        System.out.println("object type is cuboid.");
    }
}
class Prism extends Objects{
    voidd showShape(){
        System.out.println("Object type is Prism.");
    }
}
public class Main{
    public static void main(string args[]){
        Objects obj=new sphere();
        obj.showShape();
        obj=new Cuboid();
        obj.showShape();
        obj.new Prism();
        obj.showShape();
        obj.shape();
    }
}