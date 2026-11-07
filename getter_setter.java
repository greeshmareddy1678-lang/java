class student{
    private String name;
    public String fetch(){
        return name;
    }
    public void set(String name){
        this.name=name;
    }
}
public class getter_setter {
    public static void main(String args[]){
        student s=new student();
        s.set("Greeshma");
        System.out.println(s.fetch());
    }
}
