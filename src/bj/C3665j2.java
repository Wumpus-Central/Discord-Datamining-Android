package bj;

import com.facebook.react.uimanager.ViewProps;
import eg.C6884j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11065e0;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u0002H\u0010ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, m15073d2 = {"Lbj/j2;", "Lbj/q1;", "Lnf/e0;", "", "requiredCapacity", "", "b", "(I)V", "Lnf/d0;", "c", "e", "(J)V", "f", "()[J", "a", "[J", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.j2 */
/* loaded from: classes8.dex */
public final class C3665j2 extends AbstractC3693q1<C11065e0> {

    /* renamed from: a */
    private long[] f5981a;

    /* renamed from: b */
    private int f5982b;

    private C3665j2(long[] jArr) {
        this.f5981a = jArr;
        this.f5982b = C11065e0.m10989t(jArr);
        mo33748b(10);
    }

    public /* synthetic */ C3665j2(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C11065e0 mo33749a() {
        return C11065e0.m10998a(m33856f());
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: b */
    public void mo33748b(int i) {
        int c;
        if (C11065e0.m10989t(this.f5981a) < i) {
            long[] jArr = this.f5981a;
            c = C6884j.m23961c(i, C11065e0.m10989t(jArr) * 2);
            long[] copyOf = Arrays.copyOf(jArr, c);
            C9971q.m14634f(copyOf, "copyOf(this, newSize)");
            this.f5981a = C11065e0.m10996f(copyOf);
        }
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: d */
    public int mo33747d() {
        return this.f5982b;
    }

    /* renamed from: e */
    public final void m33857e(long j) {
        AbstractC3693q1.m33811c(this, 0, 1, null);
        long[] jArr = this.f5981a;
        int d = mo33747d();
        this.f5982b = d + 1;
        C11065e0.m10985x(jArr, d, j);
    }

    /* renamed from: f */
    public long[] m33856f() {
        long[] copyOf = Arrays.copyOf(this.f5981a, mo33747d());
        C9971q.m14634f(copyOf, "copyOf(this, newSize)");
        return C11065e0.m10996f(copyOf);
    }
}
