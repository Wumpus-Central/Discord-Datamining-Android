.class public abstract Lkotlin/jvm/internal/b0;
.super Lkotlin/jvm/internal/d0;
.source "SourceFile"

# interfaces
.implements Ldg/h;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/d0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lkotlin/reflect/KCallable;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    move-result-object v0

    return-object v0
.end method

.method public f()Ldg/h$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/d0;->n()Lkotlin/reflect/KProperty;

    move-result-object v0

    check-cast v0, Ldg/h;

    invoke-interface {v0}, Ldg/h;->f()Ldg/h$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Lkotlin/reflect/KProperty$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/b0;->f()Ldg/h$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Ldg/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
