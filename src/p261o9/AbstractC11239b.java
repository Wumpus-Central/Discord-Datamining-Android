package p261o9;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import ma.C10576i;
import p384v9.AbstractC13468e;
import p384v9.C13456a;

/* renamed from: o9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC11239b extends AbstractC13468e<C13456a.AbstractC13459d.C13461c> {

    /* renamed from: k */
    private static final C13456a.C13464g<C10576i> f25137k;

    /* renamed from: l */
    private static final C13456a.AbstractC0437a<C10576i, C13456a.AbstractC13459d.C13461c> f25138l;

    /* renamed from: m */
    private static final C13456a<C13456a.AbstractC13459d.C13461c> f25139m;

    static {
        C13456a.C13464g<C10576i> gVar = new C13456a.C13464g<>();
        f25137k = gVar;
        C11240c cVar = new C11240c();
        f25138l = cVar;
        f25139m = new C13456a<>("SmsRetriever.API", cVar, gVar);
    }

    public AbstractC11239b(Context context) {
        super(context, f25139m, C13456a.AbstractC13459d.f30065j, AbstractC13468e.C13469a.f30078c);
    }

    /* renamed from: C */
    public abstract Task<Void> mo10370C();
}
