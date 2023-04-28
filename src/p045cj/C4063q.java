package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11056b0;
import nf.C11062d0;
import nf.C11070g0;
import nf.C11100z;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m15073d2 = {"Lcj/q;", "Lcj/h;", "", "v", "", "h", "", "i", "", "d", "", "k", "", "c", "Z", "forceQuoting", "Lcj/k0;", "writer", "<init>", "(Lcj/k0;Z)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.q */
/* loaded from: classes8.dex */
public final class C4063q extends C4040h {

    /* renamed from: c */
    private final boolean f6688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4063q(AbstractC4049k0 writer, boolean z) {
        super(writer);
        C9971q.m14633g(writer, "writer");
        this.f6688c = z;
    }

    @Override // p045cj.C4040h
    /* renamed from: d */
    public void mo32913d(byte b) {
        boolean z = this.f6688c;
        String e = C11100z.m10916e(C11100z.m10919b(b));
        if (z) {
            mo32959m(e);
        } else {
            m32963j(e);
        }
    }

    @Override // p045cj.C4040h
    /* renamed from: h */
    public void mo32912h(int i) {
        String l;
        String l2;
        boolean z = this.f6688c;
        int b = C11056b0.m11030b(i);
        if (z) {
            l2 = Long.toString(b & 4294967295L, 10);
            mo32959m(l2);
            return;
        }
        l = Long.toString(b & 4294967295L, 10);
        m32963j(l);
    }

    @Override // p045cj.C4040h
    /* renamed from: i */
    public void mo32911i(long j) {
        String a;
        String a2;
        boolean z = this.f6688c;
        long b = C11062d0.m11005b(j);
        if (z) {
            a2 = C4061p.m32916a(b, 10);
            mo32959m(a2);
            return;
        }
        a = C4058o.m32918a(b, 10);
        m32963j(a);
    }

    @Override // p045cj.C4040h
    /* renamed from: k */
    public void mo32910k(short s) {
        boolean z = this.f6688c;
        String e = C11070g0.m10975e(C11070g0.m10978b(s));
        if (z) {
            mo32959m(e);
        } else {
            m32963j(e);
        }
    }
}
