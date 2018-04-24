package Model;

import Entities.Token;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by baldissin - 24/4/18.
 */
public class Unigram {

    Map<Token, Integer> freqlist;
    int count;

    public Unigram()
    {
        freqlist = new HashMap<Token, Integer>();
        count = 0;
    }

    public Unigram insert(Token token)
    {
        freqlist.put(token, freqlist.containsKey(token) ? freqlist.get(token) + 1 : 1);
        count++;

        return this;
    }
}
