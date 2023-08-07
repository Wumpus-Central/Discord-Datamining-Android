package com.discord.media;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.discord.media.react.events.PhotoLibraryChangedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import jf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u000bH\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/media/PhotoLibraryHelperModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "listener", "com/discord/media/PhotoLibraryHelperModule$listener$1", "Lcom/discord/media/PhotoLibraryHelperModule$listener$1;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "doesAttachmentExist", "uri", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getName", "register", "registerEventListener", "removeEventListener", "removeListeners", "count", "", "unregister", "Companion", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class PhotoLibraryHelperModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String PHOTO_LIBRARY_CHANGED = "photoLibraryChanged";
    private final PhotoLibraryHelperModule$listener$1 listener;
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents = new ReactEvents(x.a(PHOTO_LIBRARY_CHANGED, f0.b(PhotoLibraryChangedEvent.class)));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/media/PhotoLibraryHelperModule$Companion;", "", "()V", "PHOTO_LIBRARY_CHANGED", "", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    
    public PhotoLibraryHelperModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
        this.reactContext = reactContext;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.listener = new ContentObserver(handler) { 
            @Override 
            public void onChange(boolean z10, Uri uri) {
                ReactEvents reactEvents;
                ReactApplicationContext reactApplicationContext;
                super.onChange(z10, uri);
                reactEvents = PhotoLibraryHelperModule.this.reactEvents;
                reactApplicationContext = PhotoLibraryHelperModule.this.reactContext;
                reactEvents.emitModuleEvent(reactApplicationContext, new PhotoLibraryChangedEvent());
            }
        };
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
        q.h(type, "type");
        if (q.c(type, PHOTO_LIBRARY_CHANGED)) {
            register();
        }
    }

    @ReactMethod
    public final void doesAttachmentExist(String uri, Promise promise) {
        int i10;
        q.h(uri, "uri");
        q.h(promise, "promise");
        Cursor query = this.reactContext.getContentResolver().query(Uri.parse(uri), new String[]{"_id"}, null, null, null, null);
        boolean z10 = false;
        if (query != null) {
            i10 = query.getCount();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            z10 = true;
        }
        promise.resolve(Boolean.valueOf(z10));
        if (query != null) {
            query.close();
        }
    }

    @Override 
    public String getName() {
        return "PhotoLibraryHelper";
    }

    @ReactMethod
    public final void registerEventListener(String type) {
        q.h(type, "type");
        if (q.c(type, PHOTO_LIBRARY_CHANGED)) {
            register();
        }
    }

    @ReactMethod
    public final void removeEventListener(String type) {
        q.h(type, "type");
        if (q.c(type, PHOTO_LIBRARY_CHANGED)) {
            unregister();
        }
    }

    @ReactMethod
    public final void removeListeners(int i10) {
        removeEventListener(PHOTO_LIBRARY_CHANGED);
    }
}
