package com.discord.simpleast.core.parser;

import com.discord.simpleast.core.node.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u001dB-\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB\u001d\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m15073d2 = {"Lcom/discord/simpleast/core/parser/ParseSpec;", "R", "S", "", "root", "Lcom/discord/simpleast/core/node/Node;", "state", "startIndex", "", "endIndex", "(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;II)V", "(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;)V", "getEndIndex", "()I", "setEndIndex", "(I)V", "isTerminal", "", "()Z", "getRoot", "()Lcom/discord/simpleast/core/node/Node;", "getStartIndex", "setStartIndex", "getState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "applyOffset", "", "offset", "Companion", "simpleast-core_release"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class ParseSpec<R, S> {
    public static final Companion Companion = new Companion(null);
    private int endIndex;
    private final boolean isTerminal = true;
    private final Node<R> root;
    private int startIndex;
    private final S state;

    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JK\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\u0006\u0010\t\u001a\u0002H\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\rJ;\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\u0006\u0010\t\u001a\u0002H\u0006H\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/simpleast/core/parser/ParseSpec$Companion;", "", "()V", "createNonterminal", "Lcom/discord/simpleast/core/parser/ParseSpec;", "R", "S", "node", "Lcom/discord/simpleast/core/node/Node;", "state", "startIndex", "", "endIndex", "(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;II)Lcom/discord/simpleast/core/parser/ParseSpec;", "createTerminal", "(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;", "simpleast-core_release"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <R, S> ParseSpec<R, S> createNonterminal(Node<R> node, S s, int i, int i2) {
            C9971q.m14633g(node, "node");
            return new ParseSpec<>(node, s, i, i2);
        }

        public final <R, S> ParseSpec<R, S> createTerminal(Node<R> node, S s) {
            C9971q.m14633g(node, "node");
            return new ParseSpec<>(node, s);
        }
    }

    public ParseSpec(Node<R> root, S s, int i, int i2) {
        C9971q.m14633g(root, "root");
        this.root = root;
        this.state = s;
        this.startIndex = i;
        this.endIndex = i2;
    }

    public static final <R, S> ParseSpec<R, S> createNonterminal(Node<R> node, S s, int i, int i2) {
        return Companion.createNonterminal(node, s, i, i2);
    }

    public static final <R, S> ParseSpec<R, S> createTerminal(Node<R> node, S s) {
        return Companion.createTerminal(node, s);
    }

    public final void applyOffset(int i) {
        this.startIndex += i;
        this.endIndex += i;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final Node<R> getRoot() {
        return this.root;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final S getState() {
        return this.state;
    }

    public final boolean isTerminal() {
        return this.isTerminal;
    }

    public final void setEndIndex(int i) {
        this.endIndex = i;
    }

    public final void setStartIndex(int i) {
        this.startIndex = i;
    }

    public ParseSpec(Node<R> root, S s) {
        C9971q.m14633g(root, "root");
        this.root = root;
        this.state = s;
    }
}
