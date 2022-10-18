package com.elbehiry.shared.data.recipes.random.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/elbehiry/shared/data/recipes/random/repository/GetRandomRecipesRepository;", "Lcom/elbehiry/shared/data/recipes/random/repository/RandomRecipesRepository;", "randomRecipesRemoteDataSource", "Lcom/elbehiry/shared/data/recipes/random/remote/RandomRecipesRemoteDataSource;", "(Lcom/elbehiry/shared/data/recipes/random/remote/RandomRecipesRemoteDataSource;)V", "getRandomRecipes", "", "Lcom/elbehiry/model/Recipe;", "tags", "", "number", "", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public final class GetRandomRecipesRepository implements com.elbehiry.shared.data.recipes.random.repository.RandomRecipesRepository {
    private final com.elbehiry.shared.data.recipes.random.remote.RandomRecipesRemoteDataSource randomRecipesRemoteDataSource = null;
    
    public GetRandomRecipesRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.random.remote.RandomRecipesRemoteDataSource randomRecipesRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRandomRecipes(@org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    java.lang.Integer number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elbehiry.model.Recipe>> p2) {
        return null;
    }
}