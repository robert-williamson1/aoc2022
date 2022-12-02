import java.util.Scanner;
import java.io.File; 

public class Day02{

    public static int evaluate(String strategy){
        int score = 0;
        String[] choices = strategy.split(" ");
        int otherChoice = choices[0].compareTo("A"); 
        int myChoice = choices[1].compareTo("X");
        int diff = Math.floorMod((otherChoice - myChoice),3);

        switch(diff){
            case 0: score +=3; break;
            case 1: break;
            case 2: score +=6; break;
        }
        score += myChoice +1;
        return score;
    } 

    public static void part1(){
        Scanner in = new Scanner(new File("sampleInput.txt"));
        int total = 0;
        while(in.hasNext()){
            String line = in.nextLine();
            total += evaluate(line);
        }
        System.out.println(total);
    }

    public static void part2(){

    }

    public static void main(String[] args){
        try{
            part1();
        } catch (Exception e){
            System.out.print(e);
        }
    }
}