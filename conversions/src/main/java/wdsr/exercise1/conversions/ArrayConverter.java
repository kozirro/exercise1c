package wdsr.exercise1.conversions;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
	static final  Logger logger =  LogManager.getLogger(ArrayConverter.class.getName());
	
    public int[] convertToInts(String[] strings) {
    	logger.debug("convertToInts parameter name = " + String[].class.getName() + " argument values = " + Arrays.toString( Arrays.stream(strings).mapToInt(Integer::valueOf).toArray()));
		logger.debug("convertToInts result "+ Arrays.toString( Arrays.stream(strings).mapToInt(Integer::valueOf).toArray()));		
        return Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
    }
}
