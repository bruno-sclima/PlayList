
public class ExcecaotituloInvalido extends Exception{

	private static final long serialVersionUID = 1L;
	ExcecaotituloInvalido(String tit){
		super("O t�tulo " + tit + " n�o pode ser adicionado ");
	}
}
