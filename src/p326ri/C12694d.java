package p326ri;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0011\u0010\u0015\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, m15073d2 = {"Lri/d;", "", "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "UTF_8", "c", "UTF_16", "d", "UTF_16BE", "e", "UTF_16LE", "f", "US_ASCII", "g", "ISO_8859_1", "h", "utf_32le", "i", "utf_32be", "()Ljava/nio/charset/Charset;", "UTF_32LE", "a", "UTF_32BE", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ri.d */
/* loaded from: classes8.dex */
public final class C12694d {

    /* renamed from: a */
    public static final C12694d f28535a = new C12694d();

    /* renamed from: b */
    public static final Charset f28536b;

    /* renamed from: c */
    public static final Charset f28537c;

    /* renamed from: d */
    public static final Charset f28538d;

    /* renamed from: e */
    public static final Charset f28539e;

    /* renamed from: f */
    public static final Charset f28540f;

    /* renamed from: g */
    public static final Charset f28541g;

    /* renamed from: h */
    private static volatile Charset f28542h;

    /* renamed from: i */
    private static volatile Charset f28543i;

    static {
        Charset forName = Charset.forName("UTF-8");
        C9971q.m14634f(forName, "forName(\"UTF-8\")");
        f28536b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C9971q.m14634f(forName2, "forName(\"UTF-16\")");
        f28537c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C9971q.m14634f(forName3, "forName(\"UTF-16BE\")");
        f28538d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C9971q.m14634f(forName4, "forName(\"UTF-16LE\")");
        f28539e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C9971q.m14634f(forName5, "forName(\"US-ASCII\")");
        f28540f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C9971q.m14634f(forName6, "forName(\"ISO-8859-1\")");
        f28541g = forName6;
    }

    private C12694d() {
    }

    /* renamed from: a */
    public final Charset m5852a() {
        Charset charset = f28543i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C9971q.m14634f(forName, "forName(\"UTF-32BE\")");
        f28543i = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset m5851b() {
        Charset charset = f28542h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C9971q.m14634f(forName, "forName(\"UTF-32LE\")");
        f28542h = forName;
        return forName;
    }
}
