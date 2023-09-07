# Chemie
![Logo](/docs/resources/logo.png)

# Molecular Weight Calculator :test_tube:

This project is a Java-based Molecular Weight Calculator that interprets and calculates the molecular weight of any given chemical formula, such as "H2O", "C6H12O6", and more.

## Features :sparkles:

- **Enum Storage for Chemical Elements:** The project stores chemical elements in Enums, which makes it easy to manage and extend in the future.
- **Formula Interpreter:** It accepts a chemical formula string (like "H2O") and intelligently parses it to compute the weight.
- **Error Handling:** Throws an `IllegalArgumentException` when it encounters an unknown element symbol or if the formula pattern does not match the expected format.
- **User Interaction:** A simple command-line interface to input the chemical formula and get the molecular weight as an output.

## How to Use :hammer_and_wrench:

1. Clone the repository to your local machine.
2. Compile the `MolecularWeightCalculator.java` file.
3. Run the program.
4. When prompted, enter your chemical formula.
5. Receive the molecular weight of the given formula in g/mol.

**Note**: Make sure that the chemical formula follows the pattern of element symbols, optionally followed by a number indicating the count of atoms for that element. If no number is provided, it is assumed the element appears once in the molecule.
