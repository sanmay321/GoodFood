package com.elbehiry.shared.data.plan.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/elbehiry/shared/data/plan/remote/GetMealPlanRemoteDataSource;", "Lcom/elbehiry/shared/data/plan/remote/MealPlanDataSource;", "api", "Lcom/elbehiry/shared/data/remote/DelishApi;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/elbehiry/shared/data/remote/DelishApi;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getMealsPlan", "Lcom/elbehiry/model/MealsPlan;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public final class GetMealPlanRemoteDataSource implements com.elbehiry.shared.data.plan.remote.MealPlanDataSource {
    private final com.elbehiry.shared.data.remote.DelishApi api = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject()
    public GetMealPlanRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMealsPlan(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.MealsPlan> p0) {
        return null;
    }
}