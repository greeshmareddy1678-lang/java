class Employee{ int emp_no;
    String name;
    float sal;
    Employee(){
        System.out.println("******");
        emp_no=101;
        name="Greeshma";
        sal=300000;
    }
void displayDetails(){
    System.out.println(emp_no+"|"+name+"|"+sal);
}}
class details{
    public static void main(String args[]){
    Employee emp1=new Employee();
    Employee emp2=new Employee();
    Employee emp3=new Employee();
    emp1.displayDetails();
    emp2.displayDetails();
    emp3.displayDetails();
}}

   


