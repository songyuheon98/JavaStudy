import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cookingName = sc.nextLine();
        double starScore = sc.nextDouble();

        String [] recipe = new String[10];

//        for (String re: recipe) {
//            re=sc.nextLine();
//        }
//
//        for (String re: recipe) {
//            System.out.println(re);
//        }
//
//        System.out.println(starScore);
//        System.out.println(cookingName);
        sc.nextLine();
        // \n문자 받는 역활

        for (int i = 0; i < recipe.length; i++) {
            recipe[i]=sc.nextLine();
        }

        System.out.println("[ "+cookingName+" ]");
        System.out.print("별점 : "+(int)starScore);
        System.out.println(" ( "+(((int)starScore)/5.0)*100+"% )");

        for (int i = 0; i <recipe.length ; i++) {
            System.out.println(""+(i+1)+". "+recipe[i]);
        }


    }
}