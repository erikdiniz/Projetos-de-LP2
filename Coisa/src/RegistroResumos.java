public class RegistroResumos {
    private Resumo[] resumos;
    private int contResumos;

    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
        this.contResumos = 0;
    }

    public void adiciona(String tema, String resumo){
        Resumo r = new Resumo(tema, resumo);

        if (contResumos + 1 > resumos.length){
            contResumos = 1;
            resumos[0] = r;
        } else {
            resumos[contResumos] = r;
            contResumos++;
        }
    }

    public String[] pegaResumos(){
        String[] r = new String[resumos.length];

        for (int i = 0; i < resumos.length; i++){
            if (resumos[i] != null) {
                r[i] = resumos[i].getResumo();
            }
        }

        return r;
    }

    private String formataTemas(Resumo[] resumos){
        String retorno = "";

        for (int i = 0; i < resumos.length; i++){
            if (resumos[i] != null) {
                retorno += resumos[i].getTema();
                retorno += " | ";
            }
        }

        return retorno.substring(0, retorno.length()-3);
    }

    public String imprimeResumos(){
        return "- " + contResumos + " resumo(s) cadastrado(s)\n"
                + "- " + formataTemas(resumos);
    }

    public int conta(){
        return contResumos;
    }

    public boolean temResumo(String tema){
        boolean existe = false;

        for (int i = 0; i < resumos.length; i++){
            if (resumos[i] != null && tema == resumos[i].getTema()){
                existe = true;
                break;
            }
        }

        return existe;
    }
}