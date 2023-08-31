package com.discord.core;

import android.net.Uri;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerDelegate;
import com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = LocalImageThumbnailViewManager.NAME)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/core/LocalImageThumbnailViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/core/LocalImageThumbnailView;", "Lcom/facebook/react/viewmanagers/DCDLocalImageThumbnailManagerInterface;", "()V", "mDelegate", "Lcom/facebook/react/viewmanagers/DCDLocalImageThumbnailManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "setLocalImageSource", "", "view", "source", "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class LocalImageThumbnailViewManager extends SimpleViewManager<LocalImageThumbnailView> implements DCDLocalImageThumbnailManagerInterface<LocalImageThumbnailView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDLocalImageThumbnail";
    private final DCDLocalImageThumbnailManagerDelegate<LocalImageThumbnailView, LocalImageThumbnailViewManager> mDelegate = new DCDLocalImageThumbnailManagerDelegate<>(this);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/core/LocalImageThumbnailViewManager$Companion;", "", "()V", "NAME", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override 
    public String getName() {
        return NAME;
    }

    
    @Override 
    public LocalImageThumbnailView createViewInstance(ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        return new LocalImageThumbnailView(reactContext, null, 0, 6, null);
    }

    
    @Override 
    public DCDLocalImageThumbnailManagerDelegate<LocalImageThumbnailView, LocalImageThumbnailViewManager> getDelegate() {
        return this.mDelegate;
    }

    @ReactProp(name = "localImageSource")
    public void setLocalImageSource(LocalImageThumbnailView view, ReadableMap readableMap) {
        q.h(view, "view");
        if (readableMap != null) {
            Uri uri = Uri.parse(readableMap.getString("uri"));
            q.g(uri, "uri");
            view.setLocalImageSource(uri, (int) readableMap.getDouble("width"), (int) readableMap.getDouble("height"));
        }
    }
}
