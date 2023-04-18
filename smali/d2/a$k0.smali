.class Ld2/a$k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->Z0(Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;)V
    .locals 0

    iput-object p1, p0, Ld2/a$k0;->k:Ld2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ld2/a$k0;->k:Ld2/a;

    .line 2
    .line 3
    invoke-static {v0}, Ld2/a;->k0(Ld2/a;)Ld2/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Ld2/a$k0;->k:Ld2/a;

    .line 11
    .line 12
    invoke-static {v0}, Ld2/a;->k0(Ld2/a;)Ld2/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, Ld2/h;->k:Ld2/m0;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Ld2/a$k0;->k:Ld2/a;

    .line 22
    .line 23
    invoke-static {v0}, Ld2/a;->k0(Ld2/a;)Ld2/h;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, Ld2/h;->k:Ld2/m0;

    .line 28
    .line 29
    iget-object v1, p0, Ld2/a$k0;->k:Ld2/a;

    .line 30
    .line 31
    invoke-static {v1}, Ld2/a;->l0(Ld2/a;)Ld2/g;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Ld2/m0;->onAttributionChanged(Ld2/g;)V

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
.end method
