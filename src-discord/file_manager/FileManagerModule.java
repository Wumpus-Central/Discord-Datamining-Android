package com.discord.file_manager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import com.discord.codegen.NativeFileManagerSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.l;
import kotlinx.coroutines.y0;
import nf.x;
import of.v;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0014J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tJ \u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J(\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J0\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R:\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bj\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/discord/file_manager/FileManagerModule;", "Lcom/discord/codegen/NativeFileManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "storageDirs", "Ljava/util/HashMap;", "", "kotlin.jvm.PlatformType", "Lkotlin/collections/HashMap;", "fileExists", "", "path", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getName", "getSize", "uri", "getTypedExportedConstants", "", "", "openRawResource", "Ljava/io/InputStream;", "assetUri", "readAsset", "encoding", "readFile", "saveFileToGallery", "fileName", "fileType", "writeFile", "storageDir", "data", "Companion", "file_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FileManagerModule extends NativeFileManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNFileManager";
    private final CoroutineScope ioScope = k0.a(y0.b());
    private final HashMap<String, String> storageDirs;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/file_manager/FileManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "file_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.g(reactContext, "reactContext");
            return new FileManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        HashMap<String, String> j10;
        q.g(reactContext, "reactContext");
        j10 = v.j(x.a("cache", getReactApplicationContext().getCacheDir().getAbsolutePath()), x.a("documents", getReactApplicationContext().getFilesDir().getAbsolutePath()));
        this.storageDirs = j10;
    }

    @Override // com.discord.codegen.NativeFileManagerSpec
    public void fileExists(String path, Promise promise) {
        q.g(path, "path");
        q.g(promise, "promise");
        l.d(this.ioScope, null, null, new FileManagerModule$fileExists$1(promise, path, null), 3, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.discord.codegen.NativeFileManagerSpec
    public void getSize(String uri, Promise promise) {
        q.g(uri, "uri");
        q.g(promise, "promise");
        l.d(this.ioScope, null, null, new FileManagerModule$getSize$1(this, uri, promise, null), 3, null);
    }

    @Override // com.discord.codegen.NativeFileManagerSpec
    protected Map<String, Object> getTypedExportedConstants() {
        Map<String, Object> l10;
        String str = this.storageDirs.get("documents");
        q.d(str);
        l10 = v.l(x.a("DocumentsDirPath", str));
        return l10;
    }

    public final InputStream openRawResource(String assetUri) {
        q.g(assetUri, "assetUri");
        InputStream openRawResource = getReactApplicationContext().getResources().openRawResource(getReactApplicationContext().getResources().getIdentifier(assetUri, "raw", getReactApplicationContext().getPackageName()));
        q.f(openRawResource, "reactApplicationContext.…urces.openRawResource(id)");
        return openRawResource;
    }

    @Override // com.discord.codegen.NativeFileManagerSpec
    public void readAsset(String assetUri, String encoding, Promise promise) {
        q.g(assetUri, "assetUri");
        q.g(encoding, "encoding");
        q.g(promise, "promise");
        l.d(this.ioScope, null, null, new FileManagerModule$readAsset$1(assetUri, this, encoding, promise, null), 3, null);
    }

    @Override // com.discord.codegen.NativeFileManagerSpec
    public void readFile(String path, String encoding, Promise promise) {
        q.g(path, "path");
        q.g(encoding, "encoding");
        q.g(promise, "promise");
        l.d(this.ioScope, null, null, new FileManagerModule$readFile$1(path, encoding, promise, null), 3, null);
    }

    @Override // com.discord.codegen.NativeFileManagerSpec
    public void saveFileToGallery(String uri, String fileName, String fileType, Promise promise) {
        q.g(uri, "uri");
        q.g(fileName, "fileName");
        q.g(fileType, "fileType");
        q.g(promise, "promise");
        Bitmap decodeStream = BitmapFactory.decodeStream(getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(uri)));
        if (decodeStream != null) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), fileName);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (q.b(fileType, "PNG")) {
                    decodeStream.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                } else if (q.b(fileType, "JPEG")) {
                    decodeStream.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                MediaScannerConnection.scanFile(getReactApplicationContext(), new String[]{file.toString()}, new String[]{file.getName()}, null);
                promise.resolve(file.getAbsolutePath());
            } catch (Throwable th2) {
                promise.reject(th2);
            }
        }
    }

    @Override // com.discord.codegen.NativeFileManagerSpec
    public void writeFile(String storageDir, String path, String data, String encoding, Promise promise) {
        q.g(storageDir, "storageDir");
        q.g(path, "path");
        q.g(data, "data");
        q.g(encoding, "encoding");
        q.g(promise, "promise");
        l.d(this.ioScope, null, null, new FileManagerModule$writeFile$1(this, storageDir, promise, path, encoding, data, null), 3, null);
    }
}
