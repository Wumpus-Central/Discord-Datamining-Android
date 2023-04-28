package pg;

import com.facebook.react.util.JSStackTrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9899f;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11098x;
import p267of.C11289v;

/* renamed from: pg.n */
/* loaded from: classes8.dex */
public enum EnumC11684n {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE(JSStackTrace.FILE_KEY, false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    

    /* renamed from: A */
    private static final List<EnumC11684n> f39088A;

    /* renamed from: B */
    private static final List<EnumC11684n> f39089B;

    /* renamed from: C */
    private static final Map<EnumC11669e, EnumC11684n> f39090C;

    /* renamed from: o */
    private static final Set<EnumC11684n> f26079o;

    /* renamed from: p */
    private static final Set<EnumC11684n> f26081p;

    /* renamed from: q */
    private static final List<EnumC11684n> f26083q;

    /* renamed from: r */
    private static final List<EnumC11684n> f26085r;

    /* renamed from: s */
    private static final List<EnumC11684n> f26087s;

    /* renamed from: t */
    private static final List<EnumC11684n> f26089t;

    /* renamed from: u */
    private static final List<EnumC11684n> f26091u;

    /* renamed from: v */
    private static final List<EnumC11684n> f26093v;

    /* renamed from: w */
    private static final List<EnumC11684n> f26094w;

    /* renamed from: x */
    private static final List<EnumC11684n> f26095x;

    /* renamed from: y */
    private static final List<EnumC11684n> f26096y;

    /* renamed from: z */
    private static final List<EnumC11684n> f26097z;

    /* renamed from: k */
    private final String f26098k;

    /* renamed from: l */
    private final boolean f26099l;

    /* renamed from: m */
    public static final C11685a f26075m = new C11685a(null);

    /* renamed from: n */
    private static final HashMap<String, EnumC11684n> f26077n = new HashMap<>();

    /* renamed from: pg.n$a */
    /* loaded from: classes8.dex */
    public static final class C11685a {
        private C11685a() {
        }

        public /* synthetic */ C11685a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumC11684n[] values;
        Set<EnumC11684n> H0;
        Set<EnumC11684n> H02;
        List<EnumC11684n> l;
        List<EnumC11684n> l2;
        List<EnumC11684n> l3;
        List<EnumC11684n> l4;
        List<EnumC11684n> l5;
        List<EnumC11684n> l6;
        List<EnumC11684n> l7;
        List<EnumC11684n> l8;
        List<EnumC11684n> d;
        List<EnumC11684n> d2;
        List<EnumC11684n> d3;
        List<EnumC11684n> d4;
        Map<EnumC11669e, EnumC11684n> k;
        for (EnumC11684n nVar : values()) {
            f26077n.put(nVar.name(), nVar);
        }
        EnumC11684n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC11684n nVar2 : values2) {
            if (nVar2.f26099l) {
                arrayList.add(nVar2);
            }
        }
        H0 = C9914r.m14786H0(arrayList);
        f26079o = H0;
        H02 = C9899f.m14957H0(values());
        f26081p = H02;
        EnumC11684n nVar3 = CLASS;
        l = C9906j.m14817l(ANNOTATION_CLASS, nVar3);
        f26083q = l;
        l2 = C9906j.m14817l(LOCAL_CLASS, nVar3);
        f26085r = l2;
        l3 = C9906j.m14817l(CLASS_ONLY, nVar3);
        f26087s = l3;
        EnumC11684n nVar4 = OBJECT;
        l4 = C9906j.m14817l(COMPANION_OBJECT, nVar4, nVar3);
        f26089t = l4;
        l5 = C9906j.m14817l(STANDALONE_OBJECT, nVar4, nVar3);
        f26091u = l5;
        l6 = C9906j.m14817l(INTERFACE, nVar3);
        f26093v = l6;
        l7 = C9906j.m14817l(ENUM_CLASS, nVar3);
        f26094w = l7;
        EnumC11684n nVar5 = PROPERTY;
        EnumC11684n nVar6 = FIELD;
        l8 = C9906j.m14817l(ENUM_ENTRY, nVar5, nVar6);
        f26095x = l8;
        EnumC11684n nVar7 = PROPERTY_SETTER;
        d = C9905i.m14825d(nVar7);
        f26096y = d;
        EnumC11684n nVar8 = PROPERTY_GETTER;
        d2 = C9905i.m14825d(nVar8);
        f26097z = d2;
        d3 = C9905i.m14825d(FUNCTION);
        f39088A = d3;
        EnumC11684n nVar9 = FILE;
        d4 = C9905i.m14825d(nVar9);
        f39089B = d4;
        EnumC11669e eVar = EnumC11669e.CONSTRUCTOR_PARAMETER;
        EnumC11684n nVar10 = VALUE_PARAMETER;
        k = C11289v.m10248k(C11098x.m10921a(eVar, nVar10), C11098x.m10921a(EnumC11669e.FIELD, nVar6), C11098x.m10921a(EnumC11669e.PROPERTY, nVar5), C11098x.m10921a(EnumC11669e.FILE, nVar9), C11098x.m10921a(EnumC11669e.PROPERTY_GETTER, nVar8), C11098x.m10921a(EnumC11669e.PROPERTY_SETTER, nVar7), C11098x.m10921a(EnumC11669e.RECEIVER, nVar10), C11098x.m10921a(EnumC11669e.SETTER_PARAMETER, nVar10), C11098x.m10921a(EnumC11669e.PROPERTY_DELEGATE_FIELD, nVar6));
        f39090C = k;
    }

    EnumC11684n(String str, boolean z) {
        this.f26098k = str;
        this.f26099l = z;
    }

    /* synthetic */ EnumC11684n(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
