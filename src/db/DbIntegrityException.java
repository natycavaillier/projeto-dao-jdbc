package db;

public class DbIntegrityException extends RuntimeException{
	// Erro pra caso tente excluir um departamento que tem vendedores associados

	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String message) {
		super(message);
	}

	
}
