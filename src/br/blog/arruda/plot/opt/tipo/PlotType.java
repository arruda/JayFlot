package br.blog.arruda.plot.opt.tipo;


/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 *@author Felipe Arruda Pontes
 *
 */
public class PlotType {
	protected boolean show;
	protected boolean fill;
	
	
	public PlotType(){
		this.show = true;
		this.fill = true;
	}




	// ================================== M�todos get() e set() ================================== //




	public boolean getShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public boolean getFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}
	


	
}