import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        MergeHelp solution = new MergeHelp();
        solution.mainMenu();
    }
}

class MergeHelp{

    void sortedByMerge(List<Integer> toSort){
        int iterator1, iterator2;
        List<Integer> sorted = new ArrayList<>();
        sorted.add(toSort.get(0));
        System.out.println("1) " + sorted);
        for(int i = 1; i < toSort.size(); i ++){
            iterator1 = toSort.get(i);
            for(int j = sorted.size() - 1; j >= 0; j--){
                iterator2 = sorted.get(j);
                if(iterator1 > iterator2){
                    sorted = insert(sorted, j + 1, iterator1);
                    j = -1;
                }
                if(j == 0){
                    sorted = insert(sorted, j, iterator1);
                }
            }
            System.out.println( i + 1 + ") " + sorted);
        }
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("Your final list : " + sorted);
    }
    List<Integer> insert(List<Integer> toTransform, int index, int toAdd){
        List<Integer> toReturn = new ArrayList<>();
        for(int i = 0; i < toTransform.size(); i++ ){
            if(i == index){
                toReturn.add(toAdd);
                toReturn.add(toTransform.get(i));
            }else{
                toReturn.add(toTransform.get(i));
            }
        }
        if(index == toTransform.size()){
            toReturn.add(toAdd);
        }
        return toReturn;
    }

    void mainMenu(){
        List<Integer> userInput = new ArrayList<>();
        Scanner ask = new Scanner(System.in);
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.print("How many elements do you want to have in your list? ");
        int max = ask.nextInt();
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        for(int i = 0; i < max; i++){
            System.out.printf("Type %d element of your list: ", i + 1);
            userInput.add(ask.nextInt());
        }
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("Your list : " +  userInput);
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        sortedByMerge(userInput);
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
    }
}
