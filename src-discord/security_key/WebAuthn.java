package com.discord.security_key;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Base64;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.google.android.gms.tasks.Task;
import com.reactnativecommunity.webview.RNCWebViewManager;
import fa.e;
import fa.f;
import gf.p;
import i9.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.b;
import k9.g;
import k9.h;
import k9.i;
import k9.j;
import k9.o;
import k9.p;
import k9.r;
import k9.s;
import k9.t;
import k9.u;
import k9.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import wf.j;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0017\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\f\u0010\n\u001a\u00020\u0007*\u00020\bH\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006!"}, d2 = {"Lcom/discord/security_key/WebAuthn;", "", "Lorg/json/JSONArray;", "array", "", "Lk9/q;", "parseCredentialDescriptors", "", "", "toBase64", "decodeBase64", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "challenge", "Landroid/app/Activity;", "currentActivity", "register", "authenticate", "Lkotlin/Function1;", "resolve", "Lkotlin/jvm/functions/Function1;", "getResolve", "()Lkotlin/jvm/functions/Function1;", "reject", "getReject", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "security_key_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class WebAuthn {
    private static final int BASE64_FLAG = 11;
    public static final Companion Companion = new Companion(null);
    private static final int REQUEST_CODE_AUTHENTICATE = 4002;
    private static final int REQUEST_CODE_REGISTER = 4001;
    private final Function1<String, Unit> reject;
    private final Function1<String, Unit> resolve;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/discord/security_key/WebAuthn$Companion;", "", "()V", "BASE64_FLAG", "", "REQUEST_CODE_AUTHENTICATE", "REQUEST_CODE_REGISTER", "security_key_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebAuthn(Function1<? super String, Unit> resolve, Function1<? super String, Unit> reject) {
        q.g(resolve, "resolve");
        q.g(reject, "reject");
        this.resolve = resolve;
        this.reject = reject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void authenticate$lambda$4(Function1 tmp0, Object obj) {
        q.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void authenticate$lambda$5(WebAuthn this$0, Exception it) {
        q.g(this$0, "this$0");
        q.g(it, "it");
        this$0.reject.invoke("task failed");
    }

    private final byte[] decodeBase64(String str) {
        byte[] decode = Base64.decode(str, 11);
        q.f(decode, "decode(this, BASE64_FLAG)");
        return decode;
    }

    private final List<k9.q> parseCredentialDescriptors(JSONArray jSONArray) {
        IntRange p10;
        ArrayList arrayList = new ArrayList();
        p10 = j.p(0, jSONArray.length());
        Iterator<Integer> it = p10.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((p) it).nextInt());
            String uVar = u.PUBLIC_KEY.toString();
            String string = jSONObject.getString("id");
            q.f(string, "obj.getString(\"id\")");
            arrayList.add(new k9.q(uVar, decodeBase64(string), null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$2(Function1 tmp0, Object obj) {
        q.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$3(WebAuthn this$0, Exception it) {
        q.g(this$0, "this$0");
        q.g(it, "it");
        this$0.reject.invoke("task failed");
    }

    private final String toBase64(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 11);
        q.f(encodeToString, "encodeToString(this, BASE64_FLAG)");
        return encodeToString;
    }

    public final void authenticate(String challenge, Activity activity) {
        q.g(challenge, "challenge");
        s.a aVar = new s.a();
        JSONObject jSONObject = new JSONObject(new JSONTokener(challenge)).getJSONObject("publicKey");
        String string = jSONObject.getString("challenge");
        q.f(string, "obj.getString(\"challenge\")");
        aVar.c(decodeBase64(string));
        JSONArray jSONArray = jSONObject.getJSONArray("allowCredentials");
        q.f(jSONArray, "obj.getJSONArray(\"allowCredentials\")");
        aVar.b(parseCredentialDescriptors(jSONArray));
        aVar.d(jSONObject.getString("rpId"));
        aVar.e(Double.valueOf(jSONObject.getDouble("timeout") / ((double) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)));
        Task<PendingIntent> D = a.a(activity).D(aVar.a());
        final WebAuthn$authenticate$1 webAuthn$authenticate$1 = new WebAuthn$authenticate$1(activity);
        D.f(new f() { // from class: com.discord.security_key.c
            @Override // fa.f
            public final void b(Object obj) {
                WebAuthn.authenticate$lambda$4(Function1.this, obj);
            }
        });
        D.d(new e() { // from class: com.discord.security_key.d
            @Override // fa.e
            public final void onFailure(Exception exc) {
                WebAuthn.authenticate$lambda$5(WebAuthn.this, exc);
            }
        });
    }

    public final Function1<String, Unit> getReject() {
        return this.reject;
    }

    public final Function1<String, Unit> getResolve() {
        return this.resolve;
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        byte[] bArr;
        if (i10 != 4001 && i10 != REQUEST_CODE_AUTHENTICATE) {
            return;
        }
        if (i11 != -1) {
            this.reject.invoke("activity failed");
            return;
        }
        if (intent != null) {
            bArr = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
        } else {
            bArr = null;
        }
        if (bArr == null) {
            this.reject.invoke("credential data missing");
            return;
        }
        o n10 = o.n(bArr);
        if (n10.u() instanceof h) {
            Function1<String, Unit> function1 = this.reject;
            i u10 = n10.u();
            q.e(u10, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse");
            String r10 = ((h) u10).r();
            q.d(r10);
            function1.invoke(r10);
        } else if (i10 == 4001) {
            byte[] r11 = n10.r();
            q.f(r11, "credential.rawId");
            String base64 = toBase64(r11);
            i u11 = n10.u();
            q.e(u11, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse");
            g gVar = (g) u11;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", base64);
            jSONObject.put("rawId", base64);
            jSONObject.put("type", u.PUBLIC_KEY.toString());
            JSONObject jSONObject2 = new JSONObject();
            byte[] n11 = gVar.n();
            q.f(n11, "response.clientDataJSON");
            jSONObject2.put("clientDataJSON", toBase64(n11));
            byte[] q10 = gVar.q();
            q.f(q10, "response.attestationObject");
            jSONObject2.put("attestationObject", toBase64(q10));
            jSONObject.put("response", jSONObject2);
            Function1<String, Unit> function12 = this.resolve;
            String jSONObject3 = jSONObject.toString();
            q.f(jSONObject3, "obj.toString()");
            function12.invoke(jSONObject3);
        } else if (i10 == REQUEST_CODE_AUTHENTICATE) {
            byte[] r12 = n10.r();
            q.f(r12, "credential.rawId");
            String base642 = toBase64(r12);
            i u12 = n10.u();
            q.e(u12, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse");
            k9.f fVar = (k9.f) u12;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("id", base642);
            jSONObject4.put("rawId", base642);
            jSONObject4.put("type", u.PUBLIC_KEY.toString());
            JSONObject jSONObject5 = new JSONObject();
            byte[] n12 = fVar.n();
            q.f(n12, "response.clientDataJSON");
            jSONObject5.put("clientDataJSON", toBase64(n12));
            byte[] q11 = fVar.q();
            q.f(q11, "response.authenticatorData");
            jSONObject5.put("authenticatorData", toBase64(q11));
            byte[] u13 = fVar.u();
            q.f(u13, "response.signature");
            jSONObject5.put("signature", toBase64(u13));
            byte[] w10 = fVar.w();
            if (w10 != null) {
                jSONObject5.put("userHandle", toBase64(w10));
            }
            jSONObject4.put("response", jSONObject5);
            Function1<String, Unit> function13 = this.resolve;
            String jSONObject6 = jSONObject4.toString();
            q.f(jSONObject6, "obj.toString()");
            function13.invoke(jSONObject6);
        }
    }

    public final void register(String challenge, Activity activity) {
        IntRange p10;
        q.g(challenge, "challenge");
        p.a aVar = new p.a();
        JSONObject jSONObject = new JSONObject(new JSONTokener(challenge));
        String string = jSONObject.getJSONObject("user").getString("id");
        q.f(string, "obj.getJSONObject(\"user\").getString(\"id\")");
        aVar.h(new v(decodeBase64(string), jSONObject.getJSONObject("user").getString(ZeroconfModule.KEY_SERVICE_NAME), null, jSONObject.getJSONObject("user").getString("displayName")));
        String string2 = jSONObject.getString("challenge");
        q.f(string2, "obj.getString(\"challenge\")");
        aVar.c(decodeBase64(string2));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        p10 = j.p(0, jSONArray.length());
        Iterator<Integer> it = p10.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(((gf.p) it).nextInt());
            arrayList.add(new r(jSONObject2.getString("type"), jSONObject2.getInt("alg")));
        }
        aVar.e(arrayList);
        aVar.g(Double.valueOf(jSONObject.getDouble("timeout") / ((double) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)));
        JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
        q.f(jSONArray2, "obj.getJSONArray(\"excludeCredentials\")");
        aVar.d(parseCredentialDescriptors(jSONArray2));
        j.a aVar2 = new j.a();
        aVar2.b(b.a(jSONObject.getJSONObject("authenticatorSection").getString("authenticatorAttachment")));
        aVar.b(aVar2.a());
        aVar.f(new t(jSONObject.getJSONObject("rp").getString("id"), jSONObject.getJSONObject("rp").getString(ZeroconfModule.KEY_SERVICE_NAME), null));
        Task<PendingIntent> C = a.a(activity).C(aVar.a());
        final WebAuthn$register$2 webAuthn$register$2 = new WebAuthn$register$2(activity);
        C.f(new f() { // from class: com.discord.security_key.a
            @Override // fa.f
            public final void b(Object obj) {
                WebAuthn.register$lambda$2(Function1.this, obj);
            }
        });
        C.d(new e() { // from class: com.discord.security_key.b
            @Override // fa.e
            public final void onFailure(Exception exc) {
                WebAuthn.register$lambda$3(WebAuthn.this, exc);
            }
        });
    }
}
