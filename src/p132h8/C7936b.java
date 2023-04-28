package p132h8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5328i;
import java.io.InputStream;
import java.util.List;
import p132h8.AbstractC7935a;

/* renamed from: h8.b */
/* loaded from: classes7.dex */
public final class C7936b<T extends AbstractC7935a<T>> implements C5328i.AbstractC5329a<T> {

    /* renamed from: a */
    private final C5328i.AbstractC5329a<? extends T> f17032a;

    /* renamed from: b */
    private final List<C7937c> f17033b;

    public C7936b(C5328i.AbstractC5329a<? extends T> aVar, List<C7937c> list) {
        this.f17032a = aVar;
        this.f17033b = list;
    }

    /* renamed from: b */
    public T mo7921a(Uri uri, InputStream inputStream) {
        T t = (T) ((AbstractC7935a) this.f17032a.mo7921a(uri, inputStream));
        List<C7937c> list = this.f17033b;
        if (list == null || list.isEmpty()) {
            return t;
        }
        return (T) ((AbstractC7935a) t.mo7928a(this.f17033b));
    }
}
