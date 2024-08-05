import java.util.Random;
import java.util.ArrayList;

/**
 * Beschreiben Sie hier die Klasse Random.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Randoms
{

    private Random rnd;

    public Randoms(){
        rnd = new Random();
    }

    public void number(){
        int idx = rnd.nextInt();
        System.out.println(idx);
    }

    public void numbers(int n){
        for(int i = 0; i< n; i++){
            int idx = rnd.nextInt();
            System.out.println(idx);
        }
    }

    public void dice(){
        int idx = rnd.nextInt(1,7);
        System.out.println(idx);
    }

    public void getAnswer(){
        int idx = rnd.nextInt(1,4);
        if(idx == 1){
            System.out.println("yes");
        }
        else if(idx == 2){
            System.out.println("maybe");
        }
        else{
            System.out.println("no");

        }
    }

    public void getArrayAnswer(){
        ArrayList <String> answers = new ArrayList<>();

        answers.add("yes");
        answers.add("no");
        answers.add("maybe");
        int idx = rnd.nextInt(0,answers.size());
        System.out.println(answers.get(idx));
    }
    
    public void rangeRandom(int max){
        int idx = rnd.nextInt(0, max + 1);
        System.out.println(idx);
    }
    
    
    public void rangeRandom(int min,int max){
        int idx = rnd.nextInt(min, max + 1);
        System.out.println(idx);
    }

}
