.class public final Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/simpleast/code/JavaScript$FunctionNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u0002H\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00070\u0008\u0012\u0004\u0012\u0002H\t0\u0006\"\u0004\u0008\u0001\u0010\u0007\"\u0004\u0008\u0002\u0010\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00070\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;",
        "",
        "()V",
        "PATTERN_JAVASCRIPT_FUNC",
        "Ljava/util/regex/Pattern;",
        "createFunctionRule",
        "Lcom/discord/simpleast/core/parser/Rule;",
        "RC",
        "Lcom/discord/simpleast/core/node/Node;",
        "S",
        "codeStyleProviders",
        "Lcom/discord/simpleast/code/CodeStyleProviders;",
        "simpleast-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFunctionRule(Lcom/discord/simpleast/code/CodeStyleProviders;)Lcom/discord/simpleast/core/parser/Rule;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RC:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/discord/simpleast/code/CodeStyleProviders<",
            "TRC;>;)",
            "Lcom/discord/simpleast/core/parser/Rule<",
            "TRC;",
            "Lcom/discord/simpleast/core/node/Node<",
            "TRC;>;TS;>;"
        }
    .end annotation

    .line 1
    const-string v0, "codeStyleProviders"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion$createFunctionRule$1;

    .line 7
    .line 8
    invoke-static {}, Lcom/discord/simpleast/code/JavaScript$FunctionNode;->access$getPATTERN_JAVASCRIPT_FUNC$cp()Ljava/util/regex/Pattern;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, p0, p1, v1}, Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion$createFunctionRule$1;-><init>(Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;Lcom/discord/simpleast/code/CodeStyleProviders;Ljava/util/regex/Pattern;)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method
