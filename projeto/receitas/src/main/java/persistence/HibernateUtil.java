package persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import model.Categoria;

public class HibernateUtil {
	private static final ThreadLocal session = new ThreadLocal();
	private static final SessionFactory sessionFactory = new AnnotationConfiguration().configure()
			.addAnnotatedClass(Categoria.class).buildSessionFactory();

	protected HibernateUtil() {
	}

	public static Session getSession() {
		Session session = (Session) HibernateUtil.session.get();
		if (session == null) {
			session = sessionFactory.openSession();
			HibernateUtil.session.set(session);
		}
		return session;
	}

	protected static void begin() {
		getSession().beginTransaction();
	}

	protected static void commit() {
		getSession().getTransaction().commit();
	}

	protected static void rollback() {
		try {
			getSession().getTransaction().rollback();
		} catch (HibernateException e) {
			System.out.println("Não foi possível fazer rollback da transação");
		}
		try {
			getSession().close();
		} catch (HibernateException e) {
			System.out.println("Não foi possível fazer fechar a sessão");
		}
		HibernateUtil.session.set(null);
	}

	public static void close() {
		getSession().close();
		HibernateUtil.session.set(null);
	}

	public static void shutdown() {
		sessionFactory.close();
	}
}
