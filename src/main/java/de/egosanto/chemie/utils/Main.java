package de.egosanto.chemie.utils;

import de.egosanto.chemie.utils.Element;

public class Main {
    public static void main(String[] args) {
        // --- Ein Element
        final Element ELEMENT = Element.Ac;

        System.out.println("\t" + ELEMENT.toString() + " - " + ELEMENT.elementName());
        System.out.println("=================================");

        System.out.println("OrdnungsZahl:\t" + ELEMENT.ordnungsZahl());
        System.out.println("Symbol:\t\t" + ELEMENT.symbol());

        System.out.println("Name:\t\t" + ELEMENT.elementName());
        System.out.println("Atom Gewicht:\t" + ELEMENT.atomGewicht());

        System.out.print("Elektron Konf:\t");
        for (int i = 0; i < ELEMENT.elektronenKonfiguration().length; i++) {
            System.out.print(ELEMENT.elektronenKonfiguration()[i] + " ");
        }
        System.out.println();

        System.out.println("Negativität:\t" + ELEMENT.elektronegativität());
        String jain = ELEMENT.istRadioaktiv() ? "Ja" : "Nein";
        System.out.println("Ist Radioaktiv: " + jain);
        jain = ELEMENT.istNatürlichesElement() ? "Ja" : "Nein";
        System.out.println("Ist natürlich:\t" + jain);
        System.out.println("Agregat Zustand:\t" + ELEMENT.aggregatZustand());
        System.out.println("Gruppe:\t\t" + ELEMENT.elementGruppe());

        // Schleife über alle Werte in Elemente
        for (Element e : Element.values()) {
            System.out.println("=================================");

            System.out.println("OrdnungsZahl:\t" + e.ordnungsZahl());
            System.out.println("Symbol:\t\t" + e.symbol());

            System.out.println("Name:\t\t" + e.elementName());
            System.out.println("Atom Gewicht:\t" + e.atomGewicht());

            System.out.print("Elektron Konf:\t");
            for (int i = 0; i < e.elektronenKonfiguration().length; i++) {
                System.out.print(e.elektronenKonfiguration()[i] + " ");
            }
            System.out.println();

            System.out.println("Negativität:\t" + e.elektronegativität());
            jain = e.istRadioaktiv() ? "Ja" : "Nein";
            System.out.println("Ist Radioaktiv: " + jain);
            jain = e.istNatürlichesElement() ? "Ja" : "Nein";
            System.out.println("Ist natürlich:\t" + jain);
            System.out.println("Agregat Zustand:\t" + e.aggregatZustand());
            System.out.println("Gruppe:\t\t" + e.elementGruppe());

        }
    }
}