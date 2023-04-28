package p260o8;

import com.google.android.exoplayer2.upstream.C5328i;
import java.util.List;
import p132h8.C7936b;
import p132h8.C7937c;

/* renamed from: o8.e */
/* loaded from: classes7.dex */
public final class C11216e implements AbstractC11231j {

    /* renamed from: a */
    private final AbstractC11231j f25039a;

    /* renamed from: b */
    private final List<C7937c> f25040b;

    public C11216e(AbstractC11231j jVar, List<C7937c> list) {
        this.f25039a = jVar;
        this.f25040b = list;
    }

    @Override // p260o8.AbstractC11231j
    /* renamed from: a */
    public C5328i.AbstractC5329a<AbstractC11227h> mo10388a() {
        return new C7936b(this.f25039a.mo10388a(), this.f25040b);
    }

    @Override // p260o8.AbstractC11231j
    /* renamed from: b */
    public C5328i.AbstractC5329a<AbstractC11227h> mo10387b(C11217f fVar, C11220g gVar) {
        return new C7936b(this.f25039a.mo10387b(fVar, gVar), this.f25040b);
    }
}
