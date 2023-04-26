.class public final Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1$parse$node$1;
.super Lcom/discord/simpleast/core/node/Node$Parent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;->parse(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/discord/simpleast/core/node/Node$Parent<",
        "TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "com/discord/simpleast/code/CodeRules$createInlineCodeRule$1$parse$node$1",
        "Lcom/discord/simpleast/core/node/Node$Parent;",
        "render",
        "",
        "builder",
        "Landroid/text/SpannableStringBuilder;",
        "renderContext",
        "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V",
        "simpleast-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $codeNode:Lcom/discord/simpleast/code/CodeNode;

.field final synthetic this$0:Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;


# direct methods
.method constructor <init>(Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;Lcom/discord/simpleast/code/CodeNode;[Lcom/discord/simpleast/core/node/Node;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/simpleast/code/CodeNode;",
            "[",
            "Lcom/discord/simpleast/core/node/Node;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1$parse$node$1;->this$0:Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;

    iput-object p2, p0, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1$parse$node$1;->$codeNode:Lcom/discord/simpleast/code/CodeNode;

    invoke-direct {p0, p3}, Lcom/discord/simpleast/core/node/Node$Parent;-><init>([Lcom/discord/simpleast/core/node/Node;)V

    return-void
.end method


# virtual methods
.method public render(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/SpannableStringBuilder;",
            "TR;)V"
        }
    .end annotation

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-super {p0, p1, p2}, Lcom/discord/simpleast/core/node/Node$Parent;->render(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1$parse$node$1;->this$0:Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/discord/simpleast/code/CodeRules$createInlineCodeRule$1;->$bgStyleProvider:Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;

    .line 16
    .line 17
    invoke-interface {v1, p2}, Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;->get(Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/16 v3, 0x21

    .line 40
    .line 41
    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
.end method
