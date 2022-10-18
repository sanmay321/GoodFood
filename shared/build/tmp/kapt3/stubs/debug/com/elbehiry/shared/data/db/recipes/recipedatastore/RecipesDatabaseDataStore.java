package com.elbehiry.shared.data.db.recipes.recipedatastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u00120\u0011H\u0016J\u001b\u0010\u0014\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013*\b\u0012\u0004\u0012\u00020\u001a0\u0013H\u0002J*\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u00120\u0011*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/elbehiry/shared/data/db/recipes/recipedatastore/RecipesDatabaseDataStore;", "Lcom/elbehiry/shared/data/db/datastore/RecipesLocalDataStore;", "recipesTable", "Lcom/elbehiry/shared/data/db/recipes/tables/RecipesTable;", "recipeMapper", "Lcom/elbehiry/shared/data/db/recipes/mapper/RecipeMapper;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/elbehiry/shared/data/db/recipes/tables/RecipesTable;Lcom/elbehiry/shared/data/db/recipes/mapper/RecipeMapper;Lkotlinx/coroutines/CoroutineDispatcher;)V", "deleteRecipe", "", "recipeId", "", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeById", "Lcom/elbehiry/model/RecipesItem;", "getRecipes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "", "isRecipeSaved", "", "saveRecipe", "recipesItem", "(Lcom/elbehiry/model/RecipesItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toDataRecipes", "Lcom/elbehiry/shared/data/db/recipes/entities/RecipeEntity;", "toListDataRecipeFlow", "shared_debug"})
public final class RecipesDatabaseDataStore implements com.elbehiry.shared.data.db.datastore.RecipesLocalDataStore {
    private final com.elbehiry.shared.data.db.recipes.tables.RecipesTable recipesTable = null;
    private final com.elbehiry.shared.data.db.recipes.mapper.RecipeMapper recipeMapper = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject()
    public RecipesDatabaseDataStore(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.recipes.tables.RecipesTable recipesTable, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.recipes.mapper.RecipeMapper recipeMapper, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveRecipe(@org.jetbrains.annotations.NotNull()
    com.elbehiry.model.RecipesItem recipesItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.RecipesItem>>> getRecipes() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.RecipesItem>>> toListDataRecipeFlow(kotlinx.coroutines.flow.Flow<? extends java.util.List<com.elbehiry.shared.data.db.recipes.entities.RecipeEntity>> $this$toListDataRecipeFlow) {
        return null;
    }
    
    private final java.util.List<com.elbehiry.model.RecipesItem> toDataRecipes(java.util.List<com.elbehiry.shared.data.db.recipes.entities.RecipeEntity> $this$toDataRecipes) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRecipeById(@org.jetbrains.annotations.Nullable()
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.RecipesItem> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteRecipe(@org.jetbrains.annotations.Nullable()
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isRecipeSaved(@org.jetbrains.annotations.Nullable()
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
}