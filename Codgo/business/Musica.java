package business;

import java.util.Arrays;

public class Musica extends ItemPlaylist{
    
    private Artista[] artistas;
    private int numArtistas = 0;
    
    
    public Musica(String titulo, int duracao, Artista[] artistas) throws ExcecaoItemPlaylistInvalido {
        super(titulo, duracao);
        this.artistas = artistas;
        this.numArtistas = 1;
    }
    
    public void add(Artista art){
        if (this.artistas.length > numArtistas) {
            this.artistas[numArtistas++] = art;
        }
    }

    public void remove(Artista art){
        if (this.artistas.length > numArtistas) {
            this.artistas[numArtistas--] = art;
        }
    }

    @Override
    public String toString() {
        return "Musica [artistas=" + Arrays.toString(artistas) + ", numArtistas=" + numArtistas + super.toString() + "]";
    }
}
