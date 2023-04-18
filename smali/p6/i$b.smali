.class final Lp6/i$b;
.super Lp6/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lp6/o$c;

.field private b:Lp6/o$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lp6/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lp6/o;
    .locals 4

    new-instance v0, Lp6/i;

    iget-object v1, p0, Lp6/i$b;->a:Lp6/o$c;

    iget-object v2, p0, Lp6/i$b;->b:Lp6/o$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lp6/i;-><init>(Lp6/o$c;Lp6/o$b;Lp6/i$a;)V

    return-object v0
.end method

.method public b(Lp6/o$b;)Lp6/o$a;
    .locals 0

    iput-object p1, p0, Lp6/i$b;->b:Lp6/o$b;

    return-object p0
.end method

.method public c(Lp6/o$c;)Lp6/o$a;
    .locals 0

    iput-object p1, p0, Lp6/i$b;->a:Lp6/o$c;

    return-object p0
.end method
