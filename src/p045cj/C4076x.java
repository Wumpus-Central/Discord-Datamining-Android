package p045cj;

import bj.C3720z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, m15073d2 = {"Lcj/x;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "e", "", "c", "(I)V", "d", "()I", "Lbj/z;", "a", "Lbj/z;", "origin", "<set-?>", "b", "Z", "()Z", "isUnmarkedNull", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.x */
/* loaded from: classes8.dex */
public final class C4076x {

    /* renamed from: a */
    private final C3720z f6704a;

    /* renamed from: b */
    private boolean f6705b;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: cj.x$a */
    /* loaded from: classes8.dex */
    /* synthetic */ class C4077a extends C9968n implements Function2<SerialDescriptor, Integer, Boolean> {
        C4077a(Object obj) {
            super(2, obj, C4076x.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        /* renamed from: i */
        public final Boolean m32875i(SerialDescriptor p0, int i) {
            C9971q.m14633g(p0, "p0");
            return Boolean.valueOf(((C4076x) this.receiver).m32876e(p0, i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(SerialDescriptor serialDescriptor, Integer num) {
            return m32875i(serialDescriptor, num.intValue());
        }
    }

    public C4076x(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        this.f6704a = new C3720z(descriptor, new C4077a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m32876e(SerialDescriptor serialDescriptor, int i) {
        boolean z = !serialDescriptor.mo13675j(i) && serialDescriptor.mo13677h(i).mo13683b();
        this.f6705b = z;
        return z;
    }

    /* renamed from: b */
    public final boolean m32879b() {
        return this.f6705b;
    }

    /* renamed from: c */
    public final void m32878c(int i) {
        this.f6704a.m33744a(i);
    }

    /* renamed from: d */
    public final int m32877d() {
        return this.f6704a.m33741d();
    }
}
