package oo.encapsulamento.casab;

import oo.encapsulamento.casaa.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcessos() {
        //segredo
        //alguemSabe
        //algunsSabem
        //todosSabem

        //System.out.println(sogra.esposa.segredo);//private
        //System.out.println(sogra.alguemSabe);//default
        //System.out.println(sogra.algunsSabem);//protected
        System.out.println(sogra.todosSabem);//public
    }
}
