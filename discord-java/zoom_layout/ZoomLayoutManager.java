package com.discord.zoom_layout;

import android.graphics.Matrix;
import com.discord.reactevents.ReactEvents;
import com.discord.zoom_layout.reactevents.OnZoomChangedEvent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.otaliastudios.zoom.ZoomEngine;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import nf.x;
import of.v;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0007J$\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\"\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/discord/zoom_layout/ZoomLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/zoom_layout/ZoomLayoutFixed;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "gestureEnabled", "", "view", "", "getCommandsMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getExportedCustomDirectEventTypeConstants", "", "", "getName", "maximumZoomScale", "", "minimumZoomScale", "receiveCommand", "zoomLayout", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "Companion", "zoom_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ZoomLayoutManager extends ViewGroupManager<ZoomLayoutFixed> {
    public static final Companion Companion = new Companion(null);
    private static final int UNZOOM_INDEX = 1;
    private static final int ZOOM_TO_INDEX = 0;
    private final ReactEvents reactEvents = new ReactEvents(x.a("onZoomChanged", f0.b(OnZoomChangedEvent.class)));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/zoom_layout/ZoomLayoutManager$Companion;", "", "()V", "UNZOOM_INDEX", "", "ZOOM_TO_INDEX", "zoom_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @ReactProp(name = "gestureEnabled")
    public final void gestureEnabled(ZoomLayoutFixed view, boolean z10) {
        q.g(view, "view");
        view.setGestureEnabled(z10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDZoomLayoutAndroid";
    }

    @ReactProp(name = "maximumZoomScale")
    public final void maximumZoomScale(ZoomLayoutFixed view, float f10) {
        q.g(view, "view");
        view.setMaxZoom(f10);
    }

    @ReactProp(name = "minimumZoomScale")
    public final void minimumZoomScale(ZoomLayoutFixed view, float f10) {
        q.g(view, "view");
        view.setMinZoom(f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ZoomLayoutFixed createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        final ZoomLayoutFixed zoomLayoutFixed = new ZoomLayoutFixed(reactContext, null, 0, 6, null);
        zoomLayoutFixed.setOverScrollHorizontal(false);
        zoomLayoutFixed.setOverScrollVertical(false);
        zoomLayoutFixed.setOverPinchable(false);
        zoomLayoutFixed.getEngine().l(new ZoomEngine.c() { // from class: com.discord.zoom_layout.ZoomLayoutManager$createViewInstance$1$1
            @Override // com.otaliastudios.zoom.ZoomEngine.c
            public void onIdle(ZoomEngine engine) {
                q.g(engine, "engine");
            }

            @Override // com.otaliastudios.zoom.ZoomEngine.c
            public void onUpdate(ZoomEngine engine, Matrix matrix) {
                ReactEvents reactEvents;
                q.g(engine, "engine");
                q.g(matrix, "matrix");
                reactEvents = ZoomLayoutManager.this.reactEvents;
                reactEvents.emitEvent(zoomLayoutFixed, new OnZoomChangedEvent(zoomLayoutFixed.getZoom()));
            }
        });
        return zoomLayoutFixed;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public HashMap<String, Integer> getCommandsMap() {
        HashMap<String, Integer> j10;
        j10 = v.j(x.a("zoomTo", 0), x.a("unzoom", 1));
        return j10;
    }

    public void receiveCommand(ZoomLayoutFixed zoomLayout, int i10, ReadableArray readableArray) {
        q.g(zoomLayout, "zoomLayout");
        if (i10 != 0) {
            if (i10 == 1) {
                zoomLayout.moveToCenter(Float.valueOf(1.0f), true);
            }
        } else if (readableArray != null) {
            zoomLayout.moveTo(2.0f, (float) readableArray.getDouble(0), (float) readableArray.getDouble(1), true);
        }
    }
}
