package p217lg;

import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;
import nf.EnumC11087p;
import p249nh.C11137c;
import p249nh.C11142f;

/* renamed from: lg.i */
/* loaded from: classes8.dex */
public enum EnumC10426i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    

    /* renamed from: o */
    public static final C10427a f22843o = new C10427a(null);

    /* renamed from: p */
    public static final Set<EnumC10426i> f22844p;

    /* renamed from: k */
    private final C11142f f22854k;

    /* renamed from: l */
    private final C11142f f22855l;

    /* renamed from: m */
    private final Lazy f22856m;

    /* renamed from: n */
    private final Lazy f22857n;

    /* renamed from: lg.i$a */
    /* loaded from: classes8.dex */
    public static final class C10427a {
        private C10427a() {
        }

        public /* synthetic */ C10427a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lg.i$b */
    /* loaded from: classes8.dex */
    static final class C10428b extends AbstractC9973s implements Function0<C11137c> {
        C10428b() {
            super(0);
        }

        /* renamed from: a */
        public final C11137c invoke() {
            C11137c c = C10434k.f22894u.m10802c(EnumC10426i.this.m13345c());
            C9971q.m14634f(c, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return c;
        }
    }

    /* renamed from: lg.i$c */
    /* loaded from: classes8.dex */
    static final class C10429c extends AbstractC9973s implements Function0<C11137c> {
        C10429c() {
            super(0);
        }

        /* renamed from: a */
        public final C11137c invoke() {
            C11137c c = C10434k.f22894u.m10802c(EnumC10426i.this.m13343e());
            C9971q.m14634f(c, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return c;
        }
    }

    static {
        EnumC10426i iVar;
        EnumC10426i iVar2;
        EnumC10426i iVar3;
        EnumC10426i iVar4;
        EnumC10426i iVar5;
        EnumC10426i iVar6;
        Set<EnumC10426i> i;
        i = C9921w.m14717i(r0, iVar, iVar2, iVar3, iVar4, iVar5, iVar6);
        f22844p = i;
    }

    EnumC10426i(String str) {
        Lazy b;
        Lazy b2;
        C11142f f = C11142f.m10767f(str);
        C9971q.m14634f(f, "identifier(typeName)");
        this.f22854k = f;
        C11142f f2 = C11142f.m10767f(str + "Array");
        C9971q.m14634f(f2, "identifier(\"${typeName}Array\")");
        this.f22855l = f2;
        EnumC11087p pVar = EnumC11087p.PUBLICATION;
        b = C11084n.m10944b(pVar, new C10429c());
        this.f22856m = b;
        b2 = C11084n.m10944b(pVar, new C10428b());
        this.f22857n = b2;
    }

    /* renamed from: b */
    public final C11137c m13346b() {
        return (C11137c) this.f22857n.getValue();
    }

    /* renamed from: c */
    public final C11142f m13345c() {
        return this.f22855l;
    }

    /* renamed from: d */
    public final C11137c m13344d() {
        return (C11137c) this.f22856m.getValue();
    }

    /* renamed from: e */
    public final C11142f m13343e() {
        return this.f22854k;
    }
}
