package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.List;
import p359u3.C13182a;
import p394w3.C13736i;
import p394w3.C13740j;

/* renamed from: com.facebook.datasource.e */
/* loaded from: classes7.dex */
public class C4783e<T> implements Supplier<DataSource<T>> {

    /* renamed from: a */
    private final List<Supplier<DataSource<T>>> f7603a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.datasource.e$b */
    /* loaded from: classes7.dex */
    public class C4785b extends AbstractC4775a<T> {

        /* renamed from: h */
        private int f7604h = 0;

        /* renamed from: i */
        private DataSource<T> f7605i = null;

        /* renamed from: j */
        private DataSource<T> f7606j = null;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.facebook.datasource.e$b$a */
        /* loaded from: classes7.dex */
        public class C4786a implements AbstractC4782d<T> {
            private C4786a() {
            }

            @Override // com.facebook.datasource.AbstractC4782d
            public void onCancellation(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.AbstractC4782d
            public void onFailure(DataSource<T> dataSource) {
                C4785b.this.m31991E(dataSource);
            }

            @Override // com.facebook.datasource.AbstractC4782d
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.mo31971b()) {
                    C4785b.this.m31990F(dataSource);
                } else if (dataSource.mo32020a()) {
                    C4785b.this.m31991E(dataSource);
                }
            }

            @Override // com.facebook.datasource.AbstractC4782d
            public void onProgressUpdate(DataSource<T> dataSource) {
                C4785b.this.m32006s(Math.max(C4785b.this.mo32017e(), dataSource.mo32017e()));
            }
        }

        public C4785b() {
            if (!m31988H()) {
                mo31967p(new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* renamed from: A */
        private void m31995A(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        /* renamed from: B */
        private synchronized DataSource<T> m31994B() {
            return this.f7606j;
        }

        /* renamed from: C */
        private synchronized Supplier<DataSource<T>> m31993C() {
            if (m32013k() || this.f7604h >= C4783e.this.f7603a.size()) {
                return null;
            }
            List list = C4783e.this.f7603a;
            int i = this.f7604h;
            this.f7604h = i + 1;
            return (Supplier) list.get(i);
        }

        /* renamed from: D */
        private void m31992D(DataSource<T> dataSource, boolean z) {
            DataSource<T> dataSource2;
            synchronized (this) {
                if (dataSource == this.f7605i && dataSource != (dataSource2 = this.f7606j)) {
                    if (dataSource2 != null && !z) {
                        dataSource2 = null;
                        m31995A(dataSource2);
                    }
                    this.f7606j = dataSource;
                    m31995A(dataSource2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public void m31991E(DataSource<T> dataSource) {
            if (m31985z(dataSource)) {
                if (dataSource != m31994B()) {
                    m31995A(dataSource);
                }
                if (!m31988H()) {
                    m32008q(dataSource.mo32019c(), dataSource.getExtras());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public void m31990F(DataSource<T> dataSource) {
            m31992D(dataSource, dataSource.mo32020a());
            if (dataSource == m31994B()) {
                m32004u(null, dataSource.mo32020a(), dataSource.getExtras());
            }
        }

        /* renamed from: G */
        private synchronized boolean m31989G(DataSource<T> dataSource) {
            if (m32013k()) {
                return false;
            }
            this.f7605i = dataSource;
            return true;
        }

        /* renamed from: H */
        private boolean m31988H() {
            DataSource<T> dataSource;
            Supplier<DataSource<T>> C = m31993C();
            if (C != null) {
                dataSource = C.get();
            } else {
                dataSource = null;
            }
            if (!m31989G(dataSource) || dataSource == null) {
                m31995A(dataSource);
                return false;
            }
            dataSource.mo32018d(new C4786a(), C13182a.m4396a());
            return true;
        }

        /* renamed from: z */
        private synchronized boolean m31985z(DataSource<T> dataSource) {
            if (!m32013k() && dataSource == this.f7605i) {
                this.f7605i = null;
                return true;
            }
            return false;
        }

        @Override // com.facebook.datasource.AbstractC4775a, com.facebook.datasource.DataSource
        /* renamed from: b */
        public synchronized boolean mo31971b() {
            boolean z;
            DataSource<T> B = m31994B();
            if (B != null) {
                if (B.mo31971b()) {
                    z = true;
                }
            }
            z = false;
            return z;
        }

        @Override // com.facebook.datasource.AbstractC4775a, com.facebook.datasource.DataSource
        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                DataSource<T> dataSource = this.f7605i;
                this.f7605i = null;
                DataSource<T> dataSource2 = this.f7606j;
                this.f7606j = null;
                m31995A(dataSource2);
                m31995A(dataSource);
                return true;
            }
        }

        @Override // com.facebook.datasource.AbstractC4775a, com.facebook.datasource.DataSource
        /* renamed from: g */
        public synchronized T mo31326g() {
            T t;
            DataSource<T> B = m31994B();
            if (B != null) {
                t = B.mo31326g();
            } else {
                t = null;
            }
            return t;
        }
    }

    private C4783e(List<Supplier<DataSource<T>>> list) {
        C13740j.m2838c(!list.isEmpty(), "List of suppliers is empty!");
        this.f7603a = list;
    }

    /* renamed from: b */
    public static <T> C4783e<T> m31997b(List<Supplier<DataSource<T>>> list) {
        return new C4783e<>(list);
    }

    /* renamed from: c */
    public DataSource<T> get() {
        return new C4785b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4783e)) {
            return false;
        }
        return C13736i.m2848a(this.f7603a, ((C4783e) obj).f7603a);
    }

    public int hashCode() {
        return this.f7603a.hashCode();
    }

    public String toString() {
        return C13736i.m2846c(this).m2844b("list", this.f7603a).toString();
    }
}
