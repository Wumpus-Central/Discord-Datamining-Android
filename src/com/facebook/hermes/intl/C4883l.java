package com.facebook.hermes.intl;

import com.facebook.hermes.intl.AbstractC4845a;
import java.text.Collator;
import java.text.RuleBasedCollator;
import p129h5.AbstractC7805b;

/* renamed from: com.facebook.hermes.intl.l */
/* loaded from: classes7.dex */
public class C4883l implements AbstractC4845a {

    /* renamed from: a */
    private RuleBasedCollator f8085a;

    /* renamed from: b */
    private C4877h f8086b;

    /* renamed from: com.facebook.hermes.intl.l$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C4884a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8087a;

        static {
            int[] iArr = new int[AbstractC4845a.EnumC4847c.values().length];
            f8087a = iArr;
            try {
                iArr[AbstractC4845a.EnumC4847c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8087a[AbstractC4845a.EnumC4847c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8087a[AbstractC4845a.EnumC4847c.VARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8087a[AbstractC4845a.EnumC4847c.CASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: a */
    public int mo31563a(String str, String str2) {
        return this.f8085a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: b */
    public AbstractC4845a mo31562b(AbstractC7805b<?> bVar) {
        C4877h hVar = (C4877h) bVar;
        this.f8086b = hVar;
        this.f8085a = (RuleBasedCollator) Collator.getInstance(hVar.mo21162h());
        return this;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: c */
    public AbstractC4845a.EnumC4847c mo31561c() {
        RuleBasedCollator ruleBasedCollator = this.f8085a;
        if (ruleBasedCollator == null) {
            return AbstractC4845a.EnumC4847c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return AbstractC4845a.EnumC4847c.BASE;
        }
        if (strength == 1) {
            return AbstractC4845a.EnumC4847c.ACCENT;
        }
        return AbstractC4845a.EnumC4847c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: d */
    public AbstractC4845a mo31560d(boolean z) {
        return this;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: e */
    public AbstractC4845a mo31559e(AbstractC4845a.EnumC4846b bVar) {
        return this;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: f */
    public AbstractC4845a mo31558f(boolean z) {
        return this;
    }

    @Override // com.facebook.hermes.intl.AbstractC4845a
    /* renamed from: g */
    public AbstractC4845a mo31557g(AbstractC4845a.EnumC4847c cVar) {
        int i = C4884a.f8087a[cVar.ordinal()];
        if (i == 1) {
            this.f8085a.setStrength(0);
        } else if (i == 2) {
            this.f8085a.setStrength(1);
        } else if (i == 3) {
            this.f8085a.setStrength(2);
        } else if (i == 4) {
            this.f8085a.setStrength(0);
        }
        return this;
    }
}
