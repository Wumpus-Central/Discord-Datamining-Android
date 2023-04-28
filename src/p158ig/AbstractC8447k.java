package p158ig;

import gh.C7624l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kh.AbstractC9874c;
import kh.C9877e;
import kh.C9879g;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.AbstractC10609d;
import mh.C10619i;
import p070di.AbstractC6483f;
import p070di.C6467d;
import p070di.C6505j;
import p158ig.AbstractC8434j;
import p159ih.C8544c;
import p159ih.C8581n;
import p218lh.C10440a;
import p249nh.C11143g;
import p268og.AbstractC11344l0;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.C11373t;
import p427xg.C14106a0;
import ph.AbstractC11702i;
import ug.C13283d;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m15073d2 = {"Lig/k;", "", "", "a", "<init>", "()V", "b", "c", "d", "Lig/k$a;", "Lig/k$b;", "Lig/k$c;", "Lig/k$d;", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.k */
/* loaded from: classes8.dex */
public abstract class AbstractC8447k {

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m15073d2 = {"Lig/k$a;", "Lig/k;", "", "a", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.k$a */
    /* loaded from: classes8.dex */
    public static final class C8448a extends AbstractC8447k {

        /* renamed from: a */
        private final Field f18395a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8448a(Field field) {
            super(null);
            C9971q.m14633g(field, "field");
            this.f18395a = field;
        }

        @Override // p158ig.AbstractC8447k
        /* renamed from: a */
        public String mo19753a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f18395a.getName();
            C9971q.m14634f(name, "field.name");
            sb2.append(C14106a0.m1649b(name));
            sb2.append("()");
            Class<?> type = this.f18395a.getType();
            C9971q.m14634f(type, "field.type");
            sb2.append(C13283d.m4052b(type));
            return sb2.toString();
        }

        /* renamed from: b */
        public final Field m19762b() {
            return this.f18395a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, m15073d2 = {"Lig/k$b;", "Lig/k;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "getterMethod", "c", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.k$b */
    /* loaded from: classes8.dex */
    public static final class C8449b extends AbstractC8447k {

        /* renamed from: a */
        private final Method f18396a;

        /* renamed from: b */
        private final Method f18397b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8449b(Method getterMethod, Method method) {
            super(null);
            C9971q.m14633g(getterMethod, "getterMethod");
            this.f18396a = getterMethod;
            this.f18397b = method;
        }

        @Override // p158ig.AbstractC8447k
        /* renamed from: a */
        public String mo19753a() {
            return C8490n0.m19689a(this.f18396a);
        }

        /* renamed from: b */
        public final Method m19761b() {
            return this.f18396a;
        }

        /* renamed from: c */
        public final Method m19760c() {
            return this.f18397b;
        }
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m15073d2 = {"Lig/k$c;", "Lig/k;", "", "c", "a", "Log/u0;", "Log/u0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "Lih/n;", "b", "Lih/n;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "proto", "Llh/a$d;", "Llh/a$d;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lkh/c;", "d", "Lkh/c;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "nameResolver", "Lkh/g;", "e", "Lkh/g;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "typeTable", "f", "Ljava/lang/String;", "string", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.k$c */
    /* loaded from: classes8.dex */
    public static final class C8450c extends AbstractC8447k {

        /* renamed from: a */
        private final AbstractC11388u0 f18398a;

        /* renamed from: b */
        private final C8581n f18399b;

        /* renamed from: c */
        private final C10440a.C10444d f18400c;

        /* renamed from: d */
        private final AbstractC9874c f18401d;

        /* renamed from: e */
        private final C9879g f18402e;

        /* renamed from: f */
        private final String f18403f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8450c(AbstractC11388u0 descriptor, C8581n proto, C10440a.C10444d signature, AbstractC9874c nameResolver, C9879g typeTable) {
            super(null);
            String str;
            C9971q.m14633g(descriptor, "descriptor");
            C9971q.m14633g(proto, "proto");
            C9971q.m14633g(signature, "signature");
            C9971q.m14633g(nameResolver, "nameResolver");
            C9971q.m14633g(typeTable, "typeTable");
            this.f18398a = descriptor;
            this.f18399b = proto;
            this.f18400c = signature;
            this.f18401d = nameResolver;
            this.f18402e = typeTable;
            if (signature.m13253H()) {
                str = nameResolver.getString(signature.m13258C().m13273y()) + nameResolver.getString(signature.m13258C().m13274x());
            } else {
                AbstractC10609d.C10610a d = C10619i.m12725d(C10619i.f23511a, proto, nameResolver, typeTable, false, 8, null);
                if (d != null) {
                    String d2 = d.m12737d();
                    str = C14106a0.m1649b(d2) + m19758c() + "()" + d.m12736e();
                } else {
                    throw new C8430h0("No field signature for property: " + descriptor);
                }
            }
            this.f18403f = str;
        }

        /* renamed from: c */
        private final String m19758c() {
            String str;
            AbstractC11346m b = this.f18398a.mo6104b();
            C9971q.m14634f(b, "descriptor.containingDeclaration");
            if (C9971q.m14638b(this.f18398a.getVisibility(), C11373t.f25298d) && (b instanceof C6467d)) {
                C8544c b1 = ((C6467d) b).m25514b1();
                AbstractC11702i.C11709f<C8544c, Integer> classModuleName = C10440a.f22983i;
                C9971q.m14634f(classModuleName, "classModuleName");
                Integer num = (Integer) C9877e.m15132a(b1, classModuleName);
                if (num == null || (str = this.f18401d.getString(num.intValue())) == null) {
                    str = "main";
                }
                return '$' + C11143g.m10763a(str);
            } else if (!C9971q.m14638b(this.f18398a.getVisibility(), C11373t.f25295a) || !(b instanceof AbstractC11344l0)) {
                return "";
            } else {
                AbstractC11388u0 u0Var = this.f18398a;
                C9971q.m14635e(u0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                AbstractC6483f H = ((C6505j) u0Var).mo25403H();
                if (!(H instanceof C7624l)) {
                    return "";
                }
                C7624l lVar = (C7624l) H;
                if (lVar.m21856f() == null) {
                    return "";
                }
                return '$' + lVar.m21854h().m10771b();
            }
        }

        @Override // p158ig.AbstractC8447k
        /* renamed from: a */
        public String mo19753a() {
            return this.f18403f;
        }

        /* renamed from: b */
        public final AbstractC11388u0 m19759b() {
            return this.f18398a;
        }

        /* renamed from: d */
        public final AbstractC9874c m19757d() {
            return this.f18401d;
        }

        /* renamed from: e */
        public final C8581n m19756e() {
            return this.f18399b;
        }

        /* renamed from: f */
        public final C10440a.C10444d m19755f() {
            return this.f18400c;
        }

        /* renamed from: g */
        public final C9879g m19754g() {
            return this.f18402e;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, m15073d2 = {"Lig/k$d;", "Lig/k;", "", "a", "Lig/j$e;", "Lig/j$e;", "b", "()Lig/j$e;", "getterSignature", "c", "setterSignature", "<init>", "(Lig/j$e;Lig/j$e;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ig.k$d */
    /* loaded from: classes8.dex */
    public static final class C8451d extends AbstractC8447k {

        /* renamed from: a */
        private final AbstractC8434j.C8441e f18404a;

        /* renamed from: b */
        private final AbstractC8434j.C8441e f18405b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8451d(AbstractC8434j.C8441e getterSignature, AbstractC8434j.C8441e eVar) {
            super(null);
            C9971q.m14633g(getterSignature, "getterSignature");
            this.f18404a = getterSignature;
            this.f18405b = eVar;
        }

        @Override // p158ig.AbstractC8447k
        /* renamed from: a */
        public String mo19753a() {
            return this.f18404a.mo19774a();
        }

        /* renamed from: b */
        public final AbstractC8434j.C8441e m19752b() {
            return this.f18404a;
        }

        /* renamed from: c */
        public final AbstractC8434j.C8441e m19751c() {
            return this.f18405b;
        }
    }

    private AbstractC8447k() {
    }

    public /* synthetic */ AbstractC8447k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo19753a();
}
