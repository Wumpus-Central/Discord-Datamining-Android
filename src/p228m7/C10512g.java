package p228m7;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p119g9.C7541k;
import p243n7.C10725b;
import p259o7.C11210d;
import p280p7.C11581c;
import p296q7.C12034a;
import p316r7.C12445e;
import p336s7.C12809f;
import p348t7.C12985g;
import p348t7.C12991k;
import p363u7.C13202d;
import p398w7.C13752a0;
import p398w7.C13754b;
import p398w7.C13760e;
import p398w7.C13767h;
import p398w7.C13768h0;
import p418x7.C13942b;

/* renamed from: m7.g */
/* loaded from: classes7.dex */
public final class C10512g implements AbstractC10521o {

    /* renamed from: m */
    private static final int[] f23247m = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: n */
    private static final Constructor<? extends AbstractC10514i> f23248n;

    /* renamed from: b */
    private boolean f23249b;

    /* renamed from: c */
    private int f23250c;

    /* renamed from: d */
    private int f23251d;

    /* renamed from: e */
    private int f23252e;

    /* renamed from: f */
    private int f23253f;

    /* renamed from: g */
    private int f23254g;

    /* renamed from: h */
    private int f23255h;

    /* renamed from: i */
    private int f23256i;

    /* renamed from: k */
    private int f23258k;

    /* renamed from: j */
    private int f23257j = 1;

    /* renamed from: l */
    private int f23259l = 112800;

    static {
        Constructor<? extends AbstractC10514i> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(AbstractC10514i.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f23248n = constructor;
    }

    /* renamed from: c */
    private void m12975c(int i, List<AbstractC10514i> list) {
        switch (i) {
            case 0:
                list.add(new C13754b());
                return;
            case 1:
                list.add(new C13760e());
                return;
            case 2:
                list.add(new C13767h(this.f23250c | (this.f23249b ? 1 : 0)));
                return;
            case 3:
                list.add(new C10725b(this.f23251d | (this.f23249b ? 1 : 0)));
                return;
            case 4:
                Constructor<? extends AbstractC10514i> constructor = f23248n;
                if (constructor != null) {
                    try {
                        list.add((AbstractC10514i) constructor.newInstance(Integer.valueOf(this.f23252e)));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                } else {
                    list.add(new C11210d(this.f23252e));
                    return;
                }
            case 5:
                list.add(new C11581c());
                return;
            case 6:
                list.add(new C12445e(this.f23253f));
                return;
            case 7:
                list.add(new C12809f(this.f23256i | (this.f23249b ? 1 : 0)));
                return;
            case 8:
                list.add(new C12985g(this.f23255h));
                list.add(new C12991k(this.f23254g));
                return;
            case 9:
                list.add(new C13202d());
                return;
            case 10:
                list.add(new C13752a0());
                return;
            case 11:
                list.add(new C13768h0(this.f23257j, this.f23258k, this.f23259l));
                return;
            case 12:
                list.add(new C13942b());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new C12034a());
                return;
        }
    }

    @Override // p228m7.AbstractC10521o
    /* renamed from: a */
    public synchronized AbstractC10514i[] mo2230a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        arrayList = new ArrayList(14);
        int b = C7541k.m22289b(map);
        if (b != -1) {
            m12975c(b, arrayList);
        }
        int c = C7541k.m22288c(uri);
        if (!(c == -1 || c == b)) {
            m12975c(c, arrayList);
        }
        for (int i : f23247m) {
            if (!(i == b || i == c)) {
                m12975c(i, arrayList);
            }
        }
        return (AbstractC10514i[]) arrayList.toArray(new AbstractC10514i[arrayList.size()]);
    }

    @Override // p228m7.AbstractC10521o
    /* renamed from: b */
    public synchronized AbstractC10514i[] mo2229b() {
        return mo2230a(Uri.EMPTY, new HashMap());
    }
}
