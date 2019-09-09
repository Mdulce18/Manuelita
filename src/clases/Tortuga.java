package clases;

public class Tortuga {

    private double energia;
    private Lugar lugar;

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public double calculoGastoEnergia(double metros) {
        return metros / 2;
    }

    public double getEnergia() {
        return energia;
    }

    public void caminar(double metros) {
        this.energia = this.energia - calculoGastoEnergia(metros);
    }

    public double calculoAumentoEnergia(double gramos) {
        return gramos*2;
    }

    public void comer(double gramos) {
        this.energia = this.energia + calculoAumentoEnergia(gramos);
    }

    public double vacacionar (){
        return lugar.calculoVacacion(this.energia);
    }
}
