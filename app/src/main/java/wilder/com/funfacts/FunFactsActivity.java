package wilder.com.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wilder.funfacts.R;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
// Aqui se estan declarando las variables y views del layout del app.

        final TextView factLabel = (TextView) findViewById(R.id.FactTextView);
        final Button showFactButton = (Button) findViewById(R.id.ShowFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String fact = mFactBook.getFact();



                //if randomNumber equals 1 then
                //set fact equal to ostriches fact
                //if randomNumber equals 2 then
                //set fact equal to olympic fact


//Update our label with our dynamic fact
                factLabel.setText(fact);

              int color = mColorWheel.getColor();

                relativeLayout.setBackgroundColor(color);

                //Esta linea cambio el color del texto del boton.
                showFactButton.setTextColor(color);


            }
        };
        showFactButton.setOnClickListener(listener);

        //Manda mensajes de notificacion al usuario o eventos que pasen tras banbalinas dentro del app, el Toast metodo.
        // Toast.makeText(this, "What´s up", Toast.LENGTH_LONG).show();

        Log.d(TAG, "We are logging from the onCreate() method!");



    }



}
