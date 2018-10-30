package com.kgisl.cakeshop.model;

public class Cake {
    private int id;
    private double sugar; // cup
    private double butter; // cup
    private int eggs;
    private int vanila; // spoon
    private double flour; // cup
    private double bakingpowder; // spoon
    private double milk; // cup
    private int cherry;

    public Cake() {
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the sugar
     */
    public double getSugar() {
        return sugar;
    }

    /**
     * @param sugar the sugar to set
     */
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    /**
     * @return the butter
     */
    public double getButter() {
        return butter;
    }

    /**
     * @param butter the butter to set
     */
    public void setButter(double butter) {
        this.butter = butter;
    }

    /**
     * @return the vanila
     */
    public int getVanila() {
        return vanila;
    }

    /**
     * @param vanila the vanila to set
     */
    public void setVanila(int vanila) {
        this.vanila = vanila;
    }

    /**
     * @return the eggs
     */
    public int getEggs() {
        return eggs;
    }

    /**
     * @param eggs the eggs to set
     */
    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    /**
     * @return the bakingpowder
     */
    public double getBakingpowder() {
        return bakingpowder;
    }

    /**
     * @param bakingpowder the bakingpowder to set
     */
    public void setBakingpowder(double bakingpowder) {
        this.bakingpowder = bakingpowder;
    }

    /**
     * @return the cherry
     */
    public int getCherry() {
        return cherry;
    }

    /**
     * @param cherry the cherry to set
     */
    public void setCherry(int cherry) {
        this.cherry = cherry;
    }

    /**
     * @return the flour
     */
    public double getFlour() {
        return flour;
    }

    /**
     * @param flour the flour to set
     */
    public void setFlour(double flour) {
        this.flour = flour;
    }

    /**
     * @return the milk
     */
    public double getMilk() {
        return milk;
    }

    /**
     * @param milk the milk to set
     */
    public void setMilk(double milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour="
                + flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", cherry=" + cherry + '}';

    }

    // public String printCake() {
    //     return "Cake{" + "sugar=" + getSugar() + ", butter=" + getCherry() + ", eggs=" + eggs + ", vanila=" + vanila
    //             + ", flour=" + flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", cherry=" + cherry + '}';
    // }
}