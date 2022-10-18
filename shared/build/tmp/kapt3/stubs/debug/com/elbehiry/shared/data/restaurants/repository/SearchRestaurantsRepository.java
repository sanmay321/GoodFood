package com.elbehiry.shared.data.restaurants.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JC\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/elbehiry/shared/data/restaurants/repository/SearchRestaurantsRepository;", "Lcom/elbehiry/shared/data/restaurants/repository/ISearchRestaurantsRepository;", "restaurantsSearchDataSource", "Lcom/elbehiry/shared/data/restaurants/remote/ISearchRestaurantsDataSource;", "(Lcom/elbehiry/shared/data/restaurants/remote/ISearchRestaurantsDataSource;)V", "search", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "", "Lcom/elbehiry/model/VenuesItem;", "latLng", "", "version", "radius", "", "limit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "shared_debug"})
public final class SearchRestaurantsRepository implements com.elbehiry.shared.data.restaurants.repository.ISearchRestaurantsRepository {
    private final com.elbehiry.shared.data.restaurants.remote.ISearchRestaurantsDataSource restaurantsSearchDataSource = null;
    
    @javax.inject.Inject()
    public SearchRestaurantsRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.restaurants.remote.ISearchRestaurantsDataSource restaurantsSearchDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.VenuesItem>>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String latLng, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    java.lang.Integer radius, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit) {
        return null;
    }
}