package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m15073d2 = {"Lcj/i;", "Lcj/h;", "", "value", "", "m", "", "c", "Z", "forceQuoting", "Lcj/k0;", "writer", "<init>", "(Lcj/k0;Z)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.i */
/* loaded from: classes8.dex */
public final class C4042i extends C4040h {

    /* renamed from: c */
    private final boolean f6648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4042i(AbstractC4049k0 writer, boolean z) {
        super(writer);
        C9971q.m14633g(writer, "writer");
        this.f6648c = z;
    }

    @Override // p045cj.C4040h
    /* renamed from: m */
    public void mo32959m(String value) {
        C9971q.m14633g(value, "value");
        if (this.f6648c) {
            super.mo32959m(value);
        } else {
            super.m32963j(value);
        }
    }
}
