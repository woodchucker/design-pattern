package entities;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class FormatConfiguration {
	DecimalFormat df = new DecimalFormat("#.##");
	public void setDecimalFormat(){
    DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
    dfs.setDecimalSeparator('.');
    df.setDecimalFormatSymbols(dfs);
	}
    public DecimalFormat getDecimalFormat(){
    	this.setDecimalFormat();
    	return df;
    }
}
