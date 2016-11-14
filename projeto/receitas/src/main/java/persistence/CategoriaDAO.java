package persistence;

import model.Categoria;

public class CategoriaDAO extends DAO{
	public void inserir(Object obj) {
        inserir(obj, Categoria.class);
    }

    
    public void atualizar(Object obj) {
        atualizar(obj, Categoria.class);
    }

    public void deletar(Object obj) {
        deletar(obj, Categoria.class);
    }

    public void deletar(int id) {
        deletar(id, Categoria.class);
    }
}
