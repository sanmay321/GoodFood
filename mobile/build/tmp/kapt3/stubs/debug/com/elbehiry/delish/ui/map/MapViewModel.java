package com.elbehiry.delish.ui.map;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010\u001dJ$\u00101\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u00103\u001a\u00020!2\b\b\u0002\u00104\u001a\u00020!J\u0010\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u001dH\u0002J\u0010\u00107\u001a\u00020.2\u0006\u00106\u001a\u00020\u001dH\u0002J\u000e\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0012R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00160\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120 \u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140 \u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00160 \u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\"\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00160,0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/elbehiry/delish/ui/map/MapViewModel;", "Landroidx/lifecycle/ViewModel;", "searchRestaurantsUseCase", "Lcom/elbehiry/shared/domain/restaurants/SearchRestaurantsUseCase;", "createFoursquareVersionUseCase", "Lcom/elbehiry/shared/domain/restaurants/CreateFoursquareVersionUseCase;", "getCurrentLocationUseCase", "Lcom/elbehiry/shared/domain/location/GetCurrentLocationUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/elbehiry/shared/domain/restaurants/SearchRestaurantsUseCase;Lcom/elbehiry/shared/domain/restaurants/CreateFoursquareVersionUseCase;Lcom/elbehiry/shared/domain/location/GetCurrentLocationUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_errorMessage", "Lkotlinx/coroutines/channels/Channel;", "", "_mapCenterEvent", "Lcom/google/android/gms/maps/CameraUpdate;", "_mapVariant", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/elbehiry/delish/ui/map/MapVariant;", "_selectedMarkerInfo", "Lcom/elbehiry/model/VenuesItem;", "_venuesList", "", "errorMessage", "Lkotlinx/coroutines/flow/Flow;", "getErrorMessage", "()Lkotlinx/coroutines/flow/Flow;", "getRestaurants", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/google/android/gms/maps/model/LatLng;", "getRestaurantsUsingLocation", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "mapCenterEvent", "getMapCenterEvent", "mapVariant", "getMapVariant", "selectedMarkerInfo", "getSelectedMarkerInfo", "venuesList", "getVenuesList", "viewState", "Lcom/elbehiry/shared/result/Result;", "getRestaurantByCurrentLocation", "", "getRestaurantsInPosition", "target", "highlightVenuesItem", "venuesItem", "immediateHighLight", "shouldZoomCamera", "offerCameraUpdates", "latLng", "saveCurrentLatLng", "setMapVariant", "variant", "mobile_debug"})
public final class MapViewModel extends androidx.lifecycle.ViewModel {
    private final com.elbehiry.shared.domain.restaurants.SearchRestaurantsUseCase searchRestaurantsUseCase = null;
    private final com.elbehiry.shared.domain.restaurants.CreateFoursquareVersionUseCase createFoursquareVersionUseCase = null;
    private final com.elbehiry.shared.domain.location.GetCurrentLocationUseCase getCurrentLocationUseCase = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final kotlinx.coroutines.channels.Channel<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> errorMessage = null;
    private final kotlinx.coroutines.channels.Channel<com.google.android.gms.maps.CameraUpdate> _mapCenterEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.CameraUpdate> mapCenterEvent = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.elbehiry.delish.ui.map.MapVariant> _mapVariant = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.elbehiry.delish.ui.map.MapVariant> mapVariant = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.elbehiry.model.VenuesItem> _selectedMarkerInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.elbehiry.model.VenuesItem> selectedMarkerInfo = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.elbehiry.model.VenuesItem>> _venuesList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.elbehiry.model.VenuesItem>> venuesList = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.google.android.gms.maps.model.LatLng> getRestaurants = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.google.android.gms.maps.model.LatLng> getRestaurantsUsingLocation = null;
    private final kotlinx.coroutines.flow.StateFlow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.VenuesItem>>> viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject()
    public MapViewModel(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.restaurants.SearchRestaurantsUseCase searchRestaurantsUseCase, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.restaurants.CreateFoursquareVersionUseCase createFoursquareVersionUseCase, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.location.GetCurrentLocationUseCase getCurrentLocationUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.CameraUpdate> getMapCenterEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.elbehiry.delish.ui.map.MapVariant> getMapVariant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.elbehiry.model.VenuesItem> getSelectedMarkerInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.elbehiry.model.VenuesItem>> getVenuesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    /**
     * Validate if there is camera updates in the cache.
     * Call the get restaurants near using current location.
     */
    public final void getRestaurantByCurrentLocation() {
    }
    
    /**
     * This to get the restaurant using a specific position, depending on camera position.
     *
     * @param target
     */
    public final void getRestaurantsInPosition(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng target) {
    }
    
    /**
     * Highlight a specific venue item and move the camera towards.
     *
     * @param venuesItem
     * @param immediateHighLight
     * @param shouldZoomCamera
     */
    public final void highlightVenuesItem(@org.jetbrains.annotations.Nullable()
    com.elbehiry.model.VenuesItem venuesItem, boolean immediateHighLight, boolean shouldZoomCamera) {
    }
    
    private final void saveCurrentLatLng(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    private final void offerCameraUpdates(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    public final void setMapVariant(@org.jetbrains.annotations.NotNull()
    com.elbehiry.delish.ui.map.MapVariant variant) {
    }
}