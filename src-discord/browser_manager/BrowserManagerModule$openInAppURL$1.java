package com.discord.browser_manager;

import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BrowserManagerModule$openInAppURL$1 extends s implements Function1<Exception, Unit> {
    final  Promise $promise;

    
    
    public BrowserManagerModule$openInAppURL$1(Promise promise) {
        super(1);
        this.$promise = promise;
    }

    @Override 
    public   Unit invoke(Exception exc) {
        invoke2(exc);
        return Unit.f21210a;
    }

    
    public final void invoke2(Exception e10) {
        q.h(e10, "e");
        this.$promise.reject(e10);
    }
}
