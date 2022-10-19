package Collectons_.SET.TreeSET.TreeSet_CustomSort;

public class Employee {
    String name;
    Double sal;
    Employee(String name,double sal){
        this.name=name;
        this.sal=sal;  //AUTO BOXING  --> PRIMITIVE TO NON-PRIMITIVE
    }
    @Override
    public String toString(){

        return "salary of "+name+" is "+sal;
    }

}
