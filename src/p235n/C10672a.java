package p235n;

import android.os.Bundle;

/* renamed from: n.a */
/* loaded from: classes.dex */
public final class C10672a {

    /* renamed from: a */
    public final Integer f23609a;

    /* renamed from: b */
    public final Integer f23610b;

    /* renamed from: c */
    public final Integer f23611c;

    /* renamed from: d */
    public final Integer f23612d;

    /* renamed from: n.a$a */
    /* loaded from: classes.dex */
    public static final class C0345a {

        /* renamed from: a */
        private Integer f23613a;

        /* renamed from: b */
        private Integer f23614b;

        /* renamed from: c */
        private Integer f23615c;

        /* renamed from: d */
        private Integer f23616d;

        /* renamed from: a */
        public C10672a m12669a() {
            return new C10672a(this.f23613a, this.f23614b, this.f23615c, this.f23616d);
        }

        /* renamed from: b */
        public C0345a m12668b(int i) {
            this.f23615c = Integer.valueOf(i | (-16777216));
            return this;
        }

        /* renamed from: c */
        public C0345a m12667c(int i) {
            this.f23614b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C0345a m12666d(int i) {
            this.f23613a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    C10672a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f23609a = num;
        this.f23610b = num2;
        this.f23611c = num3;
        this.f23612d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle m12670a() {
        Bundle bundle = new Bundle();
        Integer num = this.f23609a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f23610b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f23611c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f23612d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
