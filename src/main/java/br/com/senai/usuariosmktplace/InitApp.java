package br.com.senai.usuariosmktplace;

import br.com.senai.usuariosmktplace.core.dao.ManagerDb;
import br.com.senai.usuariosmktplace.core.domain.Usuario;

public class InitApp {

	public static void main(String[] args) {
		
		ManagerDb.getInstance().getConexao();
		Usuario usuario = new Usuario("joao.tofani", "João Tofani", "joao1234");
		usuario.getLogin();
	}

}
