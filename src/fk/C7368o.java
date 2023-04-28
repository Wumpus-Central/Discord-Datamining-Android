package fk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m15073d2 = {"Lokio/Source;", "Lokio/BufferedSource;", "c", "Lokio/Sink;", "Lokio/BufferedSink;", "b", "a", "()Lokio/Sink;", "okio"}, m15072k = 5, m15071mv = {1, 4, 0}, m15068xs = "okio/Okio")
/* renamed from: fk.o */
/* loaded from: classes8.dex */
public final /* synthetic */ class C7368o {
    /* renamed from: a */
    public static final Sink m22799a() {
        return new C7356d();
    }

    /* renamed from: b */
    public static final BufferedSink m22798b(Sink buffer) {
        C9971q.m14633g(buffer, "$this$buffer");
        return new C7373s(buffer);
    }

    /* renamed from: c */
    public static final BufferedSource m22797c(Source buffer) {
        C9971q.m14633g(buffer, "$this$buffer");
        return new C7375t(buffer);
    }
}
