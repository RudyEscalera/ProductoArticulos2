
public class Servicio implements Producto{
	int _horas,_costo;
	public Servicio(int _horas, int _costo) {
		this._horas=_horas;
		this._costo=_costo;
		// TODO Auto-generated constructor stub
	}

	
	public double Costoporcobrar() {
		// TODO Auto-generated method stub
	 double resp=(double)_horas*(double)_costo*0.2;
		return resp;
	}

}
