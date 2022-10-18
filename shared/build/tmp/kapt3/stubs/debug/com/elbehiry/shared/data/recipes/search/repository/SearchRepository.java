package com.elbehiry.shared.data.recipes.search.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/elbehiry/shared/data/recipes/search/repository/SearchRepository;", "", "searchRecipes", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/elbehiry/model/RecipesItem;", "query", "", "cuisine", "shared_debug"})
public abstract interface SearchRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.elbehiry.model.RecipesItem>> searchRecipes(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    java.lang.String cuisine);
}