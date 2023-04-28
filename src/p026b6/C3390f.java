package p026b6;

import com.facebook.imagepipeline.nativecode.C4934f;
import p170j5.C9490c;
import p314r5.C12394h;

/* renamed from: b6.f */
/* loaded from: classes7.dex */
public class C3390f implements AbstractC3388d {

    /* renamed from: a */
    private final int f5418a;

    /* renamed from: b */
    private final boolean f5419b;

    /* renamed from: c */
    private final AbstractC3388d f5420c;

    /* renamed from: d */
    private final Integer f5421d;

    /* renamed from: e */
    private final boolean f5422e;

    public C3390f(int i, boolean z, AbstractC3388d dVar, Integer num, boolean z2) {
        this.f5418a = i;
        this.f5419b = z;
        this.f5420c = dVar;
        this.f5421d = num;
        this.f5422e = z2;
    }

    /* renamed from: a */
    private AbstractC3387c m34527a(C9490c cVar, boolean z) {
        AbstractC3388d dVar = this.f5420c;
        if (dVar == null) {
            return null;
        }
        return dVar.createImageTranscoder(cVar, z);
    }

    /* renamed from: b */
    private AbstractC3387c m34526b(C9490c cVar, boolean z) {
        Integer num = this.f5421d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return m34525c(cVar, z);
        }
        if (intValue == 1) {
            return m34524d(cVar, z);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    /* renamed from: c */
    private AbstractC3387c m34525c(C9490c cVar, boolean z) {
        return C4934f.m31250a(this.f5418a, this.f5419b, this.f5422e).createImageTranscoder(cVar, z);
    }

    /* renamed from: d */
    private AbstractC3387c m34524d(C9490c cVar, boolean z) {
        return new C3392h(this.f5418a).createImageTranscoder(cVar, z);
    }

    @Override // p026b6.AbstractC3388d
    public AbstractC3387c createImageTranscoder(C9490c cVar, boolean z) {
        AbstractC3387c a = m34527a(cVar, z);
        if (a == null) {
            a = m34526b(cVar, z);
        }
        if (a == null && C12394h.m6926a()) {
            a = m34525c(cVar, z);
        }
        if (a == null) {
            return m34524d(cVar, z);
        }
        return a;
    }
}
