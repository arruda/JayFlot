package br.blog.arruda.plot.opt;


/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 * @author Felipe
 *
 */
public class PlotLegend {
	
	private Boolean show;
	
//	private labelFormatter;
//	private labelBoxBorderColor;
	
	private Double noColumns;
	
//	position: "ne" or "nw" or "se" or "sw"
	private String position;
	
//    margin: number of pixels or [x margin, y margin]
	private Double[] margin;

//	private backgroundColor;
	
//    backgroundOpacity: number between 0 and 1
	private Double backgroundOpacity;

//	private container;
	
	
	public PlotLegend(){
		this.show = null;
		this.noColumns = null;
		this.position = null;
		this.margin = null;
		this.backgroundOpacity = null;
	}




	// ================================== M�todos get() e set() ================================== //

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public Double getNoColumns() {
		return noColumns;
	}

	public void setNoColumns(Double noColumns) {
		this.noColumns = noColumns;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Double[] getMargin() {
		return margin;
	}

	public void setMargin(Double[] margin) {
		this.margin = margin;
	}

	public Double getBackgroundOpacity() {
		return backgroundOpacity;
	}

	public void setBackgroundOpacity(Double backgroundOpacity) {
		this.backgroundOpacity = backgroundOpacity;
	}
}