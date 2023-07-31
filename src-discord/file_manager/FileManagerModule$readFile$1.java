package com.discord.file_manager;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import ff.t;
import java.io.File;
import java.io.FileInputStream;
import ji.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import lf.d;
import pf.b;
import pf.c;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.file_manager.FileManagerModule$readFile$1", f = "FileManagerModule.kt", l = {}, m = "invokeSuspend")

final class FileManagerModule$readFile$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  String $encoding;
    final  String $path;
    final  Promise $promise;
    int label;

    
    
    public FileManagerModule$readFile$1(String str, String str2, Promise promise, Continuation<? super FileManagerModule$readFile$1> continuation) {
        super(2, continuation);
        this.$path = str;
        this.$encoding = str2;
        this.$promise = promise;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$readFile$1(this.$path, this.$encoding, this.$promise, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$readFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20679a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        String q10;
        d.d();
        if (this.label == 0) {
            t.b(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.$path));
                byte[] c10 = b.c(fileInputStream);
                c.a(fileInputStream, null);
                if (q.b(this.$encoding, "base64")) {
                    this.$promise.resolve(Base64.encodeToString(c10, 2));
                } else {
                    Promise promise = this.$promise;
                    q10 = u.q(c10);
                    promise.resolve(q10);
                }
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f20679a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
