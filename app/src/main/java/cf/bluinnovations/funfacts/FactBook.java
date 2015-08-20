package cf.bluinnovations.funfacts;

import java.util.Random;

/**
 * Created by SHILPA on 2015-03-01.
 */
public class FactBook {
    public String getFact() {
        String facts= { " \"Ants stretch when they wake up in the morning.\",\n" +
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

       fact = facts;
    }
}
