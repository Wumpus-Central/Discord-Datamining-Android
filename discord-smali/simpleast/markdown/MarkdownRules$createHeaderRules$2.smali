.class final synthetic Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$2;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/markdown/MarkdownRules;->createHeaderRules(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
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
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroid/text/style/CharacterStyle;",
        "R",
        "S",
        "p1",
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
.field final synthetic $spanProvider$1:Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;


# direct methods
.method constructor <init>(Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;)V
    .locals 6

    iput-object p1, p0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$2;->$spanProvider$1:Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "spanProvider"

    const-string v4, "invoke(I)Landroid/text/style/CharacterStyle;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/n;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(I)Landroid/text/style/CharacterStyle;
    .locals 1

    iget-object v0, p0, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$2;->$spanProvider$1:Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;

    .line 2
    invoke-virtual {v0, p1}, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$1;->invoke(I)Landroid/text/style/CharacterStyle;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/discord/simpleast/markdown/MarkdownRules$createHeaderRules$2;->invoke(I)Landroid/text/style/CharacterStyle;

    move-result-object p1

    return-object p1
.end method
