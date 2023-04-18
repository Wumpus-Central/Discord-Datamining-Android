.class final Lp6/e$b;
.super Lp6/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lp6/k$b;

.field private b:Lp6/a;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lp6/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lp6/k;
    .locals 4

    new-instance v0, Lp6/e;

    iget-object v1, p0, Lp6/e$b;->a:Lp6/k$b;

    iget-object v2, p0, Lp6/e$b;->b:Lp6/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lp6/e;-><init>(Lp6/k$b;Lp6/a;Lp6/e$a;)V

    return-object v0
.end method

.method public b(Lp6/a;)Lp6/k$a;
    .locals 0

    iput-object p1, p0, Lp6/e$b;->b:Lp6/a;

    return-object p0
.end method

.method public c(Lp6/k$b;)Lp6/k$a;
    .locals 0

    iput-object p1, p0, Lp6/e$b;->a:Lp6/k$b;

    return-object p0
.end method
