public interface PontoDePagamento {

	public void abrir(Impressora impressora, Operadora operadora);

	public void finalizarPedido(Pedido pedido, Cartao cartao);

}
