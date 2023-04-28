package com.facebook.react.modules.blob;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.react.ReactApplication;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public final class BlobProvider extends ContentProvider {
    private static final int PIPE_CAPACITY = 65536;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        BlobModule blobModule;
        if (str.equals("r")) {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext instanceof ReactApplication) {
                blobModule = (BlobModule) ((ReactApplication) applicationContext).getReactNativeHost().getReactInstanceManager().getCurrentReactContext().getNativeModule(BlobModule.class);
            } else {
                blobModule = null;
            }
            if (blobModule != null) {
                final byte[] resolve = blobModule.resolve(uri);
                if (resolve != null) {
                    try {
                        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                        final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                        if (resolve.length <= PIPE_CAPACITY) {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                autoCloseOutputStream.write(resolve);
                                autoCloseOutputStream.close();
                            } catch (IOException unused) {
                                return null;
                            }
                        } else {
                            this.executor.submit(new Runnable() { // from class: com.facebook.react.modules.blob.BlobProvider.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                        autoCloseOutputStream2.write(resolve);
                                        autoCloseOutputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                            });
                        }
                        return parcelFileDescriptor;
                    } catch (IOException unused2) {
                        return null;
                    }
                } else {
                    throw new FileNotFoundException("Cannot open " + uri.toString() + ", blob not found.");
                }
            } else {
                throw new RuntimeException("No blob module associated with BlobProvider");
            }
        } else {
            throw new FileNotFoundException("Cannot open " + uri.toString() + " in mode '" + str + "'");
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
