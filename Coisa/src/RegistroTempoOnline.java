public class RegistroTempoOnline {
    private String disciplina;
    private int horasEsperadas;
    private int horasDedicadas;

    public RegistroTempoOnline(String disciplina){
        this.disciplina = disciplina;
        this.horasEsperadas = 120;
        this.horasDedicadas = 0;
    }

    public RegistroTempoOnline(String disciplina, int horas){
        this.disciplina = disciplina;
        this.horasEsperadas = horas;
        this.horasDedicadas = 0;
    }

    public void adicionaTempoOnline(int tempo){
        this.horasDedicadas += tempo;
    }

    public boolean atingiuMetaTempoOnline(){
        if (horasDedicadas < horasEsperadas){
            return false;
        } else {
            return true;
        }
    }

    public String toString(){
        return disciplina + " " + horasDedicadas + "/" + horasEsperadas;
    }
}
