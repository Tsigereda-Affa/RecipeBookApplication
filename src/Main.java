import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // this is a recipy book application
        String name = "";
        int portion =0;
        String typeOfcuisine="";
        double timeToCook=0;
        String result = "";
        String difficultyLevel;
        String resultTop;
        //String Name,Portion,Time,cuisine;
        Scanner sca = new Scanner(System.in);
//        System.out.println("welcome to the recipe book application");

//        Random rand =new Random();
//        int   difficulty = 1+rand.nextInt(3);
//        // System.out.println("difficulty level: " + difficulty );
//        String difficultyLevel="";
//
//        if (difficulty==1){
//            difficultyLevel="easy";
//        }else if (difficulty==2){
//            difficultyLevel="medium";
//        }else if (difficulty==3){
//            difficultyLevel="hard";
//        }
        String userInput = "";

        while (!userInput.contains("quit")) {
            System.out.println("Enter the name of the item:");
            name = sca.next();
            System.out.println("Enter the serving size :");
            portion = sca.nextInt();
            System.out.println("Enter the type of cusine :");
            typeOfcuisine = sca.next();
            System.out.println("Enter the time it takes to cook :");
            timeToCook = sca.nextDouble();
            String formatTimeToCook = String.format("%.02f", timeToCook);
            System.out.println("How difficult is it? (easy,medium, hard)");
            difficultyLevel = sca.next();
            result += name + "\t\t" + portion + "\t\t\t" + timeToCook + "sec\t\t" + typeOfcuisine+ "\n";
//            System.out.println("Do you want to add another item name ? (Type 'quit' to exit): ");
//            userInput = sca.next();
//            resultTop = "Name" + "\t\t" + "portion" + "\t\t\t" + "Time" + "sec\t\t" + "Cuisine";
//            System.out.println(resultTop);
//            result += name + "\t\t" + portion + "\t\t\t" + formatTimeToCook + "sec\t\t" + typeOfcuisine;
//            System.out.println(result);
            System.out.println("Do you want to add another item name ? (Type 'quit' to exit): ");
            userInput = sca.next();

        }
       resultTop = "Name" + "\t\t" + "portion" + "\t\t\t" + "Time" + "sec\t\t" + "Cuisine";
            System.out.println(resultTop);
            //result += name + "\t\t" + portion + "\t\t\t" + timeToCook + "sec\t\t" + typeOfcuisine;
            System.out.println(result);
    }
}