package p268og;

import java.util.Collection;

/* renamed from: og.b */
/* loaded from: classes8.dex */
public interface AbstractC11301b extends AbstractC11297a, AbstractC11310d0 {

    /* renamed from: og.b$a */
    /* loaded from: classes8.dex */
    public enum EnumC11302a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: a */
        public boolean m10224a() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* renamed from: B0 */
    void mo6272B0(Collection<? extends AbstractC11301b> collection);

    /* renamed from: E0 */
    AbstractC11301b mo6270E0(AbstractC11346m mVar, EnumC11314e0 e0Var, AbstractC11387u uVar, EnumC11302a aVar, boolean z);

    @Override // p268og.AbstractC11297a, p268og.AbstractC11346m
    /* renamed from: a */
    AbstractC11301b mo6162a();

    @Override // p268og.AbstractC11297a
    /* renamed from: d */
    Collection<? extends AbstractC11301b> mo6249d();

    /* renamed from: g */
    EnumC11302a mo6245g();
}
