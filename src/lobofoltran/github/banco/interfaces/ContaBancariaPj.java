package dmmaycon.com.github.projeto.banco.classes;

import java.lang.ProcessHandle.Info;

import dmmaycon.com.github.projeto.banco.interfaces.IGeraExtratoEmXml;

public class ContaBancariaPj extends ContaBancaria implements IGeraExtratoEmXml, Info {

	public ContaBancariaPj(String nome, Double saldo, String numero, String tipo) {
		super(nome, saldo, numero, tipo);
	}

	@Override
	public void salvaArquivoXml() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void constroiArquivoXml() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validaArquivoXml() {
		// TODO Auto-generated method stub
		
	}

}
