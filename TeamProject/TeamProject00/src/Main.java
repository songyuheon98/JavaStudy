import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int randNum1=0,randNum2=0,randNum3=0;
        Scanner sc = new Scanner(System.in);

        // 서로 다른 숫자 3개
        while(true) {
            randNum1=(int) (Math.random() * 10);
            randNum2=(int) (Math.random() * 10);
            randNum3=(int) (Math.random() * 10);

            if(randNum1!=randNum2 && randNum2!=randNum3 && randNum3!=randNum1)
                break;
        }
        int [] randNumArr = {randNum1,randNum2,randNum3};
        int count = 0;

        while(true){
            int ball=0,strike=0;
            int u[] = new int[3];
            int userChoice;

            //사용자 숫자
            count++;

            System.out.print(count+"번째 시도 : ");
            userChoice= sc.nextInt();

            u[0] = userChoice/100;
            userChoice %=100;
            u[1]=userChoice/10;
            userChoice%=10;
            u[2]=userChoice;

            for (int i = 0; i < u.length; i++)
                for (int j = 0; j < u.length; j++)
                    if(randNumArr[i]==u[j])
                        if(i==j)
                            strike++;
                        else
                            ball++;
            if(ball!=0)
                System.out.println(ball+"B");
            if(strike!=0)
                System.out.println(strike+"S");
            if(strike==0 && ball==0) {
                System.out.print(ball + "B");
                System.out.println(strike + "S");
            }
            if(strike==3)
                break;

        }
        System.out.println(count+"번만에 맞히셨습니다.");
        System.out.println("게임을 종료합니다.");
    }
}