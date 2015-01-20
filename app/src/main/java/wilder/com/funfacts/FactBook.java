package wilder.com.funfacts;

import java.util.Random;

/**
 * Created by Wilder on 12/8/14.
 */
public class FactBook {

    // Una clase posee dos componenets, variables, que son las propiedades, y metodos que es lo que la clase puede hacer.

    public String getFact(){

         String[] mFacts = {
                "El ingreso laboral anual en los Emiratos Arabes es de $50,000 dolares en promedio.",
                "En Pakistan se realiza el 85% de la producción total de pelotas de futbol.",
                "La manera mas rapida para mantener todos los sentidos alerta es nadar en agua fria, lo cuál tiene propiedades terapeuticas y medicinales.",
                "Al nacer tienes 300 huesos; pero al tiempo de convertirte en adulto tendrás 206.",
                "La luz tarda en llegar del Sol a la Tierra aproximadamente 8 minutos.",
                "Algunas plantas de bamboo pueden crecer un metro en tan solo un día.",
                "El estado de Florida es mas grande que Inglaterra.",
                "Algunos pinguinos pueden saltar de 2 a 3 metros fuera del agua.",
                "Aproximadamente tarda 66 dias en formarse un nuevo habito en nuestra mente.",
                "Mammoths seguian caminando en la Tierra cuando la gran Piramide estaba siendo construida.",
         "Alrededor de 1495 Leonardo Davinci habia creado planos para la cosntrucción de un Robot Humanoide."};

        // Se aprieta el boton entonces actualiza la pantalla con un nuevo consejo

        String fact = "";
        //  Random Select a fact

        Random randomGenerator = new Random(); //Construct a new Random generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);


        fact = mFacts [randomNumber];
        return fact;

    }

}
