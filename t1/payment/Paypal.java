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
public class Paypal  implements PaymenType{	
@Override
public double getTotal(List<ListableItem>  items)
{double ret = 0;
double aux = 0;
for (ListableItem item :items){
	if (item.getPrice() < ret){
	 ret = item.getPrice();};aux = item.getPrice();
}
return ret - aux ;}
}