package vi;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9971q;
import nf.C11090s;
import vi.AbstractC13513c;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b \u0010\u0017J\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010R>\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006!"}, m15073d2 = {"Lvi/a;", "Lvi/c;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "e", "()Lvi/c;", "", "size", "", "f", "(I)[Lvi/c;", "d", "slot", "", "g", "(Lvi/c;)V", "<set-?>", "k", "[Lvi/c;", "i", "()[Lvi/c;", "getSlots$annotations", "()V", "slots", "l", "I", "h", "()I", "nCollectors", "m", "nextIndex", "<init>", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: vi.a */
/* loaded from: classes8.dex */
public abstract class AbstractC13511a<S extends AbstractC13513c<?>> {

    /* renamed from: k */
    private S[] f30194k;

    /* renamed from: l */
    private int f30195l;

    /* renamed from: m */
    private int f30196m;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final S m3508d() {
        S s;
        synchronized (this) {
            S[] sArr = this.f30194k;
            if (sArr == null) {
                sArr = mo3506f(2);
                this.f30194k = sArr;
            } else if (this.f30195l >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C9971q.m14634f(copyOf, "copyOf(this, newSize)");
                this.f30194k = (S[]) ((AbstractC13513c[]) copyOf);
                sArr = (S[]) ((AbstractC13513c[]) copyOf);
            }
            int i = this.f30196m;
            do {
                s = sArr[i];
                if (s == null) {
                    s = mo3507e();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.mo3502a(this));
            this.f30196m = i;
            this.f30195l++;
        }
        return s;
    }

    /* renamed from: e */
    protected abstract S mo3507e();

    /* renamed from: f */
    protected abstract S[] mo3506f(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m3505g(S s) {
        int i;
        Continuation<Unit>[] b;
        synchronized (this) {
            int i2 = this.f30195l - 1;
            this.f30195l = i2;
            if (i2 == 0) {
                this.f30196m = 0;
            }
            b = s.mo3501b(this);
        }
        for (Continuation<Unit> continuation : b) {
            if (continuation != null) {
                C11090s.C11091a aVar = C11090s.f24606l;
                continuation.resumeWith(C11090s.m10940b(Unit.f22042a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final int m3504h() {
        return this.f30195l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final S[] m3503i() {
        return this.f30194k;
    }
}
