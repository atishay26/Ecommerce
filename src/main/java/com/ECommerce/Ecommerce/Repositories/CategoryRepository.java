package com.ECommerce.Ecommerce.Repositories;

import com.ECommerce.Ecommerce.Models.Category;
import com.ECommerce.Ecommerce.Models.Products;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {

    @Query(fields = "{'_id':1}")
    Category findBycategoryName(String name);


    Category findBy_id(String _id);

    @Query(value = "{'parentId':null}")
    List<Category> findCategoryName();

    @Query(fields = "{'parentId':0}")
    List<Category> findByparentId(String parentId);


}