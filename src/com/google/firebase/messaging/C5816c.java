package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.C2094a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes3.dex */
public final class C5816c {

    /* renamed from: a */
    public static final long f11558a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.c$a */
    /* loaded from: classes3.dex */
    public static final class C5817a {
        /* renamed from: a */
        public static C2094a<String, String> m27212a(Bundle bundle) {
            C2094a<String, String> aVar = new C2094a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            return aVar;
        }
    }
}
