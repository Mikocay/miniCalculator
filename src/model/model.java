
package model;

public class model {
    
    private double firstValue;
    private double secondValue;
    private double anwser;

    public model() {
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getAnwser() {
        return anwser;
    }

    public void setAnwser(double anwser) {
        this.anwser = anwser;
    }
    
    public void sum() {
        this.anwser= this.firstValue +this.secondValue;
    }
    public void muni() {
        this.anwser= this.firstValue -this.secondValue;
    }
    public void mul() {
        this.anwser= this.firstValue *this.secondValue;
    }
    public void div() {
        this.anwser= this.firstValue /this.secondValue;
    }
    public void pow() {
        this.anwser= Math.pow(this.firstValue, this.secondValue);
    }
    public void mod() {
        this.anwser=this.firstValue %this.secondValue;
    }

}

