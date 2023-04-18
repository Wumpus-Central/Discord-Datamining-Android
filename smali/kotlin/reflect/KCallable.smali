.class public interface abstract Lkotlin/reflect/KCallable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldg/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008f\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00012\u00020\u0002J\'\u0010\u0006\u001a\u00028\u00002\u0016\u0010\u0005\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J%\u0010\n\u001a\u00028\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0008H&\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u000c8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R \u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00128&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001c\u0010\u0010\u001a\u0004\u0008\u001b\u0010\u0014R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008!\u0010\u0010\u001a\u0004\u0008\u001f\u0010 R\u001a\u0010$\u001a\u00020#8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008&\u0010\u0010\u001a\u0004\u0008$\u0010%R\u001a\u0010\'\u001a\u00020#8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008(\u0010\u0010\u001a\u0004\u0008\'\u0010%R\u001a\u0010)\u001a\u00020#8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008*\u0010\u0010\u001a\u0004\u0008)\u0010%R\u001a\u0010+\u001a\u00020#8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008,\u0010\u0010\u001a\u0004\u0008+\u0010%\u00a8\u0006-"
    }
    d2 = {
        "Lkotlin/reflect/KCallable;",
        "R",
        "Ldg/b;",
        "",
        "",
        "args",
        "call",
        "([Ljava/lang/Object;)Ljava/lang/Object;",
        "",
        "Ldg/f;",
        "callBy",
        "(Ljava/util/Map;)Ljava/lang/Object;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "getName$annotations",
        "()V",
        "name",
        "",
        "getParameters",
        "()Ljava/util/List;",
        "parameters",
        "Lkotlin/reflect/KType;",
        "getReturnType",
        "()Lkotlin/reflect/KType;",
        "returnType",
        "Ldg/i;",
        "getTypeParameters",
        "getTypeParameters$annotations",
        "typeParameters",
        "Lkotlin/reflect/KVisibility;",
        "getVisibility",
        "()Lkotlin/reflect/KVisibility;",
        "getVisibility$annotations",
        "visibility",
        "",
        "isFinal",
        "()Z",
        "isFinal$annotations",
        "isOpen",
        "isOpen$annotations",
        "isAbstract",
        "isAbstract$annotations",
        "isSuspend",
        "isSuspend$annotations",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public varargs abstract call([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")TR;"
        }
    .end annotation
.end method

.method public abstract callBy(Ljava/util/Map;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ldg/f;",
            "+",
            "Ljava/lang/Object;",
            ">;)TR;"
        }
    .end annotation
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getParameters()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldg/f;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getReturnType()Lkotlin/reflect/KType;
.end method

.method public abstract getTypeParameters()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldg/i;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getVisibility()Lkotlin/reflect/KVisibility;
.end method

.method public abstract isAbstract()Z
.end method

.method public abstract isFinal()Z
.end method

.method public abstract isOpen()Z
.end method

.method public abstract isSuspend()Z
.end method
