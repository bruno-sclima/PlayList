
public class ExcecaoDuracaoInvalida extends Exception{

	private static final long serialVersionUID = 1L;
	ExcecaoDuracaoInvalida( double dur){
		super("Um item n�o pode receber a dura��o " + dur);
	}
}
