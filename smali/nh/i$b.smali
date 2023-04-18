.class public abstract Lnh/i$b;
.super Lnh/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnh/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lnh/i;",
        "BuilderType:",
        "Lnh/i$b;",
        ">",
        "Lnh/a$a<",
        "TBuilderType;>;"
    }
.end annotation


# instance fields
.field private k:Lnh/d;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnh/a$a;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lnh/d;->k:Lnh/d;

    .line 5
    .line 6
    iput-object v0, p0, Lnh/i$b;->k:Lnh/d;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnh/i$b;->n()Lnh/i$b;

    move-result-object v0

    return-object v0
.end method

.method public n()Lnh/i$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is supposed to be overridden by subclasses."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o()Lnh/d;
    .locals 1

    iget-object v0, p0, Lnh/i$b;->k:Lnh/d;

    return-object v0
.end method

.method public abstract p(Lnh/i;)Lnh/i$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation
.end method

.method public final q(Lnh/d;)Lnh/i$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/d;",
            ")TBuilderType;"
        }
    .end annotation

    iput-object p1, p0, Lnh/i$b;->k:Lnh/d;

    return-object p0
.end method
