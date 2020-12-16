/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

/**
 *
 * @author tiavr
 */
public class Acte {
    private Code code;
    private int coeff;
    
    public Acte(Code code, int coeff){
        this.code = code;
        this.coeff = coeff;
    }

    public double cout(){
        return code.calculerCout(coeff);
    }
    @Override
    public String toString() {
        return "    > " + code.toString() + ", coefficient : " + coeff;
    }
    

    /**
     * @return the code
     */
    public Code getCode() {
        return code;
    }
}
