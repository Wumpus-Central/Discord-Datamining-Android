package p145i0;

import android.util.Range;
import p145i0.AbstractC8105a;

/* renamed from: i0.c */
/* loaded from: classes.dex */
final class C8111c extends AbstractC8105a {

    /* renamed from: d */
    private final Range<Integer> f17546d;

    /* renamed from: e */
    private final int f17547e;

    /* renamed from: f */
    private final int f17548f;

    /* renamed from: g */
    private final Range<Integer> f17549g;

    /* renamed from: h */
    private final int f17550h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.c$b */
    /* loaded from: classes.dex */
    public static final class C8113b extends AbstractC8105a.AbstractC0254a {

        /* renamed from: a */
        private Range<Integer> f17551a;

        /* renamed from: b */
        private Integer f17552b;

        /* renamed from: c */
        private Integer f17553c;

        /* renamed from: d */
        private Range<Integer> f17554d;

        /* renamed from: e */
        private Integer f17555e;

        @Override // p145i0.AbstractC8105a.AbstractC0254a
        /* renamed from: a */
        public AbstractC8105a mo20577a() {
            String str = "";
            if (this.f17551a == null) {
                str = str + " bitrate";
            }
            if (this.f17552b == null) {
                str = str + " sourceFormat";
            }
            if (this.f17553c == null) {
                str = str + " source";
            }
            if (this.f17554d == null) {
                str = str + " sampleRate";
            }
            if (this.f17555e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C8111c(this.f17551a, this.f17552b.intValue(), this.f17553c.intValue(), this.f17554d, this.f17555e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p145i0.AbstractC8105a.AbstractC0254a
        /* renamed from: b */
        public AbstractC8105a.AbstractC0254a mo20576b(Range<Integer> range) {
            if (range != null) {
                this.f17551a = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // p145i0.AbstractC8105a.AbstractC0254a
        /* renamed from: c */
        public AbstractC8105a.AbstractC0254a mo20575c(int i) {
            this.f17555e = Integer.valueOf(i);
            return this;
        }

        @Override // p145i0.AbstractC8105a.AbstractC0254a
        /* renamed from: d */
        public AbstractC8105a.AbstractC0254a mo20574d(Range<Integer> range) {
            if (range != null) {
                this.f17554d = range;
                return this;
            }
            throw new NullPointerException("Null sampleRate");
        }

        @Override // p145i0.AbstractC8105a.AbstractC0254a
        /* renamed from: e */
        public AbstractC8105a.AbstractC0254a mo20573e(int i) {
            this.f17553c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public AbstractC8105a.AbstractC0254a m20572f(int i) {
            this.f17552b = Integer.valueOf(i);
            return this;
        }
    }

    @Override // p145i0.AbstractC8105a
    /* renamed from: b */
    public Range<Integer> mo20582b() {
        return this.f17546d;
    }

    @Override // p145i0.AbstractC8105a
    /* renamed from: c */
    public int mo20581c() {
        return this.f17550h;
    }

    @Override // p145i0.AbstractC8105a
    /* renamed from: d */
    public Range<Integer> mo20580d() {
        return this.f17549g;
    }

    @Override // p145i0.AbstractC8105a
    /* renamed from: e */
    public int mo20579e() {
        return this.f17548f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8105a)) {
            return false;
        }
        AbstractC8105a aVar = (AbstractC8105a) obj;
        if (this.f17546d.equals(aVar.mo20582b()) && this.f17547e == aVar.mo20578f() && this.f17548f == aVar.mo20579e() && this.f17549g.equals(aVar.mo20580d()) && this.f17550h == aVar.mo20581c()) {
            return true;
        }
        return false;
    }

    @Override // p145i0.AbstractC8105a
    /* renamed from: f */
    public int mo20578f() {
        return this.f17547e;
    }

    public int hashCode() {
        return ((((((((this.f17546d.hashCode() ^ 1000003) * 1000003) ^ this.f17547e) * 1000003) ^ this.f17548f) * 1000003) ^ this.f17549g.hashCode()) * 1000003) ^ this.f17550h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f17546d + ", sourceFormat=" + this.f17547e + ", source=" + this.f17548f + ", sampleRate=" + this.f17549g + ", channelCount=" + this.f17550h + "}";
    }

    private C8111c(Range<Integer> range, int i, int i2, Range<Integer> range2, int i3) {
        this.f17546d = range;
        this.f17547e = i;
        this.f17548f = i2;
        this.f17549g = range2;
        this.f17550h = i3;
    }
}
