package control;
import persistence.HibernateUtil;

public class main {

	public static void main(String[] args) {
		// Inicializa o Hibernate
		HibernateUtil.getSession();

	}

}
