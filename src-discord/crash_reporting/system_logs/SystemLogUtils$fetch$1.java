package com.discord.crash_reporting.system_logs;

import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.text.Regex;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class SystemLogUtils$fetch$1 extends s implements Function0<Unit> {
    final  Function1<LinkedList<String>, Unit> $cb;
    final  Regex $filter;
    final  boolean $logErrors;
    final  LinkedList<String> $output;

    
    
    
    public SystemLogUtils$fetch$1(LinkedList<String> linkedList, Regex regex, boolean z10, Function1<? super LinkedList<String>, Unit> function1) {
        super(0);
        this.$output = linkedList;
        this.$filter = regex;
        this.$logErrors = z10;
        this.$cb = function1;
    }

    
    @Override 
    
    
    public final void invoke2() {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.crash_reporting.system_logs.SystemLogUtils$fetch$1.invoke2():void");
    }
}
