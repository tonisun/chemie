
import static org.junit.jupiter.api.Assertions.assertEquals;

import de.egosanto.chemie.MolecularWeightCalculator;
import de.egosanto.chemie.utils.Element;
import org.junit.jupiter.api.Test;

/**
 * MolecularWeightCalculatorTest description:
 * Date: 04.09.2023
 * Time: 13:55
 * Project Name: chemie
 *
 * @author Toni Zeidler
 * @see
 */
public class MolecularWeightCalculatorTest {
    @Test
    public void testCalculateMolecularWeight_H2O() {
        double result = MolecularWeightCalculator.calculateMolecularWeight("H2O");
        double expected = 2 * Element.H.atomGewicht() + Element.O.atomGewicht();
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testCalculateMolecularWeight_CO2() {
        double result = MolecularWeightCalculator.calculateMolecularWeight("CO2");
        double expected = Element.C.atomGewicht() + 2 * Element.O.atomGewicht();
        assertEquals(expected, result, 0.0001);
    }
}
