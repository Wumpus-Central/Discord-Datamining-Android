package p159ih;

import ph.C11710j;

/* renamed from: ih.k */
/* loaded from: classes8.dex */
public enum EnumC8573k implements C11710j.AbstractC11711a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    

    /* renamed from: p */
    private static C11710j.AbstractC11712b<EnumC8573k> f18780p = new C11710j.AbstractC11712b<EnumC8573k>() { // from class: ih.k.a
        /* renamed from: b */
        public EnumC8573k mo8811a(int i) {
            return EnumC8573k.m19068a(i);
        }
    };

    /* renamed from: k */
    private final int f18782k;

    EnumC8573k(int i, int i2) {
        this.f18782k = i2;
    }

    /* renamed from: a */
    public static EnumC8573k m19068a(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // ph.C11710j.AbstractC11711a
    public final int getNumber() {
        return this.f18782k;
    }
}
