class parent{
    int age,id;
    String name;
    void naming(String name){
     System.out.println("name "+name);
}}
class Child extends parent{
    void ageN(int age){
         System.out.print("Age of student is:"+age);
    }
}
public class inheritence1 {
    public static void main(String args[]){
        Child s=new Child();
      s.naming("Greeshma");
      s.ageN(14);
    }
    
}
