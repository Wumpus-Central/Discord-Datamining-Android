package fk;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;

@Metadata(m15074d1 = {"fk/n", "fk/o"}, m15073d2 = {}, m15072k = 4, m15071mv = {1, 4, 0})
/* renamed from: fk.m */
/* loaded from: classes8.dex */
public final class C7366m {
    /* renamed from: a */
    public static final Sink m22822a(File file) {
        return C7367n.m22808b(file);
    }

    /* renamed from: b */
    public static final Sink m22821b() {
        return C7368o.m22799a();
    }

    /* renamed from: c */
    public static final BufferedSink m22820c(Sink sink) {
        return C7368o.m22798b(sink);
    }

    /* renamed from: d */
    public static final BufferedSource m22819d(Source source) {
        return C7368o.m22797c(source);
    }

    /* renamed from: e */
    public static final boolean m22818e(AssertionError assertionError) {
        return C7367n.m22807c(assertionError);
    }

    /* renamed from: f */
    public static final Sink m22817f(File file) {
        return C7367n.m22803g(file, false, 1, null);
    }

    /* renamed from: g */
    public static final Sink m22816g(File file, boolean z) {
        return C7367n.m22806d(file, z);
    }

    /* renamed from: h */
    public static final Sink m22815h(OutputStream outputStream) {
        return C7367n.m22805e(outputStream);
    }

    /* renamed from: i */
    public static final Sink m22814i(Socket socket) {
        return C7367n.m22804f(socket);
    }

    /* renamed from: j */
    public static /* synthetic */ Sink m22813j(File file, boolean z, int i, Object obj) {
        return C7367n.m22803g(file, z, i, obj);
    }

    /* renamed from: k */
    public static final Source m22812k(File file) {
        return C7367n.m22802h(file);
    }

    /* renamed from: l */
    public static final Source m22811l(InputStream inputStream) {
        return C7367n.m22801i(inputStream);
    }

    /* renamed from: m */
    public static final Source m22810m(Socket socket) {
        return C7367n.m22800j(socket);
    }
}
