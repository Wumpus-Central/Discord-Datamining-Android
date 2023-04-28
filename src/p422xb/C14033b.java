package p422xb;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: xb.b */
/* loaded from: classes3.dex */
public final class C14033b implements AbstractC14034c {

    /* renamed from: a */
    private final AbstractC14034c f31616a;

    /* renamed from: b */
    private final float f31617b;

    public C14033b(float f, AbstractC14034c cVar) {
        while (cVar instanceof C14033b) {
            cVar = ((C14033b) cVar).f31616a;
            f += ((C14033b) cVar).f31617b;
        }
        this.f31616a = cVar;
        this.f31617b = f;
    }

    @Override // p422xb.AbstractC14034c
    /* renamed from: a */
    public float mo1937a(RectF rectF) {
        return Math.max(0.0f, this.f31616a.mo1937a(rectF) + this.f31617b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14033b)) {
            return false;
        }
        C14033b bVar = (C14033b) obj;
        if (!this.f31616a.equals(bVar.f31616a) || this.f31617b != bVar.f31617b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31616a, Float.valueOf(this.f31617b)});
    }
}
