package com.discord.zoom_layout;

import android.graphics.Matrix;
import com.discord.reactevents.ReactEvents;
import com.discord.zoom_layout.reactevents.OnZoomChangedEvent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDZoomLayoutAndroidManagerDelegate;
import com.facebook.react.viewmanagers.DCDZoomLayoutAndroidManagerInterface;
import com.otaliastudios.zoom.ZoomEngine;
import java.util.Map;
import jf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@ReactModule(name = ZoomLayoutViewManager.NAME)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001'B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010H\u0014J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020!H\u0017J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020!H\u0017J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J \u0010$\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006("}, d2 = {"Lcom/discord/zoom_layout/ZoomLayoutViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/zoom_layout/ZoomLayoutFixed;", "Lcom/facebook/react/viewmanagers/DCDZoomLayoutAndroidManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDZoomLayoutAndroidManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getReactEvents$zoom_layout_release", "()Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "receiveCommand", "", "zoomLayout", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "setGestureEnabled", "view", "value", "", "setMaximumZoomScale", "", "setMinimumZoomScale", ZoomLayoutViewManager.COMMAND_UN_ZOOM, ZoomLayoutViewManager.COMMAND_ZOOM_TO, "x", "y", "Companion", "zoom_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ZoomLayoutViewManager extends ViewGroupManager<ZoomLayoutFixed> implements DCDZoomLayoutAndroidManagerInterface<ZoomLayoutFixed> {
    private static final String COMMAND_UN_ZOOM = "unzoom";
    private static final String COMMAND_ZOOM_TO = "zoomTo";
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDZoomLayoutAndroid";
    private final DCDZoomLayoutAndroidManagerDelegate<ZoomLayoutFixed, ZoomLayoutViewManager> delegate = new DCDZoomLayoutAndroidManagerDelegate<>(this);
    private final ReactEvents reactEvents = new ReactEvents(x.a("onZoomChanged", f0.b(OnZoomChangedEvent.class)));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/zoom_layout/ZoomLayoutViewManager$Companion;", "", "()V", "COMMAND_UN_ZOOM", "", "COMMAND_ZOOM_TO", "NAME", "zoom_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    @Override 
    public ViewManagerDelegate<ZoomLayoutFixed> getDelegate() {
        return this.delegate;
    }

    @Override 
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override 
    public String getName() {
        return NAME;
    }

    public final ReactEvents getReactEvents$zoom_layout_release() {
        return this.reactEvents;
    }

    
    
    @Override 
    public ZoomLayoutFixed createViewInstance(final ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        final ZoomLayoutFixed zoomLayoutFixed = new ZoomLayoutFixed(reactContext, null, 0, 6, null);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f21240j = UIManagerHelper.getEventDispatcherForReactTag(reactContext, zoomLayoutFixed.getId());
        zoomLayoutFixed.setOverScrollHorizontal(false);
        zoomLayoutFixed.setOverScrollVertical(false);
        zoomLayoutFixed.setOverPinchable(false);
        zoomLayoutFixed.getEngine().l(new ZoomEngine.c() { 
            @Override 
            public void onIdle(ZoomEngine engine) {
                q.h(engine, "engine");
            }

            @Override 
            public void onUpdate(ZoomEngine engine, Matrix matrix) {
                q.h(engine, "engine");
                q.h(matrix, "matrix");
                ZoomLayoutViewManager.this.getReactEvents$zoom_layout_release().emitEvent(ref$ObjectRef.f21240j, reactContext, zoomLayoutFixed, new OnZoomChangedEvent(zoomLayoutFixed.getZoom()));
            }
        });
        return zoomLayoutFixed;
    }

    public void receiveCommand(ZoomLayoutFixed zoomLayout, String commandId, ReadableArray readableArray) {
        q.h(zoomLayout, "zoomLayout");
        q.h(commandId, "commandId");
        if (q.c(commandId, COMMAND_ZOOM_TO)) {
            if (readableArray != null) {
                zoomTo(zoomLayout, (float) readableArray.getDouble(0), (float) readableArray.getDouble(1));
            }
        } else if (q.c(commandId, COMMAND_UN_ZOOM)) {
            unzoom(zoomLayout);
        }
    }

    @ReactProp(name = "gestureEnabled")
    public void setGestureEnabled(ZoomLayoutFixed view, boolean z10) {
        q.h(view, "view");
        view.setGestureEnabled(z10);
    }

    @ReactProp(name = "maximumZoomScale")
    public void setMaximumZoomScale(ZoomLayoutFixed view, float f10) {
        q.h(view, "view");
        view.setMaxZoom(f10);
    }

    @ReactProp(name = "minimumZoomScale")
    public void setMinimumZoomScale(ZoomLayoutFixed view, float f10) {
        q.h(view, "view");
        view.setMinZoom(f10);
    }

    public void unzoom(ZoomLayoutFixed view) {
        q.h(view, "view");
        view.moveToCenter(Float.valueOf(1.0f), true);
    }

    public void zoomTo(ZoomLayoutFixed view, float f10, float f11) {
        q.h(view, "view");
        view.moveTo(2.0f, f10, f11, true);
    }
}
