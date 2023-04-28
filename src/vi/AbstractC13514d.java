package vi;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9914r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10135k0;
import kotlinx.coroutines.C10149n0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.EnumC10140l0;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.C10039d;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C11093t;
import p339sf.C12893f;
import p372ui.AbstractC13358t;
import p372ui.C13353q;
import p372ui.EnumC13337e;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH¤@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0016J!\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R9\u0010&\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m15073d2 = {"Lvi/d;", "T", "Lvi/k;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lui/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "a", "e", "Lkotlinx/coroutines/channels/ProducerScope;", "scope", "", "d", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "Lui/t;", "h", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "toString", "k", "Lkotlin/coroutines/CoroutineContext;", "l", "I", "m", "Lui/e;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "f", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "g", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILui/e;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: vi.d */
/* loaded from: classes8.dex */
public abstract class AbstractC13514d<T> implements AbstractC13526k<T> {

    /* renamed from: k */
    public final CoroutineContext f30198k;

    /* renamed from: l */
    public final int f30199l;

    /* renamed from: m */
    public final EnumC13337e f30200m;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m15073d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m14701f = "ChannelFlow.kt", m14700l = {123}, m14699m = "invokeSuspend")
    /* renamed from: vi.d$a */
    /* loaded from: classes8.dex */
    public static final class C13515a extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        int f30201k;

        /* renamed from: l */
        private /* synthetic */ Object f30202l;

        /* renamed from: m */
        final /* synthetic */ FlowCollector<T> f30203m;

        /* renamed from: n */
        final /* synthetic */ AbstractC13514d<T> f30204n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13515a(FlowCollector<? super T> flowCollector, AbstractC13514d<T> dVar, Continuation<? super C13515a> continuation) {
            super(2, continuation);
            this.f30203m = flowCollector;
            this.f30204n = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13515a aVar = new C13515a(this.f30203m, this.f30204n, continuation);
            aVar.f30202l = obj;
            return aVar;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13515a) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C13080d.m4646d();
            int i = this.f30201k;
            if (i == 0) {
                C11093t.m10930b(obj);
                FlowCollector<T> flowCollector = this.f30203m;
                AbstractC13358t<T> h = this.f30204n.m3496h((CoroutineScope) this.f30202l);
                this.f30201k = 1;
                if (C10039d.m14430c(flowCollector, h, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C11093t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m15073d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "it", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 6, 0})
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m14701f = "ChannelFlow.kt", m14700l = {60}, m14699m = "invokeSuspend")
    /* renamed from: vi.d$b */
    /* loaded from: classes8.dex */
    public static final class C13516b extends AbstractC9938k implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        int f30205k;

        /* renamed from: l */
        /* synthetic */ Object f30206l;

        /* renamed from: m */
        final /* synthetic */ AbstractC13514d<T> f30207m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13516b(AbstractC13514d<T> dVar, Continuation<? super C13516b> continuation) {
            super(2, continuation);
            this.f30207m = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13516b bVar = new C13516b(this.f30207m, continuation);
            bVar.f30206l = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((ProducerScope) ((ProducerScope) obj), continuation);
        }

        public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
            return ((C13516b) create(producerScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C13080d.m4646d();
            int i = this.f30205k;
            if (i == 0) {
                C11093t.m10930b(obj);
                AbstractC13514d<T> dVar = this.f30207m;
                this.f30205k = 1;
                if (dVar.mo3491d((ProducerScope) this.f30206l, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C11093t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f22042a;
        }
    }

    public AbstractC13514d(CoroutineContext coroutineContext, int i, EnumC13337e eVar) {
        this.f30198k = coroutineContext;
        this.f30199l = i;
        this.f30200m = eVar;
    }

    /* renamed from: c */
    static /* synthetic */ Object m3499c(AbstractC13514d dVar, FlowCollector flowCollector, Continuation continuation) {
        Object d;
        Object g = C10135k0.m14181g(new C13515a(flowCollector, dVar, null), continuation);
        d = C13080d.m4646d();
        return g == d ? g : Unit.f22042a;
    }

    @Override // vi.AbstractC13526k
    /* renamed from: a */
    public Flow<T> mo3478a(CoroutineContext coroutineContext, int i, EnumC13337e eVar) {
        CoroutineContext f0 = coroutineContext.mo3485f0(this.f30198k);
        if (eVar == EnumC13337e.SUSPEND) {
            int i2 = this.f30199l;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = ViewDefaults.NUMBER_OF_LINES;
                        }
                    }
                }
                i = i2;
            }
            eVar = this.f30200m;
        }
        if (C9971q.m14638b(f0, this.f30198k) && i == this.f30199l && eVar == this.f30200m) {
            return this;
        }
        return mo3487e(f0, i, eVar);
    }

    /* renamed from: b */
    protected String m3500b() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return m3499c(this, flowCollector, continuation);
    }

    /* renamed from: d */
    protected abstract Object mo3491d(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation);

    /* renamed from: e */
    protected abstract AbstractC13514d<T> mo3487e(CoroutineContext coroutineContext, int i, EnumC13337e eVar);

    /* renamed from: f */
    public final Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> m3498f() {
        return new C13516b(this, null);
    }

    /* renamed from: g */
    public final int m3497g() {
        int i = this.f30199l;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: h */
    public AbstractC13358t<T> m3496h(CoroutineScope coroutineScope) {
        return C13353q.m3877e(coroutineScope, this.f30198k, m3497g(), this.f30200m, EnumC10140l0.ATOMIC, null, m3498f(), 16, null);
    }

    public String toString() {
        String e0;
        ArrayList arrayList = new ArrayList(4);
        String b = m3500b();
        if (b != null) {
            arrayList.add(b);
        }
        if (this.f30198k != C12893f.f28966k) {
            arrayList.add("context=" + this.f30198k);
        }
        if (this.f30199l != -3) {
            arrayList.add("capacity=" + this.f30199l);
        }
        if (this.f30200m != EnumC13337e.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f30200m);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C10149n0.m14165a(this));
        sb2.append('[');
        e0 = C9914r.m14760e0(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb2.append(e0);
        sb2.append(']');
        return sb2.toString();
    }
}
