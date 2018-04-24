package Entities;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by baldissin - 24/4/18.
 */
public class Corpus {

    List<Sentence> sentenceList;

    public Corpus()
    {
        sentenceList = new LinkedList<Sentence>();
    }

    public Corpus readFromFile(String path)
    {
        //TODO: Method Stub
        throw new NotImplementedException();
    }

    public Corpus readFromFile(String path, int startingFrom, int amount)
    {
        //TODO: Method Stub
        throw new NotImplementedException();
    }

    public void evaluate()
    {

    }
}
