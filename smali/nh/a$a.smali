.class public abstract Lnh/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnh/a$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<BuilderType:",
        "Lnh/a$a;",
        ">",
        "Ljava/lang/Object;",
        "Lnh/q$a;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static m(Lnh/q;)Lnh/w;
    .locals 1

    new-instance v0, Lnh/w;

    invoke-direct {v0, p0}, Lnh/w;-><init>(Lnh/q;)V

    return-object v0
.end method


# virtual methods
.method public abstract k(Lnh/e;Lnh/g;)Lnh/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/e;",
            "Lnh/g;",
            ")TBuilderType;"
        }
    .end annotation
.end method

.method public bridge synthetic l(Lnh/e;Lnh/g;)Lnh/q$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnh/a$a;->k(Lnh/e;Lnh/g;)Lnh/a$a;

    move-result-object p1

    return-object p1
.end method
