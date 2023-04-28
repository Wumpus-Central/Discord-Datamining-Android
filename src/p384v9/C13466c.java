package p384v9;

import android.text.TextUtils;
import androidx.collection.C2094a;
import java.util.ArrayList;
import p365u9.C13215a;
import p400w9.C13813b;
import p420x9.C14004p;

/* renamed from: v9.c */
/* loaded from: classes5.dex */
public class C13466c extends Exception {

    /* renamed from: k */
    private final C2094a<C13813b<?>, C13215a> f30067k;

    public C13466c(C2094a<C13813b<?>, C13215a> aVar) {
        this.f30067k = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C13813b<?> bVar : this.f30067k.keySet()) {
            C13215a aVar = (C13215a) C14004p.m2051j(this.f30067k.get(bVar));
            z &= !aVar.m4294z();
            String b = bVar.m2592b();
            String valueOf = String.valueOf(aVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb2.append(b);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }
}
