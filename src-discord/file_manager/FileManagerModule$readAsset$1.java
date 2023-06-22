package com.discord.file_manager;

import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.file_manager.FileManagerModule$readAsset$1", f = "FileManagerModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class FileManagerModule$readAsset$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $assetUri;
    final /* synthetic */ String $encoding;
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ FileManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$readAsset$1(String str, FileManagerModule fileManagerModule, String str2, Promise promise, Continuation<? super FileManagerModule$readAsset$1> continuation) {
        super(2, continuation);
        this.$assetUri = str;
        this.this$0 = fileManagerModule;
        this.$encoding = str2;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$readAsset$1(this.$assetUri, this.this$0, this.$encoding, this.$promise, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$readAsset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22113a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[Catch: all -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00ca, blocks: (B:5:0x000a, B:7:0x0016, B:12:0x0025, B:14:0x002d, B:15:0x0039, B:18:0x0042, B:21:0x004c, B:23:0x0055, B:24:0x005b, B:26:0x0061, B:27:0x007d, B:28:0x0088, B:29:0x0089, B:34:0x00a6, B:36:0x00b3, B:37:0x00be, B:39:0x00c2, B:40:0x00c6, B:32:0x0094), top: B:47:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:5:0x000a, B:7:0x0016, B:12:0x0025, B:14:0x002d, B:15:0x0039, B:18:0x0042, B:21:0x004c, B:23:0x0055, B:24:0x005b, B:26:0x0061, B:27:0x007d, B:28:0x0088, B:29:0x0089, B:34:0x00a6, B:36:0x00b3, B:37:0x00be, B:39:0x00c2, B:40:0x00c6, B:32:0x0094), top: B:47:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:5:0x000a, B:7:0x0016, B:12:0x0025, B:14:0x002d, B:15:0x0039, B:18:0x0042, B:21:0x004c, B:23:0x0055, B:24:0x005b, B:26:0x0061, B:27:0x007d, B:28:0x0088, B:29:0x0089, B:34:0x00a6, B:36:0x00b3, B:37:0x00be, B:39:0x00c2, B:40:0x00c6, B:32:0x0094), top: B:47:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            qg.b.d()
            int r0 = r6.label
            if (r0 != 0) goto L_0x00d3
            kg.t.b(r7)
            java.lang.String r7 = r6.$assetUri     // Catch: all -> 0x00ca
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: all -> 0x00ca
            java.lang.String r0 = r7.getScheme()     // Catch: all -> 0x00ca
            if (r0 == 0) goto L_0x0089
            int r1 = r0.hashCode()     // Catch: all -> 0x00ca
            r2 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r1 == r2) goto L_0x0039
            r7 = 3213448(0x310888, float:4.503E-39)
            if (r1 == r7) goto L_0x0025
            goto L_0x0089
        L_0x0025:
            java.lang.String r7 = "http"
            boolean r7 = r0.equals(r7)     // Catch: all -> 0x00ca
            if (r7 == 0) goto L_0x0089
            java.net.URL r7 = new java.net.URL     // Catch: all -> 0x00ca
            java.lang.String r0 = r6.$assetUri     // Catch: all -> 0x00ca
            r7.<init>(r0)     // Catch: all -> 0x00ca
            java.io.InputStream r7 = r7.openStream()     // Catch: all -> 0x00ca
            goto L_0x0091
        L_0x0039:
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)     // Catch: all -> 0x00ca
            if (r0 != 0) goto L_0x0042
            goto L_0x0089
        L_0x0042:
            java.io.File r0 = new java.io.File     // Catch: all -> 0x00ca
            java.lang.String r1 = r7.getPath()     // Catch: all -> 0x00ca
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = ""
        L_0x004c:
            r0.<init>(r1)     // Catch: all -> 0x00ca
            boolean r1 = r0.exists()     // Catch: all -> 0x00ca
            if (r1 == 0) goto L_0x005b
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: all -> 0x00ca
            r7.<init>(r0)     // Catch: all -> 0x00ca
            goto L_0x0091
        L_0x005b:
            java.lang.String r0 = r7.getLastPathSegment()     // Catch: all -> 0x00ca
            if (r0 == 0) goto L_0x007d
            com.discord.file_manager.FileManagerModule r7 = r6.this$0     // Catch: all -> 0x00ca
            java.lang.String r1 = "."
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: all -> 0x00ca
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.util.List r0 = oj.l.z0(r0, r1, r2, r3, r4, r5)     // Catch: all -> 0x00ca
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: all -> 0x00ca
            java.lang.String r0 = (java.lang.String) r0     // Catch: all -> 0x00ca
            java.io.InputStream r7 = r7.openRawResource(r0)     // Catch: all -> 0x00ca
            goto L_0x0091
        L_0x007d:
            java.lang.String r7 = "Could not find asset"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: all -> 0x00ca
            java.lang.String r7 = r7.toString()     // Catch: all -> 0x00ca
            r0.<init>(r7)     // Catch: all -> 0x00ca
            throw r0     // Catch: all -> 0x00ca
        L_0x0089:
            com.discord.file_manager.FileManagerModule r7 = r6.this$0     // Catch: all -> 0x00ca
            java.lang.String r0 = r6.$assetUri     // Catch: all -> 0x00ca
            java.io.InputStream r7 = r7.openRawResource(r0)     // Catch: all -> 0x00ca
        L_0x0091:
            r0 = 0
            if (r7 == 0) goto L_0x00a5
            java.lang.String r1 = "it"
            kotlin.jvm.internal.q.f(r7, r1)     // Catch: all -> 0x009e
            byte[] r1 = ug.b.c(r7)     // Catch: all -> 0x009e
            goto L_0x00a6
        L_0x009e:
            r0 = move-exception
            throw r0     // Catch: all -> 0x00a0
        L_0x00a0:
            r1 = move-exception
            ug.c.a(r7, r0)     // Catch: all -> 0x00ca
            throw r1     // Catch: all -> 0x00ca
        L_0x00a5:
            r1 = r0
        L_0x00a6:
            ug.c.a(r7, r0)     // Catch: all -> 0x00ca
            java.lang.String r7 = r6.$encoding     // Catch: all -> 0x00ca
            java.lang.String r2 = "base64"
            boolean r7 = kotlin.jvm.internal.q.b(r7, r2)     // Catch: all -> 0x00ca
            if (r7 == 0) goto L_0x00be
            com.facebook.react.bridge.Promise r7 = r6.$promise     // Catch: all -> 0x00ca
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch: all -> 0x00ca
            r7.resolve(r0)     // Catch: all -> 0x00ca
            goto L_0x00d0
        L_0x00be:
            com.facebook.react.bridge.Promise r7 = r6.$promise     // Catch: all -> 0x00ca
            if (r1 == 0) goto L_0x00c6
            java.lang.String r0 = oj.l.q(r1)     // Catch: all -> 0x00ca
        L_0x00c6:
            r7.resolve(r0)     // Catch: all -> 0x00ca
            goto L_0x00d0
        L_0x00ca:
            r7 = move-exception
            com.facebook.react.bridge.Promise r0 = r6.$promise
            r0.reject(r7)
        L_0x00d0:
            kotlin.Unit r7 = kotlin.Unit.f22113a
            return r7
        L_0x00d3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.file_manager.FileManagerModule$readAsset$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
