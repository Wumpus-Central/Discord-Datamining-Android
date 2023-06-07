package com.discord.simpleast.code;

import com.discord.simpleast.core.node.StyleNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0085\u0001\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u008f\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006&"}, d2 = {"Lcom/discord/simpleast/code/CodeStyleProviders;", "R", "", "defaultStyleProvider", "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "commentStyleProvider", "literalStyleProvider", "keywordStyleProvider", "identifierStyleProvider", "typesStyleProvider", "genericsStyleProvider", "paramsStyleProvider", "(Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V", "getCommentStyleProvider", "()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "getDefaultStyleProvider", "getGenericsStyleProvider", "getIdentifierStyleProvider", "getKeywordStyleProvider", "getLiteralStyleProvider", "getParamsStyleProvider", "getTypesStyleProvider", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class CodeStyleProviders<R> {
    private final StyleNode.SpanProvider<R> commentStyleProvider;
    private final StyleNode.SpanProvider<R> defaultStyleProvider;
    private final StyleNode.SpanProvider<R> genericsStyleProvider;
    private final StyleNode.SpanProvider<R> identifierStyleProvider;
    private final StyleNode.SpanProvider<R> keywordStyleProvider;
    private final StyleNode.SpanProvider<R> literalStyleProvider;
    private final StyleNode.SpanProvider<R> paramsStyleProvider;
    private final StyleNode.SpanProvider<R> typesStyleProvider;

    public CodeStyleProviders() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public CodeStyleProviders(StyleNode.SpanProvider<R> defaultStyleProvider, StyleNode.SpanProvider<R> commentStyleProvider, StyleNode.SpanProvider<R> literalStyleProvider, StyleNode.SpanProvider<R> keywordStyleProvider, StyleNode.SpanProvider<R> identifierStyleProvider, StyleNode.SpanProvider<R> typesStyleProvider, StyleNode.SpanProvider<R> genericsStyleProvider, StyleNode.SpanProvider<R> paramsStyleProvider) {
        q.g(defaultStyleProvider, "defaultStyleProvider");
        q.g(commentStyleProvider, "commentStyleProvider");
        q.g(literalStyleProvider, "literalStyleProvider");
        q.g(keywordStyleProvider, "keywordStyleProvider");
        q.g(identifierStyleProvider, "identifierStyleProvider");
        q.g(typesStyleProvider, "typesStyleProvider");
        q.g(genericsStyleProvider, "genericsStyleProvider");
        q.g(paramsStyleProvider, "paramsStyleProvider");
        this.defaultStyleProvider = defaultStyleProvider;
        this.commentStyleProvider = commentStyleProvider;
        this.literalStyleProvider = literalStyleProvider;
        this.keywordStyleProvider = keywordStyleProvider;
        this.identifierStyleProvider = identifierStyleProvider;
        this.typesStyleProvider = typesStyleProvider;
        this.genericsStyleProvider = genericsStyleProvider;
        this.paramsStyleProvider = paramsStyleProvider;
    }

    public final StyleNode.SpanProvider<R> component1() {
        return this.defaultStyleProvider;
    }

    public final StyleNode.SpanProvider<R> component2() {
        return this.commentStyleProvider;
    }

    public final StyleNode.SpanProvider<R> component3() {
        return this.literalStyleProvider;
    }

    public final StyleNode.SpanProvider<R> component4() {
        return this.keywordStyleProvider;
    }

    public final StyleNode.SpanProvider<R> component5() {
        return this.identifierStyleProvider;
    }

    public final StyleNode.SpanProvider<R> component6() {
        return this.typesStyleProvider;
    }

    public final StyleNode.SpanProvider<R> component7() {
        return this.genericsStyleProvider;
    }

    public final StyleNode.SpanProvider<R> component8() {
        return this.paramsStyleProvider;
    }

    public final CodeStyleProviders<R> copy(StyleNode.SpanProvider<R> defaultStyleProvider, StyleNode.SpanProvider<R> commentStyleProvider, StyleNode.SpanProvider<R> literalStyleProvider, StyleNode.SpanProvider<R> keywordStyleProvider, StyleNode.SpanProvider<R> identifierStyleProvider, StyleNode.SpanProvider<R> typesStyleProvider, StyleNode.SpanProvider<R> genericsStyleProvider, StyleNode.SpanProvider<R> paramsStyleProvider) {
        q.g(defaultStyleProvider, "defaultStyleProvider");
        q.g(commentStyleProvider, "commentStyleProvider");
        q.g(literalStyleProvider, "literalStyleProvider");
        q.g(keywordStyleProvider, "keywordStyleProvider");
        q.g(identifierStyleProvider, "identifierStyleProvider");
        q.g(typesStyleProvider, "typesStyleProvider");
        q.g(genericsStyleProvider, "genericsStyleProvider");
        q.g(paramsStyleProvider, "paramsStyleProvider");
        return new CodeStyleProviders<>(defaultStyleProvider, commentStyleProvider, literalStyleProvider, keywordStyleProvider, identifierStyleProvider, typesStyleProvider, genericsStyleProvider, paramsStyleProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeStyleProviders)) {
            return false;
        }
        CodeStyleProviders codeStyleProviders = (CodeStyleProviders) obj;
        return q.b(this.defaultStyleProvider, codeStyleProviders.defaultStyleProvider) && q.b(this.commentStyleProvider, codeStyleProviders.commentStyleProvider) && q.b(this.literalStyleProvider, codeStyleProviders.literalStyleProvider) && q.b(this.keywordStyleProvider, codeStyleProviders.keywordStyleProvider) && q.b(this.identifierStyleProvider, codeStyleProviders.identifierStyleProvider) && q.b(this.typesStyleProvider, codeStyleProviders.typesStyleProvider) && q.b(this.genericsStyleProvider, codeStyleProviders.genericsStyleProvider) && q.b(this.paramsStyleProvider, codeStyleProviders.paramsStyleProvider);
    }

    public final StyleNode.SpanProvider<R> getCommentStyleProvider() {
        return this.commentStyleProvider;
    }

    public final StyleNode.SpanProvider<R> getDefaultStyleProvider() {
        return this.defaultStyleProvider;
    }

    public final StyleNode.SpanProvider<R> getGenericsStyleProvider() {
        return this.genericsStyleProvider;
    }

    public final StyleNode.SpanProvider<R> getIdentifierStyleProvider() {
        return this.identifierStyleProvider;
    }

    public final StyleNode.SpanProvider<R> getKeywordStyleProvider() {
        return this.keywordStyleProvider;
    }

    public final StyleNode.SpanProvider<R> getLiteralStyleProvider() {
        return this.literalStyleProvider;
    }

    public final StyleNode.SpanProvider<R> getParamsStyleProvider() {
        return this.paramsStyleProvider;
    }

    public final StyleNode.SpanProvider<R> getTypesStyleProvider() {
        return this.typesStyleProvider;
    }

    public int hashCode() {
        StyleNode.SpanProvider<R> spanProvider = this.defaultStyleProvider;
        int i10 = 0;
        int hashCode = (spanProvider != null ? spanProvider.hashCode() : 0) * 31;
        StyleNode.SpanProvider<R> spanProvider2 = this.commentStyleProvider;
        int hashCode2 = (hashCode + (spanProvider2 != null ? spanProvider2.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider3 = this.literalStyleProvider;
        int hashCode3 = (hashCode2 + (spanProvider3 != null ? spanProvider3.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider4 = this.keywordStyleProvider;
        int hashCode4 = (hashCode3 + (spanProvider4 != null ? spanProvider4.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider5 = this.identifierStyleProvider;
        int hashCode5 = (hashCode4 + (spanProvider5 != null ? spanProvider5.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider6 = this.typesStyleProvider;
        int hashCode6 = (hashCode5 + (spanProvider6 != null ? spanProvider6.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider7 = this.genericsStyleProvider;
        int hashCode7 = (hashCode6 + (spanProvider7 != null ? spanProvider7.hashCode() : 0)) * 31;
        StyleNode.SpanProvider<R> spanProvider8 = this.paramsStyleProvider;
        if (spanProvider8 != null) {
            i10 = spanProvider8.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        return "CodeStyleProviders(defaultStyleProvider=" + this.defaultStyleProvider + ", commentStyleProvider=" + this.commentStyleProvider + ", literalStyleProvider=" + this.literalStyleProvider + ", keywordStyleProvider=" + this.keywordStyleProvider + ", identifierStyleProvider=" + this.identifierStyleProvider + ", typesStyleProvider=" + this.typesStyleProvider + ", genericsStyleProvider=" + this.genericsStyleProvider + ", paramsStyleProvider=" + this.paramsStyleProvider + ")";
    }

    public /* synthetic */ CodeStyleProviders(StyleNode.SpanProvider spanProvider, StyleNode.SpanProvider spanProvider2, StyleNode.SpanProvider spanProvider3, StyleNode.SpanProvider spanProvider4, StyleNode.SpanProvider spanProvider5, StyleNode.SpanProvider spanProvider6, StyleNode.SpanProvider spanProvider7, StyleNode.SpanProvider spanProvider8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider, (i10 & 2) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider2, (i10 & 4) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider3, (i10 & 8) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider4, (i10 & 16) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider5, (i10 & 32) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider6, (i10 & 64) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider7, (i10 & 128) != 0 ? CodeStyleProvidersKt.emptyProvider() : spanProvider8);
    }
}
