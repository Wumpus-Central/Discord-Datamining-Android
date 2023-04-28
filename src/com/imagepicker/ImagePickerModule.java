package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;

@ReactModule(name = ImagePickerModule.NAME)
/* loaded from: classes6.dex */
public class ImagePickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    static final String NAME = "ImagePickerManager";
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 13001;
    public static final int REQUEST_LAUNCH_LIBRARY = 13003;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 13002;
    Callback callback;
    Uri cameraCaptureURI;
    private Uri fileUri;
    UUID identifier;
    C6000e options;
    final ReactApplicationContext reactContext;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void launchCamera(ReadableMap readableMap, Callback callback) {
        Intent intent;
        int i;
        File file;
        if (!C6001f.m26510w(this.reactContext)) {
            callback.invoke(C6001f.m26523j(C6001f.f12112b, null));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(C6001f.m26523j(C6001f.f12114d, "Activity error"));
        } else if (!C6001f.m26509x(this.reactContext, currentActivity)) {
            callback.invoke(C6001f.m26523j(C6001f.f12114d, C6001f.f12119i));
        } else {
            this.callback = callback;
            C6000e eVar = new C6000e(readableMap);
            this.options = eVar;
            if (!eVar.f12107h.booleanValue() || Build.VERSION.SDK_INT > 28 || C6001f.m26511v(currentActivity)) {
                this.identifier = UUID.randomUUID();
                if (this.options.f12110k.equals(C6001f.f12116f)) {
                    intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.videoQuality", this.options.f12103d);
                    int i2 = this.options.f12108i;
                    if (i2 > 0) {
                        intent.putExtra("android.intent.extra.durationLimit", i2);
                    }
                    file = C6001f.m26530c(this.reactContext, this.identifier, "mp4");
                    this.cameraCaptureURI = C6001f.m26529d(file, this.reactContext);
                    i = REQUEST_LAUNCH_VIDEO_CAPTURE;
                } else {
                    intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    file = C6001f.m26530c(this.reactContext, this.identifier, "jpg");
                    this.cameraCaptureURI = C6001f.m26529d(file, this.reactContext);
                    i = REQUEST_LAUNCH_IMAGE_CAPTURE;
                }
                if (this.options.f12109j.booleanValue()) {
                    C6001f.m26535E(intent);
                }
                this.fileUri = Uri.fromFile(file);
                intent.putExtra("output", this.cameraCaptureURI);
                intent.addFlags(3);
                try {
                    currentActivity.startActivityForResult(intent, i);
                } catch (ActivityNotFoundException e) {
                    callback.invoke(C6001f.m26523j(C6001f.f12114d, e.getMessage()));
                    this.callback = null;
                }
            } else {
                callback.invoke(C6001f.m26523j(C6001f.f12113c, null));
                this.callback = null;
            }
        }
    }

    @ReactMethod
    public void launchImageLibrary(ReadableMap readableMap, Callback callback) {
        boolean z;
        Intent intent;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(C6001f.m26523j(C6001f.f12114d, "Activity error"));
            return;
        }
        this.callback = callback;
        C6000e eVar = new C6000e(readableMap);
        this.options = eVar;
        if (eVar.f12100a == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = eVar.f12110k.equals(C6001f.f12115e);
        boolean equals2 = this.options.f12110k.equals(C6001f.f12116f);
        boolean equals3 = this.options.f12110k.equals(C6001f.f12117g);
        if (!z || (!equals && !equals2)) {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        } else {
            intent = new Intent("android.intent.action.PICK");
        }
        if (!z) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (equals) {
            intent.setType("image/*");
        } else if (equals2) {
            intent.setType("video/*");
        } else if (equals3) {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        } else {
            intent.setType("*/*");
        }
        try {
            currentActivity.startActivityForResult(Intent.createChooser(intent, null), REQUEST_LAUNCH_LIBRARY);
        } catch (ActivityNotFoundException e) {
            callback.invoke(C6001f.m26523j(C6001f.f12114d, e.getMessage()));
            this.callback = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (C6001f.m26539A(i) && this.callback != null) {
            if (i2 != -1) {
                if (i == 13001) {
                    C6001f.m26528e(this.fileUri);
                }
                this.callback.invoke(C6001f.m26524i());
                this.callback = null;
                return;
            }
            switch (i) {
                case REQUEST_LAUNCH_IMAGE_CAPTURE /* 13001 */:
                    if (this.options.f12107h.booleanValue()) {
                        C6001f.m26536D(this.cameraCaptureURI, this.identifier, this.reactContext, "photo");
                    }
                    onAssetsObtained(Collections.singletonList(this.fileUri));
                    return;
                case REQUEST_LAUNCH_VIDEO_CAPTURE /* 13002 */:
                    if (this.options.f12107h.booleanValue()) {
                        C6001f.m26536D(this.cameraCaptureURI, this.identifier, this.reactContext, MediaStreamTrack.VIDEO_TRACK_KIND);
                    }
                    onAssetsObtained(Collections.singletonList(this.fileUri));
                    return;
                case REQUEST_LAUNCH_LIBRARY /* 13003 */:
                    onAssetsObtained(C6001f.m26532a(intent));
                    return;
                default:
                    return;
            }
        }
    }

    void onAssetsObtained(List<Uri> list) {
        try {
            try {
                this.callback.invoke(C6001f.m26513t(list, this.identifier, this.options, this.reactContext));
            } catch (RuntimeException e) {
                this.callback.invoke(C6001f.m26523j(C6001f.f12114d, e.getMessage()));
            }
        } finally {
            this.callback = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
