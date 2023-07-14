package model;

public class Modelo {
    private int v1=0;
    private int v2=0;
    private int v3,v4,v5,v6,v7,v8;
    private int total = 0;
    private int resta = 0;
    private int multiplicar = 0;
    private int dividir = 0;
    public Modelo() {
        
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }

    public int getV4() {
        return v4;
    }

    public void setV4(int v4) {
        this.v4 = v4;
    }

    public int getV5() {
        return v5;
    }

    public void setV5(int v5) {
        this.v5 = v5;
    }

    public int getV6() {
        return v6;
    }

    public void setV6(int v6) {
        this.v6 = v6;
    }

    public int getV7() {
        return v7;
    }

    public void setV7(int v7) {
        this.v7 = v7;
    }

    public int getV8() {
        return v8;
    }

    public void setV8(int v8) {
        this.v8 = v8;
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }      

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(int multiplicar) {
        this.multiplicar = multiplicar;
    }

    public int getDividir() {
        return dividir;
    }

    public void setDividir(int dividir) {
        this.dividir = dividir;
    }
    
    
    
    public void sumar(){
        this.total= this.v1+this.v2;
    }
    
    public void restar(){
        this.resta= this.v3-this.v4;
    }
    public void multiplicar(){
        this.multiplicar= this.v5*this.v6;
    }
    public void dividir(){
        this.dividir= this.v7/this.v8;
    }
    
}
