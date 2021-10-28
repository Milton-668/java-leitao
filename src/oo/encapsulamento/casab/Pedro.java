package oo.encapsulamento.casab;

import oo.encapsulamento.casaa.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        //segredo
        //alguemSabe
        //algunsSabem
        //todosSabem

        //System.out.println(esposa.segredo);//private
        //System.out.println(alguemSabe);//default
        System.out.println(algunsSabem);//protected
        System.out.println(todosSabem);//public
    }

}
