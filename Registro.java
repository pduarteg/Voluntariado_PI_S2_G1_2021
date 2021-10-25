package voluntariado;

public class Registro{
	int noBoleta = 0;
	int fechaBoleta = 0;
	int monto = 0;
	int noRecibo = 0;
	int fechaFactura = 0;
	int noFactura = 0;
	int porcentaje = 0; 
	int comision = 0;

	Registro siguiente = null;

	public Registro(int noBoleta, int fechaBoleta, int monto,
		int noRecibo, int fechaFactura, int noFactura, int porcentaje, int comision){
		this.noBoleta = noBoleta;
		this.fechaBoleta = fechaBoleta;
		this.monto = monto;
		this.noRecibo = noRecibo;
		this.fechaFactura = fechaFactura;
		this.porcentaje = porcentaje;
		this.comision = comision;
	}
}