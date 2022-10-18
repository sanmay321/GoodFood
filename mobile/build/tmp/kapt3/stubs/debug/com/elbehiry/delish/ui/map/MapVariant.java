package com.elbehiry.delish.ui.map;

import java.lang.System;

/**
 * A variant of the map UI. Depending on the variant, Map UI may show different markers, tile
 * overlays, etc.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/elbehiry/delish/ui/map/MapVariant;", "", "labelResId", "", "iconResId", "styleResId", "(Ljava/lang/String;IIII)V", "getIconResId", "()I", "getLabelResId", "getStyleResId", "Standard", "Dark", "DAY", "mobile_debug"})
public enum MapVariant {
    /*public static final*/ Standard /* = new Standard(0, 0, 0) */,
    /*public static final*/ Dark /* = new Dark(0, 0, 0) */,
    /*public static final*/ DAY /* = new DAY(0, 0, 0) */;
    private final int labelResId = 0;
    private final int iconResId = 0;
    private final int styleResId = 0;
    
    MapVariant(@androidx.annotation.StringRes()
    int labelResId, @androidx.annotation.DrawableRes()
    int iconResId, @androidx.annotation.RawRes()
    int styleResId) {
    }
    
    public final int getLabelResId() {
        return 0;
    }
    
    public final int getIconResId() {
        return 0;
    }
    
    public final int getStyleResId() {
        return 0;
    }
}