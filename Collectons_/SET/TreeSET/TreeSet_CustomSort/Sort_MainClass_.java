package Collectons_.SET.TreeSET.TreeSet_CustomSort;

import java.util.TreeSet;

public class Sort_MainClass_ {
    public static void main(String[] args) {
        System.out.println("sort by NAME: ");
        TreeSet<Employee> ts=new TreeSet<>(new SortEmpByName());    //passing object of class which have compare() overloaded
//        TreeSet<Employee> ts=new TreeSet<>(new SortEmpBySal());
        ts.add(new Employee("Tony",23456.3));
        ts.add(new Employee("stark",12000.3));
        ts.add(new Employee("thor",3767676.6));
        for(Employee e:ts){
            System.out.println(e);
        }
    }
}
