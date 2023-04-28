package p459z7;

import java.nio.ByteBuffer;
import p119g9.C7510a;

/* renamed from: z7.h */
/* loaded from: classes7.dex */
public abstract class AbstractC14585h implements AbstractC14579c {
    @Override // p459z7.AbstractC14579c
    /* renamed from: a */
    public final C14576a mo162a(C14582e eVar) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) C7510a.m22367e(eVar.f17798m);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        if (eVar.m20300j()) {
            return null;
        }
        return mo161b(eVar, byteBuffer);
    }

    /* renamed from: b */
    protected abstract C14576a mo161b(C14582e eVar, ByteBuffer byteBuffer);
}
