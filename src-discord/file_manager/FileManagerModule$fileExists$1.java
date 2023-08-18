package com.discord.file_manager;

import com.facebook.react.bridge.Promise;
import java.io.File;
import jf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pf.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.file_manager.FileManagerModule$fileExists$1", f = "FileManagerModule.kt", l = {}, m = "invokeSuspend")

final class FileManagerModule$fileExists$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  String $path;
    final  Promise $promise;
    int label;

    
    
    public FileManagerModule$fileExists$1(Promise promise, String str, Continuation<? super FileManagerModule$fileExists$1> continuation) {
        super(2, continuation);
        this.$promise = promise;
        this.$path = str;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$fileExists$1(this.$promise, this.$path, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$fileExists$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21210a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        d.d();
        if (this.label == 0) {
            t.b(obj);
            try {
                this.$promise.resolve(b.a(new File(this.$path).exists()));
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f21210a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
