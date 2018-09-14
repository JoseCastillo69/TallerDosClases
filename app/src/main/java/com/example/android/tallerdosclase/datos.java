package com.example.android.tallerdosclase;

import java.util.ArrayList;

public class datos {

    private static ArrayList<movil> moviles= new ArrayList<>();

    public static void guardar (movil m){
        moviles.add(m);
    }

    public static ArrayList<movil> obtener(){
        return moviles;
    }

}
