public class ClientePremium extends Cliente {
	
	
	@Override 
	public double calculaDesconto(){
		return 0.15 * super.getValorPedido();
	}
}
