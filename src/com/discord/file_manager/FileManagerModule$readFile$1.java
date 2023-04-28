package com.discord.file_manager;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import p326ri.C12718u;
import p426xf.C14081b;
import p426xf.C14082c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.file_manager.FileManagerModule$readFile$1", m14701f = "FileManagerModule.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FileManagerModule$readFile$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$readFile$1(this.$path, this.$encoding, this.$promise, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$readFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        String q;
        C13080d.m4646d();
        if (this.label == 0) {
            C11093t.m10930b(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.$path));
                byte[] c = C14081b.m1714c(fileInputStream);
                C14082c.m1713a(fileInputStream, null);
                if (C9971q.m14638b(this.$encoding, "base64")) {
                    this.$promise.resolve(Base64.encodeToString(c, 2));
                } else {
                    Promise promise = this.$promise;
                    q = C12718u.m5735q(c);
                    promise.resolve(q);
                }
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f22042a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
