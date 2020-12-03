/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;

/**
 *
 * @author phantomr
 */
public class Patient {
    private String firstName;
    private String name;
    private double age;
    private int room;
    private String illness;

    public Patient(String firstName, String name, double age, int room, String illness) {
        this.firstName = firstName;
        this.name = name;
        if(age >= 0){
            this.age = age;
        }
        if(room >= 0){
            this.room = room;
        }

        this.illness = illness;
    }
    
    @Override
    public String toString(){
        String s = "-firstname : " + getFirstName() +"\n"+ "-name : " + getName() + "\n" + "-age : " + getAge() + "\n" + "-room : " + getRoom() + "\n" + "-illness : " + getIllness() + "\n\n";
        return s;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public double getAge() {
        return age;
    }

    /**
     * @return the room
     */
    public int getRoom() {
        return room;
    }

    /**
     * @return the illness
     */
    public String getIllness() {
        return illness;
    }
}
