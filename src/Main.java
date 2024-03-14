
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>students = new ArrayList<>();
        students.add("Joomart");
        students.add("Ali");
        students.add("Tinatin");
        students.add("Sabina");
        students.add("Islam");
        students.add("Sultan");
        students.add("Aisha");
        students.add("Joodar");
        students.add("Eldiar");
        students.add("Yzat");
        students.add("Joomart");

        //TODO 1
        students.add(0,"Aizat");
        System.out.println("Zamena 1- index " + students);
        //TODO 2
        System.out.println("Elemment 5 index " + students.get(5));
        //TODO 3
        students.set(8, "Beknazar");
        System.out.println("Zamena 8- index " + students);

        //TODO 4
        students.remove(3);
        System.out.println("Index 3 delete " + students);
        //TODO 5
        if(students.contains("sabina")){
            System.out.println("Successfully");
        }else {
            System.out.println("Not");
        }
        //TODO 6
        List<String> subList = students.subList(0,5);
        System.out.println("SubList :" + subList);

        //TODO 7
        List<String> mentors = new ArrayList<>();
        mentors.add("Aizat");
        mentors.add("Datka");
        mentors.add("Ulan");
        students.addAll(mentors);
        System.out.println("Join List : " + students);

        //TODO 8
        Collections.reverse(students);
        System.out.println("Reverse List : " + students);

        //TODO 9

        students.removeAll(students);
        System.out.println("Cleared list: " + students);

        //TODO 10

        System.out.println("List is empty: " + students.isEmpty());
    }

}