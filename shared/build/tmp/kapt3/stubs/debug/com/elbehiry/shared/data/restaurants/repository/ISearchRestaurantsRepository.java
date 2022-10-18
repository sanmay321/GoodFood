package com.elbehiry.shared.data.restaurants.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/elbehiry/shared/data/restaurants/repository/ISearchRestaurantsRepository;", "", "search", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "", "Lcom/elbehiry/model/VenuesItem;", "latLng", "", "version", "radius", "", "limit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "shared_debug"})
public abstract interface ISearchRestaurantsRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.VenuesItem>>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String latLng, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    java.lang.Integer radius, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit);
}