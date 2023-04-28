package bj;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import nf.C11084n;
import p014aj.AbstractC1429h;
import p014aj.AbstractC1432i;
import p014aj.C1422f;
import p014aj.C1427g;

@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m15073d2 = {"Lbj/a0;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "", "index", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "h", "", "other", "", "equals", "", "toString", "hashCode", "Laj/h;", "m", "Laj/h;", "g", "()Laj/h;", "kind", "", "n", "Lkotlin/Lazy;", "s", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "name", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.a0 */
/* loaded from: classes8.dex */
public final class C3619a0 extends PluginGeneratedSerialDescriptor {

    /* renamed from: m */
    private final AbstractC1429h f5911m = AbstractC1429h.C1431b.f480a;

    /* renamed from: n */
    private final Lazy f5912n;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: bj.a0$a */
    /* loaded from: classes8.dex */
    static final class C3620a extends AbstractC9973s implements Function0<SerialDescriptor[]> {

        /* renamed from: k */
        final /* synthetic */ int f5913k;

        /* renamed from: l */
        final /* synthetic */ String f5914l;

        /* renamed from: m */
        final /* synthetic */ C3619a0 f5915m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3620a(int i, String str, C3619a0 a0Var) {
            super(0);
            this.f5913k = i;
            this.f5914l = str;
            this.f5915m = a0Var;
        }

        /* renamed from: a */
        public final SerialDescriptor[] invoke() {
            int i = this.f5913k;
            SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
            for (int i2 = 0; i2 < i; i2++) {
                serialDescriptorArr[i2] = C1427g.m41128d(this.f5914l + '.' + this.f5915m.mo13680e(i2), AbstractC1432i.C1436d.f484a, new SerialDescriptor[0], null, 8, null);
            }
            return serialDescriptorArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3619a0(String name, int i) {
        super(name, null, i, 2, null);
        Lazy a;
        C9971q.m14633g(name, "name");
        a = C11084n.m10945a(new C3620a(i, name, this));
        this.f5912n = a;
    }

    /* renamed from: s */
    private final SerialDescriptor[] m33965s() {
        return (SerialDescriptor[]) this.f5912n.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (serialDescriptor.mo13678g() == AbstractC1429h.C1431b.f480a && C9971q.m14638b(mo13676i(), serialDescriptor.mo13676i()) && C9971q.m14638b(C3677m1.m33830a(this), C3677m1.m33830a(serialDescriptor))) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC1429h mo13678g() {
        return this.f5911m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo13677h(int i) {
        return m33965s()[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int i;
        int hashCode = mo13676i().hashCode();
        int i2 = 1;
        for (String str : C1422f.m41134b(this)) {
            int i3 = i2 * 31;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        String e0;
        Iterable<String> b = C1422f.m41134b(this);
        e0 = C9914r.m14760e0(b, ", ", mo13676i() + '(', ")", 0, null, null, 56, null);
        return e0;
    }
}
