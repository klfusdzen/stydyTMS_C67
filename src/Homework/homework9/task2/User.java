package Homework.homework9.task2;

public class User implements Cloneable{
    private int userID;
    private int typeClone;
    private PC PC;

    public User(int userID, int typeClone, Homework.homework9.task2.PC PC) {
        this.userID = userID;
        this.typeClone = typeClone;
        this.PC = PC;
    }

    public int getUserID() {
        return userID;
    }

    public int getTypeClone() {
        return typeClone;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setTypeClone(int typeClone) {
        this.typeClone = typeClone;
    }

    public PC getPC() {
        return PC;
    }

    public void setPC(PC PC) {
        this.PC = PC;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", typeClone=" + typeClone +
                ", PC=" + PC +
                '}';
    }

    //Shallow copying
    /* @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } */

    //Deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.PC = (PC) PC.clone();
        return user;
    }
}
