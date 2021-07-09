import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PodcastTest {
		

	@Test
	void testTituloIncorreto() throws ExcecaoItemPlaylistInvalido {
		Podcast pc = new Podcast("SoftTalks - 01", 1000, LocalDate.of(2021, 1, 7));
		assertEquals("SoftTalks - 01",pc.getTitulo());
	}
	
	@Test
	void testDuracaoIncorreta() throws ExcecaoItemPlaylistInvalido {
		Podcast ps = new Podcast("SoftTalks - 02", 1200, LocalDate.of(2021, 2, 21));

		assertEquals(1200,ps.getDuracao());
	}
	
	@Test
	void testDataIncorreta() throws ExcecaoItemPlaylistInvalido {
		Podcast pt = new Podcast("SoftTalks - 03", 1600, LocalDate.of(2021, 3, 12));

		assertEquals(LocalDate.of(2021, 3, 12),pt.getDataPublicacao());
	}

}
