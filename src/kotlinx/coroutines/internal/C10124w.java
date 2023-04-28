package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC10000a1;
import kotlinx.coroutines.AbstractC10034f2;
import kotlinx.coroutines.AbstractC10169s0;
import kotlinx.coroutines.CancellableContinuation;
import nf.C11075i;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m15073d2 = {"Lkotlinx/coroutines/internal/w;", "Lkotlinx/coroutines/f2;", "Lkotlinx/coroutines/s0;", "", "N0", "Lkotlin/coroutines/CoroutineContext;", "context", "", "I0", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/a1;", "R", "M0", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "O0", "", "toString", "", "m", "Ljava/lang/Throwable;", "cause", "n", "Ljava/lang/String;", "errorHint", "K0", "()Lkotlinx/coroutines/f2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.w */
/* loaded from: classes8.dex */
public final class C10124w extends AbstractC10034f2 implements AbstractC10169s0 {

    /* renamed from: m */
    private final Throwable f22333m;

    /* renamed from: n */
    private final String f22334n;

    public C10124w(Throwable th2, String str) {
        this.f22333m = th2;
        this.f22334n = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void m14205N0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f22333m
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f22334n
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f22333m
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            kotlinx.coroutines.internal.C10123v.m14208d()
            nf.i r0 = new nf.i
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C10124w.m14205N0():java.lang.Void");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: I0 */
    public boolean mo4545I0(CoroutineContext coroutineContext) {
        m14205N0();
        throw new C11075i();
    }

    @Override // kotlinx.coroutines.AbstractC10034f2
    /* renamed from: K0 */
    public AbstractC10034f2 mo4544K0() {
        return this;
    }

    /* renamed from: M0 */
    public Void mo4546G0(CoroutineContext coroutineContext, Runnable runnable) {
        m14205N0();
        throw new C11075i();
    }

    /* renamed from: O0 */
    public Void mo4538t(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        m14205N0();
        throw new C11075i();
    }

    @Override // kotlinx.coroutines.AbstractC10169s0
    /* renamed from: R */
    public AbstractC10000a1 mo4537R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        m14205N0();
        throw new C11075i();
    }

    @Override // kotlinx.coroutines.AbstractC10034f2, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f22333m != null) {
            str = ", cause=" + this.f22333m;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
