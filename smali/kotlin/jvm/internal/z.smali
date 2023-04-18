.class public abstract Lkotlin/jvm/internal/z;
.super Lkotlin/jvm/internal/d0;
.source "SourceFile"

# interfaces
.implements Ldg/g;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/d0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lkotlin/reflect/KCallable;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/f0;->f(Lkotlin/jvm/internal/z;)Ldg/g;

    move-result-object v0

    return-object v0
.end method

.method public f()Ldg/g$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/d0;->n()Lkotlin/reflect/KProperty;

    move-result-object v0

    check-cast v0, Ldg/g;

    invoke-interface {v0}, Ldg/g;->f()Ldg/g$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Lkotlin/reflect/KProperty$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/z;->f()Ldg/g$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Ldg/g;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
