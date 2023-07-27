package com.discord.browser_manager;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BrowserManager$tryOpenUrlWithCustomTabs$1 extends s implements Function1<Exception, Unit> {
    final  Context $context;
    final  Function1<Exception, Unit> $onFailure;
    final  String $url;

    
    
    
    public BrowserManager$tryOpenUrlWithCustomTabs$1(Context context, String str, Function1<? super Exception, Unit> function1) {
        super(1);
        this.$context = context;
        this.$url = str;
        this.$onFailure = function1;
    }

    @Override 
    public   Unit invoke(Exception exc) {
        invoke2(exc);
        return Unit.f20670a;
    }

    
    public final void invoke2(Exception it) {
        q.g(it, "it");
        BrowserManager.INSTANCE.tryOpenUrlExternally(this.$context, this.$url, this.$onFailure);
    }
}
