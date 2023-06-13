package com.discord.core;

import android.net.Uri;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000f"}, d2 = {"Lcom/discord/core/LocalImageThumbnailManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/core/LocalImageThumbnailView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setLocalImageSource", "", "view", "source", "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LocalImageThumbnailManager extends SimpleViewManager<LocalImageThumbnailView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDLocalImageThumbnail";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/core/LocalImageThumbnailManager$Companion;", "", "()V", "NAME", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactProp(name = "localImageSource")
    public final void setLocalImageSource(LocalImageThumbnailView view, ReadableMap source) {
        q.g(view, "view");
        q.g(source, "source");
        Uri uri = Uri.parse(source.getString("uri"));
        q.f(uri, "uri");
        view.setLocalImageSource(uri, (int) source.getDouble("width"), (int) source.getDouble("height"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public LocalImageThumbnailView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return new LocalImageThumbnailView(reactContext, null, 0, 6, null);
    }
}
