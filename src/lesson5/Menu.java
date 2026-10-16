package lesson5;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("spravka po operatoru\n");
            System.out.println("1.if");
            System.out.println("2.switch");
            System.out.println("3.while");
            System.out.println("4.do-while");
            System.out.println("5.for\n");
            System.out.println("vibirite nujni variant");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println();
        switch (choice) {
            case '1':
                System.out.println("if\n");
                System.out.println("if(uslovie)operator");
                System.out.println("else operator");
                break;
            case '2':
                System.out.println("switch\n");
                System.out.println("switch(virajenie)");
                System.out.println("case konstanta");
                System.out.println("posledovatel operatorov");
                System.out.println("break");
                System.out.println("// . . . ");
                break;
            case '3':
                System.out.println("while\n");
                System.out.println("while(uslovie)operator");
                break;
            case '4':
                System.out.println("do-while\n");
                System.out.println("do{");
                System.out.println("operatorov");
                System.out.println("}while(uslovie)");
                break;
            case '5':
                System.out.println("for\n");
                System.out.println("for(inicializacia; uslovie;iteraciya)");
                System.out.println("operator");
                break;
        }


    }
}

