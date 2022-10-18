package com.elbehiry.shared.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\r\u0010\n\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\b\fJ\u0017\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\b\u0014J\u0017\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\b\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/elbehiry/shared/di/MapModule;", "", "()V", "provideSearchDataSource", "Lcom/elbehiry/shared/data/restaurants/remote/ISearchRestaurantsDataSource;", "api", "Lcom/elbehiry/shared/data/remote/DelishApi;", "provideSearchRepository", "Lcom/elbehiry/shared/data/restaurants/repository/ISearchRestaurantsRepository;", "searchDataSource", "providesCancellationToken", "Lcom/google/android/gms/tasks/CancellationToken;", "providesCancellationToken$shared_debug", "providesFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "context", "Landroid/content/Context;", "providesFusedLocationProviderClient$shared_debug", "providesLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "providesLocationRequest$shared_debug", "providesLocationSettingsClient", "Lcom/google/android/gms/location/SettingsClient;", "providesLocationSettingsClient$shared_debug", "providesLocationSettingsRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "locationRequest", "providesLocationSettingsRequest$shared_debug", "shared_debug"})
@dagger.Module()
public final class MapModule {
    
    public MapModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.restaurants.remote.ISearchRestaurantsDataSource provideSearchDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.restaurants.repository.ISearchRestaurantsRepository provideSearchRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.restaurants.remote.ISearchRestaurantsDataSource searchDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.android.gms.location.FusedLocationProviderClient providesFusedLocationProviderClient$shared_debug(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.android.gms.tasks.CancellationToken providesCancellationToken$shared_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.android.gms.location.LocationRequest providesLocationRequest$shared_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.android.gms.location.LocationSettingsRequest providesLocationSettingsRequest$shared_debug(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationRequest locationRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.android.gms.location.SettingsClient providesLocationSettingsClient$shared_debug(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
}