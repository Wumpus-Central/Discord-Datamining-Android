package fi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p087ei.AbstractC6944n;
import p268og.AbstractC11311d1;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p325rh.C12661e;

/* renamed from: fi.l */
/* loaded from: classes8.dex */
public class C7291l extends AbstractC7225b {

    /* renamed from: d */
    private final AbstractC11313e f15772d;

    /* renamed from: e */
    private final List<AbstractC11319f1> f15773e;

    /* renamed from: f */
    private final Collection<AbstractC7267g0> f15774f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7291l(AbstractC11313e eVar, List<? extends AbstractC11319f1> list, Collection<AbstractC7267g0> collection, AbstractC6944n nVar) {
        super(nVar);
        if (eVar == null) {
            m23008v(0);
        }
        if (list == null) {
            m23008v(1);
        }
        if (collection == null) {
            m23008v(2);
        }
        if (nVar == null) {
            m23008v(3);
        }
        this.f15772d = eVar;
        this.f15773e = Collections.unmodifiableList(new ArrayList(list));
        this.f15774f = Collections.unmodifiableCollection(collection);
    }

    /* renamed from: v */
    private static /* synthetic */ void m23008v(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5 || i == 6 || i == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // fi.AbstractC7268g1
    public List<AbstractC11319f1> getParameters() {
        List<AbstractC11319f1> list = this.f15773e;
        if (list == null) {
            m23008v(4);
        }
        return list;
    }

    @Override // fi.AbstractC7257g
    /* renamed from: h */
    protected Collection<AbstractC7267g0> mo6386h() {
        Collection<AbstractC7267g0> collection = this.f15774f;
        if (collection == null) {
            m23008v(6);
        }
        return collection;
    }

    @Override // fi.AbstractC7257g
    /* renamed from: l */
    protected AbstractC11311d1 mo6384l() {
        AbstractC11311d1.C11312a aVar = AbstractC11311d1.C11312a.f25241a;
        if (aVar == null) {
            m23008v(7);
        }
        return aVar;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: q */
    public boolean mo4564q() {
        return true;
    }

    public String toString() {
        return C12661e.m6041m(this.f15772d).m10792b();
    }

    @Override // fi.AbstractC7225b
    /* renamed from: w */
    public AbstractC11313e mo4565p() {
        AbstractC11313e eVar = this.f15772d;
        if (eVar == null) {
            m23008v(5);
        }
        return eVar;
    }
}
