package p422xb;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: xb.a */
/* loaded from: classes3.dex */
public final class C14032a implements AbstractC14034c {

    /* renamed from: a */
    private final float f31615a;

    public C14032a(float f) {
        this.f31615a = f;
    }

    @Override // p422xb.AbstractC14034c
    /* renamed from: a */
    public float mo1937a(RectF rectF) {
        return this.f31615a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C14032a) && this.f31615a == ((C14032a) obj).f31615a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f31615a)});
    }
}
