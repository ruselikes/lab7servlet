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
            return "Четных больше."+Integer.toString(Even) + " > " + Integer.toString(Odd);
        }
        else if (Even < Odd) {
            return "Нечетных больше. "+Integer.toString(Odd) + " > " + Integer.toString(Even);
        }
        else {
            return "Поровну. "+Integer.toString(Even)+ "==" + Integer.toString(Odd);
        }




    }
}