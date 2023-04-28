package ph;

import java.io.IOException;

/* renamed from: ph.k */
/* loaded from: classes8.dex */
public class C11713k extends IOException {

    /* renamed from: k */
    private AbstractC11724q f26165k = null;

    public C11713k(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C11713k m8809b() {
        return new C11713k("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C11713k m8808c() {
        return new C11713k("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C11713k m8807d() {
        return new C11713k("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C11713k m8806e() {
        return new C11713k("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C11713k m8805f() {
        return new C11713k("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C11713k m8804g() {
        return new C11713k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C11713k m8803h() {
        return new C11713k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C11713k m8801j() {
        return new C11713k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C11713k m8800k() {
        return new C11713k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public AbstractC11724q m8810a() {
        return this.f26165k;
    }

    /* renamed from: i */
    public C11713k m8802i(AbstractC11724q qVar) {
        this.f26165k = qVar;
        return this;
    }
}
