package com.elbehiry.shared.domain.restaurants;

import java.lang.System;

/**
 * Search for the nearby restaurant using [Params] value.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f0\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/elbehiry/shared/domain/restaurants/SearchRestaurantsUseCase;", "Lcom/elbehiry/shared/domain/FlowUseCase;", "Lcom/elbehiry/shared/domain/restaurants/SearchRestaurantsUseCase$Params;", "", "Lcom/elbehiry/model/VenuesItem;", "searchRepository", "Lcom/elbehiry/shared/data/restaurants/repository/ISearchRestaurantsRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/elbehiry/shared/data/restaurants/repository/ISearchRestaurantsRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "parameters", "Params", "shared_debug"})
public final class SearchRestaurantsUseCase extends com.elbehiry.shared.domain.FlowUseCase<com.elbehiry.shared.domain.restaurants.SearchRestaurantsUseCase.Params, java.util.List<? extends com.elbehiry.model.VenuesItem>> {
    private final com.elbehiry.shared.data.restaurants.repository.ISearchRestaurantsRepository searchRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject()
    public SearchRestaurantsUseCase(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.restaurants.repository.ISearchRestaurantsRepository searchRepository, @org.jetbrains.annotations.NotNull()
    @com.elbehiry.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.VenuesItem>>> execute(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.restaurants.SearchRestaurantsUseCase.Params parameters) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/elbehiry/shared/domain/restaurants/SearchRestaurantsUseCase$Params;", "", "latLng", "", "version", "radius", "", "limit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLatLng", "()Ljava/lang/String;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRadius", "getVersion", "Companion", "shared_debug"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String latLng = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String version = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer radius = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer limit = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.elbehiry.shared.domain.restaurants.SearchRestaurantsUseCase.Params.Companion Companion = null;
        
        private Params(java.lang.String latLng, java.lang.String version, java.lang.Integer radius, java.lang.Integer limit) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLatLng() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getRadius() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static final com.elbehiry.shared.domain.restaurants.SearchRestaurantsUseCase.Params create(@org.jetbrains.annotations.NotNull()
        java.lang.String latLng, @org.jetbrains.annotations.NotNull()
        java.lang.String version, @org.jetbrains.annotations.Nullable()
        java.lang.Integer radius, @org.jetbrains.annotations.Nullable()
        java.lang.Integer limit) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/elbehiry/shared/domain/restaurants/SearchRestaurantsUseCase$Params$Companion;", "", "()V", "create", "Lcom/elbehiry/shared/domain/restaurants/SearchRestaurantsUseCase$Params;", "latLng", "", "version", "radius", "", "limit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/elbehiry/shared/domain/restaurants/SearchRestaurantsUseCase$Params;", "shared_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.elbehiry.shared.domain.restaurants.SearchRestaurantsUseCase.Params create(@org.jetbrains.annotations.NotNull()
            java.lang.String latLng, @org.jetbrains.annotations.NotNull()
            java.lang.String version, @org.jetbrains.annotations.Nullable()
            java.lang.Integer radius, @org.jetbrains.annotations.Nullable()
            java.lang.Integer limit) {
                return null;
            }
        }
    }
}