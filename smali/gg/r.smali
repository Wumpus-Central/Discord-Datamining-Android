.class public final Lgg/r;
.super Lgg/x;
.source "SourceFile"

# interfaces
.implements Ldg/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgg/r$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lgg/x<",
        "TV;>;",
        "Ldg/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0017B\u0019\u0008\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R.\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \n*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0018"
    }
    d2 = {
        "Lgg/r;",
        "V",
        "Lgg/x;",
        "",
        "value",
        "",
        "J",
        "(Ljava/lang/Object;)V",
        "Lgg/j0$b;",
        "Lgg/r$a;",
        "kotlin.jvm.PlatformType",
        "y",
        "Lgg/j0$b;",
        "_setter",
        "I",
        "()Lgg/r$a;",
        "setter",
        "Lgg/p;",
        "container",
        "Lmg/u0;",
        "descriptor",
        "<init>",
        "(Lgg/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V",
        "a",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final y:Lgg/j0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgg/j0$b<",
            "Lgg/r$a<",
            "TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgg/p;Lmg/u0;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "descriptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lgg/x;-><init>(Lgg/p;Lmg/u0;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lgg/r$b;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lgg/r$b;-><init>(Lgg/r;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lgg/j0;->b(Lkotlin/jvm/functions/Function0;)Lgg/j0$b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string p2, "lazy { Setter(this) }"

    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lgg/r;->y:Lgg/j0$b;

    .line 29
    .line 30
    return-void
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
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public I()Lgg/r$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/r$a<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lgg/r;->y:Lgg/j0$b;

    invoke-virtual {v0}, Lgg/j0$b;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "_setter()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lgg/r$a;

    return-object v0
.end method

.method public J(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lgg/r;->I()Lgg/r$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lgg/l;->call([Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic h()Ldg/d$a;
    .locals 1

    invoke-virtual {p0}, Lgg/r;->I()Lgg/r$a;

    move-result-object v0

    return-object v0
.end method
