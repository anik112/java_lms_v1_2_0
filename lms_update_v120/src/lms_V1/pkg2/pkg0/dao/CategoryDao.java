/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.dao;

import java.util.List;
import lms_V1.pkg2.pkg0.domain.Category;

/**
 *
 * @author anik
 */
public interface CategoryDao {

    /**
     * <saveCategory(Category caategory)/> this method save all Category
     * information,
     * <deleteCategory(int id)/> this method delete Category information,
     * <List<Category> getCategoryList()/> this method return Category list,
     *
     * @param category
     */
    public void saveCategory(Category category);

    public void deleteCategory(int id);

    public List<Category> getCategoryList();

}
