package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.platform.AbstractC4945g;
import com.facebook.imageutils.C5064a;
import com.facebook.soloader.AbstractC5089e;
import java.util.Locale;
import p294q5.C11995c;
import p380v5.C13434e;
import p394w3.AbstractC13731d;
import p394w3.C13740j;
import p394w3.C13747n;
import p437y5.C14232f;
import p437y5.C14234g;
import p455z3.AbstractC14535g;

@AbstractC13731d
/* loaded from: classes7.dex */
public abstract class DalvikPurgeableDecoder implements AbstractC4945g {

    /* renamed from: b */
    protected static final byte[] f8342b = {-1, -39};

    /* renamed from: a */
    private final C14232f f8343a = C14234g.m1313a();

    @AbstractC5089e
    /* loaded from: classes7.dex */
    private static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        /* renamed from: a */
        static void m31263a(BitmapFactory.Options options, ColorSpace colorSpace) {
            ColorSpace.Named named;
            if (colorSpace == null) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        C4932d.m31252a();
    }

    /* renamed from: e */
    public static boolean m31266e(CloseableReference<AbstractC14535g> closeableReference, int i) {
        AbstractC14535g C = closeableReference.m32039C();
        if (i >= 2 && C.mo265j(i - 2) == -1 && C.mo265j(i - 1) == -39) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static BitmapFactory.Options m31265f(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @AbstractC13731d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // com.facebook.imagepipeline.platform.AbstractC4945g
    /* renamed from: a */
    public CloseableReference<Bitmap> mo31229a(C13434e eVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f = m31265f(eVar.m3715Q(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m31263a(f, colorSpace);
        }
        CloseableReference<AbstractC14535g> l = eVar.m3703l();
        C13740j.m2834g(l);
        try {
            return m31264g(mo31239c(l, f));
        } finally {
            CloseableReference.m32025t(l);
        }
    }

    @Override // com.facebook.imagepipeline.platform.AbstractC4945g
    /* renamed from: b */
    public CloseableReference<Bitmap> mo31228b(C13434e eVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        BitmapFactory.Options f = m31265f(eVar.m3715Q(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m31263a(f, colorSpace);
        }
        CloseableReference<AbstractC14535g> l = eVar.m3703l();
        C13740j.m2834g(l);
        try {
            return m31264g(mo31238d(l, i, f));
        } finally {
            CloseableReference.m32025t(l);
        }
    }

    /* renamed from: c */
    protected abstract Bitmap mo31239c(CloseableReference<AbstractC14535g> closeableReference, BitmapFactory.Options options);

    /* renamed from: d */
    protected abstract Bitmap mo31238d(CloseableReference<AbstractC14535g> closeableReference, int i, BitmapFactory.Options options);

    /* renamed from: g */
    public CloseableReference<Bitmap> m31264g(Bitmap bitmap) {
        C13740j.m2834g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f8343a.m1315g(bitmap)) {
                return CloseableReference.m32033Y(bitmap, this.f8343a.m1317e());
            }
            int e = C5064a.m30859e(bitmap);
            bitmap.recycle();
            throw new C11995c(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(e), Integer.valueOf(this.f8343a.m1320b()), Long.valueOf(this.f8343a.m1316f()), Integer.valueOf(this.f8343a.m1319c()), Integer.valueOf(this.f8343a.m1318d())));
        } catch (Exception e2) {
            bitmap.recycle();
            throw C13747n.m2823a(e2);
        }
    }
}
