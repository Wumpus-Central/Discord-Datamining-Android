.class Lf2/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/i;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lf2/i;


# direct methods
.method constructor <init>(Lf2/i;)V
    .locals 0

    iput-object p1, p0, Lf2/i$a;->k:Lf2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lf2/i$a;->k:Lf2/i;

    .line 2
    .line 3
    invoke-static {v0}, Lf2/i;->b(Lf2/i;)Ld2/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v2, p0, Lf2/i$a;->k:Lf2/i;

    .line 11
    .line 12
    invoke-static {v2}, Lf2/i;->a(Lf2/i;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object v2, v1, v3

    .line 18
    .line 19
    const-string v2, "%s fired"

    .line 20
    .line 21
    invoke-interface {v0, v2, v1}, Ld2/c0;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lf2/i$a;->k:Lf2/i;

    .line 25
    .line 26
    invoke-static {v0}, Lf2/i;->c(Lf2/i;)Ljava/lang/Runnable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
