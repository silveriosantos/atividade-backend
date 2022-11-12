package org.senai.atividadebackend.Controller;

import java.util.Optional;

import org.senai.atividadebackend.Entity.Produto;
import org.senai.atividadebackend.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/produto")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    ProdutoRepository pReository;

    @PostMapping("/")
    public @ResponseBody Integer addProduto(@RequestBody Produto objU) {
        pReository.save(objU);
        return objU.getId();

    }

    @GetMapping("/")
    public @ResponseBody Iterable<Produto> buscarProdutos() {
        return pReository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Produto> buscarProduto(@PathVariable Integer id){
        return pReository.findById(id);
    }

    @PutMapping("/")
    public @ResponseBody Produto atualizar (@RequestBody Produto objP){
        pReository.save(objP);
        return objP;
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String apagarProduto (@PathVariable Integer id){
    pReository.deleteById(id);
    return "Produto apagado com Sucesso";
    }
    
}
