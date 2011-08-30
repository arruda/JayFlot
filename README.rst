===================================
JayFlot
===================================

About:
-----------------------------------

An intagration of Java and Flot, to use in any web app.


Exemple:
-----------------------------------
In the service:

import java.util.ArrayList;

import br.blog.arruda.plot.Plot;
import br.blog.arruda.plot.data.PlotData;

public class MyClass {

	public Plot myPlotingMethod() {
	    //populate the axis information with some data
		ArrayList<Double> xAxis = new ArrayList<Double>();
		ArrayList<Double> yAxis = new ArrayList<Double>();
		for (int i =0;i<10;i++){
			xAxis.add(Double.valueOf(i));
			yAxis.add(Double.valueOf(i*10));
		}
		//generate a PlotData from the axis information created above
		ArrayList<PlotData> datas = new ArrayList<PlotData>();
		datas.add(Plot.generatePlotData(xAxis, yAxis));
		
		//generate a simple plot using the datas set above and with xlabel and ylabel.
		Plot plot = Plot.generatePlot(datas, "x axis", "y axis");
		
		return Plot;
	}
}

In the web file that's using the Flot.js:

In the java script part:

...

data = [];

data = #{myBean.plotGenerated.printData};

...

options = {};

options = #{myBean.plotGenerated.printOptions};

....

$j.plot($j("#placeholder"), data, options);

...


Requirements:
-----------------------------------
This library uses GSon from google, version 1.7.1 to work.
If you want to compile this library, you should put Gson in the external libraries of your project.
If you just want to use this, then don't forget to put Gson in the same project that you're using this.
