package br.blog.arruda.plot.opt;


/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 * @author Felipe
 *
 */
public class PlotGrid {

	private Boolean show;
	private Boolean aboveData;
//	private color 
//	private backgroundColor
//	private tickColor
	private Double labelMargin;
//	private markings
	private Double borderWidth;
//	private borderColor
	private Boolean clickable;
	private Boolean hoverable;
	private Boolean autoHighlight;
	private Double mouseActiveRadius;
	
	
	

	public PlotGrid(){
		this.show = null;
		this.aboveData = null;
		this.labelMargin = null;
		this.borderWidth = null;
		this.clickable = null;
		this.hoverable = null;
		this.autoHighlight = null;
		this.mouseActiveRadius = null;
	}




	// ================================== M�todos get() e set() ================================== //


	public Boolean getShow() {
		return show;
	}




	public void setShow(Boolean show) {
		this.show = show;
	}




	public Boolean getAboveData() {
		return aboveData;
	}




	public void setAboveData(Boolean aboveData) {
		this.aboveData = aboveData;
	}




	public Double getLabelMargin() {
		return labelMargin;
	}




	public void setLabelMargin(Double labelMargin) {
		this.labelMargin = labelMargin;
	}




	public Double getBorderWidth() {
		return borderWidth;
	}




	public void setBorderWidth(Double borderWidth) {
		this.borderWidth = borderWidth;
	}




	public Boolean getClickable() {
		return clickable;
	}




	public void setClickable(Boolean clickable) {
		this.clickable = clickable;
	}




	public Boolean getHoverable() {
		return hoverable;
	}




	public void setHoverable(Boolean hoverable) {
		this.hoverable = hoverable;
	}




	public Boolean getAutoHighlight() {
		return autoHighlight;
	}




	public void setAutoHighlight(Boolean autoHighlight) {
		this.autoHighlight = autoHighlight;
	}




	public Double getMouseActiveRadius() {
		return mouseActiveRadius;
	}




	public void setMouseActiveRadius(Double mouseActiveRadius) {
		this.mouseActiveRadius = mouseActiveRadius;
	}




}