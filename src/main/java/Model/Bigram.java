package Model;

import Entities.Token;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by baldissin - 24/4/18.
 */
public class Bigram {
    Map<Token, Unigram> freqlist;
    int count;

    public Bigram()
    {
        freqlist = new HashMap<Token, Unigram>();
        count = 0;
    }

    public Bigram insert(Token token, Token prev)
    {
        if(freqlist.containsKey(token))
        {
            freqlist.get(token).insert(prev);
        }
        else
        {
            freqlist.put(token, new Unigram().insert(prev));
        }
        count++;
        return this;
    }
}
