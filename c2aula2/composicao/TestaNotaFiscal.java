package c2aula2.composicao;

public class TestaNotaFiscal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotaFiscal nf1 = new NotaFiscal();
		nf1.addItem("achocalatado tabajau 400g", 3, 7.50);             // 22.5
		nf1.addItem("Coca-descola 350mL", 1, 2.99); 					// 2.99
		nf1.addItem("Água ardente para churrasco Pi-canha", 2, 12.25); // 24.5
		nf1.addItem("Bolacha recheada Bono Vox", 5, 1.99); 				// 9.95

		System.out.println(nf1.getTotalItens() == 4);
		System.out.println(nf1.getTotalNota() == 59.94);
		System.out.println(nf1.getDataHoraVenda());

	}

}
