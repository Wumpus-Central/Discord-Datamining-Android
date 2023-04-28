package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.C2337a;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.yalantis.ucrop.C6367a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class PickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int CAMERA_PICKER_REQUEST = 61111;
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "E_ACTIVITY_DOES_NOT_EXIST";
    private static final String E_CALLBACK_ERROR = "E_CALLBACK_ERROR";
    private static final String E_CAMERA_IS_NOT_AVAILABLE = "E_CAMERA_IS_NOT_AVAILABLE";
    private static final String E_CANNOT_LAUNCH_CAMERA = "E_CANNOT_LAUNCH_CAMERA";
    private static final String E_ERROR_WHILE_CLEANING_FILES = "E_ERROR_WHILE_CLEANING_FILES";
    private static final String E_FAILED_TO_OPEN_CAMERA = "E_FAILED_TO_OPEN_CAMERA";
    private static final String E_FAILED_TO_SHOW_PICKER = "E_FAILED_TO_SHOW_PICKER";
    private static final String E_NO_CAMERA_PERMISSION_KEY = "E_NO_CAMERA_PERMISSION";
    private static final String E_NO_CAMERA_PERMISSION_MSG = "User did not grant camera permission.";
    private static final String E_NO_IMAGE_DATA_FOUND = "E_NO_IMAGE_DATA_FOUND";
    private static final String E_NO_LIBRARY_PERMISSION_KEY = "E_NO_LIBRARY_PERMISSION";
    private static final String E_NO_LIBRARY_PERMISSION_MSG = "User did not grant library permission.";
    private static final String E_PICKER_CANCELLED_KEY = "E_PICKER_CANCELLED";
    private static final String E_PICKER_CANCELLED_MSG = "User cancelled image selection";
    private static final int IMAGE_PICKER_REQUEST = 61110;
    private Uri mCameraCaptureURI;
    private String mCurrentMediaPath;
    private ReadableMap options;
    private ReactApplicationContext reactContext;
    private String mediaType = "any";
    private boolean multiple = false;
    private boolean includeBase64 = false;
    private boolean includeExif = false;
    private boolean cropping = false;
    private boolean cropperCircleOverlay = false;
    private boolean freeStyleCropEnabled = false;
    private boolean showCropGuidelines = true;
    private boolean showCropFrame = true;
    private boolean hideBottomControls = false;
    private boolean enableRotationGesture = false;
    private boolean disableCropperColorSetters = false;
    private boolean useFrontCamera = false;
    private String cropperActiveWidgetColor = null;
    private String cropperStatusBarColor = null;
    private String cropperToolbarColor = null;
    private String cropperToolbarTitle = null;
    private String cropperToolbarWidgetColor = null;
    private int width = 0;
    private int height = 0;
    private C6125g resultCollector = new C6125g();
    private C6119a compression = new C6119a();

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$a */
    /* loaded from: classes6.dex */
    class CallableC6110a implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ PickerModule f12444a;

        /* renamed from: b */
        final /* synthetic */ Activity f12445b;

        /* renamed from: c */
        final /* synthetic */ Promise f12446c;

        CallableC6110a(PickerModule pickerModule, Activity activity, Promise promise) {
            this.f12444a = pickerModule;
            this.f12445b = activity;
            this.f12446c = promise;
        }

        /* renamed from: a */
        public Void call() {
            File file;
            try {
                file = new File(this.f12444a.getTmpDir(this.f12445b));
            } catch (Exception e) {
                e.printStackTrace();
                this.f12446c.reject(PickerModule.E_ERROR_WHILE_CLEANING_FILES, e.getMessage());
            }
            if (file.exists()) {
                this.f12444a.deleteRecursive(file);
                this.f12446c.resolve(null);
                return null;
            }
            throw new Exception("File does not exist");
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$b */
    /* loaded from: classes6.dex */
    class CallableC6111b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f12448a;

        /* renamed from: b */
        final /* synthetic */ PickerModule f12449b;

        /* renamed from: c */
        final /* synthetic */ Promise f12450c;

        CallableC6111b(String str, PickerModule pickerModule, Promise promise) {
            this.f12448a = str;
            this.f12449b = pickerModule;
            this.f12450c = promise;
        }

        /* renamed from: a */
        public Void call() {
            String str;
            File file;
            try {
                str = this.f12448a;
                if (str.startsWith("file://")) {
                    str = str.substring(7);
                }
                file = new File(str);
            } catch (Exception e) {
                e.printStackTrace();
                this.f12450c.reject(PickerModule.E_ERROR_WHILE_CLEANING_FILES, e.getMessage());
            }
            if (file.exists()) {
                this.f12449b.deleteRecursive(file);
                this.f12450c.resolve(null);
                return null;
            }
            throw new Exception("File does not exist. Path: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$c */
    /* loaded from: classes6.dex */
    public class C6112c implements PermissionListener {

        /* renamed from: k */
        final /* synthetic */ Promise f12452k;

        /* renamed from: l */
        final /* synthetic */ Callable f12453l;

        C6112c(Promise promise, Callable callable) {
            this.f12452k = promise;
            this.f12453l = callable;
        }

        @Override // com.facebook.react.modules.core.PermissionListener
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i == 1) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    String str = strArr[i2];
                    if (iArr[i2] == -1) {
                        if (str.equals("android.permission.CAMERA")) {
                            this.f12452k.reject(PickerModule.E_NO_CAMERA_PERMISSION_KEY, PickerModule.E_NO_CAMERA_PERMISSION_MSG);
                        } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            this.f12452k.reject(PickerModule.E_NO_LIBRARY_PERMISSION_KEY, PickerModule.E_NO_LIBRARY_PERMISSION_MSG);
                        } else {
                            this.f12452k.reject(PickerModule.E_NO_LIBRARY_PERMISSION_KEY, "Required permission missing");
                        }
                        return true;
                    }
                }
                try {
                    this.f12453l.call();
                } catch (Exception e) {
                    this.f12452k.reject(PickerModule.E_CALLBACK_ERROR, "Unknown error", e);
                }
            }
            return true;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$d */
    /* loaded from: classes6.dex */
    class CallableC6113d implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Activity f12455a;

        CallableC6113d(Activity activity) {
            this.f12455a = activity;
        }

        /* renamed from: a */
        public Void call() {
            PickerModule.this.initiateCamera(this.f12455a);
            return null;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$e */
    /* loaded from: classes6.dex */
    class CallableC6114e implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Activity f12457a;

        CallableC6114e(Activity activity) {
            this.f12457a = activity;
        }

        /* renamed from: a */
        public Void call() {
            PickerModule.this.initiatePicker(this.f12457a);
            return null;
        }
    }

    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$f */
    /* loaded from: classes6.dex */
    class CallableC6115f implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Activity f12459a;

        /* renamed from: b */
        final /* synthetic */ Uri f12460b;

        CallableC6115f(Activity activity, Uri uri) {
            this.f12459a = activity;
            this.f12460b = uri;
        }

        /* renamed from: a */
        public Void call() {
            PickerModule.this.startCropping(this.f12459a, this.f12460b);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$g */
    /* loaded from: classes6.dex */
    public class RunnableC6116g implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Activity f12462k;

        /* renamed from: l */
        final /* synthetic */ String f12463l;

        /* renamed from: m */
        final /* synthetic */ String f12464m;

        /* renamed from: n */
        final /* synthetic */ String f12465n;

        /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$g$a */
        /* loaded from: classes6.dex */
        class C6117a implements Callback {
            C6117a() {
            }

            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                String str = (String) objArr[0];
                try {
                    Bitmap validateVideo = PickerModule.this.validateVideo(str);
                    long lastModified = new File(str).lastModified();
                    long longValue = PickerModule.getVideoDuration(str).longValue();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt("width", validateVideo.getWidth());
                    writableNativeMap.putInt("height", validateVideo.getHeight());
                    writableNativeMap.putString("mime", RunnableC6116g.this.f12465n);
                    writableNativeMap.putInt("size", (int) new File(str).length());
                    writableNativeMap.putInt("duration", (int) longValue);
                    writableNativeMap.putString("path", "file://" + str);
                    writableNativeMap.putString("modificationDate", String.valueOf(lastModified));
                    PickerModule.this.resultCollector.m26218d(writableNativeMap);
                } catch (Exception e) {
                    PickerModule.this.resultCollector.m26219c(PickerModule.E_NO_IMAGE_DATA_FOUND, e);
                }
            }
        }

        /* renamed from: com.reactnative.ivpusic.imagepicker.PickerModule$g$b */
        /* loaded from: classes6.dex */
        class C6118b implements Callback {
            C6118b() {
            }

            @Override // com.facebook.react.bridge.Callback
            public void invoke(Object... objArr) {
                WritableNativeMap writableNativeMap = (WritableNativeMap) objArr[0];
                PickerModule.this.resultCollector.m26220b(writableNativeMap.getString("code"), writableNativeMap.getString("message"));
            }
        }

        RunnableC6116g(Activity activity, String str, String str2, String str3) {
            this.f12462k = activity;
            this.f12463l = str;
            this.f12464m = str2;
            this.f12465n = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            PickerModule.this.compression.m26235b(this.f12462k, PickerModule.this.options, this.f12463l, this.f12464m, new PromiseImpl(new C6117a(), new C6118b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    private void cameraPickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.m26220b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
        } else if (i2 == -1) {
            Uri uri = this.mCameraCaptureURI;
            if (uri == null) {
                this.resultCollector.m26220b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
            } else if (this.cropping) {
                new C6367a.C0186a().m25719e(Bitmap.CompressFormat.JPEG);
                startCropping(activity, uri);
            } else {
                try {
                    this.resultCollector.m26217e(1);
                    WritableMap selection = getSelection(activity, uri, true);
                    if (selection != null) {
                        this.resultCollector.m26218d(selection);
                    }
                } catch (Exception e) {
                    this.resultCollector.m26220b(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                }
            }
        }
    }

    private void configureCropperColors(C6367a.C0186a aVar) {
        String str = this.cropperActiveWidgetColor;
        if (str != null) {
            aVar.m25722b(Color.parseColor(str));
        }
        String str2 = this.cropperToolbarColor;
        if (str2 != null) {
            aVar.m25712l(Color.parseColor(str2));
        }
        String str3 = this.cropperStatusBarColor;
        if (str3 != null) {
            aVar.m25713k(Color.parseColor(str3));
        }
        String str4 = this.cropperToolbarWidgetColor;
        if (str4 != null) {
            aVar.m25710n(Color.parseColor(str4));
        }
    }

    private File createImageFile() {
        String str = "image-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, ".jpg", externalFilesDir);
        this.mCurrentMediaPath = "file:" + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private File createVideoFile() {
        String str = "video-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File createTempFile = File.createTempFile(str, ".mp4", externalFilesDir);
        this.mCurrentMediaPath = "file:" + createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private void croppingResult(Activity activity, int i, int i2, Intent intent) {
        if (intent != null) {
            Uri b = C6367a.m25729b(intent);
            if (b != null) {
                try {
                    if (this.width > 0 && this.height > 0) {
                        b = Uri.fromFile(this.compression.m26233d(this.reactContext, b.getPath(), this.width, this.height, 100, getMimeType(b.toString())));
                    }
                    WritableMap selection = getSelection(activity, b, false);
                    if (selection != null) {
                        selection.putMap("cropRect", getCroppedRectMap(intent));
                        this.resultCollector.m26217e(1);
                        this.resultCollector.m26218d(selection);
                        return;
                    }
                    throw new Exception("Cannot crop video files");
                } catch (Exception e) {
                    this.resultCollector.m26220b(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                }
            } else {
                this.resultCollector.m26220b(E_NO_IMAGE_DATA_FOUND, "Cannot find image data");
            }
        } else {
            this.resultCollector.m26220b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    private void getAsyncSelection(Activity activity, Uri uri, boolean z) {
        String resolveRealPath = resolveRealPath(activity, uri, z);
        if (resolveRealPath == null || resolveRealPath.isEmpty()) {
            this.resultCollector.m26220b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve asset path.");
            return;
        }
        String mimeType = getMimeType(resolveRealPath);
        if (mimeType == null || !mimeType.startsWith("video/")) {
            this.resultCollector.m26218d(getImage(activity, resolveRealPath));
        } else {
            getVideo(activity, resolveRealPath, mimeType);
        }
    }

    private String getBase64StringFromFile(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static WritableMap getCroppedRectMap(Intent intent) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("x", intent.getIntExtra("com.yalantis.ucrop.OffsetX", -1));
        writableNativeMap.putInt("y", intent.getIntExtra("com.yalantis.ucrop.OffsetY", -1));
        writableNativeMap.putInt("width", intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1));
        writableNativeMap.putInt("height", intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1));
        return writableNativeMap;
    }

    private WritableMap getImage(Activity activity, String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str.startsWith("http://") || str.startsWith("https://")) {
            throw new Exception("Cannot select remote files");
        }
        String path = this.compression.m26236a(this.reactContext, this.options, str, validateImage(str)).getPath();
        BitmapFactory.Options validateImage = validateImage(path);
        long lastModified = new File(str).lastModified();
        writableNativeMap.putString("path", "file://" + path);
        writableNativeMap.putInt("width", validateImage.outWidth);
        writableNativeMap.putInt("height", validateImage.outHeight);
        writableNativeMap.putString("mime", validateImage.outMimeType);
        writableNativeMap.putInt("size", (int) new File(path).length());
        writableNativeMap.putString("modificationDate", String.valueOf(lastModified));
        if (this.includeBase64) {
            writableNativeMap.putString("data", getBase64StringFromFile(path));
        }
        if (this.includeExif) {
            try {
                writableNativeMap.putMap("exif", C6120b.m26232a(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return writableNativeMap;
    }

    private String getMimeType(String str) {
        Uri fromFile = Uri.fromFile(new File(str));
        if (fromFile.getScheme().equals("content")) {
            return this.reactContext.getContentResolver().getType(fromFile);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(fromFile.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        }
        return null;
    }

    private WritableMap getSelection(Activity activity, Uri uri, boolean z) {
        String resolveRealPath = resolveRealPath(activity, uri, z);
        if (resolveRealPath == null || resolveRealPath.isEmpty()) {
            throw new Exception("Cannot resolve asset path.");
        }
        String mimeType = getMimeType(resolveRealPath);
        if (mimeType == null || !mimeType.startsWith("video/")) {
            return getImage(activity, resolveRealPath);
        }
        getVideo(activity, resolveRealPath, mimeType);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getTmpDir(Activity activity) {
        String str = activity.getCacheDir() + "/react-native-image-crop-picker";
        new File(str).mkdir();
        return str;
    }

    private void getVideo(Activity activity, String str, String str2) {
        validateVideo(str);
        new Thread(new RunnableC6116g(activity, str, getTmpDir(activity) + "/" + UUID.randomUUID().toString() + ".mp4", str2)).run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Long getVideoDuration(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
    }

    private void imagePickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.m26220b(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
        } else if (i2 == -1) {
            if (this.multiple) {
                ClipData clipData = intent.getClipData();
                try {
                    if (clipData == null) {
                        this.resultCollector.m26217e(1);
                        getAsyncSelection(activity, intent.getData(), false);
                        return;
                    }
                    this.resultCollector.m26217e(clipData.getItemCount());
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        getAsyncSelection(activity, clipData.getItemAt(i3).getUri(), false);
                    }
                } catch (Exception e) {
                    this.resultCollector.m26220b(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                }
            } else {
                Uri data = intent.getData();
                if (data == null) {
                    this.resultCollector.m26220b(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
                } else if (this.cropping) {
                    startCropping(activity, data);
                } else {
                    try {
                        getAsyncSelection(activity, data, false);
                    } catch (Exception e2) {
                        this.resultCollector.m26220b(E_NO_IMAGE_DATA_FOUND, e2.getMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initiateCamera(Activity activity) {
        File file;
        String str;
        try {
            if (this.mediaType.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                str = "android.media.action.VIDEO_CAPTURE";
                file = createVideoFile();
            } else {
                str = "android.media.action.IMAGE_CAPTURE";
                file = createImageFile();
            }
            Intent intent = new Intent(str);
            Uri uriForFile = FileProvider.getUriForFile(activity, activity.getApplicationContext().getPackageName() + ".provider", file);
            this.mCameraCaptureURI = uriForFile;
            intent.putExtra("output", uriForFile);
            if (this.useFrontCamera) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                this.resultCollector.m26220b(E_CANNOT_LAUNCH_CAMERA, "Cannot launch camera");
            } else {
                activity.startActivityForResult(intent, CAMERA_PICKER_REQUEST);
            }
        } catch (Exception e) {
            this.resultCollector.m26219c(E_FAILED_TO_OPEN_CAMERA, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initiatePicker(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            if (!this.cropping && !this.mediaType.equals("photo")) {
                if (this.mediaType.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    intent.setType("video/*");
                } else {
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                intent.setFlags(67108864);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.multiple);
                intent.addCategory("android.intent.category.OPENABLE");
                activity.startActivityForResult(Intent.createChooser(intent, "Pick an image"), IMAGE_PICKER_REQUEST);
            }
            intent.setType("image/*");
            if (this.cropping) {
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/jpeg", "image/png"});
            }
            intent.setFlags(67108864);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.multiple);
            intent.addCategory("android.intent.category.OPENABLE");
            activity.startActivityForResult(Intent.createChooser(intent, "Pick an image"), IMAGE_PICKER_REQUEST);
        } catch (Exception e) {
            this.resultCollector.m26219c(E_FAILED_TO_SHOW_PICKER, e);
        }
    }

    private boolean isCameraAvailable(Activity activity) {
        if (activity.getPackageManager().hasSystemFeature("android.hardware.camera") || activity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            return true;
        }
        return false;
    }

    private void permissionsCheck(Activity activity, Promise promise, List<String> list, Callable<Void> callable) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList(list);
        if (Build.VERSION.SDK_INT > 28) {
            arrayList2.remove("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        for (String str : arrayList2) {
            if (C2337a.m38137a(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ((PermissionAwareActivity) activity).requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 1, new C6112c(promise, callable));
            return;
        }
        try {
            callable.call();
        } catch (Exception e) {
            promise.reject(E_CALLBACK_ERROR, "Unknown error", e);
        }
    }

    private String resolveRealPath(Activity activity, Uri uri, boolean z) {
        if (z) {
            return Uri.parse(this.mCurrentMediaPath).getPath();
        }
        return C6124f.m26224b(activity, uri);
    }

    private void setConfiguration(ReadableMap readableMap) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        boolean z4;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (readableMap.hasKey("mediaType")) {
            str = readableMap.getString("mediaType");
        } else {
            str = "any";
        }
        this.mediaType = str;
        boolean z12 = true;
        if (!readableMap.hasKey("multiple") || !readableMap.getBoolean("multiple")) {
            z = false;
        } else {
            z = true;
        }
        this.multiple = z;
        if (!readableMap.hasKey("includeBase64") || !readableMap.getBoolean("includeBase64")) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.includeBase64 = z2;
        if (!readableMap.hasKey("includeExif") || !readableMap.getBoolean("includeExif")) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.includeExif = z3;
        if (readableMap.hasKey("width")) {
            i = readableMap.getInt("width");
        } else {
            i = 0;
        }
        this.width = i;
        if (readableMap.hasKey("height")) {
            i2 = readableMap.getInt("height");
        } else {
            i2 = 0;
        }
        this.height = i2;
        if (!readableMap.hasKey("cropping") || !readableMap.getBoolean("cropping")) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.cropping = z4;
        String str6 = null;
        if (readableMap.hasKey("cropperActiveWidgetColor")) {
            str2 = readableMap.getString("cropperActiveWidgetColor");
        } else {
            str2 = null;
        }
        this.cropperActiveWidgetColor = str2;
        if (readableMap.hasKey("cropperStatusBarColor")) {
            str3 = readableMap.getString("cropperStatusBarColor");
        } else {
            str3 = null;
        }
        this.cropperStatusBarColor = str3;
        if (readableMap.hasKey("cropperToolbarColor")) {
            str4 = readableMap.getString("cropperToolbarColor");
        } else {
            str4 = null;
        }
        this.cropperToolbarColor = str4;
        if (readableMap.hasKey("cropperToolbarTitle")) {
            str5 = readableMap.getString("cropperToolbarTitle");
        } else {
            str5 = null;
        }
        this.cropperToolbarTitle = str5;
        if (readableMap.hasKey("cropperToolbarWidgetColor")) {
            str6 = readableMap.getString("cropperToolbarWidgetColor");
        }
        this.cropperToolbarWidgetColor = str6;
        if (!readableMap.hasKey("cropperCircleOverlay") || !readableMap.getBoolean("cropperCircleOverlay")) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.cropperCircleOverlay = z5;
        if (!readableMap.hasKey("freeStyleCropEnabled") || !readableMap.getBoolean("freeStyleCropEnabled")) {
            z6 = false;
        } else {
            z6 = true;
        }
        this.freeStyleCropEnabled = z6;
        if (!readableMap.hasKey("showCropGuidelines") || readableMap.getBoolean("showCropGuidelines")) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.showCropGuidelines = z7;
        if (!readableMap.hasKey("showCropFrame") || readableMap.getBoolean("showCropFrame")) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.showCropFrame = z8;
        if (!readableMap.hasKey("hideBottomControls") || !readableMap.getBoolean("hideBottomControls")) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.hideBottomControls = z9;
        if (!readableMap.hasKey("enableRotationGesture") || !readableMap.getBoolean("enableRotationGesture")) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.enableRotationGesture = z10;
        if (!readableMap.hasKey("disableCropperColorSetters") || !readableMap.getBoolean("disableCropperColorSetters")) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.disableCropperColorSetters = z11;
        if (!readableMap.hasKey("useFrontCamera") || !readableMap.getBoolean("useFrontCamera")) {
            z12 = false;
        }
        this.useFrontCamera = z12;
        this.options = readableMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCropping(Activity activity, Uri uri) {
        String str;
        int i;
        Bitmap.CompressFormat a = C6122d.m26226a(getMimeType(uri.toString()));
        C6367a.C0186a aVar = new C6367a.C0186a();
        aVar.m25719e(a);
        aVar.m25718f(100);
        aVar.m25720d(this.cropperCircleOverlay);
        aVar.m25717g(this.freeStyleCropEnabled);
        aVar.m25714j(this.showCropGuidelines);
        aVar.m25715i(this.showCropFrame);
        aVar.m25716h(this.hideBottomControls);
        String str2 = this.cropperToolbarTitle;
        if (str2 != null) {
            aVar.m25711m(str2);
        }
        if (this.enableRotationGesture) {
            aVar.m25721c(3, 3, 3);
        }
        if (!this.disableCropperColorSetters) {
            configureCropperColors(aVar);
        }
        if (a == Bitmap.CompressFormat.PNG) {
            str = ".png";
        } else {
            str = ".jpg";
        }
        String tmpDir = getTmpDir(activity);
        C6367a g = C6367a.m25728c(uri, Uri.fromFile(new File(tmpDir, UUID.randomUUID().toString() + str))).m25724g(aVar);
        int i2 = this.width;
        if (i2 > 0 && (i = this.height) > 0) {
            g.m25725f(i2, i);
        }
        g.m25727d(activity);
    }

    private BitmapFactory.Options validateImage(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outMimeType != null && options.outWidth != 0 && options.outHeight != 0) {
            return options;
        }
        throw new Exception("Invalid image selected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap validateVideo(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new Exception("Cannot retrieve video data");
    }

    @ReactMethod
    public void clean(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC6110a(this, currentActivity, promise));
        }
    }

    @ReactMethod
    public void cleanSingle(String str, Promise promise) {
        if (str == null) {
            promise.reject(E_ERROR_WHILE_CLEANING_FILES, "Cannot cleanup empty path");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC6111b(str, this, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageCropPicker";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == IMAGE_PICKER_REQUEST) {
            imagePickerResult(activity, i, i2, intent);
        } else if (i == CAMERA_PICKER_REQUEST) {
            cameraPickerResult(activity, i, i2, intent);
        } else if (i == 69) {
            croppingResult(activity, i, i2, intent);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openCamera(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else if (!isCameraAvailable(currentActivity)) {
            promise.reject(E_CAMERA_IS_NOT_AVAILABLE, "Camera not available");
        } else {
            setConfiguration(readableMap);
            this.resultCollector.m26216f(promise, false);
            permissionsCheck(currentActivity, promise, Arrays.asList("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC6113d(currentActivity));
        }
    }

    @ReactMethod
    public void openCropper(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.m26216f(promise, false);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC6115f(currentActivity, Uri.parse(readableMap.getString("path"))));
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.m26216f(promise, this.multiple);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC6114e(currentActivity));
    }
}
