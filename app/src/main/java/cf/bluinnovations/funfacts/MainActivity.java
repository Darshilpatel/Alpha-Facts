package cf.bluinnovations.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               String facts =  " \"Ants stretch when they wake up in the morning.\",\n" +
                       "            \"Ostriches can run faster than horses.\",\n" +
                       "            \"Olympic gold medals are actually made mostly of silver.\",\n" +
                       "            \"You are born with 300 bones; by the time you are an adult you will have 206.\",\n" +
                       "            \"It takes about 8 minutes for light from the Sun to reach Earth.\",\n" +
                       "            \"Some bamboo plants can grow almost a meter in just one day.\",\n" +
                       "            \"The state of Florida is bigger than England.\",\n" +
                       "            \"Some penguins can leap 2-3 meters out of the water.\",\n" +
                       "            \"On average, it takes 66 days to form a new habit.\",\n" +
                       "            \"Mammoths still walked the earth when the Great Pyramid was being built.\"";

                String fact = "";

                Random randomGenerator = new Random();
                int randomNumber =randomGenerator.nextInt(facts.length());

                fact = facts[randomNumber];


                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }



}
