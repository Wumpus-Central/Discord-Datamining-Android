package com.discord.media;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\n\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m15073d2 = {"Lcom/discord/media/PhotoLibraryHelperModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "eventEmitter", "Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "getEventEmitter", "()Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;", "listener", "com/discord/media/PhotoLibraryHelperModule$listener$1", "Lcom/discord/media/PhotoLibraryHelperModule$listener$1;", "addListener", "", "type", "", "doesAttachmentExist", "uri", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getName", "register", "registerEventListener", "removeEventListener", "removeListeners", "count", "", "unregister", "Companion", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class PhotoLibraryHelperModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String PHOTO_LIBRARY_CHANGED = "photoLibraryChanged";
    private final PhotoLibraryHelperModule$listener$1 listener;
    private final ReactApplicationContext reactContext;

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/media/PhotoLibraryHelperModule$Companion;", "", "()V", "PHOTO_LIBRARY_CHANGED", "", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.discord.media.PhotoLibraryHelperModule$listener$1] */
    public PhotoLibraryHelperModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9677q.m14633g(reactContext, "reactContext");
        this.reactContext = reactContext;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.listener = new ContentObserver(handler) { // from class: com.discord.media.PhotoLibraryHelperModule$listener$1
            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter;
                super.onChange(z, uri);
                eventEmitter = PhotoLibraryHelperModule.this.getEventEmitter();
                eventEmitter.emit(PhotoLibraryHelperModule.PHOTO_LIBRARY_CHANGED, NativeMapExtensionsKt.nativeMapOf(new Pair[0]));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        JavaScriptModule jSModule = getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        C9677q.m14634f(jSModule, "reactApplicationContext.…EventEmitter::class.java)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    private final void register() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.reactContext.getContentResolver().registerContentObserver(MediaStore.Files.getContentUri("external"), true, this.listener);
            return;
        }
        this.reactContext.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.listener);
        this.reactContext.getContentResolver().registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.listener);
    }

    private final void unregister() {
        this.reactContext.getContentResolver().unregisterContentObserver(this.listener);
    }

    @ReactMethod
    public final void addListener(String type) {
        C9677q.m14633g(type, "type");
        if (C9677q.m14638b(type, PHOTO_LIBRARY_CHANGED)) {
            register();
        }
    }

    @ReactMethod
    public final void doesAttachmentExist(String uri, Promise promise) {
        int i;
        C9677q.m14633g(uri, "uri");
        C9677q.m14633g(promise, "promise");
        Cursor query = this.reactContext.getContentResolver().query(Uri.parse(uri), new String[]{"_id"}, null, null, null, null);
        boolean z = false;
        if (query != null) {
            i = query.getCount();
        } else {
            i = 0;
        }
        if (i > 0) {
            z = true;
        }
        promise.resolve(Boolean.valueOf(z));
        if (query != null) {
            query.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PhotoLibraryHelper";
    }

    @ReactMethod
    public final void registerEventListener(String type) {
        C9677q.m14633g(type, "type");
        if (C9677q.m14638b(type, PHOTO_LIBRARY_CHANGED)) {
            register();
        }
    }

    @ReactMethod
    public final void removeEventListener(String type) {
        C9677q.m14633g(type, "type");
        if (C9677q.m14638b(type, PHOTO_LIBRARY_CHANGED)) {
            unregister();
        }
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }
}
