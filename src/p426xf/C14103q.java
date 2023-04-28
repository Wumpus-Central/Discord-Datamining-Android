package p426xf;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p306qi.C12193m;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u0006\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u0010"}, m15073d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "", "action", "c", "Ljava/io/BufferedReader;", "Lkotlin/sequences/Sequence;", "d", "e", "Ljava/io/Writer;", "out", "", "bufferSize", "", "a", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: xf.q */
/* loaded from: classes8.dex */
public final class C14103q {
    /* renamed from: a */
    public static final long m1672a(Reader reader, Writer out, int i) {
        C9971q.m14633g(reader, "<this>");
        C9971q.m14633g(out, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m1671b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m1672a(reader, writer, i);
    }

    /* renamed from: c */
    public static final void m1670c(Reader reader, Function1<? super String, Unit> action) {
        BufferedReader bufferedReader;
        C9971q.m14633g(reader, "<this>");
        C9971q.m14633g(action, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            for (String str : m1669d(bufferedReader)) {
                action.invoke(str);
            }
            Unit unit = Unit.f22042a;
            th = null;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: d */
    public static final Sequence<String> m1669d(BufferedReader bufferedReader) {
        Sequence<String> d;
        C9971q.m14633g(bufferedReader, "<this>");
        d = C12193m.m7449d(new C14100o(bufferedReader));
        return d;
    }

    /* renamed from: e */
    public static final String m1668e(Reader reader) {
        C9971q.m14633g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m1671b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        C9971q.m14634f(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
