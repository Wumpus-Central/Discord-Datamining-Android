package kotlinx.serialization.internal;

import bj.AbstractC3644f0;
import bj.AbstractC3671l;
import bj.C3677m1;
import bj.C3685o1;
import bj.C3689p1;
import eg.C6884j;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.C11084n;
import nf.EnumC11087p;
import p014aj.AbstractC1429h;
import p014aj.AbstractC1432i;
import p267of.C11289v;

@Metadata(m15074d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 \u0012\u0006\u0010'\u001a\u00020\u0005¢\u0006\u0004\bK\u0010LJ\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016R\u001a\u0010\u001f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010,0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R\"\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R%\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R!\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00010)8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010>R\u001b\u0010A\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b@\u0010&R\u0014\u0010D\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010I¨\u0006M"}, m15073d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lbj/l;", "", "", "", "n", "name", "", "isOptional", "", "l", "", "annotation", "r", "index", "h", "j", "", "f", "e", "c", "", "other", "equals", "hashCode", "toString", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "Lbj/f0;", "b", "Lbj/f0;", "generatedSerializer", "I", "d", "()I", "elementsCount", "added", "", "[Ljava/lang/String;", "names", "", "[Ljava/util/List;", "propertiesAnnotations", "g", "Ljava/util/List;", "classAnnotations", "", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "Lkotlinx/serialization/KSerializer;", "Lkotlin/Lazy;", "o", "()[Lkotlinx/serialization/KSerializer;", "childSerializers", "k", "p", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "q", "_hashCode", "Laj/h;", "()Laj/h;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "()Ljava/util/Set;", "serialNames", "<init>", "(Ljava/lang/String;Lbj/f0;I)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, AbstractC3671l {

    /* renamed from: a */
    private final String f22515a;

    /* renamed from: b */
    private final AbstractC3644f0<?> f22516b;

    /* renamed from: c */
    private final int f22517c;

    /* renamed from: d */
    private int f22518d;

    /* renamed from: e */
    private final String[] f22519e;

    /* renamed from: f */
    private final List<Annotation>[] f22520f;

    /* renamed from: g */
    private List<Annotation> f22521g;

    /* renamed from: h */
    private final boolean[] f22522h;

    /* renamed from: i */
    private Map<String, Integer> f22523i;

    /* renamed from: j */
    private final Lazy f22524j;

    /* renamed from: k */
    private final Lazy f22525k;

    /* renamed from: l */
    private final Lazy f22526l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$a */
    /* loaded from: classes8.dex */
    public static final class C10250a extends AbstractC9973s implements Function0<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10250a() {
            super(0);
            PluginGeneratedSerialDescriptor.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor.this;
            return Integer.valueOf(C3685o1.m33813a(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.m13837p()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"", "Lkotlinx/serialization/KSerializer;", "a", "()[Lkotlinx/serialization/KSerializer;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$b */
    /* loaded from: classes8.dex */
    public static final class C10251b extends AbstractC9973s implements Function0<KSerializer<?>[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10251b() {
            super(0);
            PluginGeneratedSerialDescriptor.this = r1;
        }

        /* renamed from: a */
        public final KSerializer<?>[] invoke() {
            KSerializer<?>[] childSerializers;
            AbstractC3644f0 f0Var = PluginGeneratedSerialDescriptor.this.f22516b;
            return (f0Var == null || (childSerializers = f0Var.childSerializers()) == null) ? C3689p1.f6010a : childSerializers;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"", "i", "", "a", "(I)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$c */
    /* loaded from: classes8.dex */
    static final class C10252c extends AbstractC9973s implements Function1<Integer, CharSequence> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10252c() {
            super(1);
            PluginGeneratedSerialDescriptor.this = r1;
        }

        /* renamed from: a */
        public final CharSequence m13833a(int i) {
            return PluginGeneratedSerialDescriptor.this.mo13680e(i) + ": " + PluginGeneratedSerialDescriptor.this.mo13677h(i).mo13676i();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return m13833a(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m15073d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$d */
    /* loaded from: classes8.dex */
    public static final class C10253d extends AbstractC9973s implements Function0<SerialDescriptor[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10253d() {
            super(0);
            PluginGeneratedSerialDescriptor.this = r1;
        }

        /* renamed from: a */
        public final SerialDescriptor[] invoke() {
            ArrayList arrayList;
            KSerializer<?>[] typeParametersSerializers;
            AbstractC3644f0 f0Var = PluginGeneratedSerialDescriptor.this.f22516b;
            if (f0Var == null || (typeParametersSerializers = f0Var.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(typeParametersSerializers.length);
                for (KSerializer<?> kSerializer : typeParametersSerializers) {
                    arrayList.add(kSerializer.getDescriptor());
                }
            }
            return C3677m1.m33829b(arrayList);
        }
    }

    public PluginGeneratedSerialDescriptor(String serialName, AbstractC3644f0<?> f0Var, int i) {
        Map<String, Integer> h;
        Lazy b;
        Lazy b2;
        Lazy b3;
        C9971q.m14633g(serialName, "serialName");
        this.f22515a = serialName;
        this.f22516b = f0Var;
        this.f22517c = i;
        this.f22518d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f22519e = strArr;
        int i3 = this.f22517c;
        this.f22520f = new List[i3];
        this.f22522h = new boolean[i3];
        h = C11289v.m10251h();
        this.f22523i = h;
        EnumC11087p pVar = EnumC11087p.PUBLICATION;
        b = C11084n.m10944b(pVar, new C10251b());
        this.f22524j = b;
        b2 = C11084n.m10944b(pVar, new C10253d());
        this.f22525k = b2;
        b3 = C11084n.m10944b(pVar, new C10250a());
        this.f22526l = b3;
    }

    /* renamed from: m */
    public static /* synthetic */ void m13840m(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            pluginGeneratedSerialDescriptor.m13841l(str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    /* renamed from: n */
    private final Map<String, Integer> m13839n() {
        HashMap hashMap = new HashMap();
        int length = this.f22519e.length;
        for (int i = 0; i < length; i++) {
            hashMap.put(this.f22519e[i], Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: o */
    private final KSerializer<?>[] m13838o() {
        return (KSerializer[]) this.f22524j.getValue();
    }

    /* renamed from: q */
    private final int m13836q() {
        return ((Number) this.f22526l.getValue()).intValue();
    }

    @Override // bj.AbstractC3671l
    /* renamed from: a */
    public Set<String> mo13843a() {
        return this.f22523i.keySet();
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
        Integer num = this.f22523i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public final int mo13681d() {
        return this.f22517c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo13680e(int i) {
        return this.f22519e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C9971q.m14638b(mo13676i(), serialDescriptor.mo13676i()) && Arrays.equals(m13837p(), ((PluginGeneratedSerialDescriptor) obj).m13837p()) && mo13681d() == serialDescriptor.mo13681d()) {
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
        List<Annotation> i2;
        List<Annotation> list = this.f22520f[i];
        if (list != null) {
            return list;
        }
        i2 = C9906j.m14820i();
        return i2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC1429h mo13678g() {
        return AbstractC1432i.C1433a.f481a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        List<Annotation> i;
        List<Annotation> list = this.f22521g;
        if (list != null) {
            return list;
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo13677h(int i) {
        return m13838o()[i].getDescriptor();
    }

    public int hashCode() {
        return m13836q();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo13676i() {
        return this.f22515a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C10240a.m13924b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo13675j(int i) {
        return this.f22522h[i];
    }

    /* renamed from: l */
    public final void m13841l(String name, boolean z) {
        C9971q.m14633g(name, "name");
        String[] strArr = this.f22519e;
        int i = this.f22518d + 1;
        this.f22518d = i;
        strArr[i] = name;
        this.f22522h[i] = z;
        this.f22520f[i] = null;
        if (i == this.f22517c - 1) {
            this.f22523i = m13839n();
        }
    }

    /* renamed from: p */
    public final SerialDescriptor[] m13837p() {
        return (SerialDescriptor[]) this.f22525k.getValue();
    }

    /* renamed from: r */
    public final void m13835r(Annotation annotation) {
        C9971q.m14633g(annotation, "annotation");
        List<Annotation> list = this.f22520f[this.f22518d];
        if (list == null) {
            list = new ArrayList<>(1);
            this.f22520f[this.f22518d] = list;
        }
        list.add(annotation);
    }

    public String toString() {
        IntRange q;
        String e0;
        q = C6884j.m23947q(0, this.f22517c);
        e0 = C9914r.m14760e0(q, ", ", mo13676i() + '(', ")", 0, null, new C10252c(), 24, null);
        return e0;
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, AbstractC3644f0 f0Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : f0Var, i);
    }
}
