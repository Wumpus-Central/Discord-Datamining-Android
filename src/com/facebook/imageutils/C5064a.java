package com.facebook.imageutils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.Pair;
import androidx.core.util.Pools$SynchronizedPool;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p163j$.util.Spliterator;
import p394w3.C13740j;

/* renamed from: com.facebook.imageutils.a */
/* loaded from: classes7.dex */
public final class C5064a {

    /* renamed from: a */
    private static final Pools$SynchronizedPool<ByteBuffer> f8713a = new Pools$SynchronizedPool<>(12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imageutils.a$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C0126a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8714a;

        static {
            Bitmap.Config config;
            Bitmap.Config config2;
            int[] iArr = new int[Bitmap.Config.values().length];
            f8714a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8714a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8714a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8714a[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr2 = f8714a;
                config2 = Bitmap.Config.RGBA_F16;
                iArr2[config2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr3 = f8714a;
                config = Bitmap.Config.HARDWARE;
                iArr3[config.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m30863a(InputStream inputStream) {
        C13740j.m2834g(inputStream);
        Pools$SynchronizedPool<ByteBuffer> pools$SynchronizedPool = f8713a;
        ByteBuffer acquire = pools$SynchronizedPool.acquire();
        if (acquire == null) {
            acquire = ByteBuffer.allocate(Spliterator.SUBSIZED);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = acquire.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (!(options.outWidth == -1 || options.outHeight == -1)) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            pools$SynchronizedPool.release(acquire);
            return pair;
        } catch (Throwable th2) {
            f8713a.release(acquire);
            throw th2;
        }
    }

    /* renamed from: b */
    public static C5065b m30862b(InputStream inputStream) {
        C13740j.m2834g(inputStream);
        Pools$SynchronizedPool<ByteBuffer> pools$SynchronizedPool = f8713a;
        ByteBuffer acquire = pools$SynchronizedPool.acquire();
        if (acquire == null) {
            acquire = ByteBuffer.allocate(Spliterator.SUBSIZED);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = acquire.array();
            ColorSpace colorSpace = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (Build.VERSION.SDK_INT >= 26) {
                colorSpace = options.outColorSpace;
            }
            C5065b bVar = new C5065b(options.outWidth, options.outHeight, colorSpace);
            pools$SynchronizedPool.release(acquire);
            return bVar;
        } catch (Throwable th2) {
            f8713a.release(acquire);
            throw th2;
        }
    }

    /* renamed from: c */
    public static int m30861c(Bitmap.Config config) {
        switch (C0126a.f8714a[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    /* renamed from: d */
    public static int m30860d(int i, int i2, Bitmap.Config config) {
        return i * i2 * m30861c(config);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public static int m30859e(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
