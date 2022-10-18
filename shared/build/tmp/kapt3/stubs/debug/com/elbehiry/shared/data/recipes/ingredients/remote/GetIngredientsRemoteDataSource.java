package com.elbehiry.shared.data.recipes.ingredients.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/elbehiry/shared/data/recipes/ingredients/remote/GetIngredientsRemoteDataSource;", "Lcom/elbehiry/shared/data/recipes/ingredients/remote/GetIngredientsDataSource;", "api", "Lcom/elbehiry/shared/data/remote/DelishApi;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/elbehiry/shared/data/remote/DelishApi;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getIngredients", "", "Lcom/elbehiry/model/IngredientItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public final class GetIngredientsRemoteDataSource implements com.elbehiry.shared.data.recipes.ingredients.remote.GetIngredientsDataSource {
    private final com.elbehiry.shared.data.remote.DelishApi api = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject()
    public GetIngredientsRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getIngredients(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elbehiry.model.IngredientItem>> p0) {
        return null;
    }
}