
public class Ventas {
	Producto[] lista=new Producto[4];
	
	public Ventas()
	{
		
		lista[0]=new Articulo(2,3);
		lista[1]=new Servicio(1,5);
		lista[2]=new Articulo(4,7);
		lista[3]=new Servicio(2,9);
		
	}
	
	public double CobrarTotal()
	{
		double resultado = 0;
		for(int cont=0;cont<4;cont++){
			resultado=lista[cont].Costoporcobrar()+resultado;
		}
		return resultado;

	}

}
