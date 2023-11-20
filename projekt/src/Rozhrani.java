public class Rozhrani {

    //třída reprezentuje uživatelské rozhraní

    /** nastavi podobu úvodního nadpisu programu
     * @return nadpis a podržení
     */
    public String uvodnik () {
        return String.format("---------------------%n"+"Evidence pojištěnců%n"+"---------------------%n");
    }

    /** vytvoří hlavní menu programu
     * @return uživatelská navigace
     */
    public String hlavniMenu () {
        return String.format("Zvolte jednu z možností:%n"+"1 - Přidat nového pojištěnce%n"+"2 - Vypsat evidenci pojištěných%n"+"3 - Vyhledat pojištěného%n");
    }
}
