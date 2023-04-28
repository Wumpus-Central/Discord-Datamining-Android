package p346t5;

import java.io.IOException;
import java.io.InputStream;
import p076e4.C6703d;
import p163j$.util.Spliterator;
import p380v5.C13434e;
import p394w3.C13729b;
import p394w3.C13740j;
import p394w3.C13747n;
import p455z3.AbstractC14529a;
import p455z3.C14534f;

/* renamed from: t5.f */
/* loaded from: classes7.dex */
public class C12965f {

    /* renamed from: g */
    private boolean f29061g;

    /* renamed from: h */
    private final AbstractC14529a f29062h;

    /* renamed from: c */
    private int f29057c = 0;

    /* renamed from: b */
    private int f29056b = 0;

    /* renamed from: d */
    private int f29058d = 0;

    /* renamed from: f */
    private int f29060f = 0;

    /* renamed from: e */
    private int f29059e = 0;

    /* renamed from: a */
    private int f29055a = 0;

    public C12965f(AbstractC14529a aVar) {
        this.f29062h = (AbstractC14529a) C13740j.m2834g(aVar);
    }

    /* renamed from: a */
    private boolean m4938a(InputStream inputStream) {
        int read;
        int i = this.f29059e;
        while (this.f29055a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i2 = this.f29057c + 1;
                this.f29057c = i2;
                if (this.f29061g) {
                    this.f29055a = 6;
                    this.f29061g = false;
                    return false;
                }
                int i3 = this.f29055a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.f29055a = 5;
                                } else if (i3 != 5) {
                                    C13740j.m2832i(false);
                                } else {
                                    int i4 = ((this.f29056b << 8) + read) - 2;
                                    C6703d.m24613a(inputStream, i4);
                                    this.f29057c += i4;
                                    this.f29055a = 2;
                                }
                            } else if (read == 255) {
                                this.f29055a = 3;
                            } else if (read == 0) {
                                this.f29055a = 2;
                            } else if (read == 217) {
                                this.f29061g = true;
                                m4933f(i2 - 2);
                                this.f29055a = 2;
                            } else {
                                if (read == 218) {
                                    m4933f(i2 - 2);
                                }
                                if (m4937b(read)) {
                                    this.f29055a = 4;
                                } else {
                                    this.f29055a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f29055a = 3;
                        }
                    } else if (read == 216) {
                        this.f29055a = 2;
                    } else {
                        this.f29055a = 6;
                    }
                } else if (read == 255) {
                    this.f29055a = 1;
                } else {
                    this.f29055a = 6;
                }
                this.f29056b = read;
            } catch (IOException e) {
                C13747n.m2823a(e);
            }
        }
        if (this.f29055a == 6 || this.f29059e == i) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m4937b(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    /* renamed from: f */
    private void m4933f(int i) {
        int i2 = this.f29058d;
        if (i2 > 0) {
            this.f29060f = i;
        }
        this.f29058d = i2 + 1;
        this.f29059e = i2;
    }

    /* renamed from: c */
    public int m4936c() {
        return this.f29060f;
    }

    /* renamed from: d */
    public int m4935d() {
        return this.f29059e;
    }

    /* renamed from: e */
    public boolean m4934e() {
        return this.f29061g;
    }

    /* renamed from: g */
    public boolean m4932g(C13434e eVar) {
        if (this.f29055a == 6 || eVar.m3714R() <= this.f29057c) {
            return false;
        }
        C14534f fVar = new C14534f(eVar.m3726C(), this.f29062h.get(Spliterator.SUBSIZED), this.f29062h);
        try {
            C6703d.m24613a(fVar, this.f29057c);
            return m4938a(fVar);
        } catch (IOException e) {
            C13747n.m2823a(e);
            return false;
        } finally {
            C13729b.m2856b(fVar);
        }
    }
}
