package Builder;

import java.util.Scanner;

public class Director {
    private Parser parser;

    public Director() {
        parser = new Parser();
    }

    public void doTheJob(String fileName, int choice){
        if(choice == 1 ){
            parser.setBuilder(new BuilderGUI());
        }else{
            parser.setBuilder(new BuilderASCII());
        }
        parser.parseFile(fileName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Director director = new Director();
        System.out.println("Podaj nazwe pliku: ");
        String fileName  = scanner.nextLine();
        System.out.println("Podaj wersje buildera\n[1] HTML\n[2] ASCII - konsolowy");
        int choice = scanner.nextInt();
        director.doTheJob(fileName, choice);
    }
}
