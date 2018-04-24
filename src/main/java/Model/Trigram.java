package Model;

import Entities.Token;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by baldissin - 24/4/18.
 */
public class Trigram {
    Map<Token, Bigram> freqlist;
    int count;

    public Trigram()
    {
        freqlist = new HashMap<Token, Bigram>();
        count = 0;
    }

    public Trigram insert(Token token, Token w1, Token w2)
    {
        if(freqlist.containsKey(token))
        {
            freqlist.get(token).insert(w1, w2);
        }
        else
        {
            freqlist.put(token, new Bigram().insert(w1, w2));
        }
        count++;
        return this;
    }
}
