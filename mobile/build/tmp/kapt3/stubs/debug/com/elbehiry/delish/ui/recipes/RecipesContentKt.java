package com.elbehiry.delish.ui.recipes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a>\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\b\u0010\t\u001a\u00020\u0001H\u0007\u001aZ\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a>\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0010H\u0007\u00a8\u0006\u0016"}, d2 = {"DailyInspiration", "", "recipes", "", "Lcom/elbehiry/model/RecipesItem;", "onDetails", "Lkotlin/Function1;", "", "onBookMark", "HeaderTitle", "HomeContent", "viewModel", "Lcom/elbehiry/delish/ui/recipes/RecipesViewModel;", "onIngredientContent", "Lkotlin/Function0;", "onCuisineSearch", "", "onIngredientSearch", "InspirationContent", "InspirationEmptyContent", "NotificationItem", "errorMessage", "mobile_debug"})
public final class RecipesContentKt {
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.animation.ExperimentalAnimationApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    public static final void HomeContent(@org.jetbrains.annotations.NotNull()
    com.elbehiry.delish.ui.recipes.RecipesViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onIngredientContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCuisineSearch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDetails, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onIngredientSearch) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void NotificationItem(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void HeaderTitle() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DailyInspiration(@org.jetbrains.annotations.NotNull()
    java.util.List<com.elbehiry.model.RecipesItem> recipes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDetails, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.elbehiry.model.RecipesItem, kotlin.Unit> onBookMark) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void InspirationContent(@org.jetbrains.annotations.NotNull()
    java.util.List<com.elbehiry.model.RecipesItem> recipes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDetails, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.elbehiry.model.RecipesItem, kotlin.Unit> onBookMark) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void InspirationEmptyContent() {
    }
}