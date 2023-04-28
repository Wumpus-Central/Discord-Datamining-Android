package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import p319ra.C12543v0;
import p420x9.C13996n;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* loaded from: classes3.dex */
public class Message extends AbstractC14320a implements ReflectedParcelable {
    public static final Parcelable.Creator<Message> CREATOR = new C5432a();

    /* renamed from: q */
    private static final C12543v0[] f10255q = {C12543v0.f28226n};

    /* renamed from: k */
    final int f10256k;

    /* renamed from: l */
    private final byte[] f10257l;

    /* renamed from: m */
    private final String f10258m;

    /* renamed from: n */
    private final String f10259n;
    @Deprecated

    /* renamed from: o */
    final C12543v0[] f10260o;

    /* renamed from: p */
    private final long f10261p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Message(int i, byte[] bArr, String str, String str2, C12543v0[] v0VarArr, long j) {
        this.f10256k = i;
        this.f10258m = (String) C14004p.m2051j(str2);
        this.f10259n = str == null ? "" : str;
        this.f10261p = j;
        C14004p.m2051j(bArr);
        int length = bArr.length;
        C14004p.m2058c(length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), 102400);
        this.f10257l = bArr;
        this.f10260o = (v0VarArr == null || v0VarArr.length == 0) ? f10255q : v0VarArr;
        C14004p.m2058c(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        if (!TextUtils.equals(this.f10259n, message.f10259n) || !TextUtils.equals(this.f10258m, message.f10258m) || !Arrays.equals(this.f10257l, message.f10257l) || this.f10261p != message.f10261p) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C13996n.m2070c(this.f10259n, this.f10258m, Integer.valueOf(Arrays.hashCode(this.f10257l)), Long.valueOf(this.f10261p));
    }

    /* renamed from: p */
    public byte[] m28937p() {
        return this.f10257l;
    }

    /* renamed from: r */
    public String m28936r() {
        return this.f10259n;
    }

    /* renamed from: t */
    public String m28935t() {
        return this.f10258m;
    }

    public String toString() {
        String str = this.f10259n;
        String str2 = this.f10258m;
        byte[] bArr = this.f10257l;
        int length = bArr == null ? 0 : bArr.length;
        return "Message{namespace='" + str + "', type='" + str2 + "', content=[" + length + " bytes]}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m852f(parcel, 1, m28937p(), false);
        C14323c.m842p(parcel, 2, m28935t(), false);
        C14323c.m842p(parcel, 3, m28936r(), false);
        C14323c.m839s(parcel, 4, this.f10260o, i, false);
        C14323c.m845m(parcel, 5, this.f10261p);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f10256k);
        C14323c.m856b(parcel, a);
    }

    public Message(byte[] bArr) {
        this(bArr, "", "", f10255q, 0L);
    }

    public Message(byte[] bArr, String str, String str2, C12543v0[] v0VarArr, long j) {
        this(2, bArr, str, str2, v0VarArr, 0L);
    }
}
