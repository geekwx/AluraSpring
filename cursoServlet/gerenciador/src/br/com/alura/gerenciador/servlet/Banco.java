package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>(); 
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("UBB");
		empresa.setId(Banco.chaveSequencial++);
		
		Empresa empresa2 = new Empresa();
		empresa.setNome("Alura");
		empresa2.setId(Banco.chaveSequencial++);
		
		
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		//Antigamente usava o Iterator
//		Iterator<Empresa> it = Banco.lista.iterator();
//		while(it.hasNext()) {
//			Empresa emp = it.next();
//			
//			if(emp.getId() == id) {
//				it.remove();
//			}	
//		}
		

		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				Banco.lista.remove(empresa);
			}
		}
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
	

}
