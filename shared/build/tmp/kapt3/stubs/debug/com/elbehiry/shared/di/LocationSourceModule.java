package com.elbehiry.shared.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/elbehiry/shared/di/LocationSourceModule;", "", "()V", "bindsLocationRepository", "Lcom/elbehiry/shared/data/location/repository/ILocationRepository;", "repository", "Lcom/elbehiry/shared/data/location/repository/LocationRepository;", "bindsLocationRepository$shared_debug", "bindsLocationSource", "Lcom/elbehiry/shared/data/location/remote/ILocationRemoteDataSource;", "locationSource", "Lcom/elbehiry/shared/data/location/remote/LocationRemoteSource;", "bindsLocationSource$shared_debug", "shared_debug"})
@dagger.Module()
public abstract class LocationSourceModule {
    
    public LocationSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.elbehiry.shared.data.location.remote.ILocationRemoteDataSource bindsLocationSource$shared_debug(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.location.remote.LocationRemoteSource locationSource);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.elbehiry.shared.data.location.repository.ILocationRepository bindsLocationRepository$shared_debug(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.location.repository.LocationRepository repository);
}