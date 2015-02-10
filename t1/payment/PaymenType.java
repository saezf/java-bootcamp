package t1.payment;




import java.util.List;

import t1.ListableItem;
public interface PaymenType {
//public double getTotal(List<StoreItem>  items);

/**
 * @param items
 * @return
 */
double getTotal(List<ListableItem> items);
}
