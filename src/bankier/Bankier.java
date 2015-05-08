/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankier;

/**
 *
 * @author Michał
 */
public class Bankier {

    private double income;
    private boolean hasCreditCard;
    private boolean creditApplication;

    private boolean creditCardOffer = false;
    private boolean creditOffer = false;
    private boolean creditApproval = false;

    public Bankier(double income, boolean hasCreditCard, boolean creditApplication) {
        this.income = income;
        this.hasCreditCard = hasCreditCard;
        this.creditApplication = creditApplication;

        if (!hasCreditCard && income > 5000) {
            creditCardOffer = true;
            creditOffer = true;
        }
        
        if (creditApplication && income > 5000) {
            creditApproval = true;
        }
        
        if (!creditApplication) {
            creditOffer = true;
        }
    }

    public boolean CreditCardOffer() {
        return creditCardOffer;
    }

    public boolean CreditOffer() {
        return creditOffer;
    }

    public boolean CreditApproval() {
        return creditApproval;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
