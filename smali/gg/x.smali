.class public Lgg/x;
.super Lgg/c0;
.source "SourceFile"

# interfaces
.implements Ldg/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgg/x$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lgg/c0<",
        "TV;>;",
        "Ldg/g<",
        "TV;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0010\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0001 B\u0019\u0008\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB+\u0008\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ\u000f\u0010\u0004\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0005R.\u0010\u000c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \t*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00080\u00080\u00078\u0008X\u0088\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006!"
    }
    d2 = {
        "Lgg/x;",
        "V",
        "Ldg/g;",
        "Lgg/c0;",
        "get",
        "()Ljava/lang/Object;",
        "invoke",
        "Lgg/j0$b;",
        "Lgg/x$a;",
        "kotlin.jvm.PlatformType",
        "w",
        "Lgg/j0$b;",
        "_getter",
        "Lkotlin/Lazy;",
        "",
        "x",
        "Lkotlin/Lazy;",
        "delegateValue",
        "H",
        "()Lgg/x$a;",
        "getter",
        "Lgg/p;",
        "container",
        "Lmg/u0;",
        "descriptor",
        "<init>",
        "(Lgg/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V",
        "",
        "name",
        "signature",
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
.field private final w:Lgg/j0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgg/j0$b<",
            "Lgg/x$a<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field private final x:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljava/lang/Object;",
            ">;"
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

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lgg/c0;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    new-instance p1, Lgg/x$b;

    invoke-direct {p1, p0}, Lgg/x$b;-><init>(Lgg/x;)V

    invoke-static {p1}, Lgg/j0;->b(Lkotlin/jvm/functions/Function0;)Lgg/j0$b;

    move-result-object p1

    const-string p2, "lazy { Getter(this) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lgg/x;->w:Lgg/j0$b;

    .line 6
    sget-object p1, Llf/p;->l:Llf/p;

    new-instance p2, Lgg/x$c;

    invoke-direct {p2, p0}, Lgg/x$c;-><init>(Lgg/x;)V

    invoke-static {p1, p2}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lgg/x;->x:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Lgg/p;Lmg/u0;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lgg/c0;-><init>(Lgg/p;Lmg/u0;)V

    .line 2
    new-instance p1, Lgg/x$b;

    invoke-direct {p1, p0}, Lgg/x$b;-><init>(Lgg/x;)V

    invoke-static {p1}, Lgg/j0;->b(Lkotlin/jvm/functions/Function0;)Lgg/j0$b;

    move-result-object p1

    const-string p2, "lazy { Getter(this) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lgg/x;->w:Lgg/j0$b;

    .line 3
    sget-object p1, Llf/p;->l:Llf/p;

    new-instance p2, Lgg/x$c;

    invoke-direct {p2, p0}, Lgg/x$c;-><init>(Lgg/x;)V

    invoke-static {p1, p2}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lgg/x;->x:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public bridge synthetic E()Lgg/c0$c;
    .locals 1

    invoke-virtual {p0}, Lgg/x;->H()Lgg/x$a;

    move-result-object v0

    return-object v0
.end method

.method public H()Lgg/x$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/x$a<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lgg/x;->w:Lgg/j0$b;

    invoke-virtual {v0}, Lgg/j0$b;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "_getter()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lgg/x$a;

    return-object v0
.end method

.method public bridge synthetic f()Ldg/g$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgg/x;->H()Lgg/x$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Lkotlin/reflect/KProperty$b;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lgg/x;->H()Lgg/x$a;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    invoke-virtual {p0}, Lgg/x;->H()Lgg/x$a;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lgg/l;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    invoke-virtual {p0}, Lgg/x;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
