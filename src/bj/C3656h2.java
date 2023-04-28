package bj;

import com.facebook.react.uimanager.ViewProps;
import eg.C6884j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11059c0;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u0002H\u0010ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, m15073d2 = {"Lbj/h2;", "Lbj/q1;", "Lnf/c0;", "", "requiredCapacity", "", "b", "(I)V", "Lnf/b0;", "c", "e", "f", "()[I", "a", "[I", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.h2 */
/* loaded from: classes8.dex */
public final class C3656h2 extends AbstractC3693q1<C11059c0> {

    /* renamed from: a */
    private int[] f5968a;

    /* renamed from: b */
    private int f5969b;

    private C3656h2(int[] iArr) {
        this.f5968a = iArr;
        this.f5969b = C11059c0.m11016t(iArr);
        mo33748b(10);
    }

    public /* synthetic */ C3656h2(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C11059c0 mo33749a() {
        return C11059c0.m11025a(m33875f());
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: b */
    public void mo33748b(int i) {
        int c;
        if (C11059c0.m11016t(this.f5968a) < i) {
            int[] iArr = this.f5968a;
            c = C6884j.m23961c(i, C11059c0.m11016t(iArr) * 2);
            int[] copyOf = Arrays.copyOf(iArr, c);
            C9971q.m14634f(copyOf, "copyOf(this, newSize)");
            this.f5968a = C11059c0.m11023f(copyOf);
        }
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: d */
    public int mo33747d() {
        return this.f5969b;
    }

    /* renamed from: e */
    public final void m33876e(int i) {
        AbstractC3693q1.m33811c(this, 0, 1, null);
        int[] iArr = this.f5968a;
        int d = mo33747d();
        this.f5969b = d + 1;
        C11059c0.m11012x(iArr, d, i);
    }

    /* renamed from: f */
    public int[] m33875f() {
        int[] copyOf = Arrays.copyOf(this.f5968a, mo33747d());
        C9971q.m14634f(copyOf, "copyOf(this, newSize)");
        return C11059c0.m11023f(copyOf);
    }
}
