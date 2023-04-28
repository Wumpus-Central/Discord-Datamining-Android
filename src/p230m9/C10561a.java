package p230m9;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import la.C10385l;
import p245n9.AbstractC10762c;
import p282p9.AbstractC11588a;
import p298q9.AbstractC12049a;
import p318r9.C12474h;
import p384v9.C13456a;
import p420x9.C13996n;

/* renamed from: m9.a */
/* loaded from: classes5.dex */
public final class C10561a {

    /* renamed from: b */
    public static final C13456a<C0338a> f23393b;

    /* renamed from: c */
    public static final C13456a<GoogleSignInOptions> f23394c;

    /* renamed from: g */
    public static final C13456a.C13464g f23398g;

    /* renamed from: h */
    public static final C13456a.C13464g f23399h;

    /* renamed from: i */
    private static final C13456a.AbstractC0437a f23400i;

    /* renamed from: j */
    private static final C13456a.AbstractC0437a f23401j;
    @Deprecated

    /* renamed from: a */
    public static final C13456a<C10563c> f23392a = C10562b.f23408a;
    @Deprecated

    /* renamed from: d */
    public static final AbstractC11588a f23395d = C10562b.f23409b;

    /* renamed from: e */
    public static final AbstractC10762c f23396e = new C10385l();

    /* renamed from: f */
    public static final AbstractC12049a f23397f = new C12474h();

    @Deprecated
    /* renamed from: m9.a$a */
    /* loaded from: classes5.dex */
    public static class C0338a implements C13456a.AbstractC13459d {

        /* renamed from: n */
        public static final C0338a f23402n = new C0338a(new C0339a());

        /* renamed from: k */
        private final String f23403k = null;

        /* renamed from: l */
        private final boolean f23404l;

        /* renamed from: m */
        private final String f23405m;

        @Deprecated
        /* renamed from: m9.a$a$a */
        /* loaded from: classes5.dex */
        public static class C0339a {

            /* renamed from: a */
            protected Boolean f23406a;

            /* renamed from: b */
            protected String f23407b;

            public C0339a() {
                this.f23406a = Boolean.FALSE;
            }

            /* renamed from: a */
            public final C0339a m12809a(String str) {
                this.f23407b = str;
                return this;
            }

            public C0339a(C0338a aVar) {
                this.f23406a = Boolean.FALSE;
                String unused = aVar.f23403k;
                this.f23406a = Boolean.valueOf(aVar.f23404l);
                this.f23407b = aVar.f23405m;
            }
        }

        public C0338a(C0339a aVar) {
            this.f23404l = aVar.f23406a.booleanValue();
            this.f23405m = aVar.f23407b;
        }

        /* renamed from: a */
        public final Bundle m12813a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f23404l);
            bundle.putString("log_session_id", this.f23405m);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0338a)) {
                return false;
            }
            C0338a aVar = (C0338a) obj;
            String str = aVar.f23403k;
            if (!C13996n.m2071b(null, null) || this.f23404l != aVar.f23404l || !C13996n.m2071b(this.f23405m, aVar.f23405m)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C13996n.m2070c(null, Boolean.valueOf(this.f23404l), this.f23405m);
        }
    }

    static {
        C13456a.C13464g gVar = new C13456a.C13464g();
        f23398g = gVar;
        C13456a.C13464g gVar2 = new C13456a.C13464g();
        f23399h = gVar2;
        C10564d dVar = new C10564d();
        f23400i = dVar;
        C10565e eVar = new C10565e();
        f23401j = eVar;
        f23393b = new C13456a<>("Auth.CREDENTIALS_API", dVar, gVar);
        f23394c = new C13456a<>("Auth.GOOGLE_SIGN_IN_API", eVar, gVar2);
    }
}
