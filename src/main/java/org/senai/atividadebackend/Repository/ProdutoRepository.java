package org.senai.atividadebackend.Repository;

import org.senai.atividadebackend.Entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository  extends CrudRepository<Produto, Integer>{
    
}
