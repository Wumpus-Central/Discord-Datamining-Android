package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* renamed from: io.sentry.l0 */
/* loaded from: classes8.dex */
public interface AbstractC8924l0 {
    /* renamed from: a */
    <T> void mo17607a(T t, Writer writer);

    /* renamed from: b */
    void mo17606b(C9025q2 q2Var, OutputStream outputStream);

    /* renamed from: c */
    <T> T mo17605c(Reader reader, Class<T> cls);

    /* renamed from: d */
    C9025q2 mo17604d(InputStream inputStream);

    /* renamed from: e */
    String mo17603e(Map<String, Object> map);
}
