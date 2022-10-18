package com.elbehiry.shared.data.db.datastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b0\nH&J\u001b\u0010\r\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/elbehiry/shared/data/db/datastore/RecipesLocalDataStore;", "", "deleteRecipe", "", "recipeId", "", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipeById", "Lcom/elbehiry/model/RecipesItem;", "getRecipes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "", "isRecipeSaved", "", "saveRecipe", "recipesItem", "(Lcom/elbehiry/model/RecipesItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public abstract interface RecipesLocalDataStore {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveRecipe(@org.jetbrains.annotations.NotNull()
    com.elbehiry.model.RecipesItem recipesItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.RecipesItem>>> getRecipes();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRecipeById(@org.jetbrains.annotations.Nullable()
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.RecipesItem> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteRecipe(@org.jetbrains.annotations.Nullable()
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isRecipeSaved(@org.jetbrains.annotations.Nullable()
    java.lang.Integer recipeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1);
}