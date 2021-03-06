package br.com.paraconsistente.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.paraconsistente.enuns.StatusProjetoEnum;

@Entity
@Table(name = "PROJETO")
public class Projeto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(nullable = false)
	private String nome;

	@ManyToOne
	private Gerente gerente;

	@ManyToOne
	private Gerente gerenteBackup;

	@ManyToOne
	private Cliente cliente;

	private String descricao;

	private Date dataInicio;

	private Date dataFim;

	@Enumerated(EnumType.STRING)
	private StatusProjetoEnum status;

	@ManyToMany
	private List<CFPS> cfpss;

	@ManyToOne
	private CFPS cfps;

	@ManyToOne(cascade = CascadeType.ALL)
	private CFPS cfpsIA;

	private Integer pontosFuncao;

	public Gerente getGerente() {
		return gerente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public Integer getPontosFuncao() {
		return pontosFuncao;
	}

	public Long getId() {
		return id;
	}

	public StatusProjetoEnum getStatus() {
		return status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public void setPontosFuncao(Integer pontosFuncao) {
		this.pontosFuncao = pontosFuncao;
	}

	public void setStatus(StatusProjetoEnum status) {
		this.status = status;
	}

	public List<CFPS> getCfpss() {
		return cfpss;
	}

	public void setCfpss(List<CFPS> cfps) {
		this.cfpss = cfps;
	}

	public CFPS getCfps() {
		return cfps;
	}

	public void setCfps(CFPS cfpsSelecionado) {
		this.cfps = cfpsSelecionado;
	}

	public CFPS getCfpsIA() {
		return cfpsIA;
	}

	public void setCfpsIA(CFPS cfpsIA) {
		this.cfpsIA = cfpsIA;
	}

	public Gerente getGerenteBackup() {
		return gerenteBackup;
	}

	public void setGerenteBackup(Gerente gerenteBackup) {
		this.gerenteBackup = gerenteBackup;
	}

}
