.class public final Lsg/e;
.super Lsg/p;
.source "SourceFile"

# interfaces
.implements Lch/a;


# instance fields
.field private final a:Ljava/lang/annotation/Annotation;


# direct methods
.method public constructor <init>(Ljava/lang/annotation/Annotation;)V
    .locals 1

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lsg/p;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public final P()Ljava/lang/annotation/Annotation;
    .locals 1

    iget-object v0, p0, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    return-object v0
.end method

.method public Q()Lsg/l;
    .locals 2

    new-instance v0, Lsg/l;

    iget-object v1, p0, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    invoke-static {v1}, Lwf/a;->a(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-static {v1}, Lwf/a;->b(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1}, Lsg/l;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public e()Ljava/util/Collection;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lch/b;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-static {v0}, Lwf/a;->a(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lwf/a;->b(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "annotation.annotationClass.java.declaredMethods"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    array-length v2, v0

    .line 23
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    array-length v2, v0

    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    :goto_0
    if-ge v4, v2, :cond_0

    .line 30
    .line 31
    aget-object v5, v0, v4

    .line 32
    .line 33
    sget-object v6, Lsg/f;->b:Lsg/f$a;

    .line 34
    .line 35
    iget-object v7, p0, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    .line 36
    .line 37
    new-array v8, v3, [Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v5, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    const-string v8, "method.invoke(annotation)"

    .line 44
    .line 45
    invoke-static {v7, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-static {v5}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v6, v7, v5}, Lsg/f$a;->a(Ljava/lang/Object;Llh/f;)Lsg/f;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    return-object v1
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lsg/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    check-cast p1, Lsg/e;

    iget-object p1, p1, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Llh/b;
    .locals 1

    iget-object v0, p0, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    invoke-static {v0}, Lwf/a;->a(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-static {v0}, Lwf/a;->b(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lsg/d;->a(Ljava/lang/Class;)Llh/b;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lsg/e;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lsg/e;->a:Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic y()Lch/g;
    .locals 1

    invoke-virtual {p0}, Lsg/e;->Q()Lsg/l;

    move-result-object v0

    return-object v0
.end method
