package school.sptech;

public class Produto {

    private Integer id;
    private String nome;
    private String categoria;
    private Integer quantidade;
    private Double precoUnitario;

    public Produto() {
    }

    public Produto(Integer id, String nome, String categoria, Integer quantidade,
          Double precoUnitario) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Double getValorTotal() {
        return quantidade * precoUnitario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" +
              "id=" + id +
              ", nome='" + nome + '\'' +
              ", categoria='" + categoria + '\'' +
              ", quantidade=" + quantidade +
              ", precoUnitario=" + precoUnitario +
              '}';
    }
}
