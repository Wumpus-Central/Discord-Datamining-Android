package sa;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Arrays;

/* renamed from: sa.d0 */
/* loaded from: classes3.dex */
public final class C12834d0 {

    /* renamed from: a */
    Object[] f28907a = new Object[8];

    /* renamed from: b */
    int f28908b = 0;

    /* renamed from: c */
    C12832c0 f28909c;

    /* renamed from: a */
    public final C12834d0 m5308a(Object obj, Object obj2) {
        int i = this.f28908b + 1;
        Object[] objArr = this.f28907a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = ViewDefaults.NUMBER_OF_LINES;
            }
            this.f28907a = Arrays.copyOf(objArr, i3);
        }
        C12856w.m5259a(obj, obj2);
        Object[] objArr2 = this.f28907a;
        int i4 = this.f28908b;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.f28908b = i4 + 1;
        return this;
    }

    /* renamed from: b */
    public final AbstractC12836e0 m5307b() {
        C12832c0 c0Var = this.f28909c;
        if (c0Var == null) {
            C12839g g = C12839g.m5300g(this.f28908b, this.f28907a, this);
            C12832c0 c0Var2 = this.f28909c;
            if (c0Var2 == null) {
                return g;
            }
            throw c0Var2.m5311a();
        }
        throw c0Var.m5311a();
    }
}
