public abstract class ItemPlaylist {
	
	private String titulo;
	private double duracao;
	
	public ItemPlaylist(String titulo, double duracao) throws ExcecaotituloInvalido,ExcecaoDuracaoInvalida {
		this.setTitulo(titulo);
		this.setDuracao(duracao);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) throws ExcecaotituloInvalido {
		if(titulo.equals("") || titulo == null) {
			throw new ExcecaotituloInvalido(getTitulo());
		}
		else {
			this.titulo = titulo;
		}
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	public void setDuracao(double duracao) throws ExcecaoDuracaoInvalida {
		 if(duracao > 0){
	           this.duracao = duracao;
	       }
	       else{
				throw new ExcecaoDuracaoInvalida(getDuracao());
	       }
	}
	
	@Override
	public String toString() {
		return " ItemPlaylist [Título=" + titulo + ", Duração=" + duracao + "segundos]";
	}
	
	

}

