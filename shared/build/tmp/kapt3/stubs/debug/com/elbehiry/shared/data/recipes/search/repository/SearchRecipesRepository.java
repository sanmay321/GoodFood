package com.elbehiry.shared.data.recipes.search.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/elbehiry/shared/data/recipes/search/repository/SearchRecipesRepository;", "Lcom/elbehiry/shared/data/recipes/search/repository/SearchRepository;", "searchDataSource", "Lcom/elbehiry/shared/data/recipes/search/remote/SearchDataSource;", "(Lcom/elbehiry/shared/data/recipes/search/remote/SearchDataSource;)V", "searchRecipes", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/elbehiry/model/RecipesItem;", "query", "", "cuisine", "shared_debug"})
public final class SearchRecipesRepository implements com.elbehiry.shared.data.recipes.search.repository.SearchRepository {
    private final com.elbehiry.shared.data.recipes.search.remote.SearchDataSource searchDataSource = null;
    
    public SearchRecipesRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.search.remote.SearchDataSource searchDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.elbehiry.model.RecipesItem>> searchRecipes(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    java.lang.String cuisine) {
        return null;
    }
}