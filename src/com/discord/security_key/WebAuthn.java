package com.discord.security_key;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.reactnativecommunity.webview.RNCWebViewManager;
import eg.C6322j;
import ga.C7036a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import p064db.AbstractC5844e;
import p064db.AbstractC5845f;
import p155ia.AbstractC7829i;
import p155ia.C7821f;
import p155ia.C7824g;
import p155ia.C7827h;
import p155ia.C7831j;
import p155ia.C7844o;
import p155ia.C7846p;
import p155ia.C7849q;
import p155ia.C7851r;
import p155ia.C7853s;
import p155ia.C7856t;
import p155ia.C7861v;
import p155ia.EnumC7807b;
import p155ia.EnumC7858u;
import p268of.AbstractC11047p;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0017\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\f\u0010\n\u001a\u00020\u0007*\u00020\bH\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006!"}, m15073d2 = {"Lcom/discord/security_key/WebAuthn;", "", "Lorg/json/JSONArray;", "array", "", "Lia/q;", "parseCredentialDescriptors", "", "", "toBase64", "decodeBase64", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "challenge", "Landroid/app/Activity;", "currentActivity", "register", "authenticate", "Lkotlin/Function1;", "resolve", "Lkotlin/jvm/functions/Function1;", "getResolve", "()Lkotlin/jvm/functions/Function1;", "reject", "getReject", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "security_key_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class WebAuthn {
    private static final int BASE64_FLAG = 11;
    public static final Companion Companion = new Companion(null);
    private static final int REQUEST_CODE_AUTHENTICATE = 4002;
    private static final int REQUEST_CODE_REGISTER = 4001;
    private final Function1<String, Unit> reject;
    private final Function1<String, Unit> resolve;

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/security_key/WebAuthn$Companion;", "", "()V", "BASE64_FLAG", "", "REQUEST_CODE_AUTHENTICATE", "REQUEST_CODE_REGISTER", "security_key_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebAuthn(Function1<? super String, Unit> resolve, Function1<? super String, Unit> reject) {
        C9677q.m14633g(resolve, "resolve");
        C9677q.m14633g(reject, "reject");
        this.resolve = resolve;
        this.reject = reject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void authenticate$lambda$4(Function1 tmp0, Object obj) {
        C9677q.m14633g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void authenticate$lambda$5(WebAuthn this$0, Exception it) {
        C9677q.m14633g(this$0, "this$0");
        C9677q.m14633g(it, "it");
        this$0.reject.invoke("task failed");
    }

    private final byte[] decodeBase64(String str) {
        byte[] decode = Base64.decode(str, 11);
        C9677q.m14634f(decode, "decode(this, BASE64_FLAG)");
        return decode;
    }

    private final List<C7849q> parseCredentialDescriptors(JSONArray jSONArray) {
        IntRange q;
        ArrayList arrayList = new ArrayList();
        q = C6322j.m23947q(0, jSONArray.length());
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((AbstractC11047p) it).nextInt());
            String uVar = EnumC7858u.PUBLIC_KEY.toString();
            String string = jSONObject.getString("id");
            C9677q.m14634f(string, "obj.getString(\"id\")");
            arrayList.add(new C7849q(uVar, decodeBase64(string), null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$2(Function1 tmp0, Object obj) {
        C9677q.m14633g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$3(WebAuthn this$0, Exception it) {
        C9677q.m14633g(this$0, "this$0");
        C9677q.m14633g(it, "it");
        this$0.reject.invoke("task failed");
    }

    private final String toBase64(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 11);
        C9677q.m14634f(encodeToString, "encodeToString(this, BASE64_FLAG)");
        return encodeToString;
    }

    public final void authenticate(String challenge, Activity activity) {
        C9677q.m14633g(challenge, "challenge");
        C7853s.C7854a aVar = new C7853s.C7854a();
        JSONObject jSONObject = new JSONObject(new JSONTokener(challenge)).getJSONObject("publicKey");
        String string = jSONObject.getString("challenge");
        C9677q.m14634f(string, "obj.getString(\"challenge\")");
        aVar.m19902c(decodeBase64(string));
        JSONArray jSONArray = jSONObject.getJSONArray("allowCredentials");
        C9677q.m14634f(jSONArray, "obj.getJSONArray(\"allowCredentials\")");
        aVar.m19903b(parseCredentialDescriptors(jSONArray));
        aVar.m19901d(jSONObject.getString("rpId"));
        aVar.m19900e(Double.valueOf(jSONObject.getDouble("timeout") / ((double) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)));
        Task<PendingIntent> D = C7036a.m21977a(activity).m20977D(aVar.m19904a());
        final WebAuthn$authenticate$1 webAuthn$authenticate$1 = new WebAuthn$authenticate$1(activity);
        D.mo28867f(new AbstractC5845f() { // from class: com.discord.security_key.c
            @Override // p064db.AbstractC5845f
            /* renamed from: a */
            public final void mo25576a(Object obj) {
                WebAuthn.authenticate$lambda$4(Function1.this, obj);
            }
        });
        D.mo28869d(new AbstractC5844e() { // from class: com.discord.security_key.d
            @Override // p064db.AbstractC5844e
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

    public final void onActivityResult(int i, int i2, Intent intent) {
        byte[] bArr;
        if (i != 4001 && i != REQUEST_CODE_AUTHENTICATE) {
            return;
        }
        if (i2 != -1) {
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
        C7844o p = C7844o.m19931p(bArr);
        if (p.m19928u() instanceof C7827h) {
            Function1<String, Unit> function1 = this.reject;
            AbstractC7829i u = p.m19928u();
            C9677q.m14635e(u, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse");
            String t = ((C7827h) u).m19943t();
            C9677q.m14636d(t);
            function1.invoke(t);
        } else if (i == 4001) {
            byte[] t2 = p.m19929t();
            C9677q.m14634f(t2, "credential.rawId");
            String base64 = toBase64(t2);
            AbstractC7829i u2 = p.m19928u();
            C9677q.m14635e(u2, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse");
            C7824g gVar = (C7824g) u2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", base64);
            jSONObject.put("rawId", base64);
            jSONObject.put("type", EnumC7858u.PUBLIC_KEY.toString());
            JSONObject jSONObject2 = new JSONObject();
            byte[] p2 = gVar.mo19942p();
            C9677q.m14634f(p2, "response.clientDataJSON");
            jSONObject2.put("clientDataJSON", toBase64(p2));
            byte[] r = gVar.m19948r();
            C9677q.m14634f(r, "response.attestationObject");
            jSONObject2.put("attestationObject", toBase64(r));
            jSONObject.put("response", jSONObject2);
            Function1<String, Unit> function12 = this.resolve;
            String jSONObject3 = jSONObject.toString();
            C9677q.m14634f(jSONObject3, "obj.toString()");
            function12.invoke(jSONObject3);
        } else if (i == REQUEST_CODE_AUTHENTICATE) {
            byte[] t3 = p.m19929t();
            C9677q.m14634f(t3, "credential.rawId");
            String base642 = toBase64(t3);
            AbstractC7829i u3 = p.m19928u();
            C9677q.m14635e(u3, "null cannot be cast to non-null type com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse");
            C7821f fVar = (C7821f) u3;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("id", base642);
            jSONObject4.put("rawId", base642);
            jSONObject4.put("type", EnumC7858u.PUBLIC_KEY.toString());
            JSONObject jSONObject5 = new JSONObject();
            byte[] p3 = fVar.mo19942p();
            C9677q.m14634f(p3, "response.clientDataJSON");
            jSONObject5.put("clientDataJSON", toBase64(p3));
            byte[] r2 = fVar.m19953r();
            C9677q.m14634f(r2, "response.authenticatorData");
            jSONObject5.put("authenticatorData", toBase64(r2));
            byte[] u4 = fVar.m19951u();
            C9677q.m14634f(u4, "response.signature");
            jSONObject5.put("signature", toBase64(u4));
            byte[] z = fVar.m19950z();
            if (z != null) {
                jSONObject5.put("userHandle", toBase64(z));
            }
            jSONObject4.put("response", jSONObject5);
            Function1<String, Unit> function13 = this.resolve;
            String jSONObject6 = jSONObject4.toString();
            C9677q.m14634f(jSONObject6, "obj.toString()");
            function13.invoke(jSONObject6);
        }
    }

    public final void register(String challenge, Activity activity) {
        IntRange q;
        C9677q.m14633g(challenge, "challenge");
        C7846p.C7847a aVar = new C7846p.C7847a();
        JSONObject jSONObject = new JSONObject(new JSONTokener(challenge));
        String string = jSONObject.getJSONObject("user").getString("id");
        C9677q.m14634f(string, "obj.getJSONObject(\"user\").getString(\"id\")");
        aVar.m19913h(new C7861v(decodeBase64(string), jSONObject.getJSONObject("user").getString("name"), null, jSONObject.getJSONObject("user").getString("displayName")));
        String string2 = jSONObject.getString("challenge");
        C9677q.m14634f(string2, "obj.getString(\"challenge\")");
        aVar.m19918c(decodeBase64(string2));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        q = C6322j.m23947q(0, jSONArray.length());
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(((AbstractC11047p) it).nextInt());
            arrayList.add(new C7851r(jSONObject2.getString("type"), jSONObject2.getInt("alg")));
        }
        aVar.m19916e(arrayList);
        aVar.m19914g(Double.valueOf(jSONObject.getDouble("timeout") / ((double) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)));
        JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
        C9677q.m14634f(jSONArray2, "obj.getJSONArray(\"excludeCredentials\")");
        aVar.m19917d(parseCredentialDescriptors(jSONArray2));
        C7831j.C7832a aVar2 = new C7831j.C7832a();
        aVar2.m19938b(EnumC7807b.m19963a(jSONObject.getJSONObject("authenticatorSection").getString("authenticatorAttachment")));
        aVar.m19919b(aVar2.m19939a());
        aVar.m19915f(new C7856t(jSONObject.getJSONObject("rp").getString("id"), jSONObject.getJSONObject("rp").getString("name"), null));
        Task<PendingIntent> C = C7036a.m21977a(activity).m20978C(aVar.m19920a());
        final WebAuthn$register$2 webAuthn$register$2 = new WebAuthn$register$2(activity);
        C.mo28867f(new AbstractC5845f() { // from class: com.discord.security_key.a
            @Override // p064db.AbstractC5845f
            /* renamed from: a */
            public final void mo25576a(Object obj) {
                WebAuthn.register$lambda$2(Function1.this, obj);
            }
        });
        C.mo28869d(new AbstractC5844e() { // from class: com.discord.security_key.b
            @Override // p064db.AbstractC5844e
            public final void onFailure(Exception exc) {
                WebAuthn.register$lambda$3(WebAuthn.this, exc);
            }
        });
    }
}
