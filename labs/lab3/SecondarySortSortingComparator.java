import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

/**
 * The DateTemperatureGroupingComparator class
 * enable us to compare two DateTemperaturePair
 * objects. This class is needed for sorting
 * purposes.
 *
 * @author Mahmoud Parsian
 *
 */
public class SecondarySortSortingComparator
   extends WritableComparator {

    protected SecondarySortSortingComparator() {
        super(Sale.class, true);
    }

    @Override
    public int compare(WritableComparable wc1, WritableComparable wc2) {
        Sale pair = (Sale) wc1;
        Sale pair2 = (Sale) wc2;
        return pair.compareTo(pair2);
    }
}
