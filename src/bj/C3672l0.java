package bj;

import com.facebook.react.uimanager.ViewProps;
import eg.C6884j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m15073d2 = {"Lbj/l0;", "Lbj/q1;", "", "", "requiredCapacity", "", "b", "(I)V", "c", "e", "f", "()[I", "a", "[I", "buffer", "<set-?>", "I", "d", "()I", ViewProps.POSITION, "bufferWithData", "<init>", "([I)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.l0 */
/* loaded from: classes8.dex */
public final class C3672l0 extends AbstractC3693q1<int[]> {

    /* renamed from: a */
    private int[] f5987a;

    /* renamed from: b */
    private int f5988b;

    public C3672l0(int[] bufferWithData) {
        C9971q.m14633g(bufferWithData, "bufferWithData");
        this.f5987a = bufferWithData;
        this.f5988b = bufferWithData.length;
        mo33748b(10);
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: b */
    public void mo33748b(int i) {
        int c;
        int[] iArr = this.f5987a;
        if (iArr.length < i) {
            c = C6884j.m23961c(i, iArr.length * 2);
            int[] copyOf = Arrays.copyOf(iArr, c);
            C9971q.m14634f(copyOf, "copyOf(this, newSize)");
            this.f5987a = copyOf;
        }
    }

    @Override // bj.AbstractC3693q1
    /* renamed from: d */
    public int mo33747d() {
        return this.f5988b;
    }

    /* renamed from: e */
    public final void m33852e(int i) {
        AbstractC3693q1.m33811c(this, 0, 1, null);
        int[] iArr = this.f5987a;
        int d = mo33747d();
        this.f5988b = d + 1;
        iArr[d] = i;
    }

    /* renamed from: f */
    public int[] mo33749a() {
        int[] copyOf = Arrays.copyOf(this.f5987a, mo33747d());
        C9971q.m14634f(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
