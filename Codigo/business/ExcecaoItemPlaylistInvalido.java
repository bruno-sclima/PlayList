
public class ExcecaoItemPlaylistInvalido extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	ExcecaoItemPlaylistInvalido(String tit, double durit){
		super("O t�tulo " + tit + " n�o pode receber a dura��o " + durit);
	}
	
}
