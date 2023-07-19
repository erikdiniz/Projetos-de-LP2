import java.util.Arrays;

public class Disciplina {
    private String nome;
    private double[] notas = new double[4];
    private int horasEstudo;
    private double media;

    public Disciplina(String nome){
        this.nome = nome;
        this.horasEstudo = 0;
        this.media = 0;
    }

    public void cadastraHoras(int horas){
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }

    public boolean aprovado(){
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        this.media = soma/4;

        if (media < 7){
            return false;
        } else {
            return true;
        }
    }

    public String toString(){
        return nome + " " + horasEstudo + " " + media + " " + Arrays.toString(notas);
    }
}
