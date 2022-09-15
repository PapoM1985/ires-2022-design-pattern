package it.euris.ires.exercises.strategy;

public class Spectator {
    public int age;
    public boolean staff;

    public boolean isStaff() {
        return staff;
    }

    public void setStaff(boolean staff) {
        this.staff = staff;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
