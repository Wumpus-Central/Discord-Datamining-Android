.class final Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/markdown/MarkdownRules;->createHeaderRules(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Landroid/text/style/CharacterStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "spanProvider",
        "Landroid/text/style/CharacterStyle;",
        "R",
        "S",
        "header",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $headerStyles:Ljava/util/List;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;->$headerStyles:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(I)Landroid/text/style/CharacterStyle;
    .locals 4

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Landroid/text/style/TextAppearanceSpan;

    iget-object v0, p0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;->$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;->$headerStyles:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroid/text/style/TextAppearanceSpan;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;->$headerStyles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v1, p1, :cond_1

    goto :goto_0

    :cond_1
    if-lt v0, p1, :cond_2

    new-instance v0, Landroid/text/style/TextAppearanceSpan;

    iget-object v2, p0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;->$context:Landroid/content/Context;

    iget-object v3, p0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;->$headerStyles:Ljava/util/List;

    sub-int/2addr p1, v1

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, v2, p1}, Landroid/text/style/TextAppearanceSpan;-><init>(Landroid/content/Context;I)V

    move-object p1, v0

    goto :goto_1

    .line 4
    :cond_2
    :goto_0
    new-instance p1, Landroid/text/style/StyleSpan;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Landroid/text/style/StyleSpan;-><init>(I)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;->invoke(I)Landroid/text/style/CharacterStyle;

    move-result-object p1

    return-object p1
.end method
