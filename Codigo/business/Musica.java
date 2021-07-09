import java.util.ArrayList;
import java.util.List;

public class Musica extends ItemPlaylist{
	List<Artista> artistas;
    
    
    
    public Musica(String titulo, double duracao) throws ExcecaotituloInvalido,ExcecaoDuracaoInvalida {
        super(titulo, duracao);
        this.artistas = new ArrayList<Artista>();
    }
    
    public void add(Artista art){
      
            this.artistas.add(art);
        
    }

	public void remove(Artista art){
     
            this.artistas.remove(art);
        
    }

	public List<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(List<Artista> artistas) {
		this.artistas = artistas;
	}
    
    
}

