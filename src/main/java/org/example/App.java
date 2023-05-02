package org.example;

import org.example.config.HibernateConfig;
import org.example.employees.Category;
import org.example.employees.Company;
import org.example.employees.Product;
import org.example.service.CategoryService;
import org.example.service.CompanyService;
import org.example.service.ProductService;
import org.example.service.impl.CategoryServiceImpl;
import org.example.service.impl.CompanyServiceImpl;
import org.example.service.impl.ProductServiceImpl;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HibernateConfig.getEntity();
        Company company1 = new Company("ASD","Kazakh");
        Company company2 = new Company("KYT","Kyrgyz");
        Company company3 = new Company("DAS","USA");
        Company company4 = new Company("RUS","Russia");

        CompanyService service1 = new CompanyServiceImpl();
    //    service1.saveCompany(company3);
//      service1.deleteById(1L);
//      service1.updateCompany(11L,company4);


        Category category1 = new Category("Vegetables");
        Category category2 = new Category("Fruit");

        CategoryService service = new CategoryServiceImpl();
 //       service.saveCategory(category2);
        service.getAllProductGroupByCategoryName(category1);


        Product product1 = new Product("Potatoes", LocalDate.of(2023,1,1),35);
        Product product2 = new Product("Tomato", LocalDate.of(2023,1,1),40);
        Product product3 = new Product("Bulb", LocalDate.of(2023,1,1),30);
        Product product4 = new Product("Cucumber", LocalDate.of(2023,1,1),25);

        ProductService product = new ProductServiceImpl();
        product.findAllProductsByCompany(1L);
//        product.saveProduct(product3);

//        product.deleteById(4L);
/*
//        product.findAllProductsByCompany(1L);
*/
    }
}
