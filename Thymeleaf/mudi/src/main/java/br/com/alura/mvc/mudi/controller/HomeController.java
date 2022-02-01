package br.com.alura.mvc.mudi.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller
public class HomeController {

	@Autowired
	private PedidoRepository repository;
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
//		pedido.setNomeProduto("Xiaomi Redimi Note 10s ");
//		pedido.setUrlImagem("https://m.media-amazon.com/images/I/61pOZ7mAn2S._AC_SL1500_.jpg");
//		pedido.setUrlProduto("https://www.amazon.com.br/Xiaomi-Redmi-Note-10S-128gb/dp/B093FJZYZ5/ref=sr_1_6?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=3J0HCJPWY3OJO&keywords=celular&qid=1643270336&sprefix=celula%2Caps%2C172&sr=8-6&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
//		pedido.setDescricao("Um celular");
//		
		
		List<Pedido> pedidos = repository.findAll();
		model.addAttribute("pedidos", pedidos);

		
//		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
//		List<Pedido> pedidos = query.getResultList();
		
		
		return "home";
	}
}
