package Strategy;

import java.util.Scanner;

/**
 * Created by mq on 2017-10-16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wczytywanie z pliku");
        System.out.println("[0] - txt");
        System.out.println("[1] - csv\n");

        int readChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj nazwe pliku wczytywanego\n");
        String readFileName = scanner.nextLine();

        System.out.println("Wybierz rodzaj sortowania");
        System.out.println("[0] - default");
        System.out.println("[1] - insertion sort\n");

        int sortChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Wybierz rodzaj zapisu");
        System.out.println("[0] - txt");
        System.out.println("[1] - csv\n");

        int saveChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj nazwe pliku zapisywanego\n");
        String saveFileName = scanner.nextLine();

        /*
        int readChoice = 0;
        int sortChoice = 1;
        int saveChoice = 1;
        String readFileName = "dane";
        String saveFileName = "wyjscie";
        */

        Strategy myStrategy = new Strategy(readFileName, saveFileName);
        injectToStrategy(readChoice, sortChoice, saveChoice, myStrategy);
        myStrategy.doTheJob();
    }

    public static void injectToStrategy(int readFileNo, int sortFileNo, int saveFileNo, Strategy strategy){
        if(readFileNo == 0){
            strategy.setReadFile(new ReadFileTXT());
        }else {
            strategy.setReadFile(new ReadFileXML());
        }

        if(sortFileNo == 0){
            strategy.setSortFile(new SortFileDefault());
        }else {
            strategy.setSortFile(new SortFileInsertion());
        }

        if(saveFileNo == 0){
            strategy.setSaveFile(new SaveFileTXT());
        }else {
            strategy.setSaveFile(new SaveFileXML());
        }
    }
}
