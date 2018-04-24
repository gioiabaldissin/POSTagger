package Entities;

/**
 * Created by baldissin - 24/4/18.
 */
public class Token  {

    private String text ;
    private String goldPOS ;
    private String predictedPOS ;

    public Token(String text,String goldPOS, String predictedPOS) {
        this.text = text ;
        this.goldPOS = goldPOS ;
        this.predictedPOS = predictedPOS ;
    }

    public Token(String text)
    {
        this(text, "", "");
    }

    public boolean taggedCorrectly() {
        return goldPOS.equals(predictedPOS) ;
    }

    public String getText() {
        return text;
    }
    public String getGoldPOS() {
        return goldPOS;
    }
    public String getPredictedPOS() {
        return predictedPOS;
    }
    public void setText(String text) {
        this.text = text ;
    }
    public void setGoldPOS(String goldPOS) {
        this.goldPOS = goldPOS ;
    }
    public void setPredictedPOS(String predictedPOS) {
        this.predictedPOS = predictedPOS ;
    }
}
