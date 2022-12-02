import java.util.Scanner;
import java.io.File;
import java.util.ArrayList; 
import java.util.Collections;

public class Day01 {

    private final static String DATA_FILE = "input.txt";

    public static void part1() {
        Scanner in;
        int mostCalories = 0;

        try {
            in = new Scanner(new File(DATA_FILE));
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        while (in.hasNext()) {
            String line = in.nextLine();
            int calories = 0;

            while (!line.equals("") && in.hasNext()) {
                calories += Integer.parseInt(line);
                if (in.hasNext())
                    line = in.nextLine();
                else
                    break;
            }

            if (calories > mostCalories) {
                mostCalories = calories;
            }

        }

        System.out.println(mostCalories);
    }

    public static void part2() {
        Scanner in;
        ArrayList<Integer> calorieList = new ArrayList<>(); 
        try {
            in = new Scanner(new File(DATA_FILE));
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        while (in.hasNext()) {
            String line = in.nextLine();
            int calories = 0;

            while (!line.equals("") && in.hasNext()) {
                calories += Integer.parseInt(line);
                if(in.hasNext()){
                line = in.nextLine();
                }
                else{
                    break;
                }
            }
            calorieList.add(calories);
        }
        Collections.sort(calorieList);
        Collections.reverse(calorieList);
        System.out.println(calorieList.remove(0) + calorieList.remove(0) + calorieList.remove(0) );
    }

    public static void main(String[] args) {
        part2();
    }

}