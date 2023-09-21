import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz rozmiar tablicy");

        int sizeTab = scanner.nextInt();
        int[] numbertab = new int[sizeTab];

    for(int i = 0; i<sizeTab; i++){
        if(i % 10 == 0)
            System.out.println();

        numbertab[i] = (int) (Math.random() * 100);
        System.out.printf(numbertab[i] + ", ");
    }

        System.out.println("wpisz jaką liczbę chcesz odszukać");
        int LockedForNumber = scanner.nextInt();

        String tab = findNumber (numbertab, LockedForNumber);
        System.out.printf("Liczby podzielne przez %d w tablicy to  \n%s", LockedForNumber, tab);


    }


    public static String findNumber(int[] numberTab,  int LockedforNumber) {
        String result = " ";
        int size = numberTab.length;
        for( int i = 0; i < size; i++){
            if(numberTab[i] % LockedforNumber == 0) result += numberTab[i] + ", ";


        }
    return result;
    }

}
