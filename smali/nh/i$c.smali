.class public abstract Lnh/i$c;
.super Lnh/i$b;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnh/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lnh/i$d<",
        "TMessageType;>;BuilderType:",
        "Lnh/i$c<",
        "TMessageType;TBuilderType;>;>",
        "Lnh/i$b<",
        "TMessageType;TBuilderType;>;",
        "Lnh/r;"
    }
.end annotation


# instance fields
.field private l:Lnh/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/h<",
            "Lnh/i$e;",
            ">;"
        }
    .end annotation
.end field

.field private m:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnh/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lnh/h;->g()Lnh/h;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lnh/i$c;->l:Lnh/h;

    .line 9
    .line 10
    return-void
    .line 11
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
.end method

.method static synthetic r(Lnh/i$c;)Lnh/h;
    .locals 0

    invoke-direct {p0}, Lnh/i$c;->s()Lnh/h;

    move-result-object p0

    return-object p0
.end method

.method private s()Lnh/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/h<",
            "Lnh/i$e;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnh/i$c;->l:Lnh/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnh/h;->q()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lnh/i$c;->m:Z

    .line 8
    .line 9
    iget-object v0, p0, Lnh/i$c;->l:Lnh/h;

    .line 10
    .line 11
    return-object v0
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
.end method

.method private t()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnh/i$c;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnh/i$c;->l:Lnh/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Lnh/h;->b()Lnh/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lnh/i$c;->l:Lnh/h;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lnh/i$c;->m:Z

    .line 15
    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method protected final u(Lnh/i$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnh/i$c;->t()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnh/i$c;->l:Lnh/h;

    .line 5
    .line 6
    invoke-static {p1}, Lnh/i$d;->s(Lnh/i$d;)Lnh/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lnh/h;->r(Lnh/h;)V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method
