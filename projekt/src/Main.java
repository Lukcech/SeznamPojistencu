import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //vytvoření objektů

        Rozhrani rozhrani = new Rozhrani();
        Evidence evidence = new Evidence();
        Scanner scanner = new Scanner(System.in);

        //nastavení úvodníku programu a hlavní navigace

        System.out.println(rozhrani.uvodnik());

        //cyklus po uživalské volbě přejde zpět do hl. navigace

        String pokracovat = "ano";
        while (pokracovat.equals("ano")) {
            System.out.println(rozhrani.hlavniMenu());

            //uživatelská volba
            int volba = Integer.parseInt(scanner.nextLine().trim());

            //ošetření neplatného uživatelského vstupu

            if((volba<1) || (volba>3)){
                System.out.println("Neplatná volba");
            }

            //uživatelský vstup spustí jednu ze tří funkcí evidence

            switch (volba) {
                case 1:
                    evidence.pridej();
                    break;

                case 2:
                    evidence.vypis();

                    break;
                case 3:
                    evidence.vyhledat();

            }

            //další cyklus nebo ukončení programu

            System.out.println("Pokračovat? ano/ne");
            pokracovat = scanner.nextLine();
        }

        System.out.println("Děkujeme za použití programu");
    }
}



