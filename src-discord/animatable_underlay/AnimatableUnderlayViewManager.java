package com.discord.animatable_underlay;

import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0007J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0007J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0007J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0011H\u0007J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0011H\u0007J\u0018\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0011H\u0007¨\u0006\""}, d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlayViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/animatable_underlay/AnimatableUnderlay;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setAnimatedBackgroundColor", "", "view", ViewProps.BACKGROUND_COLOR, "setAnimatedBorderColor", ViewProps.BORDER_COLOR, "setAnimatedBorderWidth", ViewProps.BORDER_WIDTH, "", "setAnimatedBottom", ViewProps.BOTTOM, "setAnimatedBottomLeftRadius", "bottomLeftRadius", "setAnimatedBottomRightRadius", "bottomRightRadius", "setAnimatedHeight", "height", "setAnimatedLeft", ViewProps.LEFT, "setAnimatedTopLeftRadius", "topLeftRadius", "setAnimatedTopRightRadius", "topRightRadius", "setAnimatedWidth", "width", "animatable_underlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatableUnderlayViewManager extends SimpleViewManager<AnimatableUnderlay> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AnimatableUnderlayView";
    }

    @ReactProp(name = "animatedBackgroundColor")
    public final void setAnimatedBackgroundColor(AnimatableUnderlay view, String backgroundColor) {
        q.g(view, "view");
        q.g(backgroundColor, "backgroundColor");
        view.setShapeBackgroundColor(AnimatableUnderlay.Companion.rgbaToArgb(backgroundColor));
        view.invalidate();
    }

    @ReactProp(name = "animatedBorderColor")
    public final void setAnimatedBorderColor(AnimatableUnderlay view, String borderColor) {
        q.g(view, "view");
        q.g(borderColor, "borderColor");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderColor(AnimatableUnderlay.Companion.rgbaToArgb(borderColor));
        view.invalidate();
    }

    @ReactProp(name = "animatedBorderWidth")
    public final void setAnimatedBorderWidth(AnimatableUnderlay view, float f10) {
        q.g(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderWidth(SizeUtilsKt.getDpToPx(f10));
        view.invalidate();
    }

    @ReactProp(name = "animatedBottom")
    public final void setAnimatedBottom(AnimatableUnderlay view, float f10) {
        q.g(view, "view");
        view.setShapeBottom(SizeUtilsKt.getDpToPx(f10));
        view.invalidate();
    }

    @ReactProp(name = "animatedBottomLeftRadius")
    public final void setAnimatedBottomLeftRadius(AnimatableUnderlay view, float f10) {
        q.g(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderBottomLeftRadius(SizeUtilsKt.getDpToPx(f10));
        view.invalidate();
    }

    @ReactProp(name = "animatedBottomRightRadius")
    public final void setAnimatedBottomRightRadius(AnimatableUnderlay view, float f10) {
        q.g(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderBottomRightRadius(SizeUtilsKt.getDpToPx(f10));
        view.invalidate();
    }

    @ReactProp(name = "animatedHeight")
    public final void setAnimatedHeight(AnimatableUnderlay view, float f10) {
        q.g(view, "view");
        view.setShapeHeight(SizeUtilsKt.getDpToPx(f10));
        view.invalidate();
    }

    @ReactProp(name = "animatedLeft")
    public final void setAnimatedLeft(AnimatableUnderlay view, float f10) {
        q.g(view, "view");
        view.setShapeLeft(SizeUtilsKt.getDpToPx(f10));
        view.invalidate();
    }

    @ReactProp(name = "animatedTopLeftRadius")
    public final void setAnimatedTopLeftRadius(AnimatableUnderlay view, float f10) {
        q.g(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderTopLeftRadius(SizeUtilsKt.getDpToPx(f10));
        view.invalidate();
    }

    @ReactProp(name = "animatedTopRightRadius")
    public final void setAnimatedTopRightRadius(AnimatableUnderlay view, float f10) {
        q.g(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderTopRightRadius(SizeUtilsKt.getDpToPx(f10));
        view.invalidate();
    }

    @ReactProp(name = "animatedWidth")
    public final void setAnimatedWidth(AnimatableUnderlay view, float f10) {
        q.g(view, "view");
        view.setShapeWidth(SizeUtilsKt.getDpToPx(f10));
        view.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public AnimatableUnderlay createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return new AnimatableUnderlay(reactContext, null, 0, 6, null);
    }
}
