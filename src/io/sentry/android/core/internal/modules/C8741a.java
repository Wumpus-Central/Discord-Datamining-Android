package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import io.sentry.internal.modules.AbstractC8901b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.sentry.android.core.internal.modules.a */
/* loaded from: classes8.dex */
public final class C8741a extends AbstractC8901b {

    /* renamed from: c */
    private final Context f19325c;

    public C8741a(Context context, AbstractC8869g0 g0Var) {
        super(g0Var);
        this.f19325c = context;
    }

    @Override // io.sentry.internal.modules.AbstractC8901b
    /* renamed from: b */
    protected Map<String, String> mo17753b() {
        TreeMap treeMap = new TreeMap();
        try {
            return m17756c(this.f19325c.getAssets().open("sentry-external-modules.txt"));
        } catch (FileNotFoundException unused) {
            this.f19585a.mo17722c(EnumC8942n3.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e) {
            this.f19585a.mo17723b(EnumC8942n3.ERROR, "Error extracting modules.", e);
            return treeMap;
        }
    }
}
