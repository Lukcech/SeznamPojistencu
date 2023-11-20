import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evidence {

    //třída reprezentuje konkrétní funkce evidence

    Scanner scanner = new Scanner(System.in);
    List<Pojisteny> seznamPojistencu = new ArrayList<>();  // kolekce pojištěnců


    /** přidá nového pojištěnce do kolekce
     * @param jméno
     * @param příjmení
     * @param telefonní číslo
     * @return nový pojištěnec
     */

    public void pridej(){
        System.out.println("Zadej jméno pojištěnce:");
        String jmeno = scanner.nextLine().trim();


        System.out.println("Zadej příjmení pojištěnce:");
        String prijmeni = scanner.nextLine().trim();

        System.out.println("Zadej věk pojištěnce: ");
        int vek = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Zadej telefonní číslo:");
        String telefon = scanner.nextLine().trim();

        Pojisteny novyPojisteny = new Pojisteny(jmeno, prijmeni, vek, telefon);
        seznamPojistencu.add(novyPojisteny);
    }

    /** vypíše kolekci pojištěnců
     * @return kolekce seznamPojištěncu
     */
    public void vypis(){
        System.out.println("Seznam evidovaných pojištěnců:");
        for (Pojisteny pojisteny : seznamPojistencu) {
            System.out.println(pojisteny.getJmeno() + " " + pojisteny.getPrijmeni() + ", " + pojisteny.getVek() + "," + " tel. " + pojisteny.getTelefon());
        }
    }


    /** projde kolekci a vyhledá konkrétního pojištěnce
     * @param jméno
     * @param příjmení
     * @return pojištěný
     */
    public void vyhledat() {
        System.out.println("Zadej jméno pro vyhledání: ");
        String hledaneJmeno = scanner.nextLine().trim();
        System.out.println("Zadej příjmení pro vyhledání: ");
        String hledanePrijmeni = scanner.nextLine().trim();
        boolean nalezeno = false;

        for (Pojisteny pojisteny : seznamPojistencu) {
            if (pojisteny.getJmeno().equalsIgnoreCase(hledaneJmeno) && pojisteny.getPrijmeni().equalsIgnoreCase(hledanePrijmeni)) {
                System.out.println("Výsledek vyhledávání: " + pojisteny.getJmeno() + " " + pojisteny.getPrijmeni() + ", " + pojisteny.getVek() + ", tel. " + pojisteny.getTelefon());
                nalezeno = true;
                break;
            }
        }

        //výpis v případě nenalezeného uživatele

        if(!nalezeno){
            System.out.println("Pojištěný nenalezen.");
        }
    }
}
