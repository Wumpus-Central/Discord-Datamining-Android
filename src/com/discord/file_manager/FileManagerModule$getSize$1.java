package com.discord.file_manager;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.coroutines.jvm.internal.C9928b;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nf.C11090s;
import nf.C11093t;
import p426xf.C14082c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.file_manager.FileManagerModule$getSize$1", m14701f = "FileManagerModule.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FileManagerModule$getSize$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileManagerModule$getSize$1 fileManagerModule$getSize$1 = new FileManagerModule$getSize$1(this.this$0, this.$uri, this.$promise, continuation);
        fileManagerModule$getSize$1.L$0 = obj;
        return fileManagerModule$getSize$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$getSize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ReactApplicationContext reactApplicationContext;
        long j;
        boolean z;
        C13080d.m4646d();
        if (this.label == 0) {
            C11093t.m10930b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FileManagerModule fileManagerModule = this.this$0;
            String str = this.$uri;
            Promise promise = this.$promise;
            try {
                C11090s.C11091a aVar = C11090s.f24606l;
                reactApplicationContext = fileManagerModule.getReactApplicationContext();
                ParcelFileDescriptor openFileDescriptor = reactApplicationContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null) {
                    j = openFileDescriptor.getStatSize();
                    C14082c.m1713a(openFileDescriptor, null);
                } else {
                    j = 0;
                }
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                C11090s.C11091a aVar2 = C11090s.f24606l;
                obj2 = C11090s.m10940b(C11093t.m10931a(th2));
            }
            if (z) {
                promise.resolve(C9928b.m14705b(j));
                obj2 = C11090s.m10940b(Unit.f22042a);
                Promise promise2 = this.$promise;
                Throwable e = C11090s.m10937e(obj2);
                if (e != null) {
                    promise2.reject(e);
                }
                return Unit.f22042a;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
