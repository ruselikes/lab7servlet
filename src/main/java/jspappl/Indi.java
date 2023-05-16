package jspappl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Indi {
    private int Even;
    private int Odd;

    public  Indi() {
        Even = 0;
        Odd = 0;
    }

    public int getCountEven() {
        return Even;
    }

    public int getCountOdd() {
        return Odd;
    }

    public void setEven(int data) {
        this.Even = data;
    }

    public void setOdd(int data) {
        this.Odd = data;
    }
    public String CompareOddEvenQty(String args[]) {

        for (String x : args) {
            if (Integer.parseInt(x) % 2 == 0) {
                this.Even =this.Even + 1;//добавление в список чётного
            } else {
                this.Odd = this.Odd + 1;//добавление в список нечётного
            }
        }
        if (Even > Odd){
            return "<tr><td><h2>Четных больше."+Integer.toString(Even) + " > " + Integer.toString(Odd)+ "</h2></tr></td>";
        }
        else if (Even < Odd) {
            return "<tr><td><h2>Нечетных больше. "+Integer.toString(Odd) + " > " + Integer.toString(Even)+"</tr></td></h2>";
        }
        else {
            return "<tr><td><h2>Поровну. "+Integer.toString(Even)+ "==" + Integer.toString(Odd)+"</tr></td><h2>";
        }




    }
}