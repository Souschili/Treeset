package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here
       BTS<Student> tree=new BTS<Student>(new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o1.getAvg()-o2.getAge();
           }
       });

       //либо так с помощью лямбды
        BTS<Student> tree1=new BTS<Student>((Student s1,Student s2)->{return s1.getName().length()-s2.getName().length();});
        tree.insert(new Student("Orkhan",18,19));
        tree.insert(new Student("Xaos",19,32));
        tree.insert(new Student("Ari",20,10));
        tree.insert(new Student("Aargh",21,1));
        tree.insert(new Student("Aida",15,42));

        tree1.insert(new Student("Ork",18,19));
        tree1.insert(new Student("Xa",19,32));
        tree1.insert(new Student("Arif",20,10));
        tree1.insert(new Student("Aarghhhhhhhh",21,1));
        tree1.insert(new Student("Aida1",15,42));






    }
}
