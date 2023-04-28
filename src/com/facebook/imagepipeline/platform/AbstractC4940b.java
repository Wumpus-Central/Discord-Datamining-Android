package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p037c4.C3763a;
import p037c4.C3764b;
import p163j$.util.Spliterator;
import p380v5.C13434e;
import p394w3.C13740j;
import p437y5.AbstractC14235h;

@TargetApi(11)
/* renamed from: com.facebook.imagepipeline.platform.b */
/* loaded from: classes7.dex */
public abstract class AbstractC4940b implements AbstractC4945g {

    /* renamed from: d */
    private static final Class<?> f8358d = AbstractC4940b.class;

    /* renamed from: e */
    private static final byte[] f8359e = {-1, -39};

    /* renamed from: a */
    private final AbstractC14235h f8360a;

    /* renamed from: b */
    private final PreverificationHelper f8361b;

    /* renamed from: c */
    final Pools$SynchronizedPool<ByteBuffer> f8362c;

    public AbstractC4940b(AbstractC14235h hVar, int i, Pools$SynchronizedPool pools$SynchronizedPool) {
        PreverificationHelper preverificationHelper;
        if (Build.VERSION.SDK_INT >= 26) {
            preverificationHelper = new PreverificationHelper();
        } else {
            preverificationHelper = null;
        }
        this.f8361b = preverificationHelper;
        this.f8360a = hVar;
        this.f8362c = pools$SynchronizedPool;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8362c.release(ByteBuffer.allocate(Spliterator.SUBSIZED));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[Catch: all -> 0x00cb, RuntimeException -> 0x00cd, IllegalArgumentException -> 0x00d6, TRY_LEAVE, TryCatch #7 {IllegalArgumentException -> 0x00d6, RuntimeException -> 0x00cd, blocks: (B:30:0x006e, B:35:0x0085, B:40:0x0099, B:44:0x00a1, B:45:0x00a4, B:48:0x00a8), top: B:77:0x006e, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.common.references.CloseableReference<android.graphics.Bitmap> m31236c(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11, android.graphics.Rect r12, android.graphics.ColorSpace r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.AbstractC4940b.m31236c(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):com.facebook.common.references.CloseableReference");
    }

    /* renamed from: e */
    private static BitmapFactory.Options m31235e(C13434e eVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = eVar.m3715Q();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.m3696z(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    @Override // com.facebook.imagepipeline.platform.AbstractC4945g
    /* renamed from: a */
    public CloseableReference<Bitmap> mo31229a(C13434e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        boolean z;
        BitmapFactory.Options e = m31235e(eVar, config);
        if (e.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z = true;
        } else {
            z = false;
        }
        try {
            return m31236c((InputStream) C13740j.m2834g(eVar.m3696z()), e, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (z) {
                return mo31229a(eVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e2;
        }
    }

    @Override // com.facebook.imagepipeline.platform.AbstractC4945g
    /* renamed from: b */
    public CloseableReference<Bitmap> mo31228b(C13434e eVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean z;
        boolean Y = eVar.m3711Y(i);
        BitmapFactory.Options e = m31235e(eVar, config);
        C3764b z2 = eVar.m3696z();
        C13740j.m2834g(z2);
        if (eVar.m3714R() > i) {
            z2 = new C3763a(z2, i);
        }
        if (!Y) {
            z2 = new C3764b(z2, f8359e);
        }
        if (e.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z = true;
        } else {
            z = false;
        }
        try {
            try {
                CloseableReference<Bitmap> c = m31236c(z2, e, rect, colorSpace);
                try {
                    z2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return c;
            } catch (RuntimeException e3) {
                if (z) {
                    CloseableReference<Bitmap> b = mo31228b(eVar, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
                    try {
                        z2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    return b;
                }
                throw e3;
            }
        } catch (Throwable th2) {
            try {
                z2.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            throw th2;
        }
    }

    /* renamed from: d */
    public abstract int mo31231d(int i, int i2, BitmapFactory.Options options);
}
