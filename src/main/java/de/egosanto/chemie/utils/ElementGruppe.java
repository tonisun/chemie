package de.egosanto.chemie.utils;

/**
 * Enumeration zur Darstellung der verschiedenen Gruppen im Periodensystem der Elemente.
 * Jede Gruppe wird durch ihre Gruppennummer repräsentiert, welche im Periodensystem zur
 * Klassifizierung verwendet wird.
 *
 * @author Toni Zeidler
 * @date 2023-09-04
 * @version 1.1
 */
public enum ElementGruppe {
    ALKALIMETALLE(1),
    ERDALKALIMETALLE(2),
    HALBMETALLE(3),
    LANTHANOIDE(5),
    NICHTMETALLE(6),
    ACTINIDE(4),
    BORGRUPPE(13),
    KOHLENSTOFFE(14),
    PNICOGENE(15),
    CHALKOGENE(16),
    HALOGENE(17),
    EDELGASE(18);

    private final int gruppenNummer;

    ElementGruppe(int gruppenNummer) {
        this.gruppenNummer = gruppenNummer;
    }

    /**
     * Gibt die Gruppennummer des Elements zurück.
     *
     * @return Die Gruppennummer des Elements.
     */
    public int getGruppenNummer() {
        return gruppenNummer;
    }
}
