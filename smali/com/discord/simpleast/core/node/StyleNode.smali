.class public Lcom/discord/simpleast/core/node/StyleNode;
.super Lcom/discord/simpleast/core/node/Node$Parent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;,
        Lcom/discord/simpleast/core/node/StyleNode$TextStyledNode;,
        Lcom/discord/simpleast/core/node/StyleNode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RC:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/discord/simpleast/core/node/Node$Parent<",
        "TRC;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u0000 \u000f*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003:\u0003\u000f\u0010\u0011B\u0013\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/discord/simpleast/core/node/StyleNode;",
        "RC",
        "T",
        "Lcom/discord/simpleast/core/node/Node$Parent;",
        "styles",
        "",
        "(Ljava/util/List;)V",
        "getStyles",
        "()Ljava/util/List;",
        "render",
        "",
        "builder",
        "Landroid/text/SpannableStringBuilder;",
        "renderContext",
        "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V",
        "Companion",
        "SpanProvider",
        "TextStyledNode",
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
.field public static final Companion:Lcom/discord/simpleast/core/node/StyleNode$Companion;


# instance fields
.field private final styles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/simpleast/core/node/StyleNode$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/simpleast/core/node/StyleNode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/simpleast/core/node/StyleNode;->Companion:Lcom/discord/simpleast/core/node/StyleNode$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "styles"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [Lcom/discord/simpleast/core/node/Node;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lcom/discord/simpleast/core/node/Node$Parent;-><init>([Lcom/discord/simpleast/core/node/Node;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/discord/simpleast/core/node/StyleNode;->styles:Ljava/util/List;

    .line 13
    .line 14
    return-void
    .line 15
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

.method public static final wrapText(Ljava/lang/String;Ljava/util/List;)Lcom/discord/simpleast/core/node/StyleNode;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RC:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+TT;>;)",
            "Lcom/discord/simpleast/core/node/StyleNode<",
            "TRC;TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/discord/simpleast/core/node/StyleNode;->Companion:Lcom/discord/simpleast/core/node/StyleNode$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/discord/simpleast/core/node/StyleNode$Companion;->wrapText(Ljava/lang/String;Ljava/util/List;)Lcom/discord/simpleast/core/node/StyleNode;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getStyles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/simpleast/core/node/StyleNode;->styles:Ljava/util/List;

    return-object v0
.end method

.method public render(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/SpannableStringBuilder;",
            "TRC;)V"
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
    iget-object p2, p0, Lcom/discord/simpleast/core/node/StyleNode;->styles:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/16 v3, 0x21

    .line 34
    .line 35
    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
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
