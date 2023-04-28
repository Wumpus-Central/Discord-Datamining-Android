package p159ih;

import ph.C11710j;

/* renamed from: ih.x */
/* loaded from: classes8.dex */
public enum EnumC8624x implements C11710j.AbstractC11711a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    

    /* renamed from: r */
    private static C11710j.AbstractC11712b<EnumC8624x> f19049r = new C11710j.AbstractC11712b<EnumC8624x>() { // from class: ih.x.a
        /* renamed from: b */
        public EnumC8624x mo8811a(int i) {
            return EnumC8624x.m18486a(i);
        }
    };

    /* renamed from: k */
    private final int f19051k;

    EnumC8624x(int i, int i2) {
        this.f19051k = i2;
    }

    /* renamed from: a */
    public static EnumC8624x m18486a(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return PUBLIC;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // ph.C11710j.AbstractC11711a
    public final int getNumber() {
        return this.f19051k;
    }
}
