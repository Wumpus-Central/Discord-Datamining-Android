package p372ui;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC10000a1;
import kotlinx.coroutines.AbstractC10067g;
import kotlinx.coroutines.C10149n0;
import kotlinx.coroutines.C10156p;
import kotlinx.coroutines.C10160q;
import kotlinx.coroutines.C10164r;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.C10084c;
import kotlinx.coroutines.internal.C10085c0;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10103k;
import kotlinx.coroutines.internal.C10108n;
import kotlinx.coroutines.internal.C10109o;
import kotlinx.coroutines.internal.C10110p;
import kotlinx.coroutines.internal.C10116q;
import kotlinx.coroutines.internal.C10125x;
import kotlinx.coroutines.selects.AbstractC10197c;
import kotlinx.coroutines.selects.AbstractC10198d;
import kotlinx.coroutines.selects.C10199e;
import nf.C11090s;
import nf.C11093t;
import p372ui.C13342i;
import p429xi.C14169a;
import p429xi.C14170b;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0005KLMNCB)\u0012 \u0010H\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Fj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`G¢\u0006\u0004\bI\u0010JJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0016\u0010 \u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010'\u001a\u00020\u00132\u000e\u0010&\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%J\u0019\u0010)\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000bH\u0014J/\u0010\u0004\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0004\u00102J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0004J\u0010\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000105H\u0014J\b\u00107\u001a\u00020\u0013H\u0014J\b\u00108\u001a\u00020\u0013H\u0014R\u0014\u0010;\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010?\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0014\u0010A\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b@\u0010:R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0B8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006O"}, m15073d2 = {"Lui/a;", "E", "Lui/c;", "Lui/f;", "R", "", "receiveMode", "W", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lui/s;", "receive", "", "J", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "block", "", "X", "(Lkotlinx/coroutines/selects/d;ILkotlin/jvm/functions/Function2;)V", "value", "Z", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/d;ILjava/lang/Object;)V", "L", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;I)Z", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "Y", "U", "V", "K", "Lui/i;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "h", "", "H", "(Ljava/lang/Throwable;)Z", "wasClosed", "Q", "Lkotlinx/coroutines/internal/k;", "Lui/w;", "list", "Lui/l;", "closed", "(Ljava/lang/Object;Lui/l;)V", "Lui/a$e;", "I", "Lui/u;", "C", "T", "S", "M", "()Z", "isBufferAlwaysEmpty", "N", "isBufferEmpty", "O", "isClosedForReceive", "P", "isEmptyImpl", "Lkotlinx/coroutines/selects/c;", "e", "()Lkotlinx/coroutines/selects/c;", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "a", "b", "c", "d", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.a */
/* loaded from: classes8.dex */
public abstract class AbstractC13323a<E> extends AbstractC13332c<E> implements AbstractC13338f<E> {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m15073d2 = {"Lui/a$a;", "E", "Lui/s;", "value", "", "Z", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/p$c;)Lkotlinx/coroutines/internal/d0;", "", "l", "(Ljava/lang/Object;)V", "Lui/l;", "closed", "Y", "", "toString", "Lkotlinx/coroutines/CancellableContinuation;", "n", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "o", "I", "receiveMode", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.a$a */
    /* loaded from: classes8.dex */
    public static class C0434a<E> extends AbstractC13357s<E> {

        /* renamed from: n */
        public final CancellableContinuation<Object> f29866n;

        /* renamed from: o */
        public final int f29867o;

        public C0434a(CancellableContinuation<Object> cancellableContinuation, int i) {
            this.f29866n = cancellableContinuation;
            this.f29867o = i;
        }

        @Override // p372ui.AbstractC13357s
        /* renamed from: Y */
        public void mo3870Y(C13348l<?> lVar) {
            if (this.f29867o == 1) {
                this.f29866n.resumeWith(C11090s.m10940b(C13342i.m3907b(C13342i.f29905b.m3898a(lVar.f29909n))));
                return;
            }
            CancellableContinuation<Object> cancellableContinuation = this.f29866n;
            C11090s.C11091a aVar = C11090s.f24606l;
            cancellableContinuation.resumeWith(C11090s.m10940b(C11093t.m10931a(lVar.m3891d0())));
        }

        /* renamed from: Z */
        public final Object m3946Z(E e) {
            if (this.f29867o == 1) {
                return C13342i.m3907b(C13342i.f29905b.m3896c(e));
            }
            return e;
        }

        @Override // p372ui.AbstractC13359u
        /* renamed from: l */
        public void mo3865l(E e) {
            this.f29866n.mo14151B(C10160q.f22367a);
        }

        @Override // kotlinx.coroutines.internal.C10110p
        public String toString() {
            return "ReceiveElement@" + C10149n0.m14164b(this) + "[receiveMode=" + this.f29867o + ']';
        }

        @Override // p372ui.AbstractC13359u
        /* renamed from: z */
        public C10087d0 mo3864z(E e, C10110p.C10113c cVar) {
            C10110p.AbstractC10111a aVar;
            CancellableContinuation<Object> cancellableContinuation = this.f29866n;
            Object Z = m3946Z(e);
            if (cVar != null) {
                aVar = cVar.f22314c;
            } else {
                aVar = null;
            }
            if (cancellableContinuation.mo14121u(Z, aVar, mo3871X(e)) == null) {
                return null;
            }
            if (cVar != null) {
                cVar.m14240d();
            }
            return C10160q.f22367a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m15073d2 = {"Lui/a$b;", "E", "Lui/a$a;", "value", "Lkotlin/Function1;", "", "", "X", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "p", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "Lkotlinx/coroutines/CancellableContinuation;", "", "cont", "", "receiveMode", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.a$b */
    /* loaded from: classes8.dex */
    public static final class C13324b<E> extends C0434a<E> {

        /* renamed from: p */
        public final Function1<E, Unit> f29868p;

        /* JADX WARN: Multi-variable type inference failed */
        public C13324b(CancellableContinuation<Object> cancellableContinuation, int i, Function1<? super E, Unit> function1) {
            super(cancellableContinuation, i);
            this.f29868p = function1;
        }

        @Override // p372ui.AbstractC13357s
        /* renamed from: X */
        public Function1<Throwable, Unit> mo3871X(E e) {
            return C10125x.m14203a(this.f29868p, e, this.f29866n.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\u0012$\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\u0006\u0010)\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR5\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m15073d2 = {"Lui/a$c;", "R", "E", "Lui/s;", "Lkotlinx/coroutines/a1;", "value", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/p$c;)Lkotlinx/coroutines/internal/d0;", "", "l", "(Ljava/lang/Object;)V", "Lui/l;", "closed", "Y", "dispose", "Lkotlin/Function1;", "", "X", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "toString", "Lui/a;", "n", "Lui/a;", "channel", "Lkotlinx/coroutines/selects/d;", "o", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "p", "Lkotlin/jvm/functions/Function2;", "block", "", "q", "I", "receiveMode", "<init>", "(Lui/a;Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;I)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.a$c */
    /* loaded from: classes8.dex */
    public static final class C13325c<R, E> extends AbstractC13357s<E> implements AbstractC10000a1 {

        /* renamed from: n */
        public final AbstractC13323a<E> f29869n;

        /* renamed from: o */
        public final AbstractC10198d<R> f29870o;

        /* renamed from: p */
        public final Function2<Object, Continuation<? super R>, Object> f29871p;

        /* renamed from: q */
        public final int f29872q;

        /* JADX WARN: Multi-variable type inference failed */
        public C13325c(AbstractC13323a<E> aVar, AbstractC10198d<? super R> dVar, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i) {
            this.f29869n = aVar;
            this.f29870o = dVar;
            this.f29871p = function2;
            this.f29872q = i;
        }

        @Override // p372ui.AbstractC13357s
        /* renamed from: X */
        public Function1<Throwable, Unit> mo3871X(E e) {
            Function1<E, Unit> function1 = this.f29869n.f29887k;
            if (function1 != null) {
                return C10125x.m14203a(function1, e, this.f29870o.mo14018w().getContext());
            }
            return null;
        }

        @Override // p372ui.AbstractC13357s
        /* renamed from: Y */
        public void mo3870Y(C13348l<?> lVar) {
            if (this.f29870o.mo14019s()) {
                int i = this.f29872q;
                if (i == 0) {
                    this.f29870o.mo14017x(lVar.m3891d0());
                } else if (i == 1) {
                    C14169a.m1467e(this.f29871p, C13342i.m3907b(C13342i.f29905b.m3898a(lVar.f29909n)), this.f29870o.mo14018w(), null, 4, null);
                }
            }
        }

        @Override // kotlinx.coroutines.AbstractC10000a1
        public void dispose() {
            if (mo3849R()) {
                this.f29869n.m3952S();
            }
        }

        @Override // p372ui.AbstractC13359u
        /* renamed from: l */
        public void mo3865l(E e) {
            Object obj;
            Function2<Object, Continuation<? super R>, Object> function2 = this.f29871p;
            if (this.f29872q == 1) {
                obj = C13342i.m3907b(C13342i.f29905b.m3896c(e));
            } else {
                obj = e;
            }
            C14169a.m1468d(function2, obj, this.f29870o.mo14018w(), mo3871X(e));
        }

        @Override // kotlinx.coroutines.internal.C10110p
        public String toString() {
            return "ReceiveSelect@" + C10149n0.m14164b(this) + '[' + this.f29870o + ",receiveMode=" + this.f29872q + ']';
        }

        @Override // p372ui.AbstractC13359u
        /* renamed from: z */
        public C10087d0 mo3864z(E e, C10110p.C10113c cVar) {
            return (C10087d0) this.f29870o.mo14020r(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m15073d2 = {"Lui/a$d;", "Lkotlinx/coroutines/g;", "", "cause", "", "a", "", "toString", "Lui/s;", "k", "Lui/s;", "receive", "<init>", "(Lui/a;Lui/s;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.a$d */
    /* loaded from: classes8.dex */
    public final class C13326d extends AbstractC10067g {

        /* renamed from: k */
        private final AbstractC13357s<?> f29873k;

        public C13326d(AbstractC13357s<?> sVar) {
            this.f29873k = sVar;
        }

        @Override // kotlinx.coroutines.AbstractC10152o
        /* renamed from: a */
        public void mo3945a(Throwable th2) {
            if (this.f29873k.mo3849R()) {
                AbstractC13323a.this.m3952S();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            mo3945a(th2);
            return Unit.f22042a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f29873k + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, m15073d2 = {"Lui/a$e;", "E", "Lkotlinx/coroutines/internal/p$d;", "Lui/w;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/p;", "affected", "", "e", "Lkotlinx/coroutines/internal/p$c;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "", "k", "Lkotlinx/coroutines/internal/n;", "queue", "<init>", "(Lkotlinx/coroutines/internal/n;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.a$e */
    /* loaded from: classes8.dex */
    public static final class C13327e<E> extends C10110p.C10114d<AbstractC13361w> {
        public C13327e(C10108n nVar) {
            super(nVar);
        }

        @Override // kotlinx.coroutines.internal.C10110p.C10114d, kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: e */
        protected Object mo3944e(C10110p pVar) {
            if (pVar instanceof C13348l) {
                return pVar;
            }
            if (!(pVar instanceof AbstractC13361w)) {
                return C13331b.f29883d;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: j */
        public Object mo3943j(C10110p.C10113c cVar) {
            C10087d0 Z = ((AbstractC13361w) cVar.f22312a).mo3850Z(cVar);
            if (Z == null) {
                return C10116q.f22318a;
            }
            Object obj = C10084c.f22271b;
            if (Z == obj) {
                return obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: k */
        public void mo3942k(C10110p pVar) {
            ((AbstractC13361w) pVar).mo3848a0();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, m15073d2 = {"ui/a$f", "Lkotlinx/coroutines/internal/p$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.a$f */
    /* loaded from: classes8.dex */
    public static final class C13328f extends C10110p.AbstractC10112b {

        /* renamed from: d */
        final /* synthetic */ AbstractC13323a f29875d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13328f(C10110p pVar, AbstractC13323a aVar) {
            super(pVar);
            this.f29875d = aVar;
        }

        /* renamed from: k */
        public Object mo3922i(C10110p pVar) {
            if (this.f29875d.mo3862N()) {
                return null;
            }
            return C10109o.m14265a();
        }
    }

    @Metadata(m15074d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m15073d2 = {"ui/a$g", "Lkotlinx/coroutines/selects/c;", "Lui/i;", "R", "Lkotlinx/coroutines/selects/d;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "a", "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.a$g */
    /* loaded from: classes8.dex */
    public static final class C13329g implements AbstractC10197c<C13342i<? extends E>> {

        /* renamed from: k */
        final /* synthetic */ AbstractC13323a<E> f29876k;

        C13329g(AbstractC13323a<E> aVar) {
            this.f29876k = aVar;
        }

        @Override // kotlinx.coroutines.selects.AbstractC10197c
        /* renamed from: a */
        public <R> void mo3940a(AbstractC10198d<? super R> dVar, Function2<? super C13342i<? extends E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f29876k.m3949X(dVar, 1, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "kotlinx.coroutines.channels.AbstractChannel", m14701f = "AbstractChannel.kt", m14700l = {633}, m14699m = "receiveCatching-JP2dKIU")
    /* renamed from: ui.a$h */
    /* loaded from: classes8.dex */
    public static final class C13330h extends AbstractC9930d {

        /* renamed from: k */
        /* synthetic */ Object f29877k;

        /* renamed from: l */
        final /* synthetic */ AbstractC13323a<E> f29878l;

        /* renamed from: m */
        int f29879m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13330h(AbstractC13323a<E> aVar, Continuation<? super C13330h> continuation) {
            super(continuation);
            this.f29878l = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            Object d;
            this.f29877k = obj;
            this.f29879m |= Integer.MIN_VALUE;
            Object f = this.f29878l.mo3868f(this);
            d = C13080d.m4646d();
            return f == d ? f : C13342i.m3907b(f);
        }
    }

    public AbstractC13323a(Function1<? super E, Unit> function1) {
        super(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final boolean m3955J(AbstractC13357s<? super E> sVar) {
        boolean K = mo3889K(sVar);
        if (K) {
            m3951T();
        }
        return K;
    }

    /* renamed from: L */
    private final <R> boolean m3954L(AbstractC10198d<? super R> dVar, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i) {
        C13325c cVar = new C13325c(this, dVar, function2, i);
        boolean J = m3955J(cVar);
        if (J) {
            dVar.mo14021n(cVar);
        }
        return J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ui.a$a] */
    /* renamed from: W */
    private final <R> Object m3950W(int i, Continuation<? super R> continuation) {
        Continuation c;
        C13324b bVar;
        Object d;
        c = C13076c.m4647c(continuation);
        C10156p b = C10164r.m14106b(c);
        if (this.f29887k == null) {
            bVar = new C0434a(b, i);
        } else {
            bVar = new C13324b(b, i, this.f29887k);
        }
        while (true) {
            if (!m3955J(bVar)) {
                Object U = mo3887U();
                if (!(U instanceof C13348l)) {
                    if (U != C13331b.f29883d) {
                        b.mo14127o(bVar.m3946Z(U), bVar.mo3871X(U));
                        break;
                    }
                } else {
                    bVar.mo3870Y((C13348l) U);
                    break;
                }
            } else {
                m3948Y(b, bVar);
                break;
            }
        }
        Object y = b.m14117y();
        d = C13080d.m4646d();
        if (y == d) {
            C9933g.m14691c(continuation);
        }
        return y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final <R> void m3949X(AbstractC10198d<? super R> dVar, int i, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!dVar.mo14022e()) {
            if (!m3953P()) {
                Object V = mo3886V(dVar);
                if (V != C10199e.m14012d()) {
                    if (!(V == C13331b.f29883d || V == C10084c.f22271b)) {
                        m3947Z(function2, dVar, i, V);
                    }
                } else {
                    return;
                }
            } else if (m3954L(dVar, function2, i)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public final void m3948Y(CancellableContinuation<?> cancellableContinuation, AbstractC13357s<?> sVar) {
        cancellableContinuation.mo14131k(new C13326d(sVar));
    }

    /* renamed from: Z */
    private final <R> void m3947Z(Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, AbstractC10198d<? super R> dVar, int i, Object obj) {
        Object obj2;
        boolean z = obj instanceof C13348l;
        if (z) {
            if (i == 0) {
                throw C10085c0.m14334a(((C13348l) obj).m3891d0());
            } else if (i == 1 && dVar.mo14019s()) {
                C14170b.m1464c(function2, C13342i.m3907b(C13342i.f29905b.m3898a(((C13348l) obj).f29909n)), dVar.mo14018w());
            }
        } else if (i == 1) {
            C13342i.C13344b bVar = C13342i.f29905b;
            if (z) {
                obj2 = bVar.m3898a(((C13348l) obj).f29909n);
            } else {
                obj2 = bVar.m3896c(obj);
            }
            C14170b.m1464c(function2, C13342i.m3907b(obj2), dVar.mo14018w());
        } else {
            C14170b.m1464c(function2, obj, dVar.mo14018w());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p372ui.AbstractC13332c
    /* renamed from: C */
    public AbstractC13359u<E> mo3937C() {
        AbstractC13359u<E> C = super.mo3937C();
        if (C != null && !(C instanceof C13348l)) {
            m3952S();
        }
        return C;
    }

    /* renamed from: H */
    public final boolean m3957H(Throwable th2) {
        boolean t = mo3857t(th2);
        mo3888Q(t);
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final C13327e<E> m3956I() {
        return new C13327e<>(m3930m());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public boolean mo3889K(AbstractC13357s<? super E> sVar) {
        int V;
        C10110p N;
        if (mo3863M()) {
            C10110p m = m3930m();
            do {
                N = m.m14251N();
                if (!(!(N instanceof AbstractC13361w))) {
                    return false;
                }
            } while (!N.m14258G(sVar, m));
        } else {
            C10110p m2 = m3930m();
            C13328f fVar = new C13328f(sVar, this);
            do {
                C10110p N2 = m2.m14251N();
                if (!(!(N2 instanceof AbstractC13361w))) {
                    return false;
                }
                V = N2.m14244V(sVar, m2, fVar);
                if (V != 1) {
                }
            } while (V != 2);
            return false;
        }
        return true;
    }

    /* renamed from: M */
    protected abstract boolean mo3863M();

    /* renamed from: N */
    protected abstract boolean mo3862N();

    /* renamed from: O */
    public boolean mo3920O() {
        return m3932k() != null && mo3862N();
    }

    /* renamed from: P */
    protected final boolean m3953P() {
        return !(m3930m().m14252M() instanceof AbstractC13361w) && mo3862N();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo3888Q(boolean z) {
        C13348l<?> l = m3931l();
        if (l != null) {
            Object b = C10103k.m14274b(null, 1, null);
            while (true) {
                C10110p N = l.m14251N();
                if (N instanceof C10108n) {
                    mo3883R(b, l);
                    return;
                } else if (!N.mo3849R()) {
                    N.m14250O();
                } else {
                    b = C10103k.m14273c(b, (AbstractC13361w) N);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* renamed from: R */
    protected void mo3883R(Object obj, C13348l<?> lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((AbstractC13361w) obj).mo3851Y(lVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                ((AbstractC13361w) arrayList.get(size)).mo3851Y(lVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: S */
    protected void m3952S() {
    }

    /* renamed from: T */
    protected void m3951T() {
    }

    /* renamed from: U */
    protected Object mo3887U() {
        while (true) {
            AbstractC13361w D = m3936D();
            if (D == null) {
                return C13331b.f29883d;
            }
            if (D.mo3850Z(null) != null) {
                D.mo3853W();
                return D.mo3852X();
            }
            D.mo3848a0();
        }
    }

    /* renamed from: V */
    protected Object mo3886V(AbstractC10198d<?> dVar) {
        C13327e<E> I = m3956I();
        Object y = dVar.mo14016y(I);
        if (y != null) {
            return y;
        }
        I.m14232o().mo3853W();
        return I.m14232o().mo3852X();
    }

    @Override // p372ui.AbstractC13358t
    /* renamed from: e */
    public final AbstractC10197c<C13342i<E>> mo3869e() {
        return new C13329g(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // p372ui.AbstractC13358t
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3868f(kotlin.coroutines.Continuation<? super p372ui.C13342i<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p372ui.AbstractC13323a.C13330h
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ui.a$h r0 = (p372ui.AbstractC13323a.C13330h) r0
            int r1 = r0.f29879m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29879m = r1
            goto L_0x0018
        L_0x0013:
            ui.a$h r0 = new ui.a$h
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f29877k
            java.lang.Object r1 = tf.C13075b.m4650d()
            int r2 = r0.f29879m
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            nf.C11093t.m10930b(r5)
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            nf.C11093t.m10930b(r5)
            java.lang.Object r5 = r4.mo3887U()
            kotlinx.coroutines.internal.d0 r2 = p372ui.C13331b.f29883d
            if (r5 == r2) goto L_0x0052
            boolean r0 = r5 instanceof p372ui.C13348l
            if (r0 == 0) goto L_0x004b
            ui.i$b r0 = p372ui.C13342i.f29905b
            ui.l r5 = (p372ui.C13348l) r5
            java.lang.Throwable r5 = r5.f29909n
            java.lang.Object r5 = r0.m3898a(r5)
            goto L_0x0051
        L_0x004b:
            ui.i$b r0 = p372ui.C13342i.f29905b
            java.lang.Object r5 = r0.m3896c(r5)
        L_0x0051:
            return r5
        L_0x0052:
            r0.f29879m = r3
            java.lang.Object r5 = r4.m3950W(r3, r0)
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x005b:
            ui.i r5 = (p372ui.C13342i) r5
            java.lang.Object r5 = r5.m3899j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p372ui.AbstractC13323a.mo3868f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p372ui.AbstractC13358t
    /* renamed from: h */
    public final void mo3867h(CancellationException cancellationException) {
        if (!mo3920O()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(C10149n0.m14165a(this) + " was cancelled");
            }
            m3957H(cancellationException);
        }
    }
}
