package com.elbehiry.shared.data.db.recipes.tables;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nH\'J\u001b\u0010\f\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/elbehiry/shared/data/db/recipes/tables/RecipesTable;", "", "deleteRecipe", "", "recipeId", "", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipe", "Lcom/elbehiry/shared/data/db/recipes/entities/RecipeEntity;", "getRecipes", "Lkotlinx/coroutines/flow/Flow;", "", "isRecipeSaved", "", "saveRecipe", "recipe", "(Lcom/elbehiry/shared/data/db/recipes/entities/RecipeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public abstract interface RecipesTable {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveRecipe(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.recipes.entities.RecipeEntity recipe, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n            SELECT * FROM recipes\n            ")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.elbehiry.shared.data.db.recipes.entities.RecipeEntity>> getRecipes();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT * FROM recipes \n        WHERE recipeId = :recipeId\n        ")
    public abstract java.lang.Object getRecipe(@org.jetbrains.annotations.Nullable()
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.shared.data.db.recipes.entities.RecipeEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        DELETE FROM recipes \n        WHERE recipeId = :recipeId\n        ")
    public abstract java.lang.Object deleteRecipe(@org.jetbrains.annotations.Nullable()
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT COUNT(*) FROM recipes \n        WHERE recipeId = :recipeId\n        ")
    public abstract java.lang.Object isRecipeSaved(@org.jetbrains.annotations.Nullable()
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1);
}