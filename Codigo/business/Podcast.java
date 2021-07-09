import java.time.LocalDate;

public class Podcast extends ItemPlaylist{
	
    private LocalDate dataPublicacao;
    
    
    public Podcast(String titulo, int duracao, LocalDate dataPublicacao) throws ExcecaotituloInvalido,ExcecaoDuracaoInvalida {
        super(titulo, duracao);
        this.setDataPublicacao(dataPublicacao);
    }
    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    } 
   
    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
    

	@Override
	public String toString() {
		return "Podcast [dataPublicacao=" + dataPublicacao + super.toString() + "]";
	}

    
}