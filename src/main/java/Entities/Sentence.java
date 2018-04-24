package Entities;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by baldissin - 24/4/18.
 */
public class Sentence {
    List<Token> tokenList;

    public Sentence()
    {
        tokenList = new LinkedList<Token>();
    }

    public Sentence(List<Token> tokenList)
    {
        this.tokenList = tokenList;
    }

    public int computeTruePositive()
    {
        //TODO: Method Stub
        throw new NotImplementedException();
    }

    public int computeTrueNegative()
    {
        //TODO: Method Stub
        throw new NotImplementedException();
    }

    public int computeFalsePositive()
    {
        //TODO: Method Stub
        throw new NotImplementedException();
    }

    public int computeFalseNegaive()
    {
        //TODO: Method Stub
        throw new NotImplementedException();
    }
}
