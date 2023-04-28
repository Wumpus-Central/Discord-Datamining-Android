package p420x9;

import android.content.Context;
import android.content.res.Resources;
import p365u9.C13225k;

/* renamed from: x9.s */
/* loaded from: classes5.dex */
public class C14013s {

    /* renamed from: a */
    private final Resources f31596a;

    /* renamed from: b */
    private final String f31597b;

    public C14013s(Context context) {
        C14004p.m2051j(context);
        Resources resources = context.getResources();
        this.f31596a = resources;
        this.f31597b = resources.getResourcePackageName(C13225k.f29699a);
    }

    /* renamed from: a */
    public String m2032a(String str) {
        int identifier = this.f31596a.getIdentifier(str, "string", this.f31597b);
        if (identifier == 0) {
            return null;
        }
        return this.f31596a.getString(identifier);
    }
}
