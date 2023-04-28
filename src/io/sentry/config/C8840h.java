package io.sentry.config;

import io.sentry.C8910j4;
import java.util.ArrayList;
import java.util.Properties;

/* renamed from: io.sentry.config.h */
/* loaded from: classes8.dex */
public final class C8840h {
    /* renamed from: a */
    public static AbstractC8839g m17921a() {
        Properties a;
        Properties a2;
        C8910j4 j4Var = new C8910j4();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8842j());
        arrayList.add(new C8836d());
        String property = System.getProperty("sentry.properties.file");
        if (!(property == null || (a2 = new C8837e(property, j4Var).m17932a()) == null)) {
            arrayList.add(new C8841i(a2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (!(str == null || (a = new C8837e(str, j4Var).m17932a()) == null)) {
            arrayList.add(new C8841i(a));
        }
        Properties a3 = new C8834b(j4Var).m17934a();
        if (a3 != null) {
            arrayList.add(new C8841i(a3));
        }
        Properties a4 = new C8837e("sentry.properties", j4Var).m17932a();
        if (a4 != null) {
            arrayList.add(new C8841i(a4));
        }
        return new C8835c(arrayList);
    }
}
