package p286pi;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: pi.b */
/* loaded from: classes8.dex */
public class C11755b {

    /* renamed from: pi.b$a */
    /* loaded from: classes8.dex */
    static class C11756a extends AbstractC0376b<N, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Function1 f26254a;

        /* renamed from: b */
        final /* synthetic */ boolean[] f26255b;

        C11756a(Function1 function1, boolean[] zArr) {
            this.f26254a = function1;
            this.f26255b = zArr;
        }

        @Override // p286pi.C11755b.AbstractC11758d
        /* renamed from: c */
        public boolean mo3515c(N n) {
            if (((Boolean) this.f26254a.invoke(n)).booleanValue()) {
                this.f26255b[0] = true;
            }
            return !this.f26255b[0];
        }

        /* renamed from: d */
        public Boolean mo3517a() {
            return Boolean.valueOf(this.f26255b[0]);
        }
    }

    /* renamed from: pi.b$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC0376b<N, R> implements AbstractC11758d<N, R> {
        @Override // p286pi.C11755b.AbstractC11758d
        /* renamed from: b */
        public void mo3516b(N n) {
        }
    }

    /* renamed from: pi.b$c */
    /* loaded from: classes8.dex */
    public interface AbstractC11757c<N> {
        /* renamed from: a */
        Iterable<? extends N> mo3541a(N n);
    }

    /* renamed from: pi.b$d */
    /* loaded from: classes8.dex */
    public interface AbstractC11758d<N, R> {
        /* renamed from: a */
        R mo3517a();

        /* renamed from: b */
        void mo3516b(N n);

        /* renamed from: c */
        boolean mo3515c(N n);
    }

    /* renamed from: pi.b$e */
    /* loaded from: classes8.dex */
    public interface AbstractC11759e<N> {
        /* renamed from: a */
        boolean mo8676a(N n);
    }

    /* renamed from: pi.b$f */
    /* loaded from: classes8.dex */
    public static class C11760f<N> implements AbstractC11759e<N> {

        /* renamed from: a */
        private final Set<N> f26256a;

        public C11760f() {
            this(new HashSet());
        }

        /* renamed from: b */
        private static /* synthetic */ void m8675b(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // p286pi.C11755b.AbstractC11759e
        /* renamed from: a */
        public boolean mo8676a(N n) {
            return this.f26256a.add(n);
        }

        public C11760f(Set<N> set) {
            if (set == null) {
                m8675b(0);
            }
            this.f26256a = set;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m8682a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <N, R> R m8681b(Collection<N> collection, AbstractC11757c<N> cVar, AbstractC11758d<N, R> dVar) {
        if (collection == null) {
            m8682a(4);
        }
        if (cVar == null) {
            m8682a(5);
        }
        if (dVar == null) {
            m8682a(6);
        }
        return (R) m8680c(collection, cVar, new C11760f(), dVar);
    }

    /* renamed from: c */
    public static <N, R> R m8680c(Collection<N> collection, AbstractC11757c<N> cVar, AbstractC11759e<N> eVar, AbstractC11758d<N, R> dVar) {
        if (collection == null) {
            m8682a(0);
        }
        if (cVar == null) {
            m8682a(1);
        }
        if (eVar == null) {
            m8682a(2);
        }
        if (dVar == null) {
            m8682a(3);
        }
        for (N n : collection) {
            m8679d(n, cVar, eVar, dVar);
        }
        return dVar.mo3517a();
    }

    /* renamed from: d */
    public static <N> void m8679d(N n, AbstractC11757c<N> cVar, AbstractC11759e<N> eVar, AbstractC11758d<N, ?> dVar) {
        if (n == null) {
            m8682a(22);
        }
        if (cVar == null) {
            m8682a(23);
        }
        if (eVar == null) {
            m8682a(24);
        }
        if (dVar == null) {
            m8682a(25);
        }
        if (eVar.mo8676a(n) && dVar.mo3515c(n)) {
            Iterator<? extends N> it = cVar.mo3541a(n).iterator();
            while (it.hasNext()) {
                m8679d(it.next(), cVar, eVar, dVar);
            }
            dVar.mo3516b(n);
        }
    }

    /* renamed from: e */
    public static <N> Boolean m8678e(Collection<N> collection, AbstractC11757c<N> cVar, Function1<N, Boolean> function1) {
        if (collection == null) {
            m8682a(7);
        }
        if (cVar == null) {
            m8682a(8);
        }
        if (function1 == null) {
            m8682a(9);
        }
        return (Boolean) m8681b(collection, cVar, new C11756a(function1, new boolean[1]));
    }
}
