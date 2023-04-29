.class final Lcom/discord/simpleast/code/CodeRules$createCodeRule$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/code/CodeRules;->createCodeRule$default(Lcom/discord/simpleast/code/CodeRules;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;Ljava/util/Map;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)Lcom/discord/simpleast/core/parser/Rule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0003H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/simpleast/code/CodeNode;",
        "R",
        "S",
        "codeNode",
        "startsWithNewline",
        "",
        "state",
        "invoke",
        "(Lcom/discord/simpleast/code/CodeNode;ZLjava/lang/Object;)Lcom/discord/simpleast/code/CodeNode;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/simpleast/code/CodeRules$createCodeRule$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/simpleast/code/CodeRules$createCodeRule$1;

    invoke-direct {v0}, Lcom/discord/simpleast/code/CodeRules$createCodeRule$1;-><init>()V

    sput-object v0, Lcom/discord/simpleast/code/CodeRules$createCodeRule$1;->INSTANCE:Lcom/discord/simpleast/code/CodeRules$createCodeRule$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/simpleast/code/CodeNode;ZLjava/lang/Object;)Lcom/discord/simpleast/code/CodeNode;
    .locals 0

    const-string p2, "codeNode"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/discord/simpleast/code/CodeNode;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/simpleast/code/CodeRules$createCodeRule$1;->invoke(Lcom/discord/simpleast/code/CodeNode;ZLjava/lang/Object;)Lcom/discord/simpleast/code/CodeNode;

    move-result-object p1

    return-object p1
.end method
