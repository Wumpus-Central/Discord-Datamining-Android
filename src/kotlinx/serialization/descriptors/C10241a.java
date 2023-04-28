package kotlinx.serialization.descriptors;

import bj.AbstractC3671l;
import bj.C3677m1;
import bj.C3685o1;
import eg.C6884j;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.C11084n;
import nf.C11098x;
import p014aj.AbstractC1429h;
import p014aj.C1407a;
import p267of.C11280m;
import p267of.C11289v;

@Metadata(m15074d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R \u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b\u0014\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010.R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00103R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u001b\u0010<\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010!¨\u0006B"}, m15073d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lbj/l;", "", "index", "", "e", "name", "c", "", "", "f", "h", "", "j", "", "other", "equals", "hashCode", "toString", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "Laj/h;", "b", "Laj/h;", "g", "()Laj/h;", "kind", "I", "d", "()I", "elementsCount", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "[Ljava/util/List;", "elementAnnotations", "", "[Z", "elementOptionality", "", "Ljava/util/Map;", "name2Index", "k", "typeParametersDescriptors", "l", "Lkotlin/Lazy;", "_hashCode", "typeParameters", "Laj/a;", "builder", "<init>", "(Ljava/lang/String;Laj/h;ILjava/util/List;Laj/a;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.descriptors.a */
/* loaded from: classes8.dex */
public final class C10241a implements SerialDescriptor, AbstractC3671l {

    /* renamed from: a */
    private final String f22500a;

    /* renamed from: b */
    private final AbstractC1429h f22501b;

    /* renamed from: c */
    private final int f22502c;

    /* renamed from: d */
    private final List<Annotation> f22503d;

    /* renamed from: e */
    private final Set<String> f22504e;

    /* renamed from: f */
    private final String[] f22505f;

    /* renamed from: g */
    private final SerialDescriptor[] f22506g;

    /* renamed from: h */
    private final List<Annotation>[] f22507h;

    /* renamed from: i */
    private final boolean[] f22508i;

    /* renamed from: j */
    private final Map<String, Integer> f22509j;

    /* renamed from: k */
    private final SerialDescriptor[] f22510k;

    /* renamed from: l */
    private final Lazy f22511l;

    @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlinx.serialization.descriptors.a$a */
    /* loaded from: classes8.dex */
    static final class C0317a extends AbstractC9973s implements Function0<Integer> {
        C0317a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            C10241a aVar = C10241a.this;
            return Integer.valueOf(C3685o1.m33813a(aVar, aVar.f22510k));
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "it", "", "a", "(I)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.descriptors.a$b */
    /* loaded from: classes8.dex */
    static final class C10242b extends AbstractC9973s implements Function1<Integer, CharSequence> {
        C10242b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m13920a(int i) {
            return C10241a.this.mo13680e(i) + ": " + C10241a.this.mo13677h(i).mo13676i();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return m13920a(num.intValue());
        }
    }

    public C10241a(String serialName, AbstractC1429h kind, int i, List<? extends SerialDescriptor> typeParameters, C1407a builder) {
        HashSet B0;
        boolean[] z0;
        Iterable<C11280m> I0;
        int t;
        Map<String, Integer> r;
        Lazy a;
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(kind, "kind");
        C9971q.m14633g(typeParameters, "typeParameters");
        C9971q.m14633g(builder, "builder");
        this.f22500a = serialName;
        this.f22501b = kind;
        this.f22502c = i;
        this.f22503d = builder.m41144c();
        B0 = C9914r.m14792B0(builder.m41141f());
        this.f22504e = B0;
        String[] strArr = (String[]) builder.m41141f().toArray(new String[0]);
        this.f22505f = strArr;
        this.f22506g = C3677m1.m33829b(builder.m41142e());
        this.f22507h = (List[]) builder.m41143d().toArray(new List[0]);
        z0 = C9914r.m14739z0(builder.m41140g());
        this.f22508i = z0;
        I0 = C9899f.m14955I0(strArr);
        t = C9907k.m14809t(I0, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C11280m mVar : I0) {
            arrayList.add(C11098x.m10921a(mVar.m10276d(), Integer.valueOf(mVar.m10277c())));
        }
        r = C11289v.m10241r(arrayList);
        this.f22509j = r;
        this.f22510k = C3677m1.m33829b(typeParameters);
        a = C11084n.m10945a(new C0317a());
        this.f22511l = a;
    }

    /* renamed from: l */
    private final int m13921l() {
        return ((Number) this.f22511l.getValue()).intValue();
    }

    @Override // bj.AbstractC3671l
    /* renamed from: a */
    public Set<String> mo13843a() {
        return this.f22504e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo13683b() {
        return SerialDescriptor.C10240a.m13923c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo13682c(String name) {
        C9971q.m14633g(name, "name");
        Integer num = this.f22509j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo13681d() {
        return this.f22502c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo13680e(int i) {
        return this.f22505f[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10241a) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C9971q.m14638b(mo13676i(), serialDescriptor.mo13676i()) && Arrays.equals(this.f22510k, ((C10241a) obj).f22510k) && mo13681d() == serialDescriptor.mo13681d()) {
                int d = mo13681d();
                for (int i = 0; i < d; i++) {
                    if (C9971q.m14638b(mo13677h(i).mo13676i(), serialDescriptor.mo13677h(i).mo13676i()) && C9971q.m14638b(mo13677h(i).mo13678g(), serialDescriptor.mo13677h(i).mo13678g())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo13679f(int i) {
        return this.f22507h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC1429h mo13678g() {
        return this.f22501b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.f22503d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo13677h(int i) {
        return this.f22506g[i];
    }

    public int hashCode() {
        return m13921l();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo13676i() {
        return this.f22500a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C10240a.m13924b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo13675j(int i) {
        return this.f22508i[i];
    }

    public String toString() {
        IntRange q;
        String e0;
        q = C6884j.m23947q(0, mo13681d());
        e0 = C9914r.m14760e0(q, ", ", mo13676i() + '(', ")", 0, null, new C10242b(), 24, null);
        return e0;
    }
}
