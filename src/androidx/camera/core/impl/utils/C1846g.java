package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* renamed from: androidx.camera.core.impl.utils.g */
/* loaded from: classes.dex */
public final class C1846g implements Comparator<Size> {

    /* renamed from: k */
    private boolean f1792k;

    public C1846g() {
        this(false);
    }

    /* renamed from: b */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        if (this.f1792k) {
            return signum * (-1);
        }
        return signum;
    }

    public C1846g(boolean z) {
        this.f1792k = z;
    }
}
