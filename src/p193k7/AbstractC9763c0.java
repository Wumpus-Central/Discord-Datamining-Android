package p193k7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p193k7.C9798l;

/* renamed from: k7.c0 */
/* loaded from: classes7.dex */
public interface AbstractC9763c0 {

    /* renamed from: k7.c0$a */
    /* loaded from: classes7.dex */
    public static final class C9764a implements AbstractC9767d {

        /* renamed from: a */
        private final AbstractC9763c0 f21734a;

        public C9764a(AbstractC9763c0 c0Var) {
            this.f21734a = c0Var;
        }

        @Override // p193k7.AbstractC9763c0.AbstractC9767d
        /* renamed from: a */
        public AbstractC9763c0 mo15408a(UUID uuid) {
            this.f21734a.acquire();
            return this.f21734a;
        }
    }

    /* renamed from: k7.c0$b */
    /* loaded from: classes7.dex */
    public static final class C9765b {

        /* renamed from: a */
        private final byte[] f21735a;

        /* renamed from: b */
        private final String f21736b;

        /* renamed from: c */
        private final int f21737c;

        public C9765b(byte[] bArr, String str, int i) {
            this.f21735a = bArr;
            this.f21736b = str;
            this.f21737c = i;
        }

        /* renamed from: a */
        public byte[] m15412a() {
            return this.f21735a;
        }

        /* renamed from: b */
        public String m15411b() {
            return this.f21736b;
        }
    }

    /* renamed from: k7.c0$c */
    /* loaded from: classes7.dex */
    public interface AbstractC9766c {
        /* renamed from: a */
        void mo15342a(AbstractC9763c0 c0Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* renamed from: k7.c0$d */
    /* loaded from: classes7.dex */
    public interface AbstractC9767d {
        /* renamed from: a */
        AbstractC9763c0 mo15408a(UUID uuid);
    }

    /* renamed from: k7.c0$e */
    /* loaded from: classes7.dex */
    public static final class C9768e {

        /* renamed from: a */
        private final byte[] f21738a;

        /* renamed from: b */
        private final String f21739b;

        public C9768e(byte[] bArr, String str) {
            this.f21738a = bArr;
            this.f21739b = str;
        }

        /* renamed from: a */
        public byte[] m15410a() {
            return this.f21738a;
        }

        /* renamed from: b */
        public String m15409b() {
            return this.f21739b;
        }
    }

    /* renamed from: a */
    void mo15274a(AbstractC9766c cVar);

    void acquire();

    /* renamed from: b */
    Class<? extends AbstractC9761b0> mo15273b();

    /* renamed from: c */
    Map<String, String> mo15272c(byte[] bArr);

    /* renamed from: d */
    AbstractC9761b0 mo15271d(byte[] bArr);

    /* renamed from: e */
    C9768e mo15270e();

    /* renamed from: f */
    byte[] mo15269f();

    /* renamed from: g */
    void mo15268g(byte[] bArr, byte[] bArr2);

    /* renamed from: h */
    void mo15267h(byte[] bArr);

    /* renamed from: i */
    void mo15266i(byte[] bArr);

    /* renamed from: j */
    byte[] mo15265j(byte[] bArr, byte[] bArr2);

    /* renamed from: k */
    C9765b mo15264k(byte[] bArr, List<C9798l.C9800b> list, int i, HashMap<String, String> hashMap);

    void release();
}
