package model;

public abstract class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones=0;
    protected int numeroRetiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0f;

    //Constructor


    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    //Metodos
    public void consignar(float monto){

        this.saldo+=monto;
        numeroConsignaciones++;
    }

    public void retirar(float monto){

        if(this.saldo>=monto){
            this.saldo-=monto;
            numeroRetiros++;

        }else{
            System.out.println("El valor a retirar supera el saldo de " +saldo);
        }
    }

    public void calcularInteresMensual(){

        float interesMensual= saldo*(tasaAnual/12)/100;
        this.saldo+=interesMensual;



    }

    public void extractoMensual(){

        this.saldo-=this.comisionMensual;
        calcularInteresMensual();

    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", numeroConsignaciones=" + numeroConsignaciones +
                ", numeroRetiros=" + numeroRetiros +
                ", tasaAnual=" + tasaAnual +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}
