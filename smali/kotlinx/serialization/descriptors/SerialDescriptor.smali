.class public interface abstract Lkotlinx/serialization/descriptors/SerialDescriptor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/serialization/descriptors/SerialDescriptor$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\'J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\'R\u001a\u0010\u0012\u001a\u00020\u00048&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00138&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u000c8VX\u0097\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001a\u0010\u0011\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0019R\u001a\u0010 \u001a\u00020\u00028&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001f\u0010\u0011\u001a\u0004\u0008\u001d\u0010\u001eR \u0010$\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088VX\u0097\u0004\u00a2\u0006\u000c\u0012\u0004\u0008#\u0010\u0011\u001a\u0004\u0008!\u0010\"\u00a8\u0006%"
    }
    d2 = {
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "",
        "",
        "index",
        "",
        "f",
        "name",
        "d",
        "",
        "",
        "h",
        "i",
        "",
        "j",
        "a",
        "()Ljava/lang/String;",
        "getSerialName$annotations",
        "()V",
        "serialName",
        "Lyi/h;",
        "g",
        "()Lyi/h;",
        "getKind$annotations",
        "kind",
        "c",
        "()Z",
        "isNullable$annotations",
        "isNullable",
        "isInline",
        "e",
        "()I",
        "getElementsCount$annotations",
        "elementsCount",
        "getAnnotations",
        "()Ljava/util/List;",
        "getAnnotations$annotations",
        "annotations",
        "kotlinx-serialization-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method

.method public abstract d(Ljava/lang/String;)I
.end method

.method public abstract e()I
.end method

.method public abstract f(I)Ljava/lang/String;
.end method

.method public abstract g()Lyi/h;
.end method

.method public abstract getAnnotations()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end method

.method public abstract h(I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end method

.method public abstract i(I)Lkotlinx/serialization/descriptors/SerialDescriptor;
.end method

.method public abstract isInline()Z
.end method

.method public abstract j(I)Z
.end method
