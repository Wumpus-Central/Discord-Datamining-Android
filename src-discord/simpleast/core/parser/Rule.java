package com.discord.simpleast.core.parser;

import com.discord.simpleast.core.node.Node;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003*\u0004\b\u0002\u0010\u00042\u00020\u0005:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ)\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0014JE\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00182\u0006\u0010\u0013\u001a\u00028\u0002H&¢\u0006\u0002\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/discord/simpleast/core/parser/Rule;", "R", "T", "Lcom/discord/simpleast/core/node/Node;", "S", "", "pattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "matcher", "Ljava/util/regex/Matcher;", "(Ljava/util/regex/Matcher;)V", "getMatcher", "()Ljava/util/regex/Matcher;", "match", "inspectionSource", "", "lastCapture", "", "state", "(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Object;)Ljava/util/regex/Matcher;", "parse", "Lcom/discord/simpleast/core/parser/ParseSpec;", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;", "BlockRule", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})

public abstract class Rule<R, T extends Node<R>, S> {
    private final Matcher matcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u000e\b\u0004\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003*\u0004\b\u0005\u0010\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ)\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00028\u0005H\u0016¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/discord/simpleast/core/parser/Rule$BlockRule;", "R", "T", "Lcom/discord/simpleast/core/node/Node;", "S", "Lcom/discord/simpleast/core/parser/Rule;", "pattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "match", "Ljava/util/regex/Matcher;", "inspectionSource", "", "lastCapture", "", "state", "(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Object;)Ljava/util/regex/Matcher;", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    
    public static abstract class BlockRule<R, T extends Node<R>, S> extends Rule<R, T, S> {
        
        public BlockRule(Pattern pattern) {
            super(pattern);
            q.h(pattern, "pattern");
        }

        @Override 
        public Matcher match(CharSequence inspectionSource, String str, S s10) {
            boolean P;
            q.h(inspectionSource, "inspectionSource");
            if (str != null) {
                P = p.P(str, '\n', false, 2, null);
                if (!P) {
                    return null;
                }
            }
            return Rule.super.match(inspectionSource, str, s10);
        }
    }

    public Rule(Matcher matcher) {
        q.h(matcher, "matcher");
        this.matcher = matcher;
    }

    public final Matcher getMatcher() {
        return this.matcher;
    }

    public Matcher match(CharSequence inspectionSource, String str, S s10) {
        q.h(inspectionSource, "inspectionSource");
        this.matcher.reset(inspectionSource);
        if (this.matcher.find()) {
            return this.matcher;
        }
        return null;
    }

    public abstract ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super T, S> parser, S s10);

    
    
    public Rule(java.util.regex.Pattern r2) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.simpleast.core.parser.Rule.<init>(java.util.regex.Pattern):void");
    }
}
