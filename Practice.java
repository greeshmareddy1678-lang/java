class Constructor {
    String name;
    int age;
 public Constructor(String name,int age){
    this.name=name;
    this.age=age;
 }
 public String getname(){
    return name;
 }
 public int getage(){
    return age;
 }}
 class Practice{
    public static void main(String args[]){
        Constructor p=new Constructor("Greeshma",14);
        System.out.println("name"+p.getname());
         System.out.println("age"+p.getage());
    }
 }
 
