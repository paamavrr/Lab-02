
package labb02;


public class Cliente {
    private String nombre;
    private Plan plan;
    private int cantM;
    

    public Cliente(String nombre, Plan plan, int cantM) {
        this.nombre = nombre;
        this.plan = plan;
        this.cantM = cantM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public int getCantM() {
        return cantM;
    }

    public void setCantM(int cantM) {
        this.cantM = cantM;
    }
    
    public int Calculo(){
        int valorTotal =plan.getCosto()+(plan.getVm()*this.getCantM());
        return valorTotal;
    }
        
    }
        