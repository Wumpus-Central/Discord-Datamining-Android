package bj;

import com.facebook.react.uimanager.ViewProps;
import eg.C6884j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11073h0;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u0002H\u0010ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, m15073d2 = {"Lbj/l2;", "Lbj/q1;", "Lnf/h0;", "", "requiredCapacity", "", "b", "(I)V", "Lnf/g0;", "c", "e", "(S)V", "f", "()[S", "a", "[S", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([SLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.l2 */
/* loaded from: classes8.dex */
public final class C3674l2 extends AbstractC3693q1<C11073h0> {

    /* renamed from: a */
    private short[] f5989a;

    /* renamed from: b */
    private int f5990b;

    private C3674l2(short[] sArr) {
        this.f5989a = sArr;
        this.f5990b = C11073h0.m10964t(sArr);
        mo33748b(10);
    }

    public /* synthetic */ C3674l2(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C11073h0 mo33749a() {
        return C11073h0.m10973a(m33835f());
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: b */
    public void mo33748b(int i) {
        int c;
        if (C11073h0.m10964t(this.f5989a) < i) {
            short[] sArr = this.f5989a;
            c = C6884j.m23961c(i, C11073h0.m10964t(sArr) * 2);
            short[] copyOf = Arrays.copyOf(sArr, c);
            C9971q.m14634f(copyOf, "copyOf(this, newSize)");
            this.f5989a = C11073h0.m10971f(copyOf);
        }
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: d */
    public int mo33747d() {
        return this.f5990b;
    }

    /* renamed from: e */
    public final void m33836e(short s) {
        AbstractC3693q1.m33811c(this, 0, 1, null);
        short[] sArr = this.f5989a;
        int d = mo33747d();
        this.f5990b = d + 1;
        C11073h0.m10960x(sArr, d, s);
    }

    /* renamed from: f */
    public short[] m33835f() {
        short[] copyOf = Arrays.copyOf(this.f5989a, mo33747d());
        C9971q.m14634f(copyOf, "copyOf(this, newSize)");
        return C11073h0.m10971f(copyOf);
    }
}
