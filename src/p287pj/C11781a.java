package p287pj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import net.time4j.C10892f0;
import net.time4j.base.AbstractC10811a;
import net.time4j.p248tz.AbstractC11008m;
import net.time4j.p248tz.AbstractC11030r;
import net.time4j.p248tz.AbstractC11031s;
import p271oj.AbstractC11409c;

/* renamed from: pj.a */
/* loaded from: classes8.dex */
public class C11781a implements AbstractC11030r, AbstractC11409c {

    /* renamed from: a */
    private final String f26284a;

    /* renamed from: b */
    private final String f26285b;

    /* renamed from: c */
    private final Map<String, byte[]> f26286c;

    /* renamed from: d */
    private final Map<String, String> f26287d;

    /* renamed from: e */
    private final C10892f0 f26288e;

    /* renamed from: f */
    private final Map<AbstractC10811a, Integer> f26289f;

    /* JADX WARN: Removed duplicated region for block: B:78:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C11781a() {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p287pj.C11781a.<init>():void");
    }

    /* renamed from: j */
    private static void m8634j(DataInputStream dataInputStream, String str) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte readByte3 = dataInputStream.readByte();
        byte readByte4 = dataInputStream.readByte();
        byte readByte5 = dataInputStream.readByte();
        byte readByte6 = dataInputStream.readByte();
        if (readByte != 116 || readByte2 != 122 || readByte3 != 114 || readByte4 != 101 || readByte5 != 112 || readByte6 != 111) {
            throw new IOException("Invalid tz-repository: " + str);
        }
    }

    /* renamed from: l */
    private static Class<?> m8632l() {
        if (!Boolean.getBoolean("test.environment")) {
            return C11781a.class;
        }
        try {
            return Class.forName("net.time4j.tz.spi.RepositoryTest");
        } catch (ClassNotFoundException e) {
            throw new AssertionError(e);
        }
    }

    @Override // net.time4j.p248tz.AbstractC11030r
    /* renamed from: a */
    public String mo8643a() {
        return this.f26285b;
    }

    @Override // net.time4j.p248tz.AbstractC11030r
    /* renamed from: b */
    public AbstractC11031s mo8642b() {
        return null;
    }

    @Override // p271oj.AbstractC11409c
    /* renamed from: c */
    public boolean mo8641c() {
        return !this.f26289f.isEmpty();
    }

    @Override // net.time4j.p248tz.AbstractC11030r
    /* renamed from: d */
    public Map<String, String> mo8640d() {
        return this.f26287d;
    }

    @Override // net.time4j.p248tz.AbstractC11030r
    /* renamed from: f */
    public String mo8638f() {
        return this.f26284a;
    }

    @Override // p271oj.AbstractC11409c
    /* renamed from: g */
    public Map<AbstractC10811a, Integer> mo8637g() {
        return Collections.unmodifiableMap(this.f26289f);
    }

    @Override // net.time4j.p248tz.AbstractC11030r
    public String getName() {
        return "TZDB";
    }

    @Override // net.time4j.p248tz.AbstractC11030r
    /* renamed from: h */
    public Set<String> mo8636h() {
        return this.f26286c.keySet();
    }

    @Override // net.time4j.p248tz.AbstractC11030r
    /* renamed from: i */
    public String mo8635i() {
        return "";
    }

    /* renamed from: k */
    public C10892f0 mo8639e() {
        return this.f26288e;
    }

    @Override // net.time4j.p248tz.AbstractC11030r
    public AbstractC11008m load(String str) {
        try {
            byte[] bArr = this.f26286c.get(str);
            if (bArr != null) {
                return (AbstractC11008m) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "TZ-REPOSITORY(" + this.f26284a + ")";
    }
}
