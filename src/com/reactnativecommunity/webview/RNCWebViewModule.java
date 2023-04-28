package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.core.content.C2337a;
import androidx.core.content.FileProvider;
import androidx.core.util.C2515e;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.ThemedReactContext;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;
import p414x3.C13925a;

@ReactModule(name = RNCWebViewModule.MODULE_NAME)
/* loaded from: classes6.dex */
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    private static final String TAG = "RNCWebViewModule";
    protected static final C6153d shouldOverrideUrlLoadingLock = new C6153d();
    private DownloadManager.Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private File outputImage;
    private File outputVideo;
    private PermissionListener webviewFileDownloaderPermissionListener = new C6150a();

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$a */
    /* loaded from: classes6.dex */
    class C6150a implements PermissionListener {
        C6150a() {
        }

        @Override // com.facebook.react.modules.core.PermissionListener
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(RNCWebViewModule.this.getCurrentActivity().getApplicationContext(), "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.", 1).show();
            } else if (RNCWebViewModule.this.downloadRequest != null) {
                RNCWebViewModule.this.downloadFile();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$b */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C6151b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12560a;

        static {
            int[] iArr = new int[EnumC6152c.values().length];
            f12560a = iArr;
            try {
                iArr[EnumC6152c.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12560a[EnumC6152c.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$c */
    /* loaded from: classes6.dex */
    public enum EnumC6152c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);
        

        /* renamed from: k */
        private final String f12565k;

        EnumC6152c(String str) {
            this.f12565k = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$d */
    /* loaded from: classes6.dex */
    public static class C6153d {

        /* renamed from: a */
        private int f12566a = 1;

        /* renamed from: b */
        private final HashMap<Integer, AtomicReference<EnumC6154a>> f12567b = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.reactnativecommunity.webview.RNCWebViewModule$d$a */
        /* loaded from: classes6.dex */
        public enum EnumC6154a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected C6153d() {
        }

        /* renamed from: a */
        public synchronized AtomicReference<EnumC6154a> m26121a(Integer num) {
            return this.f12567b.get(num);
        }

        /* renamed from: b */
        public synchronized C2515e<Integer, AtomicReference<EnumC6154a>> m26120b() {
            int i;
            AtomicReference<EnumC6154a> atomicReference;
            i = this.f12566a;
            this.f12566a = i + 1;
            atomicReference = new AtomicReference<>(EnumC6154a.UNDECIDED);
            this.f12567b.put(Integer.valueOf(i), atomicReference);
            return new C2515e<>(Integer.valueOf(i), atomicReference);
        }

        /* renamed from: c */
        public synchronized void m26119c(Integer num) {
            this.f12567b.remove(num);
        }
    }

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(EnumC6152c.IMAGE.f12565k));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(EnumC6152c.VIDEO.f12565k));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (noAcceptTypesSet(strArr).booleanValue()) {
            return new String[]{EnumC6152c.DEFAULT.f12565k};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                String mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
                if (mimeTypeFromExtension != null) {
                    strArr2[i] = mimeTypeFromExtension;
                } else {
                    strArr2[i] = str;
                }
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    private File getCapturedFile(EnumC6152c cVar) {
        String str;
        String str2;
        int i = C6151b.f12560a[cVar.ordinal()];
        if (i == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i != 2) {
            str = "";
            str2 = str;
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(String.valueOf(System.currentTimeMillis()));
        sb2.append(str2);
        return File.createTempFile(str, str2, getReactApplicationContext().getExternalFilesDir(null));
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? EnumC6152c.DEFAULT.f12565k : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(File file) {
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return FileProvider.getUriForFile(reactApplicationContext, packageName + ".fileprovider", file);
    }

    private PermissionAwareActivity getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    private Intent getPhotoIntent() {
        Intent intent;
        Throwable e;
        Uri outputUri;
        try {
            File capturedFile = getCapturedFile(EnumC6152c.IMAGE);
            this.outputImage = capturedFile;
            outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } catch (IOException | IllegalArgumentException e2) {
            intent = null;
            e = e2;
        }
        try {
            intent.putExtra("output", outputUri);
        } catch (IOException e3) {
            e = e3;
            Log.e("CREATE FILE", "Error occurred while creating the File", e);
            e.printStackTrace();
            return intent;
        } catch (IllegalArgumentException e4) {
            e = e4;
            Log.e("CREATE FILE", "Error occurred while creating the File", e);
            e.printStackTrace();
            return intent;
        }
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
            }
            return uriArr;
        } else if (intent.getData() == null || i != -1) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
    }

    private Intent getVideoIntent() {
        Intent intent;
        Throwable e;
        Uri outputUri;
        try {
            File capturedFile = getCapturedFile(EnumC6152c.VIDEO);
            this.outputVideo = capturedFile;
            outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } catch (IOException | IllegalArgumentException e2) {
            intent = null;
            e = e2;
        }
        try {
            intent.putExtra("output", outputUri);
        } catch (IOException e3) {
            e = e3;
            Log.e("CREATE FILE", "Error occurred while creating the File", e);
            e.printStackTrace();
            return intent;
        } catch (IllegalArgumentException e4) {
            e = e4;
            Log.e("CREATE FILE", "Error occurred while creating the File", e);
            e.printStackTrace();
            return intent;
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$injectJavaScriptWithWebViewKey$1(String str, String str2, Promise promise) {
        RNCWebViewManager.C6144e eVar = (RNCWebViewManager.C6144e) C6161b1.f12579a.m26112a().get(str);
        if (eVar != null) {
            eVar.m26144h(str2);
            promise.resolve(null);
            return;
        }
        promise.reject("err", "Failed to inject javascript with webViewKey: " + str + ". WebView is null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseWebView$0(String str) {
        C6161b1 b1Var = C6161b1.f12579a;
        C6158b bVar = b1Var.m26111b().get(str);
        RNCWebViewManager.C6144e eVar = (RNCWebViewManager.C6144e) b1Var.m26112a().get(str);
        if (eVar == null) {
            C13925a.m2304H(TAG, "Failed to release webview with webViewKey: " + str);
            return;
        }
        if (bVar == null) {
            ViewGroup viewGroup = (ViewGroup) eVar.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(eVar);
            }
        } else if (bVar.m26116b() != eVar) {
            throw new IllegalStateException("internalWebViewMap has a mismatched webview with key: " + str);
        }
        if (eVar.f12522p != null) {
            ((ThemedReactContext) eVar.getContext()).removeLifecycleEventListener(eVar);
            eVar.m26148d();
        }
        b1Var.m26111b().remove(str);
        b1Var.m26112a().remove(str);
    }

    private Boolean noAcceptTypesSet(String[] strArr) {
        String str;
        boolean z = true;
        if (!(strArr.length == 0 || (strArr.length == 1 && (str = strArr[0]) != null && str.length() == 0))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void downloadFile() {
        ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
        Toast.makeText(getCurrentActivity().getApplicationContext(), "Downloading", 1).show();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public boolean grantFileDownloaderPermissions() {
        boolean z;
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        if (C2337a.m38137a(getCurrentActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            getPermissionAwareActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, this.webviewFileDownloaderPermissionListener);
        }
        return z;
    }

    @ReactMethod
    public void injectJavaScriptWithWebViewKey(final String str, final String str2, final Promise promise) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativecommunity.webview.c1
            @Override // java.lang.Runnable
            public final void run() {
                RNCWebViewModule.lambda$injectJavaScriptWithWebViewKey$1(str, str2, promise);
            }
        });
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        promise.resolve(Boolean.TRUE);
    }

    protected boolean needsCameraPermission() {
        try {
            if (Arrays.asList(getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA")) {
                if (C2337a.m38137a(getCurrentActivity(), "android.permission.CAMERA") != 0) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        boolean z;
        boolean z2;
        if (this.filePathCallback != null || this.filePathCallbackLegacy != null) {
            File file = this.outputImage;
            if (file == null || file.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            File file2 = this.outputVideo;
            if (file2 == null || file2.length() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i != 1) {
                if (i == 3) {
                    if (i2 != -1) {
                        this.filePathCallbackLegacy.onReceiveValue(null);
                    } else if (z) {
                        this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputImage));
                    } else if (z2) {
                        this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputVideo));
                    } else {
                        this.filePathCallbackLegacy.onReceiveValue(intent.getData());
                    }
                }
            } else if (i2 != -1) {
                ValueCallback<Uri[]> valueCallback = this.filePathCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else if (z) {
                this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputImage)});
            } else if (z2) {
                this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputVideo)});
            } else {
                this.filePathCallback.onReceiveValue(getSelectedFiles(intent, i2));
            }
            File file3 = this.outputImage;
            if (file3 != null && !z) {
                file3.delete();
            }
            File file4 = this.outputVideo;
            if (file4 != null && !z2) {
                file4.delete();
            }
            this.filePathCallback = null;
            this.filePathCallbackLegacy = null;
            this.outputImage = null;
            this.outputVideo = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void onShouldStartLoadWithRequestCallback(boolean z, int i) {
        C6153d.EnumC6154a aVar;
        AtomicReference<C6153d.EnumC6154a> a = shouldOverrideUrlLoadingLock.m26121a(Integer.valueOf(i));
        if (a != null) {
            synchronized (a) {
                if (z) {
                    aVar = C6153d.EnumC6154a.DO_NOT_OVERRIDE;
                } else {
                    aVar = C6153d.EnumC6154a.SHOULD_OVERRIDE;
                }
                a.set(aVar);
                a.notify();
            }
        }
    }

    @ReactMethod
    public void releaseWebView(final String str) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativecommunity.webview.d1
            @Override // java.lang.Runnable
            public final void run() {
                RNCWebViewModule.lambda$releaseWebView$0(str);
            }
        });
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
            arrayList.add(photoIntent);
        }
        if (acceptsVideo(str).booleanValue() && (videoIntent = getVideoIntent()) != null) {
            arrayList.add(videoIntent);
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(createChooser, 3);
        } else {
            Log.w(TAG, "there is no Activity to handle this Intent");
        }
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, EnumC6152c.DEFAULT.f12565k).booleanValue() || arrayContainsString(acceptedMimeType, EnumC6152c.IMAGE.f12565k).booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, EnumC6152c.DEFAULT.f12565k).booleanValue() || arrayContainsString(acceptedMimeType, EnumC6152c.VIDEO.f12565k).booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(EnumC6152c.DEFAULT.f12565k);
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
                arrayList.add(photoIntent);
            }
            if (acceptsVideo(strArr).booleanValue() && (videoIntent = getVideoIntent()) != null) {
                arrayList.add(videoIntent);
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent, 1);
        } else {
            Log.w(TAG, "there is no Activity to handle this Intent");
        }
        return true;
    }
}
