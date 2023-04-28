package p028b8;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p119g9.C7510a;
import p119g9.C7570y;
import p459z7.AbstractC14585h;
import p459z7.C14576a;
import p459z7.C14582e;

/* renamed from: b8.b */
/* loaded from: classes7.dex */
public final class C3397b extends AbstractC14585h {
    @Override // p459z7.AbstractC14585h
    /* renamed from: b */
    protected C14576a mo161b(C14582e eVar, ByteBuffer byteBuffer) {
        return new C14576a(m34518c(new C7570y(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public C3396a m34518c(C7570y yVar) {
        return new C3396a((String) C7510a.m22367e(yVar.m21992x()), (String) C7510a.m22367e(yVar.m21992x()), yVar.m22027F(), yVar.m22027F(), Arrays.copyOfRange(yVar.m22012d(), yVar.m22011e(), yVar.m22010f()));
    }
}
