package productcrudapp.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;



import antlr.collections.List;
import java.util.*;
import productcrudapp.model.Product;

@Component
public class ProductDao
{
	   @Autowired
	   private HibernateTemplate hibernatetemplate;
	   
	   @Transactional
	   public void createProduct(Product product) 
	   {
		   hibernatetemplate.save(product);
	   }
	   public List getAllEmp()
		{
			return (List) hibernatetemplate.loadAll(Product.class);
			
		}
	   
	   @Transactional
	   public void deleteProduct(int pid) 
	   {
		   Product p=this.hibernatetemplate.load(Product.class,pid);
		   this.hibernatetemplate.delete(p);
		   
	   }
	   
	   
	  public Product getProduct(int pid) 
	  {
		 return this.hibernatetemplate.get(Product.class, pid);
	  }

}
