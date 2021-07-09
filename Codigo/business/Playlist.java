import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class Playlist{
    private List<ItemPlaylist> itens;
    
    public Playlist() {
        itens = new ArrayList<ItemPlaylist>();
    }

	public void add(ItemPlaylist ip){
        itens.add(ip);
    }

    public void remove(){
       itens.remove(0);
    }
    
    public double duracaoMedia(){
   
    	
    	double soma =this.itens.stream().mapToDouble((f) -> f.getDuracao()).sum();
    	
    	double media = soma/itens.size();
    	
    	return media;
			
    }
    
    public List<ItemPlaylist> getItens() {
    	return itens;
    }
    
    public List<Musica> getMusArtista(Artista art) {
    	
    	List<Musica> mus = new ArrayList<Musica>();
    	for(ItemPlaylist i : itens) {
    		if(i instanceof Musica ) {
    			if( ((Musica) i).getArtistas().contains(art)) {
    				mus.add((Musica) i);
    			}
    			
    		}
    	}
    	return mus;
    }
    public List<ItemPlaylist> getMusicas(){
    	
    	return this.itens.stream().filter((f) -> f instanceof Musica).collect(toList());
    	
    }
    public List<ItemPlaylist> getPodcasts(){
    	
    	return this.itens.stream().filter((f) -> f instanceof Podcast).collect(toList());
    	
    }
}

