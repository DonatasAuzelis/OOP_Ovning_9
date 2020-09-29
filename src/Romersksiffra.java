/**
 * Created by Donatas Auzelis
 * Date: 2020-09-29
 * Time: 14:18
 * Project: OOP_Övning_9
 * Copyright: MIT
 */
public enum Romersksiffra {
    I(1, "ett"), V(5, "fem"), X(10, "tio"), L(50, "femtio"),
    C(100, "hundra"), D(500, "femhundra"), M(1000, "tusen");

    private final int  digit;
    private final String  string;

    Romersksiffra(int digit, String s)  {
        this.digit = digit;
        this.string = s;
    }

    public int getDigit(){
        return digit;
    }

    public String getString(){
        return string;
    }
}
