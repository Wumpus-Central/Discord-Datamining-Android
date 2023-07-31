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

final class FileManagerModule$readAsset$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  String $assetUri;
    final  String $encoding;
    final  Promise $promise;
    int label;
    final  FileManagerModule this$0;

    
    
    public FileManagerModule$readAsset$1(String str, FileManagerModule fileManagerModule, String str2, Promise promise, Continuation<? super FileManagerModule$readAsset$1> continuation) {
        super(2, continuation);
        this.$assetUri = str;
        this.this$0 = fileManagerModule;
        this.$encoding = str2;
        this.$promise = promise;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$readAsset$1(this.$assetUri, this.this$0, this.$encoding, this.$promise, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$readAsset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20679a);
    }

    
    
    
    
    @Override 
    
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.file_manager.FileManagerModule$readAsset$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
