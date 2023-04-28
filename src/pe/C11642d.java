package pe;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m15073d2 = {"Lpe/d;", "Lpe/e;", "", "a", "", "D", "inputSpf", "b", "outputSpf", "c", "currentSpf", "", "d", "I", "frameCount", "inputFps", "outputFps", "<init>", "(II)V", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* renamed from: pe.d */
/* loaded from: classes6.dex */
public final class C11642d implements AbstractC11643e {

    /* renamed from: a */
    private final double f25971a;

    /* renamed from: b */
    private final double f25972b;

    /* renamed from: c */
    private double f25973c;

    /* renamed from: d */
    private int f25974d;

    public C11642d(int i, int i2) {
        this.f25971a = 1.0d / i;
        this.f25972b = 1.0d / i2;
    }

    @Override // pe.AbstractC11643e
    /* renamed from: a */
    public boolean mo9166a() {
        double d = this.f25973c + this.f25971a;
        this.f25973c = d;
        int i = this.f25974d;
        this.f25974d = i + 1;
        if (i == 0) {
            return true;
        }
        double d2 = this.f25972b;
        if (d <= d2) {
            return false;
        }
        this.f25973c = d - d2;
        return true;
    }
}
