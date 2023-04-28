package p193k7;

import android.os.Looper;
import p079e7.C6722k;
import p193k7.AbstractC9805n;
import p193k7.AbstractC9815v;

/* renamed from: k7.x */
/* loaded from: classes7.dex */
public interface AbstractC9818x {

    /* renamed from: a */
    public static final AbstractC9818x f21859a;
    @Deprecated

    /* renamed from: b */
    public static final AbstractC9818x f21860b;

    /* renamed from: k7.x$a */
    /* loaded from: classes7.dex */
    class C9819a implements AbstractC9818x {
        C9819a() {
        }

        @Override // p193k7.AbstractC9818x
        /* renamed from: a */
        public Class<C9804m0> mo15277a(C6722k kVar) {
            if (kVar.f14332y != null) {
                return C9804m0.class;
            }
            return null;
        }

        @Override // p193k7.AbstractC9818x
        /* renamed from: b */
        public AbstractC9805n mo15276b(Looper looper, AbstractC9815v.C9816a aVar, C6722k kVar) {
            if (kVar.f14332y == null) {
                return null;
            }
            return new C9759a0(new AbstractC9805n.C9806a(new C9802l0(1)));
        }

        @Override // p193k7.AbstractC9818x
        /* renamed from: c */
        public /* synthetic */ void mo15275c() {
            C9817w.m15279a(this);
        }

        @Override // p193k7.AbstractC9818x
        public /* synthetic */ void release() {
            C9817w.m15278b(this);
        }
    }

    static {
        C9819a aVar = new C9819a();
        f21859a = aVar;
        f21860b = aVar;
    }

    /* renamed from: a */
    Class<? extends AbstractC9761b0> mo15277a(C6722k kVar);

    /* renamed from: b */
    AbstractC9805n mo15276b(Looper looper, AbstractC9815v.C9816a aVar, C6722k kVar);

    /* renamed from: c */
    void mo15275c();

    void release();
}
