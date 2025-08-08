public class Convierte {

    private double tasaA;
    private double tasaB;
    private double monto;

    public Convierte(double tasaA, double tasaB, double monto) {
        this.tasaA = tasaA;
        this.tasaB = tasaB;
        this.monto = monto;
    }
    public double convertir(Convierte convierte){
        return this.tasaB*this.monto;
    }

    public double getTasaA() {
        return tasaA;
    }

    public void setTasaA(double tasaA) {
        this.tasaA = tasaA;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTasaB() {
        return tasaB;
    }

    public void setTasaB(double tasaB) {
        this.tasaB = tasaB;
    }
}
