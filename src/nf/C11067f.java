package nf;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p370uf.C13273b;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¨\u0006\u0006"}, m15073d2 = {"", "", "b", "exception", "", "a", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/ExceptionsKt")
/* renamed from: nf.f */
/* loaded from: classes8.dex */
public class C11067f {
    /* renamed from: a */
    public static void m10981a(Throwable th2, Throwable exception) {
        C9971q.m14633g(th2, "<this>");
        C9971q.m14633g(exception, "exception");
        if (th2 != exception) {
            C13273b.f29800a.mo3546a(th2, exception);
        }
    }

    /* renamed from: b */
    public static String m10980b(Throwable th2) {
        C9971q.m14633g(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C9971q.m14634f(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
