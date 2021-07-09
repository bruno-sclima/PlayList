
public class Artista {
	
		private String nomeArt;

		public String getNomeArt() {
			return nomeArt;
		}

		public void setNomeArt(String nomeArt) {
			this.nomeArt = nomeArt;
		}


		public Artista(String artistas) {
			this.setNomeArt(artistas);
		}

		@Override
		public String toString() {
			return "Artista [artistas=" + nomeArt + "]";
		}
		
		
}


