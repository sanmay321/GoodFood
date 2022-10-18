package com.elbehiry.shared.data.db.recipes.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/elbehiry/shared/data/db/recipes/mapper/RecipeMapperImpl;", "Lcom/elbehiry/shared/data/db/recipes/mapper/RecipeMapper;", "jsonConverter", "Lcom/elbehiry/shared/data/db/JsonConverter;", "(Lcom/elbehiry/shared/data/db/JsonConverter;)V", "mapToDataBaseRecipe", "Lcom/elbehiry/shared/data/db/recipes/entities/RecipeEntity;", "recipesItem", "Lcom/elbehiry/model/RecipesItem;", "mapToDataRecipe", "recipeEntity", "shared_debug"})
public final class RecipeMapperImpl implements com.elbehiry.shared.data.db.recipes.mapper.RecipeMapper {
    private final com.elbehiry.shared.data.db.JsonConverter jsonConverter = null;
    
    @javax.inject.Inject()
    public RecipeMapperImpl(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.JsonConverter jsonConverter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.elbehiry.shared.data.db.recipes.entities.RecipeEntity mapToDataBaseRecipe(@org.jetbrains.annotations.NotNull()
    com.elbehiry.model.RecipesItem recipesItem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.elbehiry.model.RecipesItem mapToDataRecipe(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.recipes.entities.RecipeEntity recipeEntity) {
        return null;
    }
}