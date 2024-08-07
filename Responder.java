import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private ArrayList<String> answers;
    private Random rnd;
    private HashMap <String, String> answerMap;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        answerMap = new HashMap<>();
        answers = new ArrayList<>();
        rnd = new Random();
        fillAnswers();
        fillAnswerMap();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse ( HashSet<String> words)
    {
        for(String word : words){
            String answer = answerMap.get(word);
            if(answer != null){
                return answer;
            }
            
        }
        
        return standardAnswer();
    }
    
    public String standardAnswer(){
        
            int idx = rnd.nextInt(answers.size());
            return answers.get(idx);

    }

    public void fillAnswers(){
        answers.add("That sounds weird.\n");
        answers.add("Which system is used?\n");
        answers.add("I need some more specification");
        answers.add("Could you explain it in an other way");
        answers.add("Could you try again?");
        answers.add("That sounds interesting. Tell me more...");
    }

    public void fillAnswerMap(){
        answerMap.put("slow",
            "There is a high possibility that it has sth do with your hardware. An Upgrade\n"+
            "for your processor should solve your problem.\n");
        answerMap.put("mistake",
            "everyone odes mistakes.\n"+
            "could you be a bit more descriptive so we know what to fix?");
        answerMap.put("expensive", "get over it.");
    }
    
}
