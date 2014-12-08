package cs.unlv.edu.common;

import similaritymetrics.JaroWinkler;

public class ResultMatcher {
    
    private static double minimumConfidence = 0.9;
    
    public static boolean match(String testResult, String outputResult) {
        boolean matched = false;

        if (testResult != null && outputResult != null) {
            
            JaroWinkler jw = new JaroWinkler();
            
            double confidence = jw.getSimilarity(testResult, outputResult);
            
            if ( confidence >= minimumConfidence) {
                matched = true;
            }
        }
        
        return matched;
    }

}
