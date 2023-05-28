package Homework.homework9.task2;

public class User implements Cloneable {
    private int typeClone;
    private int userID;
    private PC PC;

    public User(int typeClone, int userID, Homework.homework9.task2.PC PC) {
        this.typeClone = typeClone;
        this.userID = userID;
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
    /* @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.PC = (PC) PC.clone();
        return user;
    } */

    //Let the type of cloning operation (shallow cloning or deep cloning) be passed to the program input,
    // as well as the user id for cloning.

    @Override
    protected Object clone() throws CloneNotSupportedException {
        switch (typeClone) {
            case 1 -> {
                return super.clone();
            }
            case 2 -> {
                User user = (User) super.clone();
                user.PC = (PC) PC.clone();
                return user;
            }
            default -> throw new IllegalStateException("No such type of cloning");
        }
    }
}
