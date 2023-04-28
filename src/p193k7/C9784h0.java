package p193k7;

import android.net.Uri;
import android.text.TextUtils;
import cc.AbstractC3899l0;
import com.google.android.exoplayer2.upstream.AbstractC5311f;
import com.google.android.exoplayer2.upstream.C5288a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p079e7.C6713c;
import p081e9.C6779m;
import p081e9.C6793v;
import p119g9.C7510a;
import p119g9.C7557q0;
import p193k7.AbstractC9763c0;

/* renamed from: k7.h0 */
/* loaded from: classes7.dex */
public final class C9784h0 implements AbstractC9795j0 {

    /* renamed from: a */
    private final AbstractC5311f.AbstractC5314c f21782a;

    /* renamed from: b */
    private final String f21783b;

    /* renamed from: c */
    private final boolean f21784c;

    /* renamed from: d */
    private final Map<String, String> f21785d;

    public C9784h0(String str, AbstractC5311f.AbstractC5314c cVar) {
        this(str, false, cVar);
    }

    /* renamed from: c */
    private static byte[] m15367c(AbstractC5311f.AbstractC5314c cVar, String str, byte[] bArr, Map<String, String> map) {
        C6793v vVar = new C6793v(cVar.createDataSource());
        C5288a a = new C5288a.C5289b().m29614j(str).m29619e(map).m29620d(2).m29621c(bArr).m29622b(1).m29623a();
        int i = 0;
        C5288a aVar = a;
        while (true) {
            try {
                C6779m mVar = new C6779m(vVar, aVar);
                try {
                    byte[] S0 = C7557q0.m22178S0(mVar);
                    C7557q0.m22135o(mVar);
                    return S0;
                } catch (AbstractC5311f.C0146f e) {
                    String d = m15366d(e, i);
                    if (d != null) {
                        i++;
                        aVar = aVar.m29629a().m29614j(d).m29623a();
                        C7557q0.m22135o(mVar);
                    } else {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw new C9797k0(a, (Uri) C7510a.m22367e(vVar.m24319p()), vVar.mo12540e(), vVar.m24320o(), e2);
            }
        }
    }

    /* renamed from: d */
    private static String m15366d(AbstractC5311f.C0146f fVar, int i) {
        boolean z;
        Map<String, List<String>> map;
        List<String> list;
        int i2 = fVar.f9864m;
        if ((i2 == 307 || i2 == 308) && i < 5) {
            z = true;
        } else {
            z = false;
        }
        if (z && (map = fVar.f9866o) != null && (list = map.get("Location")) != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override // p193k7.AbstractC9795j0
    /* renamed from: a */
    public byte[] mo15334a(UUID uuid, AbstractC9763c0.C9768e eVar) {
        return m15367c(this.f21782a, eVar.m15409b() + "&signedRequest=" + C7557q0.m22207E(eVar.m15410a()), null, Collections.emptyMap());
    }

    @Override // p193k7.AbstractC9795j0
    /* renamed from: b */
    public byte[] mo15333b(UUID uuid, AbstractC9763c0.C9765b bVar) {
        String str;
        String b = bVar.m15411b();
        if (this.f21784c || TextUtils.isEmpty(b)) {
            b = this.f21783b;
        }
        if (!TextUtils.isEmpty(b)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C6713c.f14281e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (C6713c.f14279c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f21785d) {
                hashMap.putAll(this.f21785d);
            }
            return m15367c(this.f21782a, b, bVar.m15412a(), hashMap);
        }
        throw new C9797k0(new C5288a.C5289b().m29615i(Uri.EMPTY).m29623a(), Uri.EMPTY, AbstractC3899l0.m33370r(), 0L, new IllegalStateException("No license URL"));
    }

    /* renamed from: e */
    public void m15365e(String str, String str2) {
        C7510a.m22367e(str);
        C7510a.m22367e(str2);
        synchronized (this.f21785d) {
            this.f21785d.put(str, str2);
        }
    }

    public C9784h0(String str, boolean z, AbstractC5311f.AbstractC5314c cVar) {
        C7510a.m22371a(!z || !TextUtils.isEmpty(str));
        this.f21782a = cVar;
        this.f21783b = str;
        this.f21784c = z;
        this.f21785d = new HashMap();
    }
}
