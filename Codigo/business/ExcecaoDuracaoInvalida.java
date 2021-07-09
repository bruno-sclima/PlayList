
public class ExcecaoDuracaoInvalida extends Exception{

	private static final long serialVersionUID = 1L;
	ExcecaoDuracaoInvalida( double dur){
		super("Um item não pode receber a duração " + dur);
	}
}
