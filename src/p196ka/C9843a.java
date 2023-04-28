package p196ka;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ka.a */
/* loaded from: classes3.dex */
public class C9843a implements IInterface {

    /* renamed from: a */
    private final IBinder f21963a;

    /* renamed from: b */
    private final String f21964b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C9843a(IBinder iBinder, String str) {
        this.f21963a = iBinder;
        this.f21964b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21963a;
    }
}
