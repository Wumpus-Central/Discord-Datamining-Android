package bj;

import com.facebook.react.uimanager.ViewProps;
import eg.C6884j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m15073d2 = {"Lbj/v0;", "Lbj/q1;", "", "", "requiredCapacity", "", "b", "(I)V", "", "c", "e", "(J)V", "f", "()[J", "a", "[J", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([J)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.v0 */
/* loaded from: classes8.dex */
public final class C3707v0 extends AbstractC3693q1<long[]> {

    /* renamed from: a */
    private long[] f6027a;

    /* renamed from: b */
    private int f6028b;

    public C3707v0(long[] bufferWithData) {
        C9971q.m14633g(bufferWithData, "bufferWithData");
        this.f6027a = bufferWithData;
        this.f6028b = bufferWithData.length;
        mo33748b(10);
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: b */
    public void mo33748b(int i) {
        int c;
        long[] jArr = this.f6027a;
        if (jArr.length < i) {
            c = C6884j.m23961c(i, jArr.length * 2);
            long[] copyOf = Arrays.copyOf(jArr, c);
            C9971q.m14634f(copyOf, "copyOf(this, newSize)");
            this.f6027a = copyOf;
        }
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: d */
    public int mo33747d() {
        return this.f6028b;
    }

    /* renamed from: e */
    public final void m33782e(long j) {
        AbstractC3693q1.m33811c(this, 0, 1, null);
        long[] jArr = this.f6027a;
        int d = mo33747d();
        this.f6028b = d + 1;
        jArr[d] = j;
    }

    /* renamed from: f */
    public long[] mo33749a() {
        long[] copyOf = Arrays.copyOf(this.f6027a, mo33747d());
        C9971q.m14634f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
