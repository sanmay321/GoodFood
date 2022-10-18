package com.elbehiry.delish.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a8\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a\u001e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a.\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a8\u0006\u0012"}, d2 = {"MapTopBar", "", "onBackClicked", "Lkotlin/Function0;", "MapVariantsPopup", "variants", "", "Lcom/elbehiry/delish/ui/map/MapVariant;", "onDismiss", "onVariant", "Lkotlin/Function1;", "MapViewContent", "viewModel", "Lcom/elbehiry/delish/ui/map/MapViewModel;", "VariantItem", "mapVariant", "modifier", "Landroidx/compose/ui/Modifier;", "mobile_debug"})
public final class RestaurantsMapViewKt {
    
    @androidx.compose.runtime.Composable()
    public static final void MapViewContent(@org.jetbrains.annotations.NotNull()
    com.elbehiry.delish.ui.map.MapViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MapTopBar(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MapVariantsPopup(@org.jetbrains.annotations.NotNull()
    java.util.List<com.elbehiry.delish.ui.map.MapVariant> variants, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.elbehiry.delish.ui.map.MapVariant, kotlin.Unit> onVariant) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void VariantItem(@org.jetbrains.annotations.NotNull()
    com.elbehiry.delish.ui.map.MapVariant mapVariant, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.elbehiry.delish.ui.map.MapVariant, kotlin.Unit> onVariant) {
    }
}