package br.blog.arruda.plot.opt.tipo;


/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 *@author Felipe Arruda Pontes
 *
 */
public class PlotLines extends PlotType {
	private boolean steps;
	
	
	public PlotLines(){
		this.show = true;
		this.fill = true;
		this.steps = false;
	}




	// ================================== M�todos get() e set() ================================== //




	
	public boolean getSteps() {
		return steps;
	}


	public void setSteps(boolean steps) {
		this.steps = steps;
	}


	
}