package com.kgisl.cakeshop;

import com.kgisl.cakeshop.model.Cake;

public class CakeBuilder {

    private Cake cake = new Cake();

   

    /**
     * @param sugar the sugar to set
     */
    public CakeBuilder sugar(double sugar) {
        cake.setSugar(sugar); 
        return this;
    }
    /**
     * @param butter the butter to set
     */
    public CakeBuilder butter(double butter) {
        cake.setButter( butter);
        return this;
    }
    /**
     * @param eggs the eggs to set
     */
    public CakeBuilder eggs(int eggs) {
        cake.setEggs(eggs);
        return this;
    }
    /**
     * @param vanila the vanila to set
     */
    public CakeBuilder vanila(int vanila) {
        cake.setVanila( vanila);
        return this;
    }
    /**
     * @param flour the flour to set
     */
    public CakeBuilder flour(double flour) {
        cake.setFlour( flour);
        return this;
    }
    /**
     * @param bakingpowder the bakingpowder to set
     */
    public CakeBuilder bakingpowder(double bakingpowder) {
        cake.setBakingpowder( bakingpowder);
        return this;
    }
    /**
     * @param cherry the cherry to set
     */
    public CakeBuilder cherry(int cherry) {
        cake.setCherry(cherry);
        return this;
    }
    /**
     * @param milk the milk to set
     */
    public CakeBuilder milk(double milk) {
        cake.setMilk(milk); 
        return this;
    }
  
    //return fully build object
    public Cake build() {
        return cake;
    }
}