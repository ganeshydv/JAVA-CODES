package object_aaray;

public class Mainclass {
    public static void main(String[] args) {
        Student s1=new Student("tony",20);
        Student s2=new Student("stark",40);
        Student s3=new Student("thor",20000);
        Student[] s={s1,s2,s3};
        for (int i=0;i<s.length;i++){
            System.out.println(s[i].name);
            System.out.println(s[i].age);
        }
    }
}
