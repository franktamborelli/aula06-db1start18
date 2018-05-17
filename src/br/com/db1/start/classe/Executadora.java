package br.com.db1.start.classe;

public class Executadora {
	public static void main(String[] args) {
		exibirCepFormatado(87050250);
		exibirCepFormatado(87050180);
		exibirCepFormatado(87000130);

		exibirDocumentoFormatado("07365652993");
		exibirDocumentoFormatado("073653");
		exibirDocumentoFormatado("073656529931");

	}

	private static void exibirDocumentoFormatado(String cpfFormatado) {
		Emitente documento = new Emitente();
		documento.setDocumento(cpfFormatado);
		System.out.println(documento.getCpfFormatado());
	}

	private static void exibirCepFormatado(Integer cepFormatado) {
		Endereco endereco = new Endereco();
		endereco.setCep(cepFormatado);
		System.out.println(endereco.getCepFormatado());
	}

}
