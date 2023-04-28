package p014aj;

import bj.C3705u1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9899f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.C10241a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.AbstractC1432i;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b\u001aI\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m15073d2 = {"", "serialName", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameters", "Lkotlin/Function1;", "Laj/a;", "", "builderAction", "b", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Laj/e;", "kind", "a", "Laj/h;", "builder", "c", "(Ljava/lang/String;Laj/h;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: aj.g */
/* loaded from: classes8.dex */
public final class C1427g {

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"Laj/a;", "", "a", "(Laj/a;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: aj.g$a */
    /* loaded from: classes8.dex */
    public static final class C1428a extends AbstractC9973s implements Function1<C1407a, Unit> {

        /* renamed from: k */
        public static final C1428a f478k = new C1428a();

        C1428a() {
            super(1);
        }

        /* renamed from: a */
        public final void m41127a(C1407a aVar) {
            C9971q.m14633g(aVar, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C1407a aVar) {
            m41127a(aVar);
            return Unit.f22042a;
        }
    }

    /* renamed from: a */
    public static final SerialDescriptor m41131a(String serialName, AbstractC1413e kind) {
        boolean w;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(kind, "kind");
        w = C12718u.m5729w(serialName);
        if (!w) {
            return C3705u1.m33787a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: b */
    public static final SerialDescriptor m41130b(String serialName, SerialDescriptor[] typeParameters, Function1<? super C1407a, Unit> builderAction) {
        boolean w;
        List u0;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(typeParameters, "typeParameters");
        C9971q.m14633g(builderAction, "builderAction");
        w = C12718u.m5729w(serialName);
        if (!w) {
            C1407a aVar = new C1407a(serialName);
            builderAction.invoke(aVar);
            AbstractC1432i.C1433a aVar2 = AbstractC1432i.C1433a.f481a;
            int size = aVar.m41141f().size();
            u0 = C9899f.m14914u0(typeParameters);
            return new C10241a(serialName, aVar2, size, u0, aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: c */
    public static final SerialDescriptor m41129c(String serialName, AbstractC1429h kind, SerialDescriptor[] typeParameters, Function1<? super C1407a, Unit> builder) {
        boolean w;
        List u0;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(typeParameters, "typeParameters");
        C9971q.m14633g(builder, "builder");
        w = C12718u.m5729w(serialName);
        if (!(!w)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!C9971q.m14638b(kind, AbstractC1432i.C1433a.f481a)) {
            C1407a aVar = new C1407a(serialName);
            builder.invoke(aVar);
            int size = aVar.m41141f().size();
            u0 = C9899f.m14914u0(typeParameters);
            return new C10241a(serialName, kind, size, u0, aVar);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
    }

    /* renamed from: d */
    public static /* synthetic */ SerialDescriptor m41128d(String str, AbstractC1429h hVar, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = C1428a.f478k;
        }
        return m41129c(str, hVar, serialDescriptorArr, function1);
    }
}
