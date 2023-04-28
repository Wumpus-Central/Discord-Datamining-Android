package p159ih;

import ph.C11710j;

/* renamed from: ih.j */
/* loaded from: classes8.dex */
public enum EnumC8571j implements C11710j.AbstractC11711a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    

    /* renamed from: p */
    private static C11710j.AbstractC11712b<EnumC8571j> f18773p = new C11710j.AbstractC11712b<EnumC8571j>() { // from class: ih.j.a
        /* renamed from: b */
        public EnumC8571j mo8811a(int i) {
            return EnumC8571j.m19070a(i);
        }
    };

    /* renamed from: k */
    private final int f18775k;

    EnumC8571j(int i, int i2) {
        this.f18775k = i2;
    }

    /* renamed from: a */
    public static EnumC8571j m19070a(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // ph.C11710j.AbstractC11711a
    public final int getNumber() {
        return this.f18775k;
    }
}
