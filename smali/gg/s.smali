.class public final Lgg/s;
.super Lgg/y;
.source "SourceFile"

# interfaces
.implements Ldg/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgg/s$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lgg/y<",
        "TT;TV;>;",
        "Ldg/e<",
        "TT;TV;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001fB\u0019\u0008\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B+\u0008\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0017\u0010\u001eJ\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR:\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u000c*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b0\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006 "
    }
    d2 = {
        "Lgg/s;",
        "T",
        "V",
        "Lgg/y;",
        "Ldg/e;",
        "receiver",
        "value",
        "",
        "J",
        "(Ljava/lang/Object;Ljava/lang/Object;)V",
        "Lgg/j0$b;",
        "Lgg/s$a;",
        "kotlin.jvm.PlatformType",
        "y",
        "Lgg/j0$b;",
        "_setter",
        "I",
        "()Lgg/s$a;",
        "setter",
        "Lgg/p;",
        "container",
        "Lmg/u0;",
        "descriptor",
        "<init>",
        "(Lgg/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V",
        "",
        "name",
        "signature",
        "",
        "boundReceiver",
        "(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V",
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
            "Lgg/s$a<",
            "TT;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lgg/y;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    new-instance p1, Lgg/s$b;

    invoke-direct {p1, p0}, Lgg/s$b;-><init>(Lgg/s;)V

    invoke-static {p1}, Lgg/j0;->b(Lkotlin/jvm/functions/Function0;)Lgg/j0$b;

    move-result-object p1

    const-string p2, "lazy { Setter(this) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lgg/s;->y:Lgg/j0$b;

    return-void
.end method

.method public constructor <init>(Lgg/p;Lmg/u0;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Lgg/y;-><init>(Lgg/p;Lmg/u0;)V

    .line 4
    new-instance p1, Lgg/s$b;

    invoke-direct {p1, p0}, Lgg/s$b;-><init>(Lgg/s;)V

    invoke-static {p1}, Lgg/j0;->b(Lkotlin/jvm/functions/Function0;)Lgg/j0$b;

    move-result-object p1

    const-string p2, "lazy { Setter(this) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lgg/s;->y:Lgg/j0$b;

    return-void
.end method


# virtual methods
.method public I()Lgg/s$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/s$a<",
            "TT;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lgg/s;->y:Lgg/j0$b;

    invoke-virtual {v0}, Lgg/j0$b;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "_setter()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lgg/s$a;

    return-object v0
.end method

.method public J(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TV;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lgg/s;->I()Lgg/s$a;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-virtual {v0, v1}, Lgg/l;->call([Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic h()Ldg/d$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgg/s;->I()Lgg/s$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Ldg/e$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lgg/s;->I()Lgg/s$a;

    move-result-object v0

    return-object v0
.end method
