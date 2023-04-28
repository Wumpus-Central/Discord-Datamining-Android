package bj;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.C11098x;
import p014aj.C1407a;
import p014aj.C1427g;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0017"}, m15073d2 = {"Lbj/i1;", "K", "V", "Lbj/p0;", "Lkotlin/Pair;", "key", "value", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "d", "(Lkotlin/Pair;)Ljava/lang/Object;", "e", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.i1 */
/* loaded from: classes8.dex */
public final class C3659i1<K, V> extends AbstractC3688p0<K, V, Pair<? extends K, ? extends V>> {

    /* renamed from: c */
    private final SerialDescriptor f5972c;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"K", "V", "Laj/a;", "", "a", "(Laj/a;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: bj.i1$a */
    /* loaded from: classes8.dex */
    static final class C3660a extends AbstractC9973s implements Function1<C1407a, Unit> {

        /* renamed from: k */
        final /* synthetic */ KSerializer<K> f5973k;

        /* renamed from: l */
        final /* synthetic */ KSerializer<V> f5974l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3660a(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
            super(1);
            this.f5973k = kSerializer;
            this.f5974l = kSerializer2;
        }

        /* renamed from: a */
        public final void m33869a(C1407a buildClassSerialDescriptor) {
            C9971q.m14633g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            C1407a.m41145b(buildClassSerialDescriptor, "first", this.f5973k.getDescriptor(), null, false, 12, null);
            C1407a.m41145b(buildClassSerialDescriptor, "second", this.f5974l.getDescriptor(), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C1407a aVar) {
            m33869a(aVar);
            return Unit.f22042a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3659i1(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        C9971q.m14633g(keySerializer, "keySerializer");
        C9971q.m14633g(valueSerializer, "valueSerializer");
        this.f5972c = C1427g.m41130b("kotlin.Pair", new SerialDescriptor[0], new C3660a(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public K mo33759a(Pair<? extends K, ? extends V> pair) {
        C9971q.m14633g(pair, "<this>");
        return (K) pair.m15065c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public V mo33758b(Pair<? extends K, ? extends V> pair) {
        C9971q.m14633g(pair, "<this>");
        return (V) pair.m15064d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public Pair<K, V> mo33757c(K k, V v) {
        return C11098x.m10921a(k, v);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f5972c;
    }
}
