package br.blog.arruda.plot.opt.tipo;


/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 *@author Felipe Arruda Pontes
 *
 */
public class PlotBars extends PlotType {
	private Double barWidth;
	private String align;
	private Boolean horizontal;


	
	public PlotBars(){
		this.show = true;
		this.fill = true;
		
		this.barWidth = null;
		this.horizontal = null;
		this.align = null;
		
	}






	// ================================== M�todos get() e set() ================================== //



	public Double getBarWidth() {
		return barWidth;
	}


	public void setBarWidth(Double barWidth) {
		this.barWidth = barWidth;
	}


	public String getAlign() {
		return align;
	}


	public void setAlign(String align) {
		this.align = align;
	}


	public Boolean getHorizontal() {
		return horizontal;
	}


	public void setHorizontal(Boolean horizontal) {
		this.horizontal = horizontal;
	}

	
}