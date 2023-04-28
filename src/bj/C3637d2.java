package bj;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nf.C11097w;
import p014aj.C1407a;
import p014aj.C1427g;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016J\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m15073d2 = {"Lbj/d2;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Lnf/w;", "Lkotlinx/serialization/encoding/c;", "composite", "d", "e", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "g", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "f", "a", "Lkotlinx/serialization/KSerializer;", "aSerializer", "b", "bSerializer", "c", "cSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.d2 */
/* loaded from: classes8.dex */
public final class C3637d2<A, B, C> implements KSerializer<C11097w<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a */
    private final KSerializer<A> f5937a;

    /* renamed from: b */
    private final KSerializer<B> f5938b;

    /* renamed from: c */
    private final KSerializer<C> f5939c;

    /* renamed from: d */
    private final SerialDescriptor f5940d = C1427g.m41130b("kotlin.Triple", new SerialDescriptor[0], new C3638a(this));

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"A", "B", "C", "Laj/a;", "", "a", "(Laj/a;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: bj.d2$a */
    /* loaded from: classes8.dex */
    static final class C3638a extends AbstractC9973s implements Function1<C1407a, Unit> {

        /* renamed from: k */
        final /* synthetic */ C3637d2<A, B, C> f5941k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3638a(C3637d2<A, B, C> d2Var) {
            super(1);
            this.f5941k = d2Var;
        }

        /* renamed from: a */
        public final void m33908a(C1407a buildClassSerialDescriptor) {
            C9971q.m14633g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            C1407a.m41145b(buildClassSerialDescriptor, "first", ((C3637d2) this.f5941k).f5937a.getDescriptor(), null, false, 12, null);
            C1407a.m41145b(buildClassSerialDescriptor, "second", ((C3637d2) this.f5941k).f5938b.getDescriptor(), null, false, 12, null);
            C1407a.m41145b(buildClassSerialDescriptor, "third", ((C3637d2) this.f5941k).f5939c.getDescriptor(), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C1407a aVar) {
            m33908a(aVar);
            return Unit.f22042a;
        }
    }

    public C3637d2(KSerializer<A> aSerializer, KSerializer<B> bSerializer, KSerializer<C> cSerializer) {
        C9971q.m14633g(aSerializer, "aSerializer");
        C9971q.m14633g(bSerializer, "bSerializer");
        C9971q.m14633g(cSerializer, "cSerializer");
        this.f5937a = aSerializer;
        this.f5938b = bSerializer;
        this.f5939c = cSerializer;
    }

    /* renamed from: d */
    private final C11097w<A, B, C> m33912d(AbstractC10248c cVar) {
        Object c = AbstractC10248c.C10249a.m13844c(cVar, getDescriptor(), 0, this.f5937a, null, 8, null);
        Object c2 = AbstractC10248c.C10249a.m13844c(cVar, getDescriptor(), 1, this.f5938b, null, 8, null);
        Object c3 = AbstractC10248c.C10249a.m13844c(cVar, getDescriptor(), 2, this.f5939c, null, 8, null);
        cVar.mo13857c(getDescriptor());
        return new C11097w<>(c, c2, c3);
    }

    /* renamed from: e */
    private final C11097w<A, B, C> m33911e(AbstractC10248c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = C3642e2.f5947a;
        obj2 = C3642e2.f5947a;
        obj3 = C3642e2.f5947a;
        while (true) {
            int o = cVar.mo13851o(getDescriptor());
            if (o == -1) {
                cVar.mo13857c(getDescriptor());
                obj4 = C3642e2.f5947a;
                if (obj != obj4) {
                    obj5 = C3642e2.f5947a;
                    if (obj2 != obj5) {
                        obj6 = C3642e2.f5947a;
                        if (obj3 != obj6) {
                            return new C11097w<>(obj, obj2, obj3);
                        }
                        throw new C14436g("Element 'third' is missing");
                    }
                    throw new C14436g("Element 'second' is missing");
                }
                throw new C14436g("Element 'first' is missing");
            } else if (o == 0) {
                obj = AbstractC10248c.C10249a.m13844c(cVar, getDescriptor(), 0, this.f5937a, null, 8, null);
            } else if (o == 1) {
                obj2 = AbstractC10248c.C10249a.m13844c(cVar, getDescriptor(), 1, this.f5938b, null, 8, null);
            } else if (o == 2) {
                obj3 = AbstractC10248c.C10249a.m13844c(cVar, getDescriptor(), 2, this.f5939c, null, 8, null);
            } else {
                throw new C14436g("Unexpected index " + o);
            }
        }
    }

    /* renamed from: f */
    public C11097w<A, B, C> deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        AbstractC10248c b = decoder.mo13905b(getDescriptor());
        if (b.mo13850p()) {
            return m33912d(b);
        }
        return m33911e(b);
    }

    /* renamed from: g */
    public void serialize(Encoder encoder, C11097w<? extends A, ? extends B, ? extends C> value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        CompositeEncoder b = encoder.mo13885b(getDescriptor());
        b.mo13870t(getDescriptor(), 0, this.f5937a, value.m10924d());
        b.mo13870t(getDescriptor(), 1, this.f5938b, value.m10923e());
        b.mo13870t(getDescriptor(), 2, this.f5939c, value.m10922f());
        b.mo13884c(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f5940d;
    }
}
