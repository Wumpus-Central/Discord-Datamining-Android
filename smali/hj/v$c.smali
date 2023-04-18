.class Lhj/v$c;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Lfj/p<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lhj/v;


# direct methods
.method private constructor <init>(Lhj/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhj/v$c;->k:Lhj/v;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lhj/v;Lhj/v$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lhj/v$c;-><init>(Lhj/v;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lfj/p<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Lhj/v$b;

    iget-object v1, p0, Lhj/v$c;->k:Lhj/v;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhj/v$b;-><init>(Lhj/v;Lhj/v$a;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lhj/v$c;->k:Lhj/v;

    invoke-static {v0}, Lhj/v;->Q(Lhj/v;)I

    move-result v0

    return v0
.end method
