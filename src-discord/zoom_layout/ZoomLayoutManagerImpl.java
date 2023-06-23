package com.discord.zoom_layout;

import android.graphics.Matrix;
import com.discord.reactevents.ReactEvents;
import com.discord.zoom_layout.reactevents.OnZoomChangedEvent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.otaliastudios.zoom.ZoomEngine;
import java.util.Map;
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0014J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u001e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006!"}, d2 = {"Lcom/discord/zoom_layout/ZoomLayoutManagerImpl;", "", "()V", "COMMAND_UN_ZOOM", "", "COMMAND_ZOOM_TO", "NAME", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getReactEvents$zoom_layout_release", "()Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "Lcom/discord/zoom_layout/ZoomLayoutFixed;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "gestureEnabled", "", "view", "", "getExportedCustomDirectEventTypeConstants", "", "maximumZoomScale", "", "minimumZoomScale", "receiveCommand", "zoomLayout", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", ZoomLayoutManagerImpl.COMMAND_UN_ZOOM, ZoomLayoutManagerImpl.COMMAND_ZOOM_TO, "x", "y", "zoom_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZoomLayoutManagerImpl {
    private static final String COMMAND_UN_ZOOM = "unzoom";
    private static final String COMMAND_ZOOM_TO = "zoomTo";
    public static final String NAME = "DCDZoomLayoutAndroid";
    public static final ZoomLayoutManagerImpl INSTANCE = new ZoomLayoutManagerImpl();
    private static final ReactEvents reactEvents = new ReactEvents(x.a("onZoomChanged", f0.b(OnZoomChangedEvent.class)));

    private ZoomLayoutManagerImpl() {
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.facebook.react.uimanager.events.EventDispatcher] */
    public final ZoomLayoutFixed createViewInstance(final ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        final ZoomLayoutFixed zoomLayoutFixed = new ZoomLayoutFixed(reactContext, null, 0, 6, null);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f22140k = UIManagerHelper.getEventDispatcherForReactTag(reactContext, zoomLayoutFixed.getId());
        zoomLayoutFixed.setOverScrollHorizontal(false);
        zoomLayoutFixed.setOverScrollVertical(false);
        zoomLayoutFixed.setOverPinchable(false);
        zoomLayoutFixed.getEngine().l(new ZoomEngine.c() { // from class: com.discord.zoom_layout.ZoomLayoutManagerImpl$createViewInstance$1$1
            @Override // com.otaliastudios.zoom.ZoomEngine.c
            public void onIdle(ZoomEngine engine) {
                q.g(engine, "engine");
            }

            @Override // com.otaliastudios.zoom.ZoomEngine.c
            public void onUpdate(ZoomEngine engine, Matrix matrix) {
                q.g(engine, "engine");
                q.g(matrix, "matrix");
                ZoomLayoutManagerImpl.INSTANCE.getReactEvents$zoom_layout_release().emitEvent(ref$ObjectRef.f22140k, reactContext, zoomLayoutFixed, new OnZoomChangedEvent(zoomLayoutFixed.getZoom()));
            }
        });
        return zoomLayoutFixed;
    }

    public final void gestureEnabled(ZoomLayoutFixed view, boolean z10) {
        q.g(view, "view");
        view.setGestureEnabled(z10);
    }

    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return reactEvents.exportEventConstants();
    }

    public final ReactEvents getReactEvents$zoom_layout_release() {
        return reactEvents;
    }

    public final void maximumZoomScale(ZoomLayoutFixed view, float f10) {
        q.g(view, "view");
        view.setMaxZoom(f10);
    }

    public final void minimumZoomScale(ZoomLayoutFixed view, float f10) {
        q.g(view, "view");
        view.setMinZoom(f10);
    }

    public final void receiveCommand(ZoomLayoutFixed zoomLayout, String commandId, ReadableArray readableArray) {
        q.g(zoomLayout, "zoomLayout");
        q.g(commandId, "commandId");
        if (q.b(commandId, COMMAND_ZOOM_TO)) {
            if (readableArray != null) {
                zoomTo(zoomLayout, (float) readableArray.getDouble(0), (float) readableArray.getDouble(1));
            }
        } else if (q.b(commandId, COMMAND_UN_ZOOM)) {
            unzoom(zoomLayout);
        }
    }

    public final void unzoom(ZoomLayoutFixed view) {
        q.g(view, "view");
        view.moveToCenter(Float.valueOf(1.0f), true);
    }

    public final void zoomTo(ZoomLayoutFixed view, float f10, float f11) {
        q.g(view, "view");
        view.moveTo(2.0f, f10, f11, true);
    }
}
