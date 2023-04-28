package p422xb;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: xb.i */
/* loaded from: classes3.dex */
public final class C14043i implements AbstractC14034c {

    /* renamed from: a */
    private final float f31660a;

    public C14043i(float f) {
        this.f31660a = f;
    }

    @Override // p422xb.AbstractC14034c
    /* renamed from: a */
    public float mo1937a(RectF rectF) {
        return this.f31660a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C14043i) && this.f31660a == ((C14043i) obj).f31660a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f31660a)});
    }
}
