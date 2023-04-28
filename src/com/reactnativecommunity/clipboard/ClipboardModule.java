package com.reactnativecommunity.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@ReactModule(name = ClipboardModule.NAME)
/* loaded from: classes6.dex */
public class ClipboardModule extends ContextBaseJavaModule {
    public static final String CLIPBOARD_TEXT_CHANGED = "RNCClipboard_TEXT_CHANGED";
    public static final String NAME = "RNCClipboard";
    private ClipboardManager.OnPrimaryClipChangedListener listener = null;
    private ReactApplicationContext reactContext;

    /* renamed from: com.reactnativecommunity.clipboard.ClipboardModule$a */
    /* loaded from: classes6.dex */
    class ClipboardManager$OnPrimaryClipChangedListenerC6126a implements ClipboardManager.OnPrimaryClipChangedListener {
        ClipboardManager$OnPrimaryClipChangedListenerC6126a() {
        }

        @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
        public void onPrimaryClipChanged() {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) ClipboardModule.this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(ClipboardModule.CLIPBOARD_TEXT_CHANGED, null);
        }
    }

    public ClipboardModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private ClipboardManager getClipboardService() {
        Context context = getContext();
        getContext();
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getImage(Promise promise) {
        Uri uri;
        ContentResolver contentResolver;
        String type;
        ClipboardManager clipboardService = getClipboardService();
        if (!clipboardService.hasPrimaryClip()) {
            promise.resolve("");
        } else if (clipboardService.getPrimaryClipDescription().hasMimeType("text/plain")) {
            promise.resolve("");
        } else {
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (!(primaryClip == null || (uri = primaryClip.getItemAt(0).getUri()) == null || (type = (contentResolver = this.reactContext.getContentResolver()).getType(uri)) == null || (!type.equals("image/jpeg") && !type.equals("image/png") && !type.equals("image/jpg")))) {
                uri.getPath();
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (type.equals("image/jpeg") || type.equals("image/jpg")) {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    }
                    if (type.equals("image/png")) {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    }
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    StringBuilder sb2 = new StringBuilder("data:" + type + ";base64,");
                    sb2.append(encodeToString);
                    promise.resolve(sb2.toString());
                } catch (IOException e) {
                    promise.reject(e);
                    e.printStackTrace();
                }
            }
            promise.resolve("");
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getString(Promise promise) {
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() < 1) {
                promise.resolve("");
            } else {
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                promise.resolve("" + ((Object) itemAt.getText()));
            }
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void hasString(Promise promise) {
        boolean z;
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            if (primaryClip != null) {
                z = true;
                if (primaryClip.getItemCount() >= 1) {
                    promise.resolve(Boolean.valueOf(z));
                }
            }
            z = false;
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void removeListener() {
        if (this.listener != null) {
            try {
                getClipboardService().removePrimaryClipChangedListener(this.listener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setListener() {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipboardManager$OnPrimaryClipChangedListenerC6126a aVar = new ClipboardManager$OnPrimaryClipChangedListenerC6126a();
            this.listener = aVar;
            clipboardService.addPrimaryClipChangedListener(aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void setString(String str) {
        try {
            getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
