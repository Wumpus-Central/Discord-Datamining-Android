package p449yi;

import bj.AbstractC3623b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9897e;
import kotlin.collections.C9906j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.C11084n;
import nf.EnumC11087p;
import p014aj.AbstractC1410d;
import p014aj.AbstractC1429h;
import p014aj.C1407a;
import p014aj.C1408b;
import p014aj.C1427g;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0011\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m15073d2 = {"Lyi/c;", "", "T", "Lbj/b;", "", "toString", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/KClass;)V", "", "classAnnotations", "(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: yi.c */
/* loaded from: classes8.dex */
public final class C14431c<T> extends AbstractC3623b<T> {

    /* renamed from: a */
    private final KClass<T> f32647a;

    /* renamed from: b */
    private List<? extends Annotation> f32648b;

    /* renamed from: c */
    private final Lazy f32649c;

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: yi.c$a */
    /* loaded from: classes8.dex */
    static final class C14432a extends AbstractC9973s implements Function0<SerialDescriptor> {

        /* renamed from: k */
        final /* synthetic */ C14431c<T> f32650k;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "T", "Laj/a;", "", "a", "(Laj/a;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
        /* renamed from: yi.c$a$a */
        /* loaded from: classes8.dex */
        public static final class C0471a extends AbstractC9973s implements Function1<C1407a, Unit> {

            /* renamed from: k */
            final /* synthetic */ C14431c<T> f32651k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0471a(C14431c<T> cVar) {
                super(1);
                this.f32651k = cVar;
            }

            /* renamed from: a */
            public final void m614a(C1407a buildSerialDescriptor) {
                C9971q.m14633g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C1407a.m41145b(buildSerialDescriptor, "type", C14667a.m39E(C9962k0.f22091a).getDescriptor(), null, false, 12, null);
                C1407a.m41145b(buildSerialDescriptor, "value", C1427g.m41128d("kotlinx.serialization.Polymorphic<" + this.f32651k.mo617e().mo14598l() + '>', AbstractC1429h.C1430a.f479a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.m41139h(((C14431c) this.f32651k).f32648b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C1407a aVar) {
                m614a(aVar);
                return Unit.f22042a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14432a(C14431c<T> cVar) {
            super(0);
            this.f32650k = cVar;
        }

        /* renamed from: a */
        public final SerialDescriptor invoke() {
            return C1408b.m41136c(C1427g.m41129c("kotlinx.serialization.Polymorphic", AbstractC1410d.C1411a.f461a, new SerialDescriptor[0], new C0471a(this.f32650k)), this.f32650k.mo617e());
        }
    }

    public C14431c(KClass<T> baseClass) {
        List<? extends Annotation> i;
        Lazy b;
        C9971q.m14633g(baseClass, "baseClass");
        this.f32647a = baseClass;
        i = C9906j.m14820i();
        this.f32648b = i;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, new C14432a(this));
        this.f32649c = b;
    }

    @Override // bj.AbstractC3623b
    /* renamed from: e */
    public KClass<T> mo617e() {
        return this.f32647a;
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f32649c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + mo617e() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14431c(KClass<T> baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        List<? extends Annotation> d;
        C9971q.m14633g(baseClass, "baseClass");
        C9971q.m14633g(classAnnotations, "classAnnotations");
        d = C9897e.m14991d(classAnnotations);
        this.f32648b = d;
    }
}
