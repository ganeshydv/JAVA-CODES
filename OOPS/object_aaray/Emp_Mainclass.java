package object_aaray;

public class Emp_Mainclass {
    public static void main(String[] args) {
        Employee e1=new Employee(101,"tony",250944.0);
        Employee e2=new Employee(102,"stark",300000);
        Employee e3=new Employee(103,"thor",400000);
        Employee[] emp_arr={e1,e2,e3};
        for (int i=0;i<emp_arr.length;i++){
            System.out.println("ID :"+emp_arr[i].id+" Name: "+emp_arr[i].name+" Salary: "+emp_arr[i].sal);
        }
    }
}
