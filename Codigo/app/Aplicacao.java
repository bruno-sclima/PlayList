import java.time.LocalDate;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args)  {
		try {
		
		Playlist pl = new Playlist();
		Artista a = new Artista("Metallica");
		Artista b = new Artista("MegaDeath");
		
		Musica mc = new Musica("For Whom The Bell Tolls", 380);
		Musica ms = new Musica("Holly Wars", 150);
		mc.add(a);
		ms.add(b);
		pl.add(ms);
		pl.add(mc);
		
		Podcast pc = new Podcast("Flow #150", 1500, LocalDate.of(2021, 6, 19));
		Podcast ps = new Podcast("Podpah # 71", 1200, LocalDate.now());
		
		pl.add(pc);
		pl.add(ps);
		
		System.out.println("Todos os itens");
		List<ItemPlaylist> ip = pl.getItens();
		ip.forEach((f) -> System.out.println(f.toString()));
		
		System.out.println("\nDuração Média: " + pl.duracaoMedia());
		System.out.println("Musicas do "+ a.getNomeArt());
		List<Musica> musicas = pl.getMusArtista(a);
		musicas.forEach((f) -> System.out.println(f.toString()));
		
	}catch(ExcecaotituloInvalido | ExcecaoDuracaoInvalida e) {
		e.printStackTrace();
		e.getMessage();
	}
  }

}
