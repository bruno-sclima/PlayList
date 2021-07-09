
public class ExcecaoItemPlaylistInvalido extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	ExcecaoItemPlaylistInvalido(String tit, double durit){
		super("O título " + tit + " não pode receber a duração " + durit);
	}
	
}
