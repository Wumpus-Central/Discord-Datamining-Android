package p349t8;

import java.util.List;
import p119g9.C7570y;
import p317r8.AbstractC12456d;
import p317r8.AbstractC12458f;

/* renamed from: t8.a */
/* loaded from: classes7.dex */
public final class C13002a extends AbstractC12456d {

    /* renamed from: o */
    private final C13003b f29230o;

    public C13002a(List<byte[]> list) {
        super("DvbDecoder");
        C7570y yVar = new C7570y(list.get(0));
        this.f29230o = new C13003b(yVar.m22023J(), yVar.m22023J());
    }

    @Override // p317r8.AbstractC12456d
    /* renamed from: z */
    protected AbstractC12458f mo154z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f29230o.m4747r();
        }
        return new C13011c(this.f29230o.m4763b(bArr, i));
    }
}
