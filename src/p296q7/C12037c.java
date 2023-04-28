package p296q7;

import p119g9.C7510a;
import p228m7.AbstractC10515j;
import p228m7.C10529t;

/* renamed from: q7.c */
/* loaded from: classes7.dex */
final class C12037c extends C10529t {

    /* renamed from: b */
    private final long f27015b;

    public C12037c(AbstractC10515j jVar, long j) {
        super(jVar);
        boolean z;
        if (jVar.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        this.f27015b = j;
    }

    @Override // p228m7.C10529t, p228m7.AbstractC10515j
    public long getLength() {
        return super.getLength() - this.f27015b;
    }

    @Override // p228m7.C10529t, p228m7.AbstractC10515j
    public long getPosition() {
        return super.getPosition() - this.f27015b;
    }

    @Override // p228m7.C10529t, p228m7.AbstractC10515j
    /* renamed from: h */
    public long mo7939h() {
        return super.mo7939h() - this.f27015b;
    }
}
