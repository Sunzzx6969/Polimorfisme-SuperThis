/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorphisme_this;

/**
 *
 * @author Sultan
 */
public class Employe extends Person {
    
    float salary = 4000f;
    String name = "Ratu Kanjeng Dimas";
    int age = 100;
      
    public void showInfosuper(){
        System.out.println("============SUPER===========");
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $" + salary);
    }
    public void showInfothis(){
        System.out.println("============THIS===========");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: $" + salary);
    }
}
