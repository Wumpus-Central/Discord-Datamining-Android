.class public abstract Landroidx/emoji2/text/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field final a:Landroidx/emoji2/text/d$g;

.field b:Z

.field c:Z

.field d:[I

.field e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/emoji2/text/d$e;",
            ">;"
        }
    .end annotation
.end field

.field f:Z

.field g:I

.field h:I

.field i:Landroidx/emoji2/text/d$d;


# direct methods
.method protected constructor <init>(Landroidx/emoji2/text/d$g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, -0xff0100

    .line 5
    .line 6
    .line 7
    iput v0, p0, Landroidx/emoji2/text/d$c;->g:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Landroidx/emoji2/text/d$c;->h:I

    .line 11
    .line 12
    new-instance v0, Landroidx/emoji2/text/g$b;

    .line 13
    .line 14
    invoke-direct {v0}, Landroidx/emoji2/text/g$b;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/emoji2/text/d$c;->i:Landroidx/emoji2/text/d$d;

    .line 18
    .line 19
    const-string v0, "metadataLoader cannot be null."

    .line 20
    .line 21
    invoke-static {p1, v0}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/emoji2/text/d$c;->a:Landroidx/emoji2/text/d$g;

    .line 25
    .line 26
    return-void
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
.end method


# virtual methods
.method protected final a()Landroidx/emoji2/text/d$g;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/d$c;->a:Landroidx/emoji2/text/d$g;

    return-object v0
.end method

.method public b(I)Landroidx/emoji2/text/d$c;
    .locals 0

    iput p1, p0, Landroidx/emoji2/text/d$c;->h:I

    return-object p0
.end method
