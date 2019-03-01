package ink.laoliang.jyuncmsplatform.service;

import ink.laoliang.jyuncmsplatform.domain.Category;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface CategoryService {
    List<Category> getCategories();

    List<Category> createCategory(Category category);

    List<Category> updateCategory(Category category) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException;

    List<Category> deleteCategory(String urlAlias);

    Category getCategoryById(String urlAlias);

    Integer getCountByLevelAndParentUrlAlias(Integer nodeLevel, String parentUrlAlias);

    List<Category> moveUpNode(String urlAlias);

    List<Category> moveDownNode(String urlAlias);
}