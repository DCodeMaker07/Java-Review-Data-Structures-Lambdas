package org.TLPS1.generics;

import java.util.List;

public class Generic {

//    public <T, S> S show (T tipoObjeto, S tipoObjeto2) {
//        System.out.println("This is the generic type class: " + tipoObjeto.getClass().getName());
//        return tipoObjeto2;
//    }

    public void show(List<? extends  Number> list){

        for (Number number : list) {
            System.out.println(number);
        }

    }

}
