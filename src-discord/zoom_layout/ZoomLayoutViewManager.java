package com.discord.zoom_layout;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\"\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/discord/zoom_layout/ZoomLayoutViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/zoom_layout/ZoomLayoutFixed;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "gestureEnabled", "", "view", "", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "maximumZoomScale", "", "minimumZoomScale", "receiveCommand", "zoomLayout", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "zoom_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZoomLayoutViewManager extends ViewGroupManager<ZoomLayoutFixed> {
    @ReactProp(name = "gestureEnabled")
    public final void gestureEnabled(ZoomLayoutFixed view, boolean z10) {
        q.g(view, "view");
        ZoomLayoutManagerImpl.INSTANCE.gestureEnabled(view, z10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return ZoomLayoutManagerImpl.INSTANCE.getExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return ZoomLayoutManagerImpl.NAME;
    }

    @ReactProp(name = "maximumZoomScale")
    public final void maximumZoomScale(ZoomLayoutFixed view, float f10) {
        q.g(view, "view");
        ZoomLayoutManagerImpl.INSTANCE.maximumZoomScale(view, f10);
    }

    @ReactProp(name = "minimumZoomScale")
    public final void minimumZoomScale(ZoomLayoutFixed view, float f10) {
        q.g(view, "view");
        ZoomLayoutManagerImpl.INSTANCE.minimumZoomScale(view, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ZoomLayoutFixed createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return ZoomLayoutManagerImpl.INSTANCE.createViewInstance(reactContext);
    }

    public void receiveCommand(ZoomLayoutFixed zoomLayout, String commandId, ReadableArray readableArray) {
        q.g(zoomLayout, "zoomLayout");
        q.g(commandId, "commandId");
        ZoomLayoutManagerImpl.INSTANCE.receiveCommand(zoomLayout, commandId, readableArray);
    }
}
