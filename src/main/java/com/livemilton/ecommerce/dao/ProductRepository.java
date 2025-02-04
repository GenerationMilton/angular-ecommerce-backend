package com.livemilton.ecommerce.dao;

import com.livemilton.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
    //add new method findBy(Query Method) CategoryId(Match by categoryId) "id" parameter value
    //Behind the scenes, Spring will execute a query like this SELECT*FROM product where category_id=?
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    //add new method findByNameContaining (Query method) SELECT * FROM Product p WHERE p.name LIKE CONCAT ('%', :name, '%')
    Page<Product> findByNameContaining(@Param("name")String name, Pageable page);

}