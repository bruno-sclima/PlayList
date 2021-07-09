package business;

public class ItemPlaylist {
    private String titulo;
    private int duracao;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) throws ExcecaoItemPlaylistInvalido {
        if(titulo.equals("")) {
            throw new ExcecaoItemPlaylistInvalido(getTitulo(), getDuracao());
        }
        else {
            this.titulo = titulo;
        }
    }
    
    public int getDuracao() {
        return duracao;
    }
    
    public void setDuracao(int duracao) throws ExcecaoItemPlaylistInvalido {
         if(duracao > 0){
               this.duracao = duracao;
           }
           else{
                throw new ExcecaoItemPlaylistInvalido(getTitulo(), getDuracao());
           }
    }
    public ItemPlaylist(String tit, int dura) throws ExcecaoItemPlaylistInvalido {
        this.setTitulo(tit);
        this.setDuracao(dura);
    }
    @Override
    public String toString() {
        return " ItemPlaylist [Título=" + titulo + ", Duração=" + duracao + "segundos]";
    }

}