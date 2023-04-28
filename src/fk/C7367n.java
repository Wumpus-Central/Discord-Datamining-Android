package fk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p326ri.C12719v;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\u0004*\u00020\t\"\"\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001c\u0010\u001a\u001a\u00020\n*\u00060\u0016j\u0002`\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m15073d2 = {"Ljava/io/OutputStream;", "Lokio/Sink;", "e", "Ljava/io/InputStream;", "Lokio/Source;", "i", "Ljava/net/Socket;", "f", "j", "Ljava/io/File;", "", "append", "d", "b", "h", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "getLogger$Okio__JvmOkioKt", "()Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "c", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, m15072k = 5, m15071mv = {1, 4, 0}, m15068xs = "okio/Okio")
/* renamed from: fk.n */
/* loaded from: classes8.dex */
public final /* synthetic */ class C7367n {

    /* renamed from: a */
    private static final Logger f15865a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final Sink m22808b(File appendingSink) {
        C9971q.m14633g(appendingSink, "$this$appendingSink");
        return C7366m.m22815h(new FileOutputStream(appendingSink, true));
    }

    /* renamed from: c */
    public static final boolean m22807c(AssertionError isAndroidGetsocknameError) {
        boolean z;
        C9971q.m14633g(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        if (isAndroidGetsocknameError.getCause() == null) {
            return false;
        }
        String message = isAndroidGetsocknameError.getMessage();
        if (message != null) {
            z = C12719v.m5709M(message, "getsockname failed", false, 2, null);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final Sink m22806d(File sink, boolean z) {
        C9971q.m14633g(sink, "$this$sink");
        return C7366m.m22815h(new FileOutputStream(sink, z));
    }

    /* renamed from: e */
    public static final Sink m22805e(OutputStream sink) {
        C9971q.m14633g(sink, "$this$sink");
        return new C7371q(sink, new Timeout());
    }

    /* renamed from: f */
    public static final Sink m22804f(Socket sink) {
        C9971q.m14633g(sink, "$this$sink");
        C7381x xVar = new C7381x(sink);
        OutputStream outputStream = sink.getOutputStream();
        C9971q.m14634f(outputStream, "getOutputStream()");
        return xVar.m9666v(new C7371q(outputStream, xVar));
    }

    /* renamed from: g */
    public static /* synthetic */ Sink m22803g(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return C7366m.m22816g(file, z);
    }

    /* renamed from: h */
    public static final Source m22802h(File source) {
        C9971q.m14633g(source, "$this$source");
        return C7366m.m22811l(new FileInputStream(source));
    }

    /* renamed from: i */
    public static final Source m22801i(InputStream source) {
        C9971q.m14633g(source, "$this$source");
        return new C7365l(source, new Timeout());
    }

    /* renamed from: j */
    public static final Source m22800j(Socket source) {
        C9971q.m14633g(source, "$this$source");
        C7381x xVar = new C7381x(source);
        InputStream inputStream = source.getInputStream();
        C9971q.m14634f(inputStream, "getInputStream()");
        return xVar.m9665w(new C7365l(inputStream, xVar));
    }
}
