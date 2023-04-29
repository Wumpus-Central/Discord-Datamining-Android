.class public final Lcom/discord/simpleast/core/simple/SimpleRenderer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JA\u0010\u0003\u001a\u0002H\u0004\"\u0008\u0008\u0000\u0010\u0004*\u00020\u0005\"\u0004\u0008\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u00042\u0012\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00060\n0\t2\u0006\u0010\u000b\u001a\u0002H\u0006H\u0007\u00a2\u0006\u0002\u0010\u000cJQ\u0010\u0003\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0006\"\u0004\u0008\u0001\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0004\u0012\u0002H\r0\u00112\u0006\u0010\u000b\u001a\u0002H\u00062\u0006\u0010\u0012\u001a\u0002H\rH\u0007\u00a2\u0006\u0002\u0010\u0013JW\u0010\u0003\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0006\"\u0004\u0008\u0001\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2$\u0010\u0014\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0004\u0012\u0002H\r0\u00150\t2\u0006\u0010\u0012\u001a\u0002H\r2\u0006\u0010\u000b\u001a\u0002H\u0006H\u0007\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u001a\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/discord/simpleast/core/simple/SimpleRenderer;",
        "",
        "()V",
        "render",
        "T",
        "Landroid/text/SpannableStringBuilder;",
        "R",
        "builder",
        "ast",
        "",
        "Lcom/discord/simpleast/core/node/Node;",
        "renderContext",
        "(Landroid/text/SpannableStringBuilder;Ljava/util/Collection;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;",
        "S",
        "source",
        "",
        "parser",
        "Lcom/discord/simpleast/core/parser/Parser;",
        "initialState",
        "(Ljava/lang/CharSequence;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;",
        "rules",
        "Lcom/discord/simpleast/core/parser/Rule;",
        "(Ljava/lang/CharSequence;Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;",
        "renderBasicMarkdown",
        "",
        "textView",
        "Landroid/widget/TextView;",
        "sourceResId",
        "",
        "simpleast-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/simpleast/core/simple/SimpleRenderer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/simpleast/core/simple/SimpleRenderer;

    invoke-direct {v0}, Lcom/discord/simpleast/core/simple/SimpleRenderer;-><init>()V

    sput-object v0, Lcom/discord/simpleast/core/simple/SimpleRenderer;->INSTANCE:Lcom/discord/simpleast/core/simple/SimpleRenderer;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final render(Landroid/text/SpannableStringBuilder;Ljava/util/Collection;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/text/SpannableStringBuilder;",
            "R:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/util/Collection<",
            "+",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;>;TR;)TT;"
        }
    .end annotation

    const-string v0, "builder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ast"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/discord/simpleast/core/node/Node;

    .line 5
    invoke-virtual {v0, p0, p2}, Lcom/discord/simpleast/core/node/Node;->render(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static final render(Ljava/lang/CharSequence;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/CharSequence;",
            "Lcom/discord/simpleast/core/parser/Parser<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;TR;TS;)",
            "Landroid/text/SpannableStringBuilder;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p0

    move-object v3, p3

    invoke-static/range {v1 .. v6}, Lcom/discord/simpleast/core/parser/Parser;->parse$default(Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/CharSequence;Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {v0, p0, p2}, Lcom/discord/simpleast/core/simple/SimpleRenderer;->render(Landroid/text/SpannableStringBuilder;Ljava/util/Collection;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final render(Ljava/lang/CharSequence;Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/CharSequence;",
            "Ljava/util/Collection<",
            "+",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TR;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;>;>;TS;TR;)",
            "Landroid/text/SpannableStringBuilder;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rules"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/discord/simpleast/core/parser/Parser;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lcom/discord/simpleast/core/parser/Parser;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p1}, Lcom/discord/simpleast/core/parser/Parser;->addRules(Ljava/util/Collection;)Lcom/discord/simpleast/core/parser/Parser;

    move-result-object v4

    .line 2
    new-instance p1, Landroid/text/SpannableStringBuilder;

    invoke-direct {p1}, Landroid/text/SpannableStringBuilder;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v5, p0

    move-object v6, p2

    invoke-static/range {v4 .. v9}, Lcom/discord/simpleast/core/parser/Parser;->parse$default(Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/CharSequence;Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p1, p0, p3}, Lcom/discord/simpleast/core/simple/SimpleRenderer;->render(Landroid/text/SpannableStringBuilder;Ljava/util/Collection;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final renderBasicMarkdown(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 3

    const-string v0, "source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    .line 4
    invoke-static {v0, v0, v1, v2}, Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;->createSimpleMarkdownRules$default(ZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0, v2, v2}, Lcom/discord/simpleast/core/simple/SimpleRenderer;->render(Ljava/lang/CharSequence;Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final renderBasicMarkdown(ILandroid/widget/TextView;)V
    .locals 1

    const-string v0, "textView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "textView.context.getString(sourceResId)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p0, p1}, Lcom/discord/simpleast/core/simple/SimpleRenderer;->renderBasicMarkdown(Ljava/lang/CharSequence;Landroid/widget/TextView;)V

    return-void
.end method

.method public static final renderBasicMarkdown(Ljava/lang/CharSequence;Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p0}, Lcom/discord/simpleast/core/simple/SimpleRenderer;->renderBasicMarkdown(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
