package br.blog.arruda.plot.opt;


/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 *@author Felipe Arruda Pontes
 *
 */
public class PlotOptions {
	
	private PlotAxis xaxis;
	private PlotAxis yaxis;
	
	private PlotAxis x2axis;
	private PlotAxis y2axis;

	private PlotSeries series;

	private PlotGrid grid;
	private PlotLegend legend;
	
	
	
	public PlotOptions(){
		this.xaxis = new PlotAxis();
		this.yaxis = new PlotAxis();
		this.x2axis = new PlotAxis();
		this.y2axis = new PlotAxis();
		this.series = null;
		this.grid = null;
		this.legend = null;
	}



	// ================================== M�todos get() e set() ================================== //

	public PlotAxis getXaxis() {
		return xaxis;
	}



	public void setXaxis(PlotAxis xaxis) {
		this.xaxis = xaxis;
	}



	public PlotAxis getYaxis() {
		return yaxis;
	}



	public void setYaxis(PlotAxis yaxis) {
		this.yaxis = yaxis;
	}



	public PlotAxis getX2axis() {
		return x2axis;
	}



	public void setX2axis(PlotAxis x2axis) {
		this.x2axis = x2axis;
	}



	public PlotAxis getY2axis() {
		return y2axis;
	}



	public void setY2axis(PlotAxis y2axis) {
		this.y2axis = y2axis;
	}



	public PlotSeries getSeries() {
		return series;
	}



	public void setSeries(PlotSeries series) {
		this.series = series;
	}



	public PlotGrid getGrid() {
		return grid;
	}



	public void setGrid(PlotGrid grid) {
		this.grid = grid;
	}





	public PlotLegend getLegend() {
		return legend;
	}





	public void setLegend(PlotLegend legend) {
		this.legend = legend;
	}


}