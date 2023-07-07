package com.discord.media;

import android.net.Uri;
import com.discord.media.react.events.CompressionProgressEvent;
import com.discord.media.utils.MediaResolver;
import com.discord.media.utils.VideoCompressionQuality;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import gf.x;
import hf.u;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.j;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.l;
import kotlinx.coroutines.y0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\"\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\"\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\"\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\"\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\"\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u001a\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001f0\u001eH\u0016J\b\u0010 \u001a\u00020\u000eH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001cH\u0007J\"\u0010$\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/discord/media/MediaManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mediaResolver", "Lcom/discord/media/utils/MediaResolver;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "addListener", "", "type", "", "cancelResolveToMediaFilePath", "uri", "options", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "convertBase64ToGIF", "convertBase64ToJPEG", "convertToCompatibleMOV", "convertToJPEG", "convertToVideoFilePath", "downloadMediaAsset", "mediaType", "", "getConstants", "", "", "getName", "invalidate", "removeListeners", "count", "resolveToMediaFilePath", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaManagerModule extends ReactContextBaseJavaModule {
    private final MediaResolver mediaResolver;
    private final ReactEvents reactEvents = new ReactEvents(x.a("compression-progress", f0.b(CompressionProgressEvent.class)));
    private final CoroutineScope scope = k0.b();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.mediaResolver = new MediaResolver(reactContext, new MediaManagerModule$mediaResolver$1(this));
    }

    @ReactMethod
    public final void addListener(String type) {
        q.g(type, "type");
    }

    @ReactMethod
    public final void cancelResolveToMediaFilePath(String uri, ReadableMap readableMap, Promise promise) {
        q.g(uri, "uri");
        q.g(promise, "promise");
        MediaResolver mediaResolver = this.mediaResolver;
        Uri parse = Uri.parse(uri);
        q.f(parse, "parse(uri)");
        mediaResolver.cancel(parse);
        promise.resolve(null);
    }

    @ReactMethod
    public final void convertBase64ToGIF(String uri, ReadableMap readableMap, Promise promise) {
        q.g(uri, "uri");
        q.g(promise, "promise");
        throw new IllegalStateException("Unused on Android".toString());
    }

    @ReactMethod
    public final void convertBase64ToJPEG(String uri, ReadableMap readableMap, Promise promise) {
        q.g(uri, "uri");
        q.g(promise, "promise");
        throw new IllegalStateException("Unused on Android".toString());
    }

    @ReactMethod
    public final void convertToCompatibleMOV(String uri, ReadableMap readableMap, Promise promise) {
        q.g(uri, "uri");
        q.g(promise, "promise");
        throw new IllegalStateException("Unused on Android".toString());
    }

    @ReactMethod
    public final void convertToJPEG(String uri, ReadableMap readableMap, Promise promise) {
        q.g(uri, "uri");
        q.g(promise, "promise");
        throw new IllegalStateException("Unused on Android".toString());
    }

    @ReactMethod
    public final void convertToVideoFilePath(String uri, ReadableMap readableMap, Promise promise) {
        q.g(uri, "uri");
        q.g(promise, "promise");
        throw new IllegalStateException("Unused on Android".toString());
    }

    @ReactMethod
    public final void downloadMediaAsset(String uri, int i10, Promise promise) {
        q.g(uri, "uri");
        q.g(promise, "promise");
        l.d(this.scope, y0.b(), null, new MediaManagerModule$downloadMediaAsset$1(this, uri, promise, null), 2, null);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, List<String>> getConstants() {
        List k10;
        Map<String, List<String>> e10;
        k10 = j.k("mp4", "mov", "png", "jpg", "jpeg", "gif", "webp");
        e10 = u.e(x.a("supportedExtensions", k10));
        return e10;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MediaManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        k0.c(this.scope, new CancellationException("Module destroyed"));
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }

    @ReactMethod
    public final void resolveToMediaFilePath(String uri, ReadableMap readableMap, Promise promise) {
        String str;
        q.g(uri, "uri");
        q.g(promise, "promise");
        Uri parse = Uri.parse(uri);
        int i10 = (int) (NativeMapExtensionsKt.getDouble(readableMap, "compressionQuality", 1.0d) * 100);
        VideoCompressionQuality.Companion companion = VideoCompressionQuality.Companion;
        if (readableMap != null) {
            str = NativeMapExtensionsKt.getStringOrEmpty(readableMap, "videoQuality");
        } else {
            str = null;
        }
        l.d(this.scope, null, null, new MediaManagerModule$resolveToMediaFilePath$1(this, parse, i10, companion.fromString(str), NativeMapExtensionsKt.getBoolean(readableMap, "isLowQuality", false), promise, NativeMapExtensionsKt.getBoolean(readableMap, "canCancelCompression", false), uri, null), 3, null);
    }
}
