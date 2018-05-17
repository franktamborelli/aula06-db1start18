package br.com.db1.start.classe;

public class Emitente {

	private String nome;

	private String documento;

	private byte[] assinatura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public byte[] getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(byte[] assinatura) {
		this.assinatura = assinatura;
	}

	public String getCpfFormatado() {
		String cpfFormatado = documento.toString();
		Integer tamanho = 11;
		if (documento.length() == tamanho) {
			cpfFormatado = cpfFormatado.substring(0, 3) + "." + cpfFormatado.substring(3, 6) + "."
					+ cpfFormatado.substring(6, 9) + "-" + cpfFormatado.substring(9, 11);
		}

		return cpfFormatado;

	}
}
