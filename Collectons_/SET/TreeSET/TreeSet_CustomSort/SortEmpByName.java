package Collectons_.SET.TreeSET.TreeSet_CustomSort;

import java.util.Comparator;

public class SortEmpByName implements Comparator<Employee> {
    public int compare(Employee e1,Employee e2){
        return e1.name.compareTo(e2.name);
    }
}
