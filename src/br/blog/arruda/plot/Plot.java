package br.blog.arruda.plot;

import java.util.ArrayList;



import br.blog.arruda.plot.data.PlotData;
import br.blog.arruda.plot.opt.PlotAxis;
import br.blog.arruda.plot.opt.PlotOptions;

import com.google.gson.Gson;



/**
 * Representa um grafico, com suas informacoes pertinentes.
 *  Utilizado para trabalhar com o formato correto do Flot
 *  Usando o GSon para fazer conversao numa string(dict de Json) compativel com a biblioteca grafica JS.
 * 
 * @author Felipe
 *
 */
public class Plot {
	
	private ArrayList<PlotData> datas;
	
	private PlotOptions options;

	
	
	public Plot(){
		this.datas =null;
		this.options =null;
	}


	/**
	 * Return a string that represents the data in JSON format.
	 * @return
	 */
	public String printData(){
		Gson gson = new Gson();
		String json="";
		
		//print all datas:
		json+="[";
		for(PlotData data: this.datas){
			String temp = gson.toJson(data,data.getClass());
			json+=temp+",";
		}
		json+="]";
		
		return json;
	}
	/**
	 * Return a string that represents the data in JSON format.
	 * 
	 * Only used for bean purposes(calls printData() and return it results)
	 * @return
	 */
	public String getPrintData(){
		
		return printData();
	}


	/**
	 * Return a string that represents the options in JSON format.
	 * 
	 * @return
	 */
	public String printOptions(){
		Gson gson = new Gson();
		String json="";

		if(this.options == null){
			return "{}";
		}
		//print the options
		String temp = gson.toJson(this.options,this.options.getClass());
		json+=temp;
		
		
		return json;
	}
	
	/**
	 * Return a string that represents the options in JSON format.
	 * 
	 * Only used for bean purposes(calls printOptions() and return it results)
	 * @return
	 */
	public String getPrintOptions(){
		
		return printOptions();
	}

	/**
	 * Generates a PlotData using the two arrays passed for x and y axis.
	 * 
	 * For default, Flot uses lines as type.
	 * 
	 * @param xAxis
	 * @param yAxis
	 * @return
	 */
	public static PlotData generatePlotData(ArrayList<Double> xAxis, ArrayList<Double> yAxis){
		
		//value that will contain the max size between the two lists.
		int max_Axys = Math.max(xAxis.size(), yAxis.size());

		ArrayList<Double[]> datas = new ArrayList<Double[]>();
		
		PlotData plotData = new PlotData();
		//create a vector with max elements x2
		for(int i = 0;i< max_Axys; i++){
			Double[] dds= new Double[2];
			//alternate from x to y in the vector
			for(int j = 0; j< 2; j++){
				//if 0 then is x
				if(j==0){
					dds[0] = xAxis.get(i);
				}
				//else is y
				else{
					dds[1] = yAxis.get(i);					
				}
			}
			
			datas.add(dds);
		}
		
		plotData.setData(datas);
		
		return plotData;
	}



	/**
	 * Generates a Default Plot using the two arrays passed for x and y axis.
	 * Sets the labels of the axis for the labels passed in the parameters.
	 * Using lines as option and no series or grid.
	 * 
	 * OBS:(this should only be used if using axisLabel plugin for FLOT) 
	 * @param xAxis
	 * @param yAxis
	 * @return
	 */
	public static Plot generatePlot(ArrayList<PlotData>datas, String xLabel,String yLabel){
		Plot plot = new Plot();
		PlotOptions option = new PlotOptions(); 
		PlotAxis xaxis = new PlotAxis();
		PlotAxis yaxis = new PlotAxis();
		
		xaxis.setAxisLabel(xLabel);		
		yaxis.setAxisLabel(yLabel);
		
		plot.options = option;
		plot.options.setXaxis(xaxis);
		plot.options.setYaxis(yaxis);
		plot.datas = datas;
		
		return plot;
	}
	
	// ================================== Metodos get() e set() ================================== //

	public ArrayList<PlotData> getDatas() {
		return datas;
	}

	public void setDatas(ArrayList<PlotData> datas) {
		this.datas = datas;
	}

	public PlotOptions getOptions() {
		return options;
	}

	public void setOptions(PlotOptions options) {
		this.options = options;
	}





}