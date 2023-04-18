.class public abstract Lgg/c0$a;
.super Lgg/l;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/KFunction;
.implements Lkotlin/reflect/KProperty$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgg/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PropertyType:",
        "Ljava/lang/Object;",
        "ReturnType:",
        "Ljava/lang/Object;",
        ">",
        "Lgg/l<",
        "TReturnType;>;",
        "Lkotlin/reflect/KFunction<",
        "TReturnType;>;",
        "Lkotlin/reflect/KProperty$a<",
        "TPropertyType;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u0000*\u0006\u0008\u0001\u0010\u0001 \u0001*\u0006\u0008\u0002\u0010\u0002 \u00012\u0008\u0012\u0004\u0012\u00028\u00020\u00032\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u0008\u0012\u0004\u0012\u00028\u00020\u0005B\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0011\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u001b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "Lgg/c0$a;",
        "PropertyType",
        "ReturnType",
        "Lgg/l;",
        "Lkotlin/reflect/KProperty$a;",
        "Lkotlin/reflect/KFunction;",
        "Lgg/c0;",
        "B",
        "()Lgg/c0;",
        "property",
        "Lgg/p;",
        "v",
        "()Lgg/p;",
        "container",
        "Lhg/e;",
        "w",
        "()Lhg/e;",
        "defaultCaller",
        "",
        "z",
        "()Z",
        "isBound",
        "isInline",
        "isExternal",
        "isOperator",
        "isInfix",
        "isSuspend",
        "Lmg/t0;",
        "getDescriptor",
        "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;",
        "descriptor",
        "<init>",
        "()V",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/l;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract A()Lmg/t0;
.end method

.method public abstract B()Lgg/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgg/c0<",
            "TPropertyType;>;"
        }
    .end annotation
.end method

.method public isExternal()Z
    .locals 1

    invoke-virtual {p0}, Lgg/c0$a;->A()Lmg/t0;

    move-result-object v0

    invoke-interface {v0}, Lmg/d0;->isExternal()Z

    move-result v0

    return v0
.end method

.method public isInfix()Z
    .locals 1

    invoke-virtual {p0}, Lgg/c0$a;->A()Lmg/t0;

    move-result-object v0

    invoke-interface {v0}, Lmg/y;->isInfix()Z

    move-result v0

    return v0
.end method

.method public isInline()Z
    .locals 1

    invoke-virtual {p0}, Lgg/c0$a;->A()Lmg/t0;

    move-result-object v0

    invoke-interface {v0}, Lmg/y;->isInline()Z

    move-result v0

    return v0
.end method

.method public isOperator()Z
    .locals 1

    invoke-virtual {p0}, Lgg/c0$a;->A()Lmg/t0;

    move-result-object v0

    invoke-interface {v0}, Lmg/y;->isOperator()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    invoke-virtual {p0}, Lgg/c0$a;->A()Lmg/t0;

    move-result-object v0

    invoke-interface {v0}, Lmg/y;->isSuspend()Z

    move-result v0

    return v0
.end method

.method public v()Lgg/p;
    .locals 1

    invoke-virtual {p0}, Lgg/c0$a;->B()Lgg/c0;

    move-result-object v0

    invoke-virtual {v0}, Lgg/c0;->v()Lgg/p;

    move-result-object v0

    return-object v0
.end method

.method public w()Lhg/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhg/e<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public z()Z
    .locals 1

    invoke-virtual {p0}, Lgg/c0$a;->B()Lgg/c0;

    move-result-object v0

    invoke-virtual {v0}, Lgg/c0;->z()Z

    move-result v0

    return v0
.end method
