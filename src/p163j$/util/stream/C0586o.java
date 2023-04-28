package p163j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Function;
import p163j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.o */
/* loaded from: classes2.dex */
final class C0586o extends AbstractC0526a2 {

    /* renamed from: b */
    public final /* synthetic */ int f20706b = 0;

    /* renamed from: c */
    Object f20707c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0533c f20708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0586o(C0590p pVar, AbstractC0546e2 e2Var) {
        super(e2Var);
        this.f20708d = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0586o(C0605t tVar, AbstractC0546e2 e2Var) {
        super(e2Var);
        this.f20708d = tVar;
        this.f20707c = new C9433r(0, e2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0586o(C0613v vVar, AbstractC0546e2 e2Var) {
        super(e2Var);
        this.f20708d = vVar;
        this.f20707c = new C9395T(0, e2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0586o(C0617w wVar, AbstractC0546e2 e2Var) {
        super(e2Var);
        this.f20708d = wVar;
        this.f20707c = new C0539d0(0, e2Var);
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        AbstractC0571k0 k0Var;
        int i = this.f20706b;
        AbstractC0533c cVar = this.f20708d;
        switch (i) {
            case 0:
                if (!((Set) this.f20707c).contains(obj)) {
                    ((Set) this.f20707c).add(obj);
                    this.f20615a.accept((AbstractC0546e2) obj);
                    return;
                }
                return;
            case 1:
                k0Var = (AbstractC0571k0) ((Function) ((C0617w) cVar).f20779t).apply(obj);
                if (k0Var != null) {
                    try {
                        k0Var.sequential().mo16337q((AbstractC9290M) this.f20707c);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (k0Var != null) {
                    ((AbstractC0533c) k0Var).close();
                    return;
                }
                return;
            case 2:
                IntStream intStream = (IntStream) ((Function) ((C0613v) cVar).f20772t).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo16403C((IntConsumer) this.f20707c);
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                k0Var = (AbstractC9328D) ((Function) ((C0605t) cVar).f20751t).apply(obj);
                if (k0Var != null) {
                    try {
                        k0Var.sequential().mo16239t((AbstractC0494i) this.f20707c);
                    } finally {
                        try {
                            ((AbstractC0533c) k0Var).close();
                        } catch (Throwable th5) {
                            th2.addSuppressed(th5);
                        }
                    }
                }
                if (k0Var != null) {
                    ((AbstractC0533c) k0Var).close();
                    return;
                }
                return;
        }
    }

    @Override // p163j$.util.stream.AbstractC0546e2
    /* renamed from: c */
    public final void mo16235c(long j) {
        int i = this.f20706b;
        AbstractC0546e2 e2Var = this.f20615a;
        switch (i) {
            case 0:
                this.f20707c = new HashSet();
                e2Var.mo16235c(-1L);
                return;
            case 1:
                e2Var.mo16235c(-1L);
                return;
            case 2:
                e2Var.mo16235c(-1L);
                return;
            default:
                e2Var.mo16235c(-1L);
                return;
        }
    }

    @Override // p163j$.util.stream.AbstractC0526a2, p163j$.util.stream.AbstractC0546e2
    public final void end() {
        switch (this.f20706b) {
            case 0:
                this.f20707c = null;
                this.f20615a.end();
                return;
            default:
                super.end();
                return;
        }
    }
}
