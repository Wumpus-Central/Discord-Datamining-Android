package p229m8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p079e7.C6722k;
import p212l8.AbstractC10357e;
import p229m8.AbstractC10551j;

/* renamed from: m8.i */
/* loaded from: classes7.dex */
public abstract class AbstractC10547i {

    /* renamed from: a */
    public final long f23351a;

    /* renamed from: b */
    public final C6722k f23352b;

    /* renamed from: c */
    public final String f23353c;

    /* renamed from: d */
    public final long f23354d;

    /* renamed from: e */
    public final List<C10542d> f23355e;

    /* renamed from: f */
    private final C10546h f23356f;

    /* renamed from: m8.i$b */
    /* loaded from: classes7.dex */
    public static class C10549b extends AbstractC10547i implements AbstractC10357e {

        /* renamed from: g */
        final AbstractC10551j.AbstractC10552a f23357g;

        public C10549b(long j, C6722k kVar, String str, AbstractC10551j.AbstractC10552a aVar, List<C10542d> list) {
            super(j, kVar, str, aVar, list);
            this.f23357g = aVar;
        }

        @Override // p229m8.AbstractC10547i
        /* renamed from: a */
        public String mo12842a() {
            return null;
        }

        @Override // p229m8.AbstractC10547i
        /* renamed from: b */
        public AbstractC10357e mo12841b() {
            return this;
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: c */
        public long mo12826c(long j) {
            return this.f23357g.m12832j(j);
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: d */
        public long mo12825d(long j, long j2) {
            return this.f23357g.m12834h(j, j2);
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: e */
        public long mo12824e(long j, long j2) {
            return this.f23357g.m12837d(j, j2);
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: f */
        public long mo12823f(long j, long j2) {
            return this.f23357g.m12835f(j, j2);
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: g */
        public C10546h mo12822g(long j) {
            return this.f23357g.mo12828k(this, j);
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: h */
        public long mo12821h(long j, long j2) {
            return this.f23357g.m12833i(j, j2);
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: i */
        public int mo12820i(long j) {
            return this.f23357g.mo12829g(j);
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: j */
        public boolean mo12819j() {
            return this.f23357g.mo12831l();
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: k */
        public long mo12818k() {
            return this.f23357g.m12836e();
        }

        @Override // p212l8.AbstractC10357e
        /* renamed from: l */
        public int mo12817l(long j, long j2) {
            return this.f23357g.m12838c(j, j2);
        }

        @Override // p229m8.AbstractC10547i
        /* renamed from: m */
        public C10546h mo12840m() {
            return null;
        }
    }

    /* renamed from: m8.i$c */
    /* loaded from: classes7.dex */
    public static class C10550c extends AbstractC10547i {

        /* renamed from: g */
        public final Uri f23358g;

        /* renamed from: h */
        public final long f23359h;

        /* renamed from: i */
        private final String f23360i;

        /* renamed from: j */
        private final C10546h f23361j;

        /* renamed from: k */
        private final C10558l f23362k;

        public C10550c(long j, C6722k kVar, String str, AbstractC10551j.C10556e eVar, List<C10542d> list, String str2, long j2) {
            super(j, kVar, str, eVar, list);
            C10558l lVar;
            this.f23358g = Uri.parse(str);
            C10546h c = eVar.m12827c();
            this.f23361j = c;
            this.f23360i = str2;
            this.f23359h = j2;
            if (c != null) {
                lVar = null;
            } else {
                lVar = new C10558l(new C10546h(null, 0L, j2));
            }
            this.f23362k = lVar;
        }

        @Override // p229m8.AbstractC10547i
        /* renamed from: a */
        public String mo12842a() {
            return this.f23360i;
        }

        @Override // p229m8.AbstractC10547i
        /* renamed from: b */
        public AbstractC10357e mo12841b() {
            return this.f23362k;
        }

        @Override // p229m8.AbstractC10547i
        /* renamed from: m */
        public C10546h mo12840m() {
            return this.f23361j;
        }
    }

    /* renamed from: o */
    public static AbstractC10547i m12844o(long j, C6722k kVar, String str, AbstractC10551j jVar, List<C10542d> list) {
        return m12843p(j, kVar, str, jVar, list, null);
    }

    /* renamed from: p */
    public static AbstractC10547i m12843p(long j, C6722k kVar, String str, AbstractC10551j jVar, List<C10542d> list, String str2) {
        if (jVar instanceof AbstractC10551j.C10556e) {
            return new C10550c(j, kVar, str, (AbstractC10551j.C10556e) jVar, list, str2, -1L);
        }
        if (jVar instanceof AbstractC10551j.AbstractC10552a) {
            return new C10549b(j, kVar, str, (AbstractC10551j.AbstractC10552a) jVar, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    /* renamed from: a */
    public abstract String mo12842a();

    /* renamed from: b */
    public abstract AbstractC10357e mo12841b();

    /* renamed from: m */
    public abstract C10546h mo12840m();

    /* renamed from: n */
    public C10546h m12845n() {
        return this.f23356f;
    }

    private AbstractC10547i(long j, C6722k kVar, String str, AbstractC10551j jVar, List<C10542d> list) {
        List<C10542d> list2;
        this.f23351a = j;
        this.f23352b = kVar;
        this.f23353c = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f23355e = list2;
        this.f23356f = jVar.mo12830a(this);
        this.f23354d = jVar.m12839b();
    }
}
