package de.egosanto.chemie.utils;


import java.sql.Connection;

/**
 * Die Enumeration `Element` repräsentiert die chemischen Elemente des Periodensystems.
 * Jedes Element wird durch eine Sammlung von Attributen charakterisiert, um dessen
 * spezifische Eigenschaften und Charakteristika zu beschreiben:
 *
 * - `ordnungsZahl`: Gibt die Position des Elements im Periodensystem an.
 * - `istRadioaktiv`: Zeigt an, ob das Element radioaktiv ist oder nicht.
 * - `symbol`: Das chemische Symbol des Elements (z.B. "H" für Wasserstoff).
 * - `elementName`: Der vollständige deutsche Name des Elements.
 * - `atomGewicht`: Beschreibt die Masse eines Atoms des betreffenden Elements.
 * - `elektronenKonfiguration`: Repräsentiert die Elektronenkonfiguration des Elements.
 * - `elektronegativität`: Misst die Fähigkeit eines Atoms, in einer chemischen Bindung Elektronen anzuziehen.
 * - `istNatürlichesElement`: Zeigt an, ob das Element natürlich vorkommt oder künstlich erzeugt wurde.
 * - `aggregatZustand`: Gibt den Aggregatzustand des Elements bei Raumtemperatur an (z.B. fest, flüssig, GASförmig).
 * - `elementGruppe`: Die spezifische Gruppe oder Familie im Periodensystem, zu der das Element gehört.
 *
 * Diese Enumeration dient als robuste Grundlage für jegliche chemische oder wissenschaftliche Anwendungen in Java.
 *
 * @author Toni Zeidler
 * @date 2023-09-04
 * @version 1.0
 */
public enum Element {

    H  (1, false, "H", "Wasserstoff", 1.0079, new int[] {1}, 2.1, true, AgregatZustand.GAS, ElementGruppe.ALKALIMETALLE),
    He (2, false, "He", "Helium", 4.0026, new int[] {2}, 0.0, true, AgregatZustand.GAS, ElementGruppe.HALOGENE),

    Li (3, false, "Li", "Lithium", 6.941, new int[] {2,1}, 1.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Be (4, false, "Be", "Beryllium", 9.0122, new int[] {2,2}, 1.5, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    B  (5, false, "B", "Bor", 10.811, new int[] {2,3}, 2.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.BORGRUPPE),
    C  (6, false, "C", "Kohlenstoff", 12.011, new int[] {2,4}, 2.5, true, AgregatZustand.FESTSTOFF, ElementGruppe.KOHLENSTOFFE),
    N  (7, false, "N", "Stickstoff", 14.007, new int[] {2,5}, 3.0, true, AgregatZustand.GAS, ElementGruppe.ACTINIDE),
    O  (8, false, "O", "Sauerstoff", 15.999, new int[] {2,6}, 3.5, true, AgregatZustand.GAS, ElementGruppe.BORGRUPPE),
    F  (9, false, "F", "Fluor", 18.988, new int[] {2,7}, 4.0, true, AgregatZustand.GAS, ElementGruppe.HALOGENE),
    Ne (10, false, "Ne", "Neon", 20.180, new int[] {2,8}, 0.0, true, AgregatZustand.GAS, ElementGruppe.EDELGASE),

    Na (11, false, "Na", "Natrium", 22.99, new int[] {2,8,1}, 0.9, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Mg (12, false, "Mg", "Magnesium", 24.305, new int[] {2,8,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Al (13, false, "Al", "Aluminium", 26.982, new int[] {2,8,3}, 1.5, true, AgregatZustand.FESTSTOFF, ElementGruppe.HALBMETALLE),
    Si (14, false, "Si", "Silicium", 28.086, new int[] {2,8,4}, 1.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.HALBMETALLE),
    P  (15, false, "P", "Phosphor", 30.974, new int[] {2,8,5}, 2.1, true, AgregatZustand.FESTSTOFF, ElementGruppe.NICHTMETALLE),
    S  (16, false, "S", "Schwefel", 32.065, new int[] {2,8,6}, 2.5, true, AgregatZustand.FESTSTOFF, ElementGruppe.NICHTMETALLE),
    Cl (17, false, "Cl", "Chlor", 35.453, new int[] {2,8,7}, 3.0, true, AgregatZustand.GAS, ElementGruppe.NICHTMETALLE),
    Ar (18, false, "Ar", "Argon", 39.948, new int[] {2,8,8}, 0.0, true, AgregatZustand.GAS, ElementGruppe.EDELGASE),

    K  (19, false, "K", "Kalium", 39.0983, new int[] {2,8,8,1}, 0.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ca (20, false, "Ca", "Calcium", 40.078, new int[] {2,8,8,2}, 1.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Sc (21, false, "Sc", "Scandium", 44.956, new int[] {2,8,9,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.LANTHANOIDE),
    Ti (22, false, "Ti", "Titan", 47.867, new int[] {2,8,10,2}, 1.5, true, AgregatZustand.FESTSTOFF, ElementGruppe.LANTHANOIDE),
    V  (23, false, "V", "Vanadium", 50.942, new int[] {2,8,11,2}, 1.6, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Cr (24, false, "Cr", "Chrom", 51.996, new int[] {2,8,13,1}, 1.6, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Mn (25, false, "Mn", "Mangan", 54.938, new int[] {2,8,13,2}, 1.5, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Fe (26, false, "Fe", "Eisen", 55.845, new int[] {2,8,14,2}, 1.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Co (27, false, "Co", "Cobalt", 58.933, new int[] {2,8,15,2}, 1.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ni (28, false, "Ni", "Nickel", 58.693, new int[] {2,8,16,2}, 1.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Cu (29, false, "Cu", "Kupfer", 63.546, new int[] {2,8,18,1}, 1.9, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Zn (30, false, "Zn", "Zink", 65.38, new int[] {2,8,18,2}, 1.6, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ga (31, false, "Ga", "Gallium", 69.723, new int[] {2,8,18,3}, 1.6, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ge (32, false, "Ge", "Germanium", 72.64, new int[] {2,8,18,4}, 1.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    As (33, false, "As", "Arsen", 74.922, new int[] {2,8,18,5}, 2.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Se (34, false, "Se", "Selen", 78.96, new int[] {2,8,18,6}, 2.4, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Br (35, false, "Br", "Brom", 79.904, new int[] {2,8,18,7}, 2.8, true, AgregatZustand.FLUESSIGKEIT, ElementGruppe.ALKALIMETALLE),
    Kr (36, false, "Kr", "Krypton", 83.798, new int[] {2,8,18,8}, 0.0, true, AgregatZustand.GAS, ElementGruppe.ALKALIMETALLE),

    Rb (37, false, "Rb", "Rubidium", 85.468, new int[] {2,8,18,8,1}, 0.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Sr (38, false, "Sr", "Strontium", 87.62, new int[] {2,8,18,8,2}, 1.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Y  (39, false, "Y", "Yttrium", 88.906, new int[] {2,8,18,9,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Zr (40, false, "Zr", "Rubidium", 91.224, new int[] {2,8,18,10,2}, 1.4, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Nb (41, false, "Nb", "Niob", 92.906, new int[] {2,8,18,12,1}, 1.6, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Mo (42, false, "Mo", "Molybdän", 95.96, new int[] {2,8,18,13,1}, 1.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Tc (43, true, "Tc", "Technetium", 98.91, new int[] {2,8,18,13,2}, 1.9, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ru (44, false, "Ru", "Ruthenium", 101.07, new int[] {2,8,18,15,1}, 2.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Rh (45, false, "Rh", "Rhodium", 102.91, new int[] {2,8,18,16,1}, 2.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Pd (46, false, "Pd", "Palladium", 106.42, new int[] {2,8,18,18}, 2.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ag (47, false, "Ag", "Silber", 107.87, new int[] {2,8,18,18,1}, 1.9, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Cd (48, false, "Cd", "Cadmium", 112.41, new int[] {2,8,18,18,2}, 1.7, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    In (49, false, "In", "Indium", 114.82, new int[] {2,8,18,18,3}, 1.7, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Sn (50, false, "Sn", "Zinn", 118.71, new int[] {2,8,18,18,4}, 1.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Sb (51, false, "Sb", "Antimon", 121.76, new int[] {2,8,18,18,5}, 1.9, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Te (52, false, "Te", "Tellur", 127.6, new int[] {2,8,18,18,6}, 2.1, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    I  (53, false, "I", "Iod", 126.9, new int[] {2,8,18,18,7}, 2.5, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Xe (54, false, "Xe", "Xenon", 131.29, new int[] {2,8,18,18,8}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),

    Cs (55, false, "Cs", "Cäsium", 132.91, new int[] {2,8,18,18,8,1}, 0.7, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ba (56, false, "Ba", "Barium", 137.33, new int[] {2,8,18,18,8,2}, 0.9, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    La (57, false, "La", "Lanthan", 138.91, new int[] {2,8,18,18,9,2}, 1.1, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ce (58, false, "Ce", "Cer", 140.12, new int[] {2,8,18,19,9,2}, 1.1, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Pr (59, false, "Pr", "Praseodym", 140.91, new int[] {2,8,18,21,8,2}, 1.1, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Nd (60, false, "Nd", "Neodym", 144.24, new int[] {2,8,18,22,8,2}, 1.1, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Pm (61, true, "Pm", "Promethium", 146.90, new int[] {2,8,18,23,8,2}, 1.1, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Sm (62, false, "Sm", "Samarium", 150.36, new int[] {2,8,18,24,8,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Eu (63, false, "Eu", "Europium", 151.96, new int[] {2,8,18,25,8,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Gd (64, false, "Gd", "Gadolinium", 157.25, new int[] {2,8,18,25,9,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Tb (65, false, "Tb", "Terbium", 158.93, new int[] {2,8,18,27,8,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Dy (66, false, "Dy", "Dysprosium", 162.50, new int[] {2,8,18,28,8,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ho (67, false, "Ho", "Holmium", 164.93, new int[] {2,8,18,29,8,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Er (68, false, "Er", "Erbium", 167.26, new int[] {2,8,18,30,8,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Tm (69, false, "Tm", "Thulium", 168.93, new int[] {2,8,18,31,8,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Yb (70, false, "Yb", "Ytterbium", 173.05, new int[] {2,8,18,32,8,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Lu (71, false, "Lu", "Luthetium", 174.97, new int[] {2,8,18,32,9,2}, 1.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Hf (72, false, "Hf", "Hafnium", 178.49, new int[] {2,8,18,32,10,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ta (73, false, "Ta", "Tantal", 180.95, new int[] {2,8,18,32,11,2}, 1.5, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    W  (74, false, "W", "Wolfram", 183.84, new int[] {2,8,18,32,12,2}, 1.7, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Re (75, false, "Re", "Rhenium", 186.21, new int[] {2,8,18,32,13,2}, 1.9, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Os (76, false, "Os", "Osmium", 190.23, new int[] {2,8,18,32,14,2}, 2.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ir (77, false, "Ir", "Iridium", 192.22, new int[] {2,8,18,32,15,2}, 2.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Pt (78, false, "Pt", "Platin", 195.08, new int[] {2,8,18,32,17,1}, 2.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Au (79, false, "Au", "Gold", 196.97, new int[] {2,8,18,32,18,1}, 2.4, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Hg (80, false, "Hg", "Quecksilber", 200.59, new int[] {2,8,18,32,18,2}, 1.9, true, AgregatZustand.FLUESSIGKEIT, ElementGruppe.ALKALIMETALLE),
    Tl (81, false, "Tl", "Thallium", 204.38, new int[] {2,8,18,32,18,3}, 1.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Pb (82, false, "Pb", "Blei", 207.2, new int[] {2,8,18,32,18,4}, 1.8, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Bi (83, true, "Bi", "Bismut", 208.98, new int[] {2,8,18,32,18,5}, 1.9, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Po (84, true, "Po", "Polonium", 209.98, new int[] {2,8,18,32,18,6}, 2.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    At (85, true, "At", "Astat", 210.0, new int[] {2,8,18,32,18,7}, 2.2, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Rn (86, true, "Rn", "Radon", 222.0, new int[] {2,8,18,32,18,8}, 0.0, true, AgregatZustand.GAS, ElementGruppe.ALKALIMETALLE),

    Fr (87, true, "Fr", "Francium", 223.0, new int[] {2,8,18,32,18,8,1}, 0.7, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ra (88, true, "Ra", "Radium", 226.03, new int[] {2,8,18,32,18,8,2}, 0.9, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ac (89, true, "Ac", "Actinium", 227.0, new int[] {2,8,18,32,18,9,2}, 1.1, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Th (90, true, "Th", "Thorium", 232.04, new int[] {2,8,18,32,18,10,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Pa (91, true, "Pa", "Protaktinium", 231.04, new int[] {2,8,18,32,20,9,2}, 1.5, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    U  (92, true, "U", "Uran", 238.0, new int[] {2,8,18,32,21,9,2}, 1.4, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Np (93, true, "Np", "Neptunium", 237.05, new int[] {2,8,18,32,22,9,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Pu (94, true, "Pu", "Plutonium", 244.10, new int[] {2,8,18,32,24,8,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Am (95, true, "Am", "Americium", 243.10, new int[] {2,8,18,32,25,8,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Cm (96, true, "Cm", "Curium", 247.10, new int[] {2,8,18,32,25,9,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Bk (97, true, "Bk", "Berkelium", 247.10, new int[] {2,8,18,32,25,10,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Cf (98, true, "Cf", "Californium", 251.10, new int[] {2,8,18,32,28,8,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Es (99, true, "Es", "Einsteinium", 254.10, new int[] {2,8,18,32,29,8,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Fm (100, true, "Fm", "Fermium", 257.10, new int[] {2,8,18,32,30,8,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Md (101, true, "Md", "Mendelevium", 258.0, new int[] {2,8,18,32,31,8,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    No (102, true, "No", "Nobelium", 259.0, new int[] {2,8,18,32,32,8,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Lr (103, true, "Lr", "Lawrencium", 260.0, new int[] {2,8,18,32,32,9,2}, 1.3, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Rf (104, true, "Rf", "Rutherfordium", 261.0, new int[] {2,8,18,32,32,10,2}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Db (105, true, "Db", "Dubnium", 262.0, new int[] {2,8,18,32,32,11,2}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Sg (106, true, "Sg", "Seaborgium", 263.0, new int[] {2,8,18,32,32,12,2}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Bh (107, true, "Bh", "Bohrium", 262.0, new int[] {2,8,18,32,32,13,2}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Hs (108, true, "Hs", "Hassium", 265.0, new int[] {2,8,18,32,32,14,2}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Mt (109, true, "Mt", "Meitnerium", 266.0, new int[] {2,8,18,32,32,15,2}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ds (110, true, "Ds", "Darmstadtium", 269.0, new int[] {2,8,18,32,32,17,1}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Rg (111, true, "Rg", "Röntgenium", 272.0, new int[] {2,8,18,32,32,18,1}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Cn (112, true, "Cn", "Copernicium", 277.0, new int[] {2,8,18,32,32,18,2}, 0.0, true, AgregatZustand.FLUESSIGKEIT, ElementGruppe.ALKALIMETALLE),
    Nh (113, true, "Nh", "Nihonium", 287.0, new int[] {2,8,18,32,32,18,3}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Fl (114, true, "Fl", "Flerovium", 289.0, new int[] {2,8,18,32,32,18,4}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Mc (115, true, "Mc", "Moscovium", 288.0, new int[] {2,8,18,32,32,18,5}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Lv (116, true, "Lv", "Livermorium", 289.0, new int[] {2,8,18,32,32,18,6}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Ts (117, true, "Ts", "Tennessiene", 293.0, new int[] {2,8,18,32,32,18,7}, 0.0, true, AgregatZustand.FESTSTOFF, ElementGruppe.ALKALIMETALLE),
    Og (118, true, "Og", "Oganesson", 294.0, new int[] {2,8,18,32,32,18,8}, 0.0, true, AgregatZustand.GAS, ElementGruppe.ALKALIMETALLE);


    private final int ordnungsZahl;
    private final boolean istRadioaktiv;
    private final String symbol;
    private final String elementName;
    private final double atomGewicht;
    private final int[] elektronenKonfiguration;
    private final double elektronegativität;
    private final boolean istNatürlichesElement;
    private final AgregatZustand aggregatZustand;
    private final ElementGruppe elementGruppe;


    Element (
            int ordnungsZahl,
            boolean istRadioaktiv,
            String symbol,
            String elementName,
            double atomGewicht,
            int[] elektronenKonfiguration,
            double elektronegativität,
            boolean istNatürlichesElement,
            AgregatZustand aggregatZustand,
            ElementGruppe elementGruppe
    ){

        this.ordnungsZahl = ordnungsZahl;
        this.istRadioaktiv = istRadioaktiv;
        this.symbol = symbol;
        this.elementName = elementName;
        this.atomGewicht = atomGewicht;

		/*
		// Test ob OrdnungsZahl und Anzahl Elektronen gleich sind
		int zaehler =0;
		for (int i = 0; i < elektronenKonfiguration.length; i++) {
			zaehler += elektronenKonfiguration[i];
		}
		if(this.ordnungsZahl == zaehler) System.out.println("OK"); else System.out.println(this.ordnungsZahl+" Nit OK! "+ zaehler);
		*/

        this.elektronenKonfiguration = elektronenKonfiguration;
        this.elektronegativität = elektronegativität;
        this.istNatürlichesElement = istNatürlichesElement;
        this.aggregatZustand = aggregatZustand;
        this.elementGruppe = elementGruppe;
    }

    public int ordnungsZahl(){ return ordnungsZahl; }
    public boolean istRadioaktiv(){ return istRadioaktiv; }
    public String symbol(){ return symbol; }
    public String elementName(){ return elementName; }
    public double atomGewicht(){ return atomGewicht; }
    public int[] elektronenKonfiguration(){ return elektronenKonfiguration; }
    public double elektronegativität(){ return elektronegativität;}
    public boolean istNatürlichesElement(){ return istNatürlichesElement; }
    public AgregatZustand aggregatZustand(){ return aggregatZustand; }
    public ElementGruppe elementGruppe(){ return elementGruppe; }

    /**TODO
     * SQLite Table "element"
     * 	element={
     * 		ordnungs_zahl 	INTEGER(3) NOT NULL,
     * 		symbol 			VARCHAR(3) PRIMARY_KEY NOT NULL,
     * 		ist_radioaktiv 	BOOLEAN NOT NULL,
     * 		element_name 	VARCHAR(20) NOT NULL,
     * 		.....
     *
     * }
     *
     * @param conn
     */
    public void insertIntoSQLiteDB(Connection conn){
        String createStmt = "IF NOT EXIST CREATE TABLE element ("
                + "ordnungs_zahl 	INTEGER(3) NOT NULL, "
                + "symbol 			VARCHAR(3) PRIMARY_KEY NOT NULL, "
                + "ist_radioaktiv 	BOOLEAN NOT NULL, "
                + "element_name 		VARCHAR(20) NOT NULL,"
                + "atom_gewicht		DECIMAL(3.4) NOT NULL,"
                + "electronen_konf	VARCHAR(20) NOT NULL,"
                + "negativitaet		DECIMAL(1.1) ,"
                + "ist_natuerlich	BOOLEAN NOT NULL,"
                + "agregat_zustand	VARCHAR(20) NOT NULL,"
                + "gruppe			VARCHAR(20) NOT NULL);";

        String insertStmt = "INSERT INTO element";
    }


}