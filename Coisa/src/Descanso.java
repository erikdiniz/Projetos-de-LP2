public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public Descanso(){
        this.horasDescanso = 0;
        this.numeroSemanas = 1;
    }

    public void defineHorasDescanso(int valor){
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor){
        this.numeroSemanas = valor;
    }

    public String getStatusGeral(){
        if (horasDescanso / numeroSemanas < 26){
            return "cansado";
        } else {
            return "descansado";
        }
    }
}
