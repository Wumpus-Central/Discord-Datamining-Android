package p145i0;

import android.util.Range;
import p145i0.AbstractC8151j1;

/* renamed from: i0.m */
/* loaded from: classes.dex */
final class C8157m extends AbstractC8151j1 {

    /* renamed from: d */
    private final C8198w f17634d;

    /* renamed from: e */
    private final Range<Integer> f17635e;

    /* renamed from: f */
    private final Range<Integer> f17636f;

    /* renamed from: g */
    private final int f17637g;

    /* renamed from: i0.m$b */
    /* loaded from: classes.dex */
    static final class C8159b extends AbstractC8151j1.AbstractC8152a {

        /* renamed from: a */
        private C8198w f17638a;

        /* renamed from: b */
        private Range<Integer> f17639b;

        /* renamed from: c */
        private Range<Integer> f17640c;

        /* renamed from: d */
        private Integer f17641d;

        @Override // p145i0.AbstractC8151j1.AbstractC8152a
        /* renamed from: a */
        public AbstractC8151j1 mo20504a() {
            String str = "";
            if (this.f17638a == null) {
                str = str + " qualitySelector";
            }
            if (this.f17639b == null) {
                str = str + " frameRate";
            }
            if (this.f17640c == null) {
                str = str + " bitrate";
            }
            if (this.f17641d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C8157m(this.f17638a, this.f17639b, this.f17640c, this.f17641d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p145i0.AbstractC8151j1.AbstractC8152a
        /* renamed from: b */
        AbstractC8151j1.AbstractC8152a mo20503b(int i) {
            this.f17641d = Integer.valueOf(i);
            return this;
        }

        @Override // p145i0.AbstractC8151j1.AbstractC8152a
        /* renamed from: c */
        public AbstractC8151j1.AbstractC8152a mo20502c(Range<Integer> range) {
            if (range != null) {
                this.f17640c = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // p145i0.AbstractC8151j1.AbstractC8152a
        /* renamed from: d */
        public AbstractC8151j1.AbstractC8152a mo20501d(Range<Integer> range) {
            if (range != null) {
                this.f17639b = range;
                return this;
            }
            throw new NullPointerException("Null frameRate");
        }

        @Override // p145i0.AbstractC8151j1.AbstractC8152a
        /* renamed from: e */
        public AbstractC8151j1.AbstractC8152a mo20500e(C8198w wVar) {
            if (wVar != null) {
                this.f17638a = wVar;
                return this;
            }
            throw new NullPointerException("Null qualitySelector");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C8159b() {
        }

        private C8159b(AbstractC8151j1 j1Var) {
            this.f17638a = j1Var.mo20506e();
            this.f17639b = j1Var.mo20507d();
            this.f17640c = j1Var.mo20508c();
            this.f17641d = Integer.valueOf(j1Var.mo20509b());
        }
    }

    @Override // p145i0.AbstractC8151j1
    /* renamed from: b */
    int mo20509b() {
        return this.f17637g;
    }

    @Override // p145i0.AbstractC8151j1
    /* renamed from: c */
    public Range<Integer> mo20508c() {
        return this.f17636f;
    }

    @Override // p145i0.AbstractC8151j1
    /* renamed from: d */
    public Range<Integer> mo20507d() {
        return this.f17635e;
    }

    @Override // p145i0.AbstractC8151j1
    /* renamed from: e */
    public C8198w mo20506e() {
        return this.f17634d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8151j1)) {
            return false;
        }
        AbstractC8151j1 j1Var = (AbstractC8151j1) obj;
        if (!this.f17634d.equals(j1Var.mo20506e()) || !this.f17635e.equals(j1Var.mo20507d()) || !this.f17636f.equals(j1Var.mo20508c()) || this.f17637g != j1Var.mo20509b()) {
            return false;
        }
        return true;
    }

    @Override // p145i0.AbstractC8151j1
    /* renamed from: f */
    public AbstractC8151j1.AbstractC8152a mo20505f() {
        return new C8159b(this);
    }

    public int hashCode() {
        return ((((((this.f17634d.hashCode() ^ 1000003) * 1000003) ^ this.f17635e.hashCode()) * 1000003) ^ this.f17636f.hashCode()) * 1000003) ^ this.f17637g;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f17634d + ", frameRate=" + this.f17635e + ", bitrate=" + this.f17636f + ", aspectRatio=" + this.f17637g + "}";
    }

    private C8157m(C8198w wVar, Range<Integer> range, Range<Integer> range2, int i) {
        this.f17634d = wVar;
        this.f17635e = range;
        this.f17636f = range2;
        this.f17637g = i;
    }
}
