class Pojisteny {

    //třída reprezentuje pojištěného

    /**
     * jméno
     */
    private String jmeno;

    /**
     * příjmení
     */
    private String prijmeni;

    /**
     * věk
     */
    private int vek;

    /**
     * telefonní číslo
     */
    private String telefon;

/**
 * Inicializuje novou instanci
 * @param jmeno jméno, příjmení, věk, telefonní číslo
 * @param vek Věk
 */

    public Pojisteny(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    /**
     * získá jméno
     * @param jméno
     * @return jméno
     */

    public String getJmeno() {
        return jmeno;
    }

    /**
     * získá příjmení
     * @param příjmení
     * @return příjmení
     */

    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * získá věk
     * @param věk
     * @return věk
     */

    public int getVek() {
        return vek;
    }

    /**
     * získá telefonní číslo
     * @param telefonní číslo
     * @return telefonní číslo
     */

    public String getTelefon() {
        return telefon;
    }
}