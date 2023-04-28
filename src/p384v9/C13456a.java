package p384v9;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p365u9.C13217c;
import p384v9.AbstractC13470f;
import p384v9.C13456a.AbstractC13459d;
import p400w9.AbstractC13817d;
import p400w9.AbstractC13825h;
import p420x9.AbstractC13957c;
import p420x9.AbstractC13983j;
import p420x9.C13964d;
import p420x9.C14004p;

/* renamed from: v9.a */
/* loaded from: classes5.dex */
public final class C13456a<O extends AbstractC13459d> {

    /* renamed from: a */
    private final AbstractC0437a<?, O> f30062a;

    /* renamed from: b */
    private final C13464g<?> f30063b;

    /* renamed from: c */
    private final String f30064c;

    /* renamed from: v9.a$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC0437a<T extends AbstractC13463f, O> extends AbstractC13462e<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo3644a(Context context, Looper looper, C13964d dVar, O o, AbstractC13470f.AbstractC13471a aVar, AbstractC13470f.AbstractC13472b bVar) {
            return mo148b(context, looper, dVar, o, aVar, bVar);
        }

        /* renamed from: b */
        public T mo148b(Context context, Looper looper, C13964d dVar, O o, AbstractC13817d dVar2, AbstractC13825h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: v9.a$b */
    /* loaded from: classes5.dex */
    public interface AbstractC13457b {
    }

    /* renamed from: v9.a$c */
    /* loaded from: classes5.dex */
    public static class C13458c<C extends AbstractC13457b> {
    }

    /* renamed from: v9.a$d */
    /* loaded from: classes5.dex */
    public interface AbstractC13459d {

        /* renamed from: j */
        public static final C13461c f30065j = new C13461c(null);

        /* renamed from: v9.a$d$a */
        /* loaded from: classes5.dex */
        public interface AbstractC0438a extends AbstractC13459d {
            /* renamed from: j */
            Account m3643j();
        }

        /* renamed from: v9.a$d$b */
        /* loaded from: classes5.dex */
        public interface AbstractC13460b extends AbstractC13459d {
            /* renamed from: f */
            GoogleSignInAccount m3642f();
        }

        /* renamed from: v9.a$d$c */
        /* loaded from: classes5.dex */
        public static final class C13461c implements AbstractC13459d {
            private C13461c() {
            }

            /* synthetic */ C13461c(C13481n nVar) {
            }
        }
    }

    /* renamed from: v9.a$e */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC13462e<T extends AbstractC13457b, O> {
    }

    /* renamed from: v9.a$f */
    /* loaded from: classes5.dex */
    public interface AbstractC13463f extends AbstractC13457b {
        /* renamed from: a */
        boolean mo2576a();

        /* renamed from: b */
        void mo2575b(String str);

        /* renamed from: c */
        boolean mo2574c();

        /* renamed from: d */
        String mo2573d();

        /* renamed from: e */
        boolean mo2160e();

        /* renamed from: f */
        void mo2572f(AbstractC13957c.AbstractC0452c cVar);

        /* renamed from: g */
        boolean mo2156g();

        /* renamed from: i */
        void mo2570i(AbstractC13983j jVar, Set<Scope> set);

        /* renamed from: j */
        Set<Scope> mo2111j();

        /* renamed from: k */
        void mo2569k(AbstractC13957c.AbstractC13961e eVar);

        /* renamed from: l */
        void mo2152l();

        /* renamed from: n */
        int mo143n();

        /* renamed from: o */
        C13217c[] mo2568o();

        /* renamed from: p */
        String mo2567p();
    }

    /* renamed from: v9.a$g */
    /* loaded from: classes5.dex */
    public static final class C13464g<C extends AbstractC13463f> extends C13458c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends AbstractC13463f> C13456a(String str, AbstractC0437a<C, O> aVar, C13464g<C> gVar) {
        C14004p.m2050k(aVar, "Cannot construct an Api with a null ClientBuilder");
        C14004p.m2050k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f30064c = str;
        this.f30062a = aVar;
        this.f30063b = gVar;
    }

    /* renamed from: a */
    public final AbstractC0437a<?, O> m3647a() {
        return this.f30062a;
    }

    /* renamed from: b */
    public final C13458c<?> m3646b() {
        return this.f30063b;
    }

    /* renamed from: c */
    public final String m3645c() {
        return this.f30064c;
    }
}
