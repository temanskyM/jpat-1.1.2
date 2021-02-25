import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(int[] source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int element : source) {
            if (element > treshold) {
                logger.log("Элемент " + element + " проходит");
                result.add(element);
            } else {
                logger.log("Элемент " + element + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.length);
        return result;
    }
}
