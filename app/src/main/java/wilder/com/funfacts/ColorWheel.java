package wilder.com.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Wilder on 12/8/14.
 */
public class ColorWheel {

    // Una clase posee dos componenets, variables, que son las propiedades, y metodos que es lo que la clase puede hacer.

    public int getColor(){

        String[] mColors = {
                "#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7d669e", // purple
                "#53bbb4", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#637a91", // dark gray
                "#f092b0", // pink
                "#b7c0c7"  // light gray
        };

        // Se aprieta el boton entonces actualiza la pantalla con un nuevo consejo

        String color = "";
        //  Random Select a fact

        Random randomGenerator = new Random(); //Construct a new Random generator
        int randomNumber = randomGenerator.nextInt(mColors.length);


        color = mColors [randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;

    }

}
