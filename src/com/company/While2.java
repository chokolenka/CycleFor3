package com.company;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    do{
        System.out.println("Input an integer value");
    }
    while(scanner.nextInt()!=-1);

}
    Person person = new Person ("noname");
    //System.out.println(person.getName());
}


class Person{
    private String name;
    public Person(String name)
    { this.name = name; }
    public String getName() {return name;}
}
