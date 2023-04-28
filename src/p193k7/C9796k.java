package p193k7;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.AbstractC5311f;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import java.util.Map;
import p103fc.C7115d;
import p119g9.C7510a;
import p119g9.C7557q0;
import p193k7.C9785i;

/* renamed from: k7.k */
/* loaded from: classes7.dex */
public final class C9796k implements AbstractC9820y {

    /* renamed from: a */
    private final Object f21822a = new Object();

    /* renamed from: b */
    private MediaItem.C5149e f21823b;

    /* renamed from: c */
    private AbstractC9818x f21824c;

    /* renamed from: d */
    private AbstractC5311f.AbstractC5314c f21825d;

    /* renamed from: e */
    private String f21826e;

    /* renamed from: b */
    private AbstractC9818x m15332b(MediaItem.C5149e eVar) {
        String str;
        AbstractC5311f.AbstractC5314c cVar = this.f21825d;
        if (cVar == null) {
            cVar = new DefaultHttpDataSource.Factory().m29630b(this.f21826e);
        }
        Uri uri = eVar.f9001b;
        if (uri == null) {
            str = null;
        } else {
            str = uri.toString();
        }
        C9784h0 h0Var = new C9784h0(str, eVar.f9005f, cVar);
        for (Map.Entry<String, String> entry : eVar.f9002c.entrySet()) {
            h0Var.m15365e(entry.getKey(), entry.getValue());
        }
        C9785i a = new C9785i.C9787b().m15343e(eVar.f9000a, C9776g0.f21747d).m15346b(eVar.f9003d).m15345c(eVar.f9004e).m15344d(C7115d.m23358j(eVar.f9006g)).m15347a(h0Var);
        a.m15348t(0, eVar.m30541a());
        return a;
    }

    @Override // p193k7.AbstractC9820y
    /* renamed from: a */
    public AbstractC9818x mo9295a(MediaItem mediaItem) {
        AbstractC9818x xVar;
        C7510a.m22367e(mediaItem.f8963b);
        MediaItem.C5149e eVar = mediaItem.f8963b.f9016c;
        if (eVar == null || C7557q0.f16368a < 18) {
            return AbstractC9818x.f21859a;
        }
        synchronized (this.f21822a) {
            if (!C7557q0.m22159c(eVar, this.f21823b)) {
                this.f21823b = eVar;
                this.f21824c = m15332b(eVar);
            }
            xVar = (AbstractC9818x) C7510a.m22367e(this.f21824c);
        }
        return xVar;
    }
}
