/**
 * 
 */
package t1.payment;

import java.util.List;

import t1.ListableItem;

/**
 * @author Christian db
 *
 */
public class CreditCard  implements PaymenType{	
@Override
public double getTotal(List<ListableItem>  items)
{double ret = 0;

for (ListableItem item :items){
	ret = item.getPrice();
}
return ret *0.9;}
}
