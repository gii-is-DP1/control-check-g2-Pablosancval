package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface ProductRepository extends CrudRepository<Product, Integer>{

    List<Product> findAll();
    
	@Query("SELECT prodtype FROM ProductType prodtype")
    List<ProductType> findAllProductTypes() throws DataAccessException;

    @Query("SELECT prodtype FROM ProductType prodtype WHERE prodtype.name LIKE :name%")
    ProductType findProductTypeByName(@Param("name") String name) throws DataAccessException;

    @Query("SELECT prod FROM Product prod WHERE prod.price <= :price")
    List<Product> findByPriceLessThan(@Param("price") Double price) throws DataAccessException;

    Optional<Product> findById(int id);

    Product findByName(String name);
    Product save(Product p);
}
