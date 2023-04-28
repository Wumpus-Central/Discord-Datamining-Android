package io.sentry.internal.modules;

import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.sentry.internal.modules.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8901b implements AbstractC8900a {

    /* renamed from: a */
    protected final AbstractC8869g0 f19585a;

    /* renamed from: b */
    private Map<String, String> f19586b = null;

    public AbstractC8901b(AbstractC8869g0 g0Var) {
        this.f19585a = g0Var;
    }

    @Override // io.sentry.internal.modules.AbstractC8900a
    /* renamed from: a */
    public Map<String, String> mo17755a() {
        Map<String, String> map = this.f19586b;
        if (map != null) {
            return map;
        }
        Map<String, String> b = mo17753b();
        this.f19586b = b;
        return b;
    }

    /* renamed from: b */
    protected abstract Map<String, String> mo17753b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> m17756c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    int lastIndexOf = readLine.lastIndexOf(58);
                    treeMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
                }
                this.f19585a.mo17722c(EnumC8942n3.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e) {
            this.f19585a.mo17723b(EnumC8942n3.ERROR, "Error extracting modules.", e);
        } catch (RuntimeException e2) {
            this.f19585a.mo17724a(EnumC8942n3.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
        }
        return treeMap;
    }
}
