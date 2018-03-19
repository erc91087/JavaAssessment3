package parsing_json;

import java.util.ArrayList;

public class Element {

    private String name;
    private String appearance;
    private double atomic_mass;
    private double boil;
    private String category;
    private String color;
    private double density;
    private String discovered_by;
    private double melt;
    private double molar_heat;
    private String named_by;
    private int number;
    private int period;
    private String phase;
    private String source;
    private String spectral_img;
    private String symbol;
    private int xpos;
    private int ypos;
    private ArrayList<Integer> shells;
    private String summary;


    public Element(String hydrogen, String colorless_gas, double v, double v1, String diatomic_nonmetal, String colorless, double v2, String henry_cavendish, double v3, double v4, String antoine_lavoisier, int i, int i1, String gas, String s, String s1, String s2, String h, int i2, int i3, ArrayList<Integer> integers) {
        name = hydrogen;
        appearance = colorless_gas;
        atomic_mass = v;
        boil = v1;
        category = diatomic_nonmetal;
        color = colorless;
        density = v2;
        discovered_by = henry_cavendish;
        melt = v3;
        molar_heat = v4;
        named_by = antoine_lavoisier;
        number = i;
        period = i1;
        phase = gas;
        source = s;
        spectral_img = s1;
        symbol = h;
        xpos = i2;
        ypos = i3;
        shells = integers;
        summary = s2;



    }

    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public double getAtomic_mass() {
        return atomic_mass;
    }

    public double getBoil() {
        return boil;
    }

    public String getCategory() {
        return category;

    }

    public String getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public double getMelt() {
        return melt;
    }

    public double getMolar_heat() {
        return molar_heat;
    }

    public String getNamed_by() {
        return named_by;
    }

    public int getNumber() {
        return number;
    }

    public int getPeriod() {
        return period;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public ArrayList<Integer> getShells() {
        return shells;
    }

    public String getSummary() {
        return summary;
    }
}