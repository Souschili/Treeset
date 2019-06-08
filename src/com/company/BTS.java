package com.company;

import java.util.Comparator;

public class BTS<T>  {
    private Node<T> root; //корень дерева
    private Comparator<T> cmpr;

    public BTS() {
        // оставил для красоты :0)
        this.cmpr= new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                Student s1=(Student)o1;
                Student s2=(Student)o2;
                return s1.getAge()-s2.getAge();
            }
        };
       System.out.println("Comporator по умолчанию");
    }

    //конструктор с компоратором
    public BTS(Comparator<T> comporator) {
        this.cmpr = comporator;
        if(this.cmpr!=null)
        System.out.println("Our comp work!!!");
    }

    // вставка нового узла классический вариант
    public  void insert(T data)
    {
        Node<T> newNode=new <T>Node(data);
        if (root==null)
        {
            //если корня нет
            root=newNode;
            System.out.println(root.data.toString());
        }
        else
        {
            Node<T> current=root;
            Node<T> parent;
            while (true)
            {
                parent=current;
                if(this.cmpr.compare(parent.data,newNode.data)>0)
                {
                    // идем в лево
                    current=current.leftChild;
                    if(current==null)
                    {

                        parent.leftChild=newNode;
                        //System.out.println("Родитель: "+ parent.data.toString()+ " левый потомок" + newNode.data.toString());
                        Student s1=(Student) parent.data;
                        Student s2=(Student)parent.leftChild.data;
                        System.out.println(s1.getName()+"--left--> "+s2.getName());
                        return;
                    }

                }
                else
                {
                    current = current.rightChild;
                    if(current == null) // Если достигнут конец цепочки,
                    { // вставить справа
                        parent.rightChild = newNode;
                        Student s1=(Student) parent.data;
                        Student s2=(Student)parent.rightChild.data;
                        System.out.println(s1.getName()+"--rigth--> "+s2.getName());
                        return;
                    }

                }
            }

        }
    }

    // все по условию задачи ,интерфейсная сылка + передача своего компоратора или лямбды
    //


}
