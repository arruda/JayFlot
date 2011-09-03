package br.blog.arruda.plot.opt;

import br.blog.arruda.plot.opt.tipo.PlotBars;
import br.blog.arruda.plot.opt.tipo.PlotLines;
import br.blog.arruda.plot.opt.tipo.PlotPoints;


/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 * @author Felipe Arruda Pontes
 *
 */
public class PlotSeries {

	private PlotLines lines;
	private PlotBars bars;
	private PlotPoints points;

	private Double shadowSize;

	

	public PlotSeries(){
		this.lines = null;
		this.bars = null;
		this.points = null;
		this.shadowSize = null;
	}



	// ================================== M�todos get() e set() ================================== //


	
	public PlotLines getLines() {
		return lines;
	}



	public void setLines(PlotLines lines) {
		this.lines = lines;
	}



	public PlotBars getBars() {
		return bars;
	}



	public void setBars(PlotBars bars) {
		this.bars = bars;
	}



	public PlotPoints getPoints() {
		return points;
	}



	public void setPoints(PlotPoints points) {
		this.points = points;
	}



	public Double getShadowSize() {
		return shadowSize;
	}



	public void setShadowSize(Double shadowSize) {
		this.shadowSize = shadowSize;
	}


}