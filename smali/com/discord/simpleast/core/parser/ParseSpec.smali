.class public final Lcom/discord/simpleast/core/parser/ParseSpec;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/simpleast/core/parser/ParseSpec$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        "S:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u0000 \u001d*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u00020\u0003:\u0001\u001dB-\u0008\u0016\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\nB\u001d\u0008\u0016\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0008R\u001a\u0010\t\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\r\"\u0004\u0008\u0016\u0010\u000fR\u0013\u0010\u0006\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/discord/simpleast/core/parser/ParseSpec;",
        "R",
        "S",
        "",
        "root",
        "Lcom/discord/simpleast/core/node/Node;",
        "state",
        "startIndex",
        "",
        "endIndex",
        "(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;II)V",
        "(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;)V",
        "getEndIndex",
        "()I",
        "setEndIndex",
        "(I)V",
        "isTerminal",
        "",
        "()Z",
        "getRoot",
        "()Lcom/discord/simpleast/core/node/Node;",
        "getStartIndex",
        "setStartIndex",
        "getState",
        "()Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "applyOffset",
        "",
        "offset",
        "Companion",
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
.field public static final Companion:Lcom/discord/simpleast/core/parser/ParseSpec$Companion;


# instance fields
.field private endIndex:I

.field private final isTerminal:Z

.field private final root:Lcom/discord/simpleast/core/node/Node;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;"
        }
    .end annotation
.end field

.field private startIndex:I

.field private final state:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/simpleast/core/parser/ParseSpec$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/simpleast/core/parser/ParseSpec$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/simpleast/core/parser/ParseSpec;->Companion:Lcom/discord/simpleast/core/parser/ParseSpec$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;)V"
        }
    .end annotation

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->root:Lcom/discord/simpleast/core/node/Node;

    .line 7
    iput-object p2, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->state:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->isTerminal:Z

    return-void
.end method

.method public constructor <init>(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;II)V"
        }
    .end annotation

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->root:Lcom/discord/simpleast/core/node/Node;

    .line 2
    iput-object p2, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->state:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->isTerminal:Z

    .line 4
    iput p3, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->startIndex:I

    .line 5
    iput p4, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->endIndex:I

    return-void
.end method

.method public static final createNonterminal(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;II)Lcom/discord/simpleast/core/parser/ParseSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;II)",
            "Lcom/discord/simpleast/core/parser/ParseSpec<",
            "TR;TS;>;"
        }
    .end annotation

    sget-object v0, Lcom/discord/simpleast/core/parser/ParseSpec;->Companion:Lcom/discord/simpleast/core/parser/ParseSpec$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/discord/simpleast/core/parser/ParseSpec$Companion;->createNonterminal(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;II)Lcom/discord/simpleast/core/parser/ParseSpec;

    move-result-object p0

    return-object p0
.end method

.method public static final createTerminal(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;TS;)",
            "Lcom/discord/simpleast/core/parser/ParseSpec<",
            "TR;TS;>;"
        }
    .end annotation

    sget-object v0, Lcom/discord/simpleast/core/parser/ParseSpec;->Companion:Lcom/discord/simpleast/core/parser/ParseSpec$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/discord/simpleast/core/parser/ParseSpec$Companion;->createTerminal(Lcom/discord/simpleast/core/node/Node;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final applyOffset(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->startIndex:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->startIndex:I

    .line 5
    .line 6
    iget v0, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->endIndex:I

    .line 7
    .line 8
    add-int/2addr v0, p1

    .line 9
    iput v0, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->endIndex:I

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
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

.method public final getEndIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->endIndex:I

    return v0
.end method

.method public final getRoot()Lcom/discord/simpleast/core/node/Node;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/discord/simpleast/core/node/Node<",
            "TR;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->root:Lcom/discord/simpleast/core/node/Node;

    return-object v0
.end method

.method public final getStartIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->startIndex:I

    return v0
.end method

.method public final getState()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->state:Ljava/lang/Object;

    return-object v0
.end method

.method public final isTerminal()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->isTerminal:Z

    return v0
.end method

.method public final setEndIndex(I)V
    .locals 0

    iput p1, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->endIndex:I

    return-void
.end method

.method public final setStartIndex(I)V
    .locals 0

    iput p1, p0, Lcom/discord/simpleast/core/parser/ParseSpec;->startIndex:I

    return-void
.end method
