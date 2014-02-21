
public class Articulo implements Producto {
	int _cantidad,_precio;
	public Articulo(int _cantidad, int _precio) {
		this._cantidad=_cantidad;
		this._precio=_precio;
		// TODO Auto-generated constructor stub
	}

	public double Costoporcobrar() {
		double resultad=(double)_cantidad*(double)_precio;// TODO Auto-generated method stub
		return resultad;
	}
}
