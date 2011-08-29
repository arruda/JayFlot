package br.blog.arruda.plot.data;

import java.util.ArrayList;

import br.blog.arruda.plot.opt.tipo.PlotBars;
import br.blog.arruda.plot.opt.tipo.PlotLines;
import br.blog.arruda.plot.opt.tipo.PlotPoints;



/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 * @author Felipe
 *
 */
public class PlotData {

	private String label;
	
	private ArrayList<Double[]> data;

	private PlotLines lines;
	private PlotBars bars;
	private PlotPoints points;
	//indica qual axis x e y ira usar. 1 quer dizer a da esquerda e 2 a da direita.
	private Integer yaxis;
	private Integer xaxis;
	
	
	public PlotData(){
		this.label = null;
		this.data = null;
		this.lines = null;
		this.bars = null;
		this.points = null;		
		this.xaxis =null;
		this.yaxis =null;
	}




	// ================================== M�todos get() e set() ================================== //
	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public ArrayList<Double[]> getData() {
		return data;
	}


	public void setData(ArrayList<Double[]> data) {
		this.data = data;
	}


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




	public Integer getYaxis() {
		return yaxis;
	}




	public void setYaxis(Integer yaxis) {
		this.yaxis = yaxis;
	}




	public Integer getXaxis() {
		return xaxis;
	}




	public void setXaxis(Integer xaxis) {
		this.xaxis = xaxis;
	}



}