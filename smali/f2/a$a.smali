.class Lf2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/a;->b([Ljava/lang/Object;)Lf2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:[Ljava/lang/Object;

.field final synthetic l:Landroid/os/Handler;

.field final synthetic m:Lf2/a;


# direct methods
.method constructor <init>(Lf2/a;[Ljava/lang/Object;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lf2/a$a;->m:Lf2/a;

    iput-object p2, p0, Lf2/a$a;->k:[Ljava/lang/Object;

    iput-object p3, p0, Lf2/a$a;->l:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf2/a$a;->m:Lf2/a;

    .line 2
    .line 3
    iget-object v1, p0, Lf2/a$a;->k:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lf2/a;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lf2/a$a;->l:Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v2, Lf2/a$a$a;

    .line 12
    .line 13
    invoke-direct {v2, p0, v0}, Lf2/a$a$a;-><init>(Lf2/a$a;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
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
.end method
