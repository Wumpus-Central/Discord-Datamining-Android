package p181jh;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.C9971q;
import nf.C11098x;
import p159ih.C8578m;
import ph.C11697g;

/* renamed from: jh.c */
/* loaded from: classes8.dex */
public final class C9609c {
    /* renamed from: a */
    public static final Pair<C8578m, C9607a> m15926a(InputStream inputStream) {
        Object obj;
        C9971q.m14633g(inputStream, "<this>");
        try {
            C9607a a = C9607a.f21282g.m15928a(inputStream);
            th = null;
            if (a.m15929h()) {
                C11697g d = C11697g.m8879d();
                C9608b.m15927a(d);
                obj = C8578m.m18999X(inputStream, d);
            } else {
                obj = th;
            }
            return C11098x.m10921a(obj, a);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
