package br.blog.arruda.plot;

import java.util.ArrayList;



import br.blog.arruda.plot.data.PlotData;
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
	 * Retorna uma string que representa os dados do em JSON.
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
	 * Retorna uma string que representa as opcoes do em JSON.
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