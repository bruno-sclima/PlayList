
public class ExcecaotituloInvalido extends Exception{

	private static final long serialVersionUID = 1L;
	ExcecaotituloInvalido(String tit){
		super("O título " + tit + " não pode ser adicionado ");
	}
}
