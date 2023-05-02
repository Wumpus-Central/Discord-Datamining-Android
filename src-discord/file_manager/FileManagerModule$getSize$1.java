package com.discord.file_manager;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nf.s;
import nf.t;
import tf.d;
import xf.c;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.file_manager.FileManagerModule$getSize$1", f = "FileManagerModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FileManagerModule$getSize$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FileManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$getSize$1(FileManagerModule fileManagerModule, String str, Promise promise, Continuation<? super FileManagerModule$getSize$1> continuation) {
        super(2, continuation);
        this.this$0 = fileManagerModule;
        this.$uri = str;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileManagerModule$getSize$1 fileManagerModule$getSize$1 = new FileManagerModule$getSize$1(this.this$0, this.$uri, this.$promise, continuation);
        fileManagerModule$getSize$1.L$0 = obj;
        return fileManagerModule$getSize$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$getSize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22035a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ReactApplicationContext reactApplicationContext;
        long j10;
        boolean z10;
        d.d();
        if (this.label == 0) {
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FileManagerModule fileManagerModule = this.this$0;
            String str = this.$uri;
            Promise promise = this.$promise;
            try {
                s.a aVar = s.f24599l;
                reactApplicationContext = fileManagerModule.getReactApplicationContext();
                ParcelFileDescriptor openFileDescriptor = reactApplicationContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null) {
                    j10 = openFileDescriptor.getStatSize();
                    c.a(openFileDescriptor, null);
                } else {
                    j10 = 0;
                }
                if (j10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                s.a aVar2 = s.f24599l;
                obj2 = s.b(t.a(th2));
            }
            if (z10) {
                promise.resolve(b.b(j10));
                obj2 = s.b(Unit.f22035a);
                Promise promise2 = this.$promise;
                Throwable e10 = s.e(obj2);
                if (e10 != null) {
                    promise2.reject(e10);
                }
                return Unit.f22035a;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
