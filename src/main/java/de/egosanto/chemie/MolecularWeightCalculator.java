package de.egosanto.chemie;

import de.egosanto.chemie.utils.Element;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MolecularWeightCalculator description:
 * Date: 04.09.2023
 * Time: 13:29
 * Project Name: chemie
 *
 * @author Toni Zeidler
 * @see
 */
public class MolecularWeightCalculator {

    public static double calculateMolecularWeight(String formula) {
        double totalWeight = 0;

        Pattern pattern = Pattern.compile("([A-Z][a-z]*)(\\d*)");
        Matcher matcher = pattern.matcher(formula);

        while (matcher.find()) {
            String elementSymbol = matcher.group(1);
            String number = matcher.group(2);

            int count = 1;
            if (!number.isEmpty()) {
                count = Integer.parseInt(number);
            }

            Element element = Element.valueOf(elementSymbol);
            totalWeight += element.atomGewicht() * count;
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die chemische Formel ein: ");
        String formula = scanner.nextLine();

        double weight = calculateMolecularWeight(formula);
        System.out.printf("Molekulare Masse von %s: %.4f g/mol%n", formula, weight);
    }
}
