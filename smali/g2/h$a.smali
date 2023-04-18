.class Lg2/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/g0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg2/g0<",
        "Ljava/lang/Throwable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lg2/h;


# direct methods
.method constructor <init>(Lg2/h;)V
    .locals 0

    iput-object p1, p0, Lg2/h$a;->a:Lg2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg2/h$a;->a:Lg2/h;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/h;->f(Lg2/h;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lg2/h$a;->a:Lg2/h;

    .line 10
    .line 11
    invoke-static {v0}, Lg2/h;->f(Lg2/h;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Lg2/h;->setImageResource(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lg2/h$a;->a:Lg2/h;

    .line 19
    .line 20
    invoke-static {v0}, Lg2/h;->g(Lg2/h;)Lg2/g0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, Lg2/h;->h()Lg2/g0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, Lg2/h$a;->a:Lg2/h;

    .line 32
    .line 33
    invoke-static {v0}, Lg2/h;->g(Lg2/h;)Lg2/g0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0, p1}, Lg2/g0;->onResult(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lg2/h$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method
