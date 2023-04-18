.class final synthetic Lcom/discord/simpleast/code/Xml$TagNode$render$typeStylesProvider$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/code/Xml$TagNode;->render(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Lkotlin/jvm/functions/Function1<",
        "TRC;",
        "Ljava/lang/Iterable<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u001c\n\u0002\u0008\u0003\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0002\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "RC",
        "p1",
        "",
        "invoke",
        "(Ljava/lang/Object;)Ljava/lang/Iterable;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V
    .locals 7

    const/4 v1, 0x1

    const-class v3, Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    const-string v4, "get"

    const-string v5, "get(Ljava/lang/Object;)Ljava/lang/Iterable;"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/n;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRC;)",
            "Ljava/lang/Iterable<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/jvm/internal/e;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 2
    invoke-interface {v0, p1}, Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;->get(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/discord/simpleast/code/Xml$TagNode$render$typeStylesProvider$1;->invoke(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
