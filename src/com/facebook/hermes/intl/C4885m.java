package com.facebook.hermes.intl;

import android.icu.text.Collator;
import android.icu.text.RuleBasedCollator;
import com.facebook.hermes.intl.AbstractC4845a;
import p129h5.AbstractC7805b;
import p129h5.C7840i;
import p129h5.C7915x;

/* renamed from: com.facebook.hermes.intl.m */
/* loaded from: classes7.dex */
public class C4885m implements AbstractC4845a {

    /* renamed from: a */
    private RuleBasedCollator f8088a = null;

    /* renamed from: com.facebook.hermes.intl.m$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C4886a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8089a;

        /* renamed from: b */
        static final /* synthetic */ int[] f8090b;

        static {
            int[] iArr = new int[AbstractC4845a.EnumC4846b.values().length];
            f8090b = iArr;
            try {
                iArr[AbstractC4845a.EnumC4846b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8090b[AbstractC4845a.EnumC4846b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8090b[AbstractC4845a.EnumC4846b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC4845a.EnumC4847c.values().length];
            f8089a = iArr2;
            try {
                iArr2[AbstractC4845a.EnumC4847c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8089a[AbstractC4845a.EnumC4847c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8089a[AbstractC4845a.EnumC4847c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8089a[AbstractC4845a.EnumC4847c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: a */
    public int mo31563a(String str, String str2) {
        int compare;
        compare = this.f8088a.compare(str, str2);
        return compare;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: b */
    public AbstractC4845a mo31562b(AbstractC7805b<?> bVar) {
        Collator instance;
        instance = RuleBasedCollator.getInstance(((C7915x) bVar).mo21162h());
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) instance;
        this.f8088a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: c */
    public AbstractC4845a.EnumC4847c mo31561c() {
        int strength;
        boolean isCaseLevel;
        RuleBasedCollator ruleBasedCollator = this.f8088a;
        if (ruleBasedCollator == null) {
            return AbstractC4845a.EnumC4847c.LOCALE;
        }
        strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            isCaseLevel = this.f8088a.isCaseLevel();
            if (isCaseLevel) {
                return AbstractC4845a.EnumC4847c.CASE;
            }
            return AbstractC4845a.EnumC4847c.BASE;
        } else if (strength == 1) {
            return AbstractC4845a.EnumC4847c.ACCENT;
        } else {
            return AbstractC4845a.EnumC4847c.VARIANT;
        }
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: d */
    public AbstractC4845a mo31560d(boolean z) {
        if (z) {
            this.f8088a.setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: e */
    public AbstractC4845a mo31559e(AbstractC4845a.EnumC4846b bVar) {
        int i = C4886a.f8090b[bVar.ordinal()];
        if (i == 1) {
            this.f8088a.setUpperCaseFirst(true);
        } else if (i != 2) {
            this.f8088a.setCaseFirstDefault();
        } else {
            this.f8088a.setLowerCaseFirst(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: f */
    public AbstractC4845a mo31558f(boolean z) {
        if (z) {
            this.f8088a.setNumericCollation(C7840i.m21254e(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: g */
    public AbstractC4845a mo31557g(AbstractC4845a.EnumC4847c cVar) {
        int i = C4886a.f8089a[cVar.ordinal()];
        if (i == 1) {
            this.f8088a.setStrength(0);
        } else if (i == 2) {
            this.f8088a.setStrength(1);
        } else if (i == 3) {
            this.f8088a.setStrength(0);
            this.f8088a.setCaseLevel(true);
        } else if (i == 4) {
            this.f8088a.setStrength(2);
        }
        return this;
    }
}
