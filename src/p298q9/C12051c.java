package p298q9;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: q9.c */
/* loaded from: classes5.dex */
public final /* synthetic */ class C12051c implements Comparator {

    /* renamed from: k */
    public static final /* synthetic */ C12051c f27084k = new C12051c();

    private /* synthetic */ C12051c() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).m29115p().compareTo(((Scope) obj2).m29115p());
    }
}
