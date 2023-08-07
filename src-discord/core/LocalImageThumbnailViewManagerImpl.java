package com.discord.core;

import android.net.Uri;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/core/LocalImageThumbnailViewManagerImpl;", "", "()V", "NAME", "", "createViewInstance", "Lcom/discord/core/LocalImageThumbnailView;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setLocalImageSource", "", "view", "source", "Lcom/facebook/react/bridge/ReadableMap;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class LocalImageThumbnailViewManagerImpl {
    public static final LocalImageThumbnailViewManagerImpl INSTANCE = new LocalImageThumbnailViewManagerImpl();
    public static final String NAME = "DCDLocalImageThumbnail";

    private LocalImageThumbnailViewManagerImpl() {
    }

    public final LocalImageThumbnailView createViewInstance(ThemedReactContext reactContext) {
        q.h(reactContext, "reactContext");
        return new LocalImageThumbnailView(reactContext, null, 0, 6, null);
    }

    public final void setLocalImageSource(LocalImageThumbnailView view, ReadableMap source) {
        q.h(view, "view");
        q.h(source, "source");
        Uri uri = Uri.parse(source.getString("uri"));
        q.g(uri, "uri");
        view.setLocalImageSource(uri, (int) source.getDouble("width"), (int) source.getDouble("height"));
    }
}
