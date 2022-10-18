package com.elbehiry.shared.data.recipes.info.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/elbehiry/shared/data/recipes/info/remote/RecipeInformationRemoteDataSource;", "Lcom/elbehiry/shared/data/recipes/info/remote/RecipeInformationDataSource;", "api", "Lcom/elbehiry/shared/data/remote/DelishApi;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/elbehiry/shared/data/remote/DelishApi;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getRecipeInformation", "Lcom/elbehiry/model/Recipe;", "id", "", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public final class RecipeInformationRemoteDataSource implements com.elbehiry.shared.data.recipes.info.remote.RecipeInformationDataSource {
    private final com.elbehiry.shared.data.remote.DelishApi api = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    public RecipeInformationRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRecipeInformation(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.Recipe> p1) {
        return null;
    }
}