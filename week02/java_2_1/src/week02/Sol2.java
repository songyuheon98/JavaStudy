package week02;

import java.util.*;

public class Sol2 {

    //    자료구조 요리 레시피 메모장 만들기
//            입력값
//    저장할 자료구조명을 입력합니다. (List / Set / Map)
//    내가 좋아하는 요리 제목을 먼저 입력합니다.
//    이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다.
//    입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
//    출력값
//    입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
//    이어서, 입력한 모든 문장앞에 번호를 붙여서 입력 순서에 맞게 모두 출력 해줍니다.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choiceDataStructure = sc.nextLine();
        String cookingName = sc.nextLine();

        int i = 1,j=0;

        if(Objects.equals(choiceDataStructure,"List")){
            LinkedList<String> recipeList = new LinkedList<String>();
            while(true){
                String rows = sc.nextLine();
                if(Objects.equals(rows,"끝"))
                    break;
                recipeList.add(rows);
            }

            System.out.println("[ "+choiceDataStructure+" 으로 저장된 "+cookingName + " ]");
            while(!recipeList.isEmpty()){
                System.out.println(i+". "+recipeList.poll());
                i++;
            }

        }
        else if (Objects.equals(choiceDataStructure,"Set")) {
            LinkedHashSet<String> recipeSet = new LinkedHashSet<>();
            while(true){
                String rows = sc.nextLine();
                if(Objects.equals(rows,"끝"))
                    break;
                recipeSet.add(rows);
            }
            Iterator iterator = recipeSet.iterator();
            System.out.println("[ "+choiceDataStructure+" 으로 저장된 "+cookingName + " ]");
            while(j<recipeSet.size()){

                System.out.println(i+". "+iterator.next());
                i++;
                j++;
            }
        }
        else if (Objects.equals(choiceDataStructure,"Map")) {
            Map<Integer,String> recipeMap = new HashMap<>();
            while(true){
                String rows = sc.nextLine();
                if(Objects.equals(rows,"끝"))
                    break;
                recipeMap.put(j,rows);
                j++;
            }
            System.out.println("[ "+choiceDataStructure+" 으로 저장된 "+cookingName + " ]");
            for (int k = 0; k < recipeMap.size(); k++) {
                System.out.println((k+1)+". "+recipeMap.get(k));
            }

        }






    }
}
