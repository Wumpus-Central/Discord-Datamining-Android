package fk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p326ri.C12694d;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000*\n\u0010\u0005\"\u00020\u00042\u00020\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006*\n\u0010\t\"\u00020\b2\u00020\b¨\u0006\n"}, m15073d2 = {"", "", "b", "a", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/EOFException;", "EOFException", "Ljava/io/IOException;", "IOException", "okio"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: fk.b */
/* loaded from: classes8.dex */
public final class C7354b {
    /* renamed from: a */
    public static final byte[] m22843a(String asUtf8ToByteArray) {
        C9971q.m14633g(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
        byte[] bytes = asUtf8ToByteArray.getBytes(C12694d.f28536b);
        C9971q.m14634f(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final String m22842b(byte[] toUtf8String) {
        C9971q.m14633g(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, C12694d.f28536b);
    }
}
