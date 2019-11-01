import java.util.Collection;

public interface Pedido {

	private Collection<ItemDePedido> itemDePedido;

	private Collection<Pessoa> pessoa;

	public abstract float obterTotal();

}
