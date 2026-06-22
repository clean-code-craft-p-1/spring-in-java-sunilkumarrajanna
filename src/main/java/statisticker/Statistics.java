package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats {
        public float average;
        public float min;
        public float max;
    }
    
    public static Stats getStatistics(List<Float> numbers) {
        Stats stats = new Stats();
        
        if (numbers == null || numbers.isEmpty()) {
            stats.average = Float.NaN;
            stats.min = Float.NaN;
            stats.max = Float.NaN;
            return stats;
        }
        
        float sum = 0;
        float min = numbers.get(0);
        float max = numbers.get(0);
        
        for (Float number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        
        stats.average = sum / numbers.size();
        stats.min = min;
        stats.max = max;
        
        return stats;
    }
}
