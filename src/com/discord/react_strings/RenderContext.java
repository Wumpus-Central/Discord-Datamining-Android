package com.discord.react_strings;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9971q;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002R%\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\f"}, m15073d2 = {"Lcom/discord/react_strings/RenderContext;", "", "()V", "argHooks", "", "", "getArgHooks$annotations", "getArgHooks", "()Ljava/util/Map;", "args", "getArgs", "Argument", "react_strings_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class RenderContext {
    private final Map<String, String> args = new HashMap();
    private final Map<String, String> argHooks = new HashMap();

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J0\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014¨\u0006\u001b"}, m15073d2 = {"Lcom/discord/react_strings/RenderContext$Argument;", "", "Lkotlin/text/MatchResult;", "", "group", "", "get", "", "contains", "", "input", "Lkotlin/Function3;", "onMatch", "replace", "Lkotlin/text/Regex;", "argumentRegex", "Lkotlin/text/Regex;", "getArgumentRegex$annotations", "()V", "GROUP_ESCAPE_L", "I", "GROUP_ESCAPE_R", "GROUP_ARG_NAME", "GROUP_HOOK_MARKER_L", "GROUP_HOOK_MARKER_R", "GROUP_HOOK", "<init>", "react_strings_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class Argument {
        private static final int GROUP_ARG_NAME = 3;
        private static final int GROUP_ESCAPE_L = 2;
        private static final int GROUP_ESCAPE_R = 4;
        private static final int GROUP_HOOK = 7;
        private static final int GROUP_HOOK_MARKER_L = 1;
        private static final int GROUP_HOOK_MARKER_R = 5;
        public static final Argument INSTANCE = new Argument();
        private static final Regex argumentRegex = new Regex("(\\[)?(!!)?\\{(\\S+?)\\}(!!)?(\\])?(\\((\\S+?)\\))?");

        private Argument() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean contains(MatchResult matchResult, int i) {
            return get(matchResult, i).length() > 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(MatchResult matchResult, int i) {
            return matchResult.mo5841b().get(i);
        }

        private static /* synthetic */ void getArgumentRegex$annotations() {
        }

        public final String replace(CharSequence input, Function3<? super String, ? super String, ? super Boolean, ? extends CharSequence> onMatch) {
            C9971q.m14633g(input, "input");
            C9971q.m14633g(onMatch, "onMatch");
            return argumentRegex.m14581i(input, new RenderContext$Argument$replace$1(onMatch));
        }
    }

    public static /* synthetic */ void getArgHooks$annotations() {
    }

    public final Map<String, String> getArgHooks() {
        return this.argHooks;
    }

    public final Map<String, String> getArgs() {
        return this.args;
    }
}
