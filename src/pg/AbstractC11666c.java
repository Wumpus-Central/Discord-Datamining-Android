package pg;

import fi.AbstractC7267g0;
import java.util.Map;
import p142hi.C8039k;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11299a1;
import p268og.AbstractC11313e;
import p388vh.C13508c;
import th.AbstractC13104g;

/* renamed from: pg.c */
/* loaded from: classes8.dex */
public interface AbstractC11666c {

    /* renamed from: pg.c$a */
    /* loaded from: classes8.dex */
    public static final class C11667a {
        /* renamed from: a */
        public static C11137c m9056a(AbstractC11666c cVar) {
            AbstractC11313e i = C13508c.m3532i(cVar);
            if (i == null) {
                return null;
            }
            if (C8039k.m20765m(i)) {
                i = null;
            }
            if (i != null) {
                return C13508c.m3533h(i);
            }
            return null;
        }
    }

    /* renamed from: a */
    Map<C11142f, AbstractC13104g<?>> mo700a();

    /* renamed from: e */
    C11137c mo722e();

    AbstractC7267g0 getType();

    /* renamed from: j */
    AbstractC11299a1 mo721j();
}
