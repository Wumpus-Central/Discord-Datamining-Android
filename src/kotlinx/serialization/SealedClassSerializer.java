package kotlinx.serialization;

import bj.AbstractC3623b;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9897e;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.Encoder;
import nf.C11084n;
import nf.EnumC11087p;
import p014aj.AbstractC1410d;
import p014aj.AbstractC1429h;
import p014aj.C1407a;
import p014aj.C1427g;
import p267of.AbstractC11279l;
import p267of.C11288u;
import p267of.C11289v;
import p449yi.AbstractC14437h;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00100&\u0012\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0&¢\u0006\u0004\b)\u0010*BY\b\u0011\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00100&\u0012\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0&\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170&¢\u0006\u0004\b)\u0010,J\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J'\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR0\u0010#\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R(\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006-"}, m15073d2 = {"Lkotlinx/serialization/SealedClassSerializer;", "", "T", "Lbj/b;", "Lkotlinx/serialization/encoding/c;", "decoder", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "c", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lyi/h;", "d", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lyi/h;", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "Lkotlinx/serialization/KSerializer;", "Ljava/util/Map;", "class2Serializer", "serialName2Serializer", "serialName", "", "subclasses", "subclassSerializers", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V", "classAnnotations", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class SealedClassSerializer<T> extends AbstractC3623b<T> {

    /* renamed from: a */
    private final KClass<T> f22490a;

    /* renamed from: b */
    private List<? extends Annotation> f22491b;

    /* renamed from: c */
    private final Lazy f22492c;

    /* renamed from: d */
    private final Map<KClass<? extends T>, KSerializer<? extends T>> f22493d;

    /* renamed from: e */
    private final Map<String, KSerializer<? extends T>> f22494e;

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.SealedClassSerializer$a */
    /* loaded from: classes8.dex */
    static final class C10238a extends AbstractC9973s implements Function0<SerialDescriptor> {

        /* renamed from: k */
        final /* synthetic */ String f22495k;

        /* renamed from: l */
        final /* synthetic */ SealedClassSerializer<T> f22496l;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "T", "Laj/a;", "", "a", "(Laj/a;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: kotlinx.serialization.SealedClassSerializer$a$a */
        /* loaded from: classes8.dex */
        public static final class C0315a extends AbstractC9973s implements Function1<C1407a, Unit> {

            /* renamed from: k */
            final /* synthetic */ SealedClassSerializer<T> f22497k;

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "T", "Laj/a;", "", "a", "(Laj/a;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
            /* renamed from: kotlinx.serialization.SealedClassSerializer$a$a$a */
            /* loaded from: classes8.dex */
            public static final class C0316a extends AbstractC9973s implements Function1<C1407a, Unit> {

                /* renamed from: k */
                final /* synthetic */ SealedClassSerializer<T> f22498k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0316a(SealedClassSerializer<T> sealedClassSerializer) {
                    super(1);
                    this.f22498k = sealedClassSerializer;
                }

                /* renamed from: a */
                public final void m13926a(C1407a buildSerialDescriptor) {
                    C9971q.m14633g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                    for (Map.Entry entry : ((SealedClassSerializer) this.f22498k).f22494e.entrySet()) {
                        C1407a.m41145b(buildSerialDescriptor, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), null, false, 12, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C1407a aVar) {
                    m13926a(aVar);
                    return Unit.f22042a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0315a(SealedClassSerializer<T> sealedClassSerializer) {
                super(1);
                this.f22497k = sealedClassSerializer;
            }

            /* renamed from: a */
            public final void m13927a(C1407a buildSerialDescriptor) {
                C9971q.m14633g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C1407a.m41145b(buildSerialDescriptor, "type", C14667a.m39E(C9962k0.f22091a).getDescriptor(), null, false, 12, null);
                C1407a.m41145b(buildSerialDescriptor, "value", C1427g.m41129c("kotlinx.serialization.Sealed<" + this.f22497k.mo617e().mo14598l() + '>', AbstractC1429h.C1430a.f479a, new SerialDescriptor[0], new C0316a(this.f22497k)), null, false, 12, null);
                buildSerialDescriptor.m41139h(((SealedClassSerializer) this.f22497k).f22491b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C1407a aVar) {
                m13927a(aVar);
                return Unit.f22042a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10238a(String str, SealedClassSerializer<T> sealedClassSerializer) {
            super(0);
            this.f22495k = str;
            this.f22496l = sealedClassSerializer;
        }

        /* renamed from: a */
        public final SerialDescriptor invoke() {
            return C1427g.m41129c(this.f22495k, AbstractC1410d.C1412b.f462a, new SerialDescriptor[0], new C0315a(this.f22496l));
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m15073d2 = {"kotlinx/serialization/SealedClassSerializer$b", "Lof/l;", "", "b", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.SealedClassSerializer$b */
    /* loaded from: classes8.dex */
    public static final class C10239b implements AbstractC11279l<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String> {

        /* renamed from: a */
        final /* synthetic */ Iterable f22499a;

        public C10239b(Iterable iterable) {
            this.f22499a = iterable;
        }

        @Override // p267of.AbstractC11279l
        /* renamed from: a */
        public String mo10281a(Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> entry) {
            return ((KSerializer) entry.getValue()).getDescriptor().mo13676i();
        }

        @Override // p267of.AbstractC11279l
        /* renamed from: b */
        public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> mo10280b() {
            return this.f22499a.iterator();
        }
    }

    public SealedClassSerializer(String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers) {
        List<? extends Annotation> i;
        Lazy b;
        List J0;
        Map<KClass<? extends T>, KSerializer<? extends T>> r;
        int d;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(baseClass, "baseClass");
        C9971q.m14633g(subclasses, "subclasses");
        C9971q.m14633g(subclassSerializers, "subclassSerializers");
        this.f22490a = baseClass;
        i = C9906j.m14820i();
        this.f22491b = i;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C10238a(serialName, this));
        this.f22492c = b;
        if (subclasses.length == subclassSerializers.length) {
            J0 = C9899f.m14953J0(subclasses, subclassSerializers);
            r = C11289v.m10241r(J0);
            this.f22493d = r;
            AbstractC11279l bVar = new C10239b(r.entrySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> b2 = bVar.mo10280b();
            while (b2.hasNext()) {
                T next = b2.next();
                Object a = bVar.mo10281a(next);
                Object obj = linkedHashMap.get(a);
                if (obj == null) {
                    linkedHashMap.containsKey(a);
                }
                Map.Entry entry = (Map.Entry) next;
                Map.Entry entry2 = (Map.Entry) obj;
                String str = (String) a;
                if (entry2 == null) {
                    linkedHashMap.put(a, entry);
                } else {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + mo617e() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
            }
            d = C11288u.m10255d(linkedHashMap.size());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f22494e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + mo617e().mo14598l() + " should be marked @Serializable");
    }

    @Override // bj.AbstractC3623b
    /* renamed from: c */
    public DeserializationStrategy<T> mo13932c(AbstractC10248c decoder, String str) {
        C9971q.m14633g(decoder, "decoder");
        KSerializer<? extends T> kSerializer = this.f22494e.get(str);
        if (kSerializer != null) {
            return kSerializer;
        }
        return super.mo13932c(decoder, str);
    }

    @Override // bj.AbstractC3623b
    /* renamed from: d */
    public AbstractC14437h<T> mo13931d(Encoder encoder, T value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        KSerializer<? extends T> kSerializer = this.f22493d.get(C9951f0.m14684b(value.getClass()));
        if (kSerializer == null) {
            kSerializer = super.mo13931d(encoder, value);
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        return null;
    }

    @Override // bj.AbstractC3623b
    /* renamed from: e */
    public KClass<T> mo617e() {
        return this.f22490a;
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f22492c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        List<? extends Annotation> d;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(baseClass, "baseClass");
        C9971q.m14633g(subclasses, "subclasses");
        C9971q.m14633g(subclassSerializers, "subclassSerializers");
        C9971q.m14633g(classAnnotations, "classAnnotations");
        d = C9897e.m14991d(classAnnotations);
        this.f22491b = d;
    }
}
