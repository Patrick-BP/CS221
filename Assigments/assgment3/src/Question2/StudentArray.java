package Question2;

import java.util.Arrays;

public class StudentArray extends Student{
    private Student[] a;
    private int nElems;
    int e =0;
    int findid = 0;
    public StudentArray(int max){
        a = new Student[max];

    }
    public Student find(int id){
        if(id <0 || id >= a.length){
            throw new ArrayIndexOutOfBoundsException();
        }
       return  a[id];
    }

    public void insert(int id,String name, int mark){
        Student std = new Student(id, name, mark);
            int count=0;
            if(a[0] == null){
                a[e] = std;
                e++;
            }
            else {
                for (int i=0; i<e; i++){
                    if(id == a[i].getId()){
                        count++;
                    }
                }
                if(count <= 0){
                    a[e] = std;
                    e++;
                }
            }
        }

    public boolean delete(int id){
        for (int i=0; i<a.length; i++) {
            if(id == a[i].getId()){
                findid = i;
            }

        }
        a[findid] = null;
    return true;
    }
    public void displayAll(){

        for(int i=0; i<e; i++) {
            a[i].displayStudent();
        }

    }

    public Student getMax(){

        int max =0;
        Student st = new Student();

        for(int i=0; i<a.length; i++){
            if(a[i].getMark() > max){
                max=a[i].getMark();
                st = a[i];
            }
        }
        System.out.println("\nthe student with maximum mark is:\n" + "Name: "+ st.getName() + "\nID: "+ st.getId() + "\nmark: " + st.getMark());
        return st ;
    }
    public Student getMin(){

        Student st2 = a[0];
        int min=a[0].getMark();
        for(int i=0; i<a.length; i++){

            if(a[i].getMark() < min){
                st2 = a[i];
            }
        }
        System.out.println("\nthe student with minimum mark is:\n" + "Name: "+ st2.getName() + "\nID: "+ st2.getId() + "\nmark: " + st2.getMark());
        return st2 ;
    }



    public static void main(String[] args) {

        StudentArray sta = new StudentArray(3);


        sta.insert(1,"Alain", 66);
        sta.insert(2,"patrick", 99);
        sta.insert(3,"paul", 78);
        sta.insert(3,"John", 40);


        sta.displayAll();

        sta.getMax();
        sta.getMin();

    }


}
