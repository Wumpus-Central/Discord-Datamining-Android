package p420x9;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p365u9.C13220f;
import p384v9.AbstractC13470f;
import p384v9.C13456a;
import p400w9.AbstractC13817d;
import p400w9.AbstractC13825h;

/* renamed from: x9.g */
/* loaded from: classes5.dex */
public abstract class AbstractC13974g<T extends IInterface> extends AbstractC13957c<T> implements C13456a.AbstractC13463f {

    /* renamed from: P */
    private final C13964d f39439P;

    /* renamed from: Q */
    private final Set<Scope> f39440Q;

    /* renamed from: R */
    private final Account f39441R;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public AbstractC13974g(Context context, Looper looper, int i, C13964d dVar, AbstractC13470f.AbstractC13471a aVar, AbstractC13470f.AbstractC13472b bVar) {
        this(context, looper, i, dVar, (AbstractC13817d) aVar, (AbstractC13825h) bVar);
    }

    /* renamed from: j0 */
    private final Set<Scope> m2110j0(Set<Scope> set) {
        Set<Scope> i0 = m2112i0(set);
        for (Scope scope : i0) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return i0;
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: B */
    protected final Set<Scope> mo2114B() {
        return this.f39440Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h0 */
    public final C13964d m2113h0() {
        return this.f39439P;
    }

    /* renamed from: i0 */
    protected Set<Scope> m2112i0(Set<Scope> set) {
        return set;
    }

    @Override // p384v9.C13456a.AbstractC13463f
    /* renamed from: j */
    public Set<Scope> mo2111j() {
        return mo2156g() ? this.f39440Q : Collections.emptySet();
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: t */
    public final Account mo2109t() {
        return this.f39441R;
    }

    @Override // p420x9.AbstractC13957c
    /* renamed from: v */
    protected final Executor mo2108v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC13974g(Context context, Looper looper, int i, C13964d dVar, AbstractC13817d dVar2, AbstractC13825h hVar) {
        this(context, looper, AbstractC13977h.m2105b(context), C13220f.m4286k(), i, dVar, (AbstractC13817d) C14004p.m2051j(dVar2), (AbstractC13825h) C14004p.m2051j(hVar));
    }

    protected AbstractC13974g(Context context, Looper looper, AbstractC13977h hVar, C13220f fVar, int i, C13964d dVar, AbstractC13817d dVar2, AbstractC13825h hVar2) {
        super(context, looper, hVar, fVar, i, dVar2 == null ? null : new C13972f0(dVar2), hVar2 == null ? null : new C13975g0(hVar2), dVar.m2133j());
        this.f39439P = dVar;
        this.f39441R = dVar.m2142a();
        this.f39440Q = m2110j0(dVar.m2139d());
    }
}
