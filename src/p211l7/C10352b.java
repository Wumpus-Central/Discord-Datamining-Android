package p211l7;

import com.google.android.exoplayer2.upstream.AbstractC5311f;
import okhttp3.CacheControl;
import okhttp3.Call;
import p081e9.AbstractC6795x;

@Deprecated
/* renamed from: l7.b */
/* loaded from: classes7.dex */
public final class C10352b extends AbstractC5311f.AbstractC5312a {

    /* renamed from: b */
    private final Call.Factory f22730b;

    /* renamed from: c */
    private final String f22731c;

    /* renamed from: d */
    private final AbstractC6795x f22732d;

    /* renamed from: e */
    private final CacheControl f22733e;

    public C10352b(Call.Factory factory, String str, AbstractC6795x xVar) {
        this(factory, str, xVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public C10351a mo13548a(AbstractC5311f.C5317g gVar) {
        C10351a aVar = new C10351a(this.f22730b, this.f22731c, this.f22733e, gVar);
        AbstractC6795x xVar = this.f22732d;
        if (xVar != null) {
            aVar.mo12541c(xVar);
        }
        return aVar;
    }

    public C10352b(Call.Factory factory, String str, AbstractC6795x xVar, CacheControl cacheControl) {
        this.f22730b = factory;
        this.f22731c = str;
        this.f22732d = xVar;
        this.f22733e = cacheControl;
    }
}
