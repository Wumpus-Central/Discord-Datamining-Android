package p233mi;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import p233mi.AbstractC10630g;
import p249nh.C11142f;
import p268og.AbstractC11397y;

/* renamed from: mi.h */
/* loaded from: classes8.dex */
public final class C10634h {

    /* renamed from: a */
    private final C11142f f23525a;

    /* renamed from: b */
    private final Regex f23526b;

    /* renamed from: c */
    private final Collection<C11142f> f23527c;

    /* renamed from: d */
    private final Function1<AbstractC11397y, String> f23528d;

    /* renamed from: e */
    private final AbstractC10628f[] f23529e;

    /* renamed from: mi.h$a */
    /* loaded from: classes8.dex */
    static final class C10635a extends AbstractC9973s implements Function1 {

        /* renamed from: k */
        public static final C10635a f23530k = new C10635a();

        C10635a() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(AbstractC11397y yVar) {
            C9971q.m14633g(yVar, "$this$null");
            return null;
        }
    }

    /* renamed from: mi.h$b */
    /* loaded from: classes8.dex */
    static final class C10636b extends AbstractC9973s implements Function1 {

        /* renamed from: k */
        public static final C10636b f23531k = new C10636b();

        C10636b() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(AbstractC11397y yVar) {
            C9971q.m14633g(yVar, "$this$null");
            return null;
        }
    }

    /* renamed from: mi.h$c */
    /* loaded from: classes8.dex */
    static final class C10637c extends AbstractC9973s implements Function1 {

        /* renamed from: k */
        public static final C10637c f23532k = new C10637c();

        C10637c() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(AbstractC11397y yVar) {
            C9971q.m14633g(yVar, "$this$null");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10634h(C11142f fVar, Regex regex, Collection<C11142f> collection, Function1<? super AbstractC11397y, String> function1, AbstractC10628f... fVarArr) {
        this.f23525a = fVar;
        this.f23526b = regex;
        this.f23527c = collection;
        this.f23528d = function1;
        this.f23529e = fVarArr;
    }

    /* renamed from: a */
    public final AbstractC10630g m12705a(AbstractC11397y functionDescriptor) {
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        for (AbstractC10628f fVar : this.f23529e) {
            String b = fVar.mo12675b(functionDescriptor);
            if (b != null) {
                return new AbstractC10630g.C10632b(b);
            }
        }
        String invoke = this.f23528d.invoke(functionDescriptor);
        if (invoke != null) {
            return new AbstractC10630g.C10632b(invoke);
        }
        return AbstractC10630g.C10633c.f23524b;
    }

    /* renamed from: b */
    public final boolean m12704b(AbstractC11397y functionDescriptor) {
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        if (this.f23525a != null && !C9971q.m14638b(functionDescriptor.getName(), this.f23525a)) {
            return false;
        }
        if (this.f23526b != null) {
            String b = functionDescriptor.getName().m10771b();
            C9971q.m14634f(b, "functionDescriptor.name.asString()");
            if (!this.f23526b.m14583g(b)) {
                return false;
            }
        }
        Collection<C11142f> collection = this.f23527c;
        if (collection == null || collection.contains(functionDescriptor.getName())) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C10634h(C11142f fVar, AbstractC10628f[] fVarArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVarArr, (i & 4) != 0 ? C10635a.f23530k : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10634h(C11142f name, AbstractC10628f[] checks, Function1<? super AbstractC11397y, String> additionalChecks) {
        this(name, (Regex) null, (Collection<C11142f>) null, additionalChecks, (AbstractC10628f[]) Arrays.copyOf(checks, checks.length));
        C9971q.m14633g(name, "name");
        C9971q.m14633g(checks, "checks");
        C9971q.m14633g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ C10634h(Regex regex, AbstractC10628f[] fVarArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, fVarArr, (i & 4) != 0 ? C10636b.f23531k : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10634h(Regex regex, AbstractC10628f[] checks, Function1<? super AbstractC11397y, String> additionalChecks) {
        this((C11142f) null, regex, (Collection<C11142f>) null, additionalChecks, (AbstractC10628f[]) Arrays.copyOf(checks, checks.length));
        C9971q.m14633g(regex, "regex");
        C9971q.m14633g(checks, "checks");
        C9971q.m14633g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ C10634h(Collection collection, AbstractC10628f[] fVarArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, fVarArr, (i & 4) != 0 ? C10637c.f23532k : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10634h(Collection<C11142f> nameList, AbstractC10628f[] checks, Function1<? super AbstractC11397y, String> additionalChecks) {
        this((C11142f) null, (Regex) null, nameList, additionalChecks, (AbstractC10628f[]) Arrays.copyOf(checks, checks.length));
        C9971q.m14633g(nameList, "nameList");
        C9971q.m14633g(checks, "checks");
        C9971q.m14633g(additionalChecks, "additionalChecks");
    }
}
