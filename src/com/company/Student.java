package com.company;
// основной класс обьектов дерева
public class Student {
    private String Name;
    private int Age;
    private int Avg;
    public Student(String name, int age, int avg) {
        Name = name;
        Age = age;
        Avg = avg;
    }
    // методы получения полей
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAvg() {
        return Avg;
    }

    public void setAvg(int avg) {
        Avg = avg;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    @Override //переопределяем метод ту стринг
    public String toString()
    {

        return new String("Student nsme: "+this.Name+"\nStudent age: "+this.Age+"\nStudent average ball:"+this.Avg);
    }

}
