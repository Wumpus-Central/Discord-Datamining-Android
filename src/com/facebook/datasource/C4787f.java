package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p359u3.C13182a;
import p394w3.C13736i;
import p394w3.C13740j;

/* renamed from: com.facebook.datasource.f */
/* loaded from: classes7.dex */
public class C4787f<T> implements Supplier<DataSource<T>> {

    /* renamed from: a */
    private final List<Supplier<DataSource<T>>> f7609a;

    /* renamed from: b */
    private final boolean f7610b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.datasource.f$a */
    /* loaded from: classes7.dex */
    public class C4788a extends AbstractC4775a<T> {

        /* renamed from: h */
        private ArrayList<DataSource<T>> f7611h;

        /* renamed from: i */
        private int f7612i;

        /* renamed from: j */
        private int f7613j;

        /* renamed from: k */
        private AtomicInteger f7614k;

        /* renamed from: l */
        private Throwable f7615l;

        /* renamed from: m */
        private Map<String, Object> f7616m;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.facebook.datasource.f$a$a */
        /* loaded from: classes7.dex */
        public class C0111a implements AbstractC4782d<T> {

            /* renamed from: a */
            private int f7618a;

            public C0111a(int i) {
                this.f7618a = i;
            }

            @Override // com.facebook.datasource.AbstractC4782d
            public void onCancellation(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.AbstractC4782d
            public void onFailure(DataSource<T> dataSource) {
                C4788a.this.m31974G(this.f7618a, dataSource);
            }

            @Override // com.facebook.datasource.AbstractC4782d
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.mo31971b()) {
                    C4788a.this.m31973H(this.f7618a, dataSource);
                } else if (dataSource.mo32020a()) {
                    C4788a.this.m31974G(this.f7618a, dataSource);
                }
            }

            @Override // com.facebook.datasource.AbstractC4782d
            public void onProgressUpdate(DataSource<T> dataSource) {
                if (this.f7618a == 0) {
                    C4788a.this.m32006s(dataSource.mo32017e());
                }
            }
        }

        public C4788a() {
            if (!C4787f.this.f7610b) {
                m31980A();
            }
        }

        /* renamed from: A */
        private void m31980A() {
            if (this.f7614k == null) {
                synchronized (this) {
                    if (this.f7614k == null) {
                        this.f7614k = new AtomicInteger(0);
                        int size = C4787f.this.f7609a.size();
                        this.f7613j = size;
                        this.f7612i = size;
                        this.f7611h = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            DataSource<T> dataSource = (DataSource) ((Supplier) C4787f.this.f7609a.get(i)).get();
                            this.f7611h.add(dataSource);
                            dataSource.mo32018d(new C0111a(i), C13182a.m4396a());
                            if (dataSource.mo31971b()) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: B */
        private synchronized DataSource<T> m31979B(int i) {
            DataSource<T> dataSource;
            ArrayList<DataSource<T>> arrayList = this.f7611h;
            dataSource = null;
            if (arrayList != null && i < arrayList.size()) {
                dataSource = this.f7611h.set(i, null);
            }
            return dataSource;
        }

        /* renamed from: C */
        private synchronized DataSource<T> m31978C(int i) {
            DataSource<T> dataSource;
            ArrayList<DataSource<T>> arrayList = this.f7611h;
            if (arrayList == null || i >= arrayList.size()) {
                dataSource = null;
            } else {
                dataSource = this.f7611h.get(i);
            }
            return dataSource;
        }

        /* renamed from: D */
        private synchronized DataSource<T> m31977D() {
            return m31978C(this.f7612i);
        }

        /* renamed from: E */
        private void m31976E() {
            Throwable th2;
            if (this.f7614k.incrementAndGet() == this.f7613j && (th2 = this.f7615l) != null) {
                m32008q(th2, this.f7616m);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0022 A[LOOP:0: B:17:0x0020->B:18:0x0022, LOOP_END] */
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m31975F(int r3, com.facebook.datasource.DataSource<T> r4, boolean r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f7612i     // Catch: all -> 0x002f
                com.facebook.datasource.DataSource r1 = r2.m31978C(r3)     // Catch: all -> 0x002f
                if (r4 != r1) goto L_0x002d
                int r4 = r2.f7612i     // Catch: all -> 0x002f
                if (r3 != r4) goto L_0x000e
                goto L_0x002d
            L_0x000e:
                com.facebook.datasource.DataSource r4 = r2.m31977D()     // Catch: all -> 0x002f
                if (r4 == 0) goto L_0x001d
                if (r5 == 0) goto L_0x001b
                int r4 = r2.f7612i     // Catch: all -> 0x002f
                if (r3 >= r4) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r3 = r0
                goto L_0x001f
            L_0x001d:
                r2.f7612i = r3     // Catch: all -> 0x002f
            L_0x001f:
                monitor-exit(r2)     // Catch: all -> 0x002f
            L_0x0020:
                if (r0 <= r3) goto L_0x002c
                com.facebook.datasource.DataSource r4 = r2.m31979B(r0)
                r2.m31968z(r4)
                int r0 = r0 + (-1)
                goto L_0x0020
            L_0x002c:
                return
            L_0x002d:
                monitor-exit(r2)     // Catch: all -> 0x002f
                return
            L_0x002f:
                r3 = move-exception
                monitor-exit(r2)     // Catch: all -> 0x002f
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C4787f.C4788a.m31975F(int, com.facebook.datasource.DataSource, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G */
        public void m31974G(int i, DataSource<T> dataSource) {
            m31968z(m31972I(i, dataSource));
            if (i == 0) {
                this.f7615l = dataSource.mo32019c();
                this.f7616m = dataSource.getExtras();
            }
            m31976E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public void m31973H(int i, DataSource<T> dataSource) {
            boolean z;
            m31975F(i, dataSource, dataSource.mo32020a());
            if (dataSource == m31977D()) {
                if (i != 0 || !dataSource.mo32020a()) {
                    z = false;
                } else {
                    z = true;
                }
                m32004u(null, z, dataSource.getExtras());
            }
            m31976E();
        }

        /* renamed from: I */
        private synchronized DataSource<T> m31972I(int i, DataSource<T> dataSource) {
            if (dataSource == m31977D()) {
                return null;
            }
            if (dataSource != m31978C(i)) {
                return dataSource;
            }
            return m31979B(i);
        }

        /* renamed from: z */
        private void m31968z(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        @Override // com.facebook.datasource.AbstractC4775a, com.facebook.datasource.DataSource
        /* renamed from: b */
        public synchronized boolean mo31971b() {
            boolean z;
            if (C4787f.this.f7610b) {
                m31980A();
            }
            DataSource<T> D = m31977D();
            if (D != null) {
                if (D.mo31971b()) {
                    z = true;
                }
            }
            z = false;
            return z;
        }

        @Override // com.facebook.datasource.AbstractC4775a, com.facebook.datasource.DataSource
        public boolean close() {
            if (C4787f.this.f7610b) {
                m31980A();
            }
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                ArrayList<DataSource<T>> arrayList = this.f7611h;
                this.f7611h = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    m31968z(arrayList.get(i));
                }
                return true;
            }
        }

        @Override // com.facebook.datasource.AbstractC4775a, com.facebook.datasource.DataSource
        /* renamed from: g */
        public synchronized T mo31326g() {
            T t;
            if (C4787f.this.f7610b) {
                m31980A();
            }
            DataSource<T> D = m31977D();
            if (D != null) {
                t = D.mo31326g();
            } else {
                t = null;
            }
            return t;
        }
    }

    private C4787f(List<Supplier<DataSource<T>>> list, boolean z) {
        C13740j.m2838c(!list.isEmpty(), "List of suppliers is empty!");
        this.f7609a = list;
        this.f7610b = z;
    }

    /* renamed from: c */
    public static <T> C4787f<T> m31982c(List<Supplier<DataSource<T>>> list, boolean z) {
        return new C4787f<>(list, z);
    }

    /* renamed from: d */
    public DataSource<T> get() {
        return new C4788a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4787f)) {
            return false;
        }
        return C13736i.m2848a(this.f7609a, ((C4787f) obj).f7609a);
    }

    public int hashCode() {
        return this.f7609a.hashCode();
    }

    public String toString() {
        return C13736i.m2846c(this).m2844b("list", this.f7609a).toString();
    }
}
