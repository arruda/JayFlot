package br.blog.arruda.plot.opt;


/**
 * Classe utilizada para gerar os dados nas tags de grafico.
 * 
 * 
 * @author Felipe
 *
 */
public class PlotAxis {
	/*Nao sei que tipo de "time" � esse do Flot,
	no doc : API.txt, na parte "Customizing the axes" talvez tenha
	uma explicacao melhor.
	*/ 
//	private Time mode;

	//minimo valor do eixo
	private Double min;

	//maximo valor do eixo
	private Double max;
	
	//� algo meio "esoterico" como diz a doc do Flot, merece uma
	//olhada mais a fundo para entender melhor seu uso e aplicacao.
	private Double autoscaleMargin;

	//Expecifica a largura da label.
	private Double labelWidth;

	//Expecifica a altura da label.
	private Double labelHeight;
	
	//nao estou colocando outras informa�oes, pq nao s�o necessarias no momento.
	
	//infos do plugin axisLabel e minhas modificacoes
	private String axisLabel;
	private Boolean axisLabelUseCanvas;
	private Double axisLabelFontSizePixels;
	private String axisLabelFontFamily;
	private Boolean centralize;
	

	public PlotAxis(){
		this.min = null;
		this.max = null;
		this.autoscaleMargin = null;
		this.labelWidth = null;
		this.labelHeight = null;
		this.axisLabel = null;
		this.axisLabelUseCanvas = null;
		this.axisLabelFontSizePixels = null;
		this.axisLabelFontFamily = "Times New Roman";
		this.centralize = null;
	}



	// ================================== M�todos get() e set() ================================== //

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public Double getAutoscaleMargin() {
		return autoscaleMargin;
	}

	public void setAutoscaleMargin(Double autoscaleMargin) {
		this.autoscaleMargin = autoscaleMargin;
	}

	public Double getLabelWidth() {
		return labelWidth;
	}

	public void setLabelWidth(Double labelWidth) {
		this.labelWidth = labelWidth;
	}

	public Double getLabelHeight() {
		return labelHeight;
	}

	public void setLabelHeight(Double labelHeight) {
		this.labelHeight = labelHeight;
	}



	public String getAxisLabel() {
		return axisLabel;
	}



	public void setAxisLabel(String axisLabel) {
		this.axisLabel = axisLabel;
	}



	public Boolean getAxisLabelUseCanvas() {
		return axisLabelUseCanvas;
	}



	public void setAxisLabelUseCanvas(Boolean axisLabelUseCanvas) {
		this.axisLabelUseCanvas = axisLabelUseCanvas;
	}



	public Double getAxisLabelFontSizePixels() {
		return axisLabelFontSizePixels;
	}



	public void setAxisLabelFontSizePixels(Double axisLabelFontSizePixels) {
		this.axisLabelFontSizePixels = axisLabelFontSizePixels;
	}



	public String getAxisLabelFontFamily() {
		return axisLabelFontFamily;
	}



	public void setAxisLabelFontFamily(String axisLabelFontFamily) {
		this.axisLabelFontFamily = axisLabelFontFamily;
	}



	public Boolean getCentralize() {
		return centralize;
	}



	public void setCentralize(Boolean centralize) {
		this.centralize = centralize;
	}
}