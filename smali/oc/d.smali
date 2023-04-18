.class public interface abstract annotation Loc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Loc/d;
        intEncoding = .enum Loc/d$a;->k:Loc/d$a;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loc/d$a;
    }
.end annotation


# virtual methods
.method public abstract intEncoding()Loc/d$a;
.end method

.method public abstract tag()I
.end method
