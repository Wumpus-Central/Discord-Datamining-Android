package fi;

import java.util.List;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;

/* renamed from: fi.e0 */
/* loaded from: classes8.dex */
public final class C7239e0 extends AbstractC7299n1 {

    /* renamed from: c */
    private final AbstractC11319f1[] f15678c;

    /* renamed from: d */
    private final AbstractC7290k1[] f15679d;

    /* renamed from: e */
    private final boolean f15680e;

    public /* synthetic */ C7239e0(AbstractC11319f1[] f1VarArr, AbstractC7290k1[] k1VarArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f1VarArr, k1VarArr, (i & 4) != 0 ? false : z);
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: b */
    public boolean mo5148b() {
        return this.f15680e;
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: e */
    public AbstractC7290k1 mo5147e(AbstractC7267g0 key) {
        AbstractC11319f1 f1Var;
        C9971q.m14633g(key, "key");
        AbstractC11326h p = key.mo5172N0().mo4565p();
        if (p instanceof AbstractC11319f1) {
            f1Var = (AbstractC11319f1) p;
        } else {
            f1Var = null;
        }
        if (f1Var == null) {
            return null;
        }
        int index = f1Var.getIndex();
        AbstractC11319f1[] f1VarArr = this.f15678c;
        if (index >= f1VarArr.length || !C9971q.m14638b(f1VarArr[index].mo6111k(), f1Var.mo6111k())) {
            return null;
        }
        return this.f15679d[index];
    }

    @Override // fi.AbstractC7299n1
    /* renamed from: f */
    public boolean mo22911f() {
        return this.f15679d.length == 0;
    }

    /* renamed from: i */
    public final AbstractC7290k1[] m23137i() {
        return this.f15679d;
    }

    /* renamed from: j */
    public final AbstractC11319f1[] m23136j() {
        return this.f15678c;
    }

    public C7239e0(AbstractC11319f1[] parameters, AbstractC7290k1[] arguments, boolean z) {
        C9971q.m14633g(parameters, "parameters");
        C9971q.m14633g(arguments, "arguments");
        this.f15678c = parameters;
        this.f15679d = arguments;
        this.f15680e = z;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7239e0(List<? extends AbstractC11319f1> parameters, List<? extends AbstractC7290k1> argumentsList) {
        this((AbstractC11319f1[]) parameters.toArray(new AbstractC11319f1[0]), (AbstractC7290k1[]) argumentsList.toArray(new AbstractC7290k1[0]), false, 4, null);
        C9971q.m14633g(parameters, "parameters");
        C9971q.m14633g(argumentsList, "argumentsList");
    }
}
