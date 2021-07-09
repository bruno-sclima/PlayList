import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcecaoItemPlaylistInvalidoTest {

	@Test
	void testExcecaoItemPlaylistInvalido() throws ExcecaoItemPlaylistInvalido {
	
		ItemPlaylist ip = new ItemPlaylist("Jorge",5);

		assertThrows(ExcecaoItemPlaylistInvalido.class, () -> { ip.setTitulo(""); }, "Erro ao lancar ExcecaoItemPlaylistInvalido no atributo título");
		assertThrows(ExcecaoItemPlaylistInvalido.class, () -> { ip.setDuracao(-10); }, "Erro ao lancar ExcecaoItemPlaylistInvalido no atributo duração");

	}

}
