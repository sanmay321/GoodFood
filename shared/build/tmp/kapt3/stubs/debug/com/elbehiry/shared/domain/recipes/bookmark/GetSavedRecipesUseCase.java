package com.elbehiry.shared.domain.recipes.bookmark;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f0\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/elbehiry/shared/domain/recipes/bookmark/GetSavedRecipesUseCase;", "Lcom/elbehiry/shared/domain/FlowUseCase;", "", "", "Lcom/elbehiry/model/RecipesItem;", "dataStore", "Lcom/elbehiry/shared/data/db/datastore/RecipesLocalDataStore;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/elbehiry/shared/data/db/datastore/RecipesLocalDataStore;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "parameters", "(Lkotlin/Unit;)Lkotlinx/coroutines/flow/Flow;", "shared_debug"})
public final class GetSavedRecipesUseCase extends com.elbehiry.shared.domain.FlowUseCase<kotlin.Unit, java.util.List<? extends com.elbehiry.model.RecipesItem>> {
    private final com.elbehiry.shared.data.db.datastore.RecipesLocalDataStore dataStore = null;
    
    @javax.inject.Inject()
    public GetSavedRecipesUseCase(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.datastore.RecipesLocalDataStore dataStore, @org.jetbrains.annotations.NotNull()
    @com.elbehiry.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.RecipesItem>>> execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit parameters) {
        return null;
    }
}