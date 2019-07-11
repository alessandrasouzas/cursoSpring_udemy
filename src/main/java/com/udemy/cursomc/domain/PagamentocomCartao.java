package com.udemy.cursomc.domain;

import javax.persistence.Entity;

import com.udemy.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentocomCartao extends Pagamento{

	private Integer numeroDeParcelas;
	
	public PagamentocomCartao() {		
	}

	public PagamentocomCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
}
