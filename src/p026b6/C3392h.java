package p026b6;

import p170j5.C9490c;

/* renamed from: b6.h */
/* loaded from: classes7.dex */
public class C3392h implements AbstractC3388d {

    /* renamed from: a */
    private final int f5425a;

    public C3392h(int i) {
        this.f5425a = i;
    }

    @Override // p026b6.AbstractC3388d
    public AbstractC3387c createImageTranscoder(C9490c cVar, boolean z) {
        return new C3391g(z, this.f5425a);
    }
}
