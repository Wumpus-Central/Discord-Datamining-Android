package p223m2;

import java.util.List;
import p254o2.C11186p;

/* renamed from: m2.d */
/* loaded from: classes.dex */
public class C10473d {

    /* renamed from: a */
    private final List<C11186p> f23126a;

    /* renamed from: b */
    private final char f23127b;

    /* renamed from: c */
    private final double f23128c;

    /* renamed from: d */
    private final double f23129d;

    /* renamed from: e */
    private final String f23130e;

    /* renamed from: f */
    private final String f23131f;

    public C10473d(List<C11186p> list, char c, double d, double d2, String str, String str2) {
        this.f23126a = list;
        this.f23127b = c;
        this.f23128c = d;
        this.f23129d = d2;
        this.f23130e = str;
        this.f23131f = str2;
    }

    /* renamed from: c */
    public static int m13097c(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C11186p> m13099a() {
        return this.f23126a;
    }

    /* renamed from: b */
    public double m13098b() {
        return this.f23129d;
    }

    public int hashCode() {
        return m13097c(this.f23127b, this.f23131f, this.f23130e);
    }
}
