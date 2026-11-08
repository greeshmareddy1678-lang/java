abstract class Objects{
    abstract void showshape();
    void shape(){
        System.out.println("im from abstract class");
    }}
class Sphere extends Objects{
    void showshape(){
        System.out.println("sphere");
    }
}
class Prism extends Objects{
     void showshape(){
        System.out.println("prism");
}}
public class abstracting_data{
public static void main(String args[]){
    Objects sc=new Sphere();
    sc.showshape();
    sc.shape();
   Objects s=new Prism();
    s.showshape();
    s.shape();
}
}

