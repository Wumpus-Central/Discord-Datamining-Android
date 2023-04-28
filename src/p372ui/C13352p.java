package p372ui;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10106l0;
import kotlinx.coroutines.internal.C10125x;
import p372ui.AbstractC13332c;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m15073d2 = {"Lui/p;", "E", "Lui/a;", "element", "", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/k;", "Lui/w;", "list", "Lui/l;", "closed", "", "R", "(Ljava/lang/Object;Lui/l;)V", "", "M", "()Z", "isBufferAlwaysEmpty", "N", "isBufferEmpty", "s", "isBufferAlwaysFull", "u", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.p */
/* loaded from: classes8.dex */
public class C13352p<E> extends AbstractC13323a<E> {
    public C13352p(Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: M */
    protected final boolean mo3863M() {
        return true;
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: N */
    protected final boolean mo3862N() {
        return true;
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: R */
    protected void mo3883R(Object obj, C13348l<?> lVar) {
        C10106l0 l0Var = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                AbstractC13361w wVar = (AbstractC13361w) obj;
                if (wVar instanceof AbstractC13332c.C13333a) {
                    Function1<E, Unit> function1 = this.f29887k;
                    if (function1 != null) {
                        l0Var = C10125x.m14201c(function1, ((AbstractC13332c.C13333a) wVar).f29889n, null);
                    }
                } else {
                    wVar.mo3851Y(lVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                C10106l0 l0Var2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    AbstractC13361w wVar2 = (AbstractC13361w) arrayList.get(size);
                    if (wVar2 instanceof AbstractC13332c.C13333a) {
                        Function1<E, Unit> function12 = this.f29887k;
                        if (function12 != null) {
                            l0Var2 = C10125x.m14201c(function12, ((AbstractC13332c.C13333a) wVar2).f29889n, l0Var2);
                        } else {
                            l0Var2 = null;
                        }
                    } else {
                        wVar2.mo3851Y(lVar);
                    }
                }
                l0Var = l0Var2;
            }
        }
        if (l0Var != null) {
            throw l0Var;
        }
    }

    @Override // p372ui.AbstractC13332c
    /* renamed from: s */
    protected final boolean mo3861s() {
        return false;
    }

    @Override // p372ui.AbstractC13332c
    /* renamed from: u */
    protected final boolean mo3860u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p372ui.AbstractC13332c
    /* renamed from: y */
    public Object mo3882y(E e) {
        AbstractC13359u<?> A;
        do {
            Object y = super.mo3882y(e);
            C10087d0 d0Var = C13331b.f29881b;
            if (y == d0Var) {
                return d0Var;
            }
            if (y == C13331b.f29882c) {
                A = m3939A(e);
                if (A == null) {
                    return d0Var;
                }
            } else if (y instanceof C13348l) {
                return y;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + y).toString());
            }
        } while (!(A instanceof C13348l));
        return A;
    }
}
