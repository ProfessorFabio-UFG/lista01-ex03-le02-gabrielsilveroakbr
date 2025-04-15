public class Morador {
    private static int proximoCodigo = 1; // atributo estático para gerar códigos sequenciais
    private String nome;
    private String cpf;
    private String celular;
    private String dt_nascimento;
    private String sexo;
    private String bloco;
    private int ap;
    private int cod_acesso;
    private int codigo_sequencial;

    public Morador(String nome, String cpf, String celular, String dt_nascimento, String sexo, String bloco, int ap, int cod_acesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dt_nascimento = dt_nascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.ap = ap;
        this.cod_acesso = cod_acesso;
        this.codigo_sequencial = proximoCodigo++; // atribui e incrementa para o próximo
    }

    public int getCodigo_sequencial() {
        return codigo_sequencial;
    }

    // Resto dos getters e setters...

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCod_acesso() {
        return cod_acesso;
    }

    public void setCod_acesso(int cod_acesso) {
        this.cod_acesso = cod_acesso;
    }
// é basicamente o mesmo codigo da 2 porém adicionei o cógigo sequencial no toString e na classe moradores. Poupou tempo reescrevendo tudo
    @Override
    public String toString() {
        return "Morador{" +
                "Código Sequencial=" + codigo_sequencial +
                ", Nome='" + nome + '\'' +
                ", CPF='" + cpf + '\'' +
                ", Apartamento=" + ap +
                ", Bloco=" + bloco +
                ", Celular='" + celular + '\'' +
                ", Código Sequencial:" + codigo_sequencial +
                '}';
    }
}
