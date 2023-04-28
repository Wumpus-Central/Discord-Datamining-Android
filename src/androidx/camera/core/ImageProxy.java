package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageProxy extends AutoCloseable {

    /* renamed from: androidx.camera.core.ImageProxy$a */
    /* loaded from: classes.dex */
    public interface AbstractC1764a {
        /* renamed from: c */
        ByteBuffer mo39901c();

        /* renamed from: d */
        int mo39900d();

        /* renamed from: e */
        int mo39899e();
    }

    /* renamed from: O */
    void mo39605O(Rect rect);

    @Override // java.lang.AutoCloseable
    void close();

    @SuppressLint({"ArrayReturn"})
    /* renamed from: d0 */
    AbstractC1764a[] mo39701d0();

    int getFormat();

    int getHeight();

    int getWidth();

    /* renamed from: p0 */
    AbstractC1876k1 mo39604p0();

    /* renamed from: r0 */
    Image mo39699r0();
}
