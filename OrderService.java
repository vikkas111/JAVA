package com.order;

public class OrderService extends Product {
	
 Order order=new Order();
Product p=new Product();
void Processorder() {
	 int j = 0;

	for(int i=0;i<=1;i++)
	if(order.getProductid()==p.getProductId(i,j)) {
		
		if(order.getQuantity()<=p.getProdctquantity(i)) {
			System.out.println("product is available");
			System.out.println("product id  " +order.getProductid());
			System.out.println("product quantity  "+order.getQuantity());
			
		}
			else
				System.out.println("product is not available");

				

		}
	}


public static void main(String args[]) {
	Order order=new Order();
	order.setProductid(1);
	order.setQuantity(3);
OrderService n=new OrderService();
n.Processorder();

	
		
	}
			
	

}

