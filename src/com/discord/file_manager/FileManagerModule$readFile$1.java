package com.discord.file_manager;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import p327ri.C12587u;
import p427xf.C14000b;
import p427xf.C14001c;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.file_manager.FileManagerModule$readFile$1", m14701f = "FileManagerModule.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FileManagerModule$readFile$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $encoding;
    final /* synthetic */ String $path;
    final /* synthetic */ Promise $promise;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$readFile$1(String str, String str2, Promise promise, Continuation<? super FileManagerModule$readFile$1> continuation) {
        super(2, continuation);
        this.$path = str;
        this.$encoding = str2;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$readFile$1(this.$path, this.$encoding, this.$promise, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$readFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        String q;
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.$path));
                byte[] c = C14000b.m1714c(fileInputStream);
                C14001c.m1713a(fileInputStream, null);
                if (C9677q.m14638b(this.$encoding, "base64")) {
                    this.$promise.resolve(Base64.encodeToString(c, 2));
                } else {
                    Promise promise = this.$promise;
                    q = C12587u.m5735q(c);
                    promise.resolve(q);
                }
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f25780a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
