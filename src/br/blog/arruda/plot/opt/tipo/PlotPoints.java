package br.blog.arruda.plot.opt.tipo;


/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 * @author Felipe
 *
 */
public class PlotPoints extends PlotType {
	private Double radius;
	


	
	public PlotPoints(){
		this.show = true;
		this.fill = true;
		
		this.radius = null;
		
	}



	// ================================== M�todos get() e set() ================================== //



	public Double getRadius() {
		return radius;
	}




	public void setRadius(Double radius) {
		this.radius = radius;
	}


}