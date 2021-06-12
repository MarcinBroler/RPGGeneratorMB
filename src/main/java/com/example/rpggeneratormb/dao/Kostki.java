package com.example.rpggeneratormb.dao;

import java.util.Random;

public class Kostki {
    Random random = new Random();
public int d10 () { return (random.nextInt(10)+ 1);}
public  int TenX2() {
    return d10() + d10();
}


    public int[] StatyHumanWH() {
        Kostki kostki = new Kostki();
        int[] table = new int[7];
        for (int a = 0; a < table.length; a++)
            table[a] = kostki.TenX2() + 20;
        return table;
    }

}
